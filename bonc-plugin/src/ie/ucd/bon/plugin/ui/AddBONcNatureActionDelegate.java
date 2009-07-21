package ie.ucd.bon.plugin.ui;

import ie.ucd.bon.plugin.BONPlugin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public class AddBONcNatureActionDelegate implements IObjectActionDelegate {

  private IWorkbenchPart targetPart;
  private ISelection selection;

  private static final String NATURE_ID = BONPlugin.PLUGIN_ID + ".boncnature";

  public void setActivePart(IAction action, IWorkbenchPart targetPart) {
    this.targetPart = targetPart;
  }

  public void run(IAction action) {

    int count = 0;
    StringBuilder names = new StringBuilder();
    
    if (selection instanceof IStructuredSelection) {
      IStructuredSelection structuredSelection = (IStructuredSelection)selection;

      Iterator<?> iterator = structuredSelection.iterator();
      
      while (iterator.hasNext()) {
        Object obj = iterator.next();

        if (obj instanceof IProject) {
          IProject project = (IProject)obj;

          if (!project.isOpen()) {
            continue;
          }

          IProjectDescription description;
          try {
            description = project.getDescription();
          } catch (CoreException e) {
            //e.printStackTrace();
            continue;
          }

          List<String> newIds = new ArrayList<String>();
          newIds.addAll(Arrays.asList(description.getNatureIds()));

          if (!newIds.contains(NATURE_ID)) {
            newIds.add(NATURE_ID);
            description.setNatureIds(newIds.toArray(new String[newIds.size()]));

            try {
              project.setDescription(description, null);
              if (count == 0) {
                names.append(project.getDescription().getName());
              } else {
                names.append(", ");
                names.append(project.getDescription().getName());
              }
              count++;
            } catch (CoreException e) {
              //e.printStackTrace();
            }

          }
        }
      }
    }
    
    if (count == 1) {
      MessageDialog.openInformation(targetPart.getSite().getShell(), "Added BONc nature", "BONc nature added to project " + names);
    } else if (count > 1) {
      MessageDialog.openInformation(targetPart.getSite().getShell(), "Added BONc nature", "BONc nature added to projects: " + names);
    }
  }

  public void selectionChanged(IAction action, ISelection selection) {
    this.selection = selection;
  }

}
