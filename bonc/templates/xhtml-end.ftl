<#escape x as prepareManifest(x)?html>
<div id="footer">
  <p id="left-footer">
    <button id="showlink" onclick="return toggleShowAll();">Show all</button>
    Chart type:
    <select id="top-menu" onchange="populate(); showSelected();"><option>processing...</option></select>
    Chart:
    <select id="sub-menu" onchange="showSelected();"><option>processing...</option></select>
  </p>
  <p id="right-footer">
    Generated by <a href="http://kind.ucd.ie/products/opensource/BONc">BONc</a> (version: ${version}) <a href="http://validator.w3.org/check?uri=referer">XHTML</a> output, ${time?datetime?string.medium}.
  </p>
</div>

</div> <!-- End main -->

</body>
</html>

</#escape>