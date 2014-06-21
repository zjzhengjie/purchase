<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    
    <title>采购管理</title>
    
	<meta name="pragma" content="no-cache">
	<meta name="cache-control" content="no-cache">
	<meta name="expires" content="0">    
	<meta name="keywords" content="keyword1,keyword2,keyword3">
	<meta name="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	<link rel="stylesheet" type="text/css" href="css/header.css">
	<link rel="stylesheet" type="text/css" href="css/main.css">
	<link rel="stylesheet" type="text/css" href="css/font.css">
	
  </head>
  
  <body>
  		<%@include file="header.jsp" %>
  		<div class="container">
  			<header></header>
  			<section id="primary" class="content-full-width">
  				<div class="intro-text type1">
  					<h4>采购管理</h4>
  				</div>
  				<div class="hr-invisible-small">
  				</div>
  				<div class="column one-fifth">
  					<div class="ico-content type1">
  						<div class="icon">
  							<span class="icon-popup">
  							</span>
  							<h5>
  								<a title="杂仓采购" href="messyhouse">杂仓采购</a>
  							</h5>
  						</div>
  					</div>
  				</div>
  				<div class="column one-fifth">
  					<div class="ico-content type1">
  						<div class="icon">
  							<span class="icon-cog">
  							</span>
  							<h5>
  								<a title="标准供应商" href="standardsupplier">标准供应商</a>
  							</h5>
  						</div>
  					</div>
  				</div>
  				<div class="column one-fifth">
  					<div class="ico-content type1">
  						<div class="icon">
  							<span class="icon-leaf">
  							</span>
  							<h5>
  								<a title="大批量采购录入" href="batchinput">大批量采购录入</a>
  							</h5>
  						</div>
  					</div>
  				</div>
  				<div class="column one-fifth">
  					<div class="ico-content type1">
  						<div class="icon">
  							<span class="icon-cd">
  							</span>
  							<h5>
  								<a title="采购状态查询" href="statequery">采购状态查询</a>
  							</h5>
  						</div>
  					</div>
  				</div>
  				<div class="column one-fifth last">
  					<div class="ico-content type1">
  						<div class="icon">
  							<span class="icon-twitter">
  							</span>
  							<h5>
  								<a title="报表统计" href="reports">报表统计</a>
  							</h5>
  						</div>
  					</div>
  				</div>
  				<div class="clear">
  				</div>
  			</section>
  		</div>
  </body>
</html>
