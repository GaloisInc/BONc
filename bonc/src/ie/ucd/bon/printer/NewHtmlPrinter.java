package ie.ucd.bon.printer;

import ie.ucd.bon.ast.Clazz;
import ie.ucd.bon.ast.FeatureArgument;
import ie.ucd.bon.ast.FeatureSpecification;
import ie.ucd.bon.ast.Type;
import ie.ucd.bon.parser.tracker.ParsingTracker;
import ie.ucd.bon.printer.template.FreeMarkerTemplate;
import ie.ucd.bon.typechecker.BONST;
import ie.ucd.bon.util.FileUtil;
import ie.ucd.bon.util.STUtil;

import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class NewHtmlPrinter {

  public static void print(final File outputDirectory, final ParsingTracker tracker) {

    //TODO copy relevant javascript files
    System.out.println("Doing new html printing " + outputDirectory);

    if (!setupDirectory(outputDirectory)) {
      return;
    }

    Map<String,Object> map = prepareMap(tracker);

    //JS gen
    FreeMarkerTemplate.writeTemplateToFile(relativeFile(outputDirectory, "js/vars.js"), "newhtml/vars.ftl", map);

    //Index page
    FreeMarkerTemplate.writeTemplateToFile(relativeFile(outputDirectory, "index.html"), "newhtml/index.ftl", map);
    FreeMarkerTemplate.writeTemplateToFile(relativeFile(outputDirectory, "all-classes.html"), "newhtml/all-classes.ftl", map);

    BONST st = tracker.getSymbolTable();

    //Classes
    for (Clazz clazz : st.classes.values()) {
      printForClass(clazz, map, st, outputDirectory);
    }

    //Clusters

  }
  
  private static void printForClass(Clazz clazz, Map<String,Object> map, BONST st, File outputDirectory) {
    map.put("class", clazz);
    map.put("qualifiedclass", STUtil.getQualifiedClassString(clazz.name.name, st));
    if (clazz.classInterface != null) {
      map.put("parents", clazz.classInterface.parents);
      map.put("features", st.featuresMap.getAll(clazz));
    } else {
      map.put("parents", null);
      map.put("features", null);
    }
    map.put("children", STUtil.getAllDescendants(clazz, st));
    FreeMarkerTemplate.writeTemplateToFile(relativeFile(outputDirectory, clazz.name.name + ".html"), "newhtml/fclass.ftl", map);
    map.put("related", getRelated(clazz, st));
    FreeMarkerTemplate.writeTemplateToFile(relativeFile(outputDirectory, clazz.name.name + "-related.html"), "newhtml/fclass-related.ftl", map);
  }

  private static boolean setupDirectory(File outputDirectory) {
    File js = relativeFile(outputDirectory, "js");
    File scripty = relativeFile(outputDirectory, "js/scripty");
    File scripty2 = relativeFile(outputDirectory, "js/scripty2");
    File jquery = relativeFile(outputDirectory, "js/jquery");

    if (!(checkDirectory(js) && checkDirectory(scripty) && checkDirectory(scripty2) && checkDirectory(jquery))) {
      return false;
    }

    String[] filePaths = { "js/jquery/jquery-1.3.2.js", "js/jquery/jquery.history.js",
        "js/jquery/jquery.hotkeys.js", "js/scripty/scriptaculous.js",
        "js/scripty/prototype.js", "js/scripty/builder.js",
        "js/scripty/controls.js", "js/scripty/dragdrop.js",
        "js/scripty/effects.js", "js/scripty/slider.js",
        "js/scripty/sound.js", "js/scripty/unittest.js",
        "style.css", "js/jdoc.js"};

    for (String path : filePaths) {
      if (!FileUtil.copyResourceToExternalFile("templates/newhtml/" + path, relativeFile(outputDirectory, path))) {
        return false;
      }
    }
    return true;
  }

  private static boolean checkDirectory(File directory) {
    if (directory.exists()) {
      if (!directory.isDirectory()) {
        System.out.println(directory.getPath() + " exists and is not a directory.");
        return false;
      }
    } else {
      if (!directory.mkdir()) {
        System.out.println("Unable to make directory " + directory.getPath());
        return false;
      }
    }
    return true;
  }

  private static File relativeFile(File file, String path) {
    String start = file.getPath();
    if (!start.endsWith("/")) {
      start += '/';
    }
    return new File(start + path);
  }

  private static Map<String,Object> prepareMap(final ParsingTracker tracker) {
    Map<String,Object> map = new HashMap<String,Object>();

    map.put("tracker", tracker);

    BONST st = tracker.getSymbolTable();
    map.put("st", st);

    
    map.put("fclasses", STUtil.alphabeticalClasses(st));
    map.put("fclusters", st.clusters.values());
    map.put("iclasses", st.informal.classes.values());
    map.put("iclusters", st.informal.clusters.values());

    return map;
  }

  private static Collection<Clazz> getRelated(Clazz clazz, BONST st) {
    //TODO other classes in cluster, classes that use this class
    Set<Clazz> related = new LinkedHashSet<Clazz>();
    //Children
    related.addAll(STUtil.getAllDescendants(clazz, st));
    //All parents
    related.addAll(STUtil.getAllAncestors(clazz, st));
    
    if (clazz.classInterface != null) {
      //Features
      for (FeatureSpecification fs : st.featuresMap.getAll(clazz)) {
        if (fs.hasType != null) {
          String rt = fs.hasType.type.identifier;
          if (!rt.equals("Void")) {
            related.add(st.classes.get(rt));
          }
        }
        for (FeatureArgument fa : fs.arguments) {
          related.add(st.classes.get(fa.type.identifier));
        }
      }
    }
    related.remove(null);
    return related;
  }
}
