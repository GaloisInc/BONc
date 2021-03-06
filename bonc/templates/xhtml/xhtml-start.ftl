<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-type" content="text/html; charset=iso-8859-1" />

<title>BON Documentation: ${systemName?html}</title>

<script type="text/javascript">
<!--

${links}

var showAll = false;
var sysTitle = 'system_title';
var topMenu = 'top-menu';
var subMenu = 'sub-menu';

function setElText(id,text) {
  var elem = document.getElementById(id);
  if (elem) {
    elem.innerHTML = text;
  }
}

function toggleShowAll() {
  showAll = !showAll;
  if (showAll) {
    displayAll();
    setElText('showlink', 'Show One');
  } else {
    hideAll();
    setElText('showlink', 'Show All');
  }
  showSelected();
  return false;
}

function select(id) {
  if (showAll) {
//    setHash(id);
    return true;
  } else {
    showOnly(id);
    return true;
  }
}

function showOnly(id) {
  var elem = document.getElementById(id);
  if (elem) {
    hideAll();
    showElem(id);
  }
}

function hideAll() {
  for (var i=0; i<items.length; i++) {
    hideElem(items[i]);
  }
}

function displayAll() {
  for (var i=0; i<items.length; i++) {
    showElem(items[i]);
  }
}

function showElem(id) {
  var elem = document.getElementById(id);
  if (elem) {
    show(elem);
  }
}

function hideElem(id) {
  var elem = document.getElementById(id);
  if (elem) {
    hide(elem);
  }
}

function hide(elem) {
  addClass(elem,'hidden');
}

function show(elem) {
  removeClass(elem,'hidden');
}

function addClass(elem,cName) {
  if (!elem.className) {
    elem.className = cName;
  } else if (elem.className.indexOf(cName) == -1) {
    elem.className += ' ' + cName;
  }
}

function removeClass(elem,cName) {
  if (elem.className) {
    var toReplace = elem.className.match(' ' + cName);
    elem.className = elem.className.replace(toReplace, '');
  }
}

function setBack(id) {
//Not yet...
}

function initialPopulate() {
  var topSelect = document.getElementById(topMenu);
  if (topSelect) {
    topSelect.options.length = 0;
    for (var i=0; i < topOptions.length; i+=2) {
      topSelect.options[i/2] = new Option(topOptions[i],topOptions[i+1]);
    }
  }
  if (window.location.hash) {
    hashSelect(window.location.hash.substr(1));    
  } else {
    populate();
    showSelected();
  }
  lastHash = window.location.hash;
  //Trigger checkHash
  setInterval(checkHash,100);
}

function hashSelect(hash) {
  var parts = hash.split(':');
  if (parts.length == 2) {
    linkSelect(parts[0],hash);
  } else {
    populate();
  }
}

var lastHash = '';

function checkHash() {

  if (window.location.hash) {
    if (window.location.hash != lastHash) {
      hashSelect(window.location.hash.substr(1));
      lastHash = window.location.hash;
    }
  }
}

function setHash(hash) {
  lastHash = '#' + hash;
  window.location.hash = hash;
}

function populate() {

  var subSelect = document.getElementById(subMenu);
  var topSelect = document.getElementById(topMenu);

  if (subSelect && topSelect) {
    var selected = topSelect.options[topSelect.selectedIndex].value;
    if (selected) {
      var chosenSubOptions = subOptions[selected];
      subSelect.options.length = 0;
      for (var i=0; i < chosenSubOptions.length; i+=2) {
        subSelect.options[i/2] = new Option(chosenSubOptions[i],chosenSubOptions[i+1]);
      }
    }
  }
}

function showSelected() {
  var subSelect = document.getElementById(subMenu);
  if (subSelect) {
    var selected = subSelect.options[subSelect.selectedIndex].value;
    if (selected) {
      select(selected);
      setHash(selected);
    }
  }
}

function linkSelect(top, sub) {
  var topSelect = document.getElementById(topMenu);
  if (topSelect) {
    for (var i=0; i < topSelect.options.length; i++) {
      if (topSelect.options[i].value == top) {
        topSelect.selectedIndex = i;
        break;
      }
    }
  }  
  populate();
  var subSelect = document.getElementById(subMenu);
  if (subSelect) {
    for (var i=0; i < subSelect.options.length; i++) {
      if (subSelect.options[i].value == sub) {
        subSelect.selectedIndex = i;
        showSelected();
        return false;
      }
    }
    showSelected();
  }
  return true;
}


//-->
</script>

<style type="text/css">

.hidden {
  position:absolute;
  left:0px;
  top:-500px;
  width:1px;
  height:1px;
  overflow:hidden;
}

body {
  font-family: Optima, "Lucida Grande", "Lucida Sans Unicode", "Lucida Sans", Helvetica, Arial, sans-serif;
}

.list-entry {
  margin-left: 5px;
}

a {
  text-decoration: none;
  color: blue;
}

a:hover {
  text-decoration: underline;
}

a:active {
  text-decoration: none;
}

#main {
  padding-bottom: 100px;
}

#footer {
  z-index: 1;
  position: fixed; 
  bottom: 0px;
  right: 0px; 
  width: 100%;
  border-top: 2px solid #000000;
  background-color: #cccccc;
}

#left-footer {
  margin-top: 5px;
  margin-bottom: 0px;
  font-weight: bold;
}

#left-footer select {
  margin-right: 10px;
  font-size: 1.1em;
}

#showlink {
  margin-left: 10px;
  margin-right: 10px;
  font-weight: bold;
  font-size: 1.1em;
  min-width: 125px;
}

#top-menu {
  min-width: 160px;
}

#sub-menu {
  min-width: 220px;
}

#right-footer {
  margin: 5px 5px 0px 0px;
  padding: 0;
  text-align: right;
}

#footer a {
  text-decoration: none;
  font-weight: bold;
}

dl {
  margin: 0 0 0 10px;
}

dd {
  margin-left: 20px;
} 

.scenario_entry dt {
  font-weight: bold;
}

.indexing dt, .explanation dt {
  font-variant: small-caps;
  letter-spacing: 1px;
}

.top-level {
  width: 98%;
  margin: auto;
}

.outer {
  width: 100%;
  background-color: #a2a2a2;
  border: 2px solid #000000;
  margin-bottom: 30px;
}

.type, .name, .part {
  border: 4px groove #c0c0c0;
  padding: 5px 0px 5px 0px;
  text-align: center;
}

.explanation, .indexing {
  padding: 5px 5px 5px 10px;
  background-color: #ffffff;
  vertical-align: top;
  border: 4px groove #c0c0c0;
  padding: 5px 0px 5px 0px;
}

.name {
  background-color: #f3f0f0;
  font-size: 1.1em;
}

.part {
  background-color: #cccccc;
}

.type, .part {
  width: 25%;
}

.type {
  background-color: #bcbcbc;
}

.name, .indexing, .explanation {
  width: 50%;
}

.top, .middle, .bottom {
  width: 100%;
}

.bottom table {
  border: 4px groove #c0c0c0;
  width: 100%;
}

.bottom tr {
  width: 100%;
}

.bottom td, .bottom th {
  border: 1px inset #c0c0c0;
  vertical-align: top;
  padding: 8px 20px 8px 20px;
}

.spaced-lines {
  line-height: 1.5em;
}

.white {
  background-color: #ffffff;
}

.light-grey {
  background-color: #f3f0f0;
}

.grey {
  background-color: #cccccc;
}
</style>

</head>
<body onload="initialPopulate();">

<div id="main">

