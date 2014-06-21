<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>

<!DOCTYPE html>
<html>
  <head>
    
    <title>出错了</title>
    
	<meta name="pragma" content="no-cache">
	<meta name="cache-control" content="no-cache">
	<meta name="expires" content="0">    
	<meta name="keywords" content="keyword1,keyword2,keyword3">
	<meta name="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	<link rel="stylesheet" type="text/css" href="css/header.css">
	<link rel="stylesheet" type="text/css" href="css/500error.css">
	<script src="js/jquery.min.js"  type="text/javascript"></script>
	<script src="js/500error.js"  type="text/javascript"></script>
  </head>
  
  <body>
  	<%@include file="header.jsp"%>
  	<div class="container">
  		<div id="error">
  			<div id="pacman"></div>
  		</div>
  		<div id="content">
  			<h5><s:property value="exception.message"/></h5>
  		</div>
  	</div>
  </body>
 </html>