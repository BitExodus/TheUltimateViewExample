<!DOCTYPE html>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<html>
  <head>
    <tiles:insertAttribute name="meta"/>
  </head>
  <body>
    <div id="header"><tiles:insertAttribute name="header"/></div>
    <div id="body"><tiles:insertAttribute name="body"/></div>
    <div id="footer"><tiles:insertAttribute name="footer"/></div>
  </body>
</html>