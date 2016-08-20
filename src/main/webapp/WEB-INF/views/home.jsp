<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1 user-scalable=no">
<link rel="stylesheet" type="text/css" href="./resources/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="./resources/css/bootstrap-theme.min.css">
<link rel="stylesheet" media="all" href="./resources/css/home.css">
<title>我的首页</title>
</head>
<body>
	<header class="navbar navbar-default navbar-static-top bs-docs-nav">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand logo" href="#">Water.Stone.</a>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="#">生活<span class="sr-only">(current)</span></a></li>
					<li class=""><a href="#">工作</a></li>
					<li class="dropdown"><a href="#" class="dropdown-toggle"
						data-toggle="dropdown" role="button" aria-haspopup="true"
						aria-expanded="false">吴俊 <span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">内容管理</a></li>
							<li><a href="#">个人资料</a></li>
							<li role="separator" class="divider"></li>
							<li><a href="#">退出</a></li>
						</ul></li>
				</ul>
			</div>
		</div>
	</header>

	<div class="head-pic">
		<div class="container-fluid">
			<div class="row">
				<div id="head_pics_carousel" class="carousel slide"
					data-ride="carousel">
					<!-- Indicators -->
					<ol class="carousel-indicators">
						<li data-target="#head_pics_carousel" data-slide-to="0"
							class="active"></li>
						<li data-target="#head_pics_carousel" data-slide-to="1"></li>
					</ol>

					<!-- Wrapper for slides -->
					<div class="carousel-inner" role="listbox">
						<div class="item active">
							<img src="./resources/imgs/yunnanxl.jpg" alt="pic1"
								style="width: 100%;">
							<div class="carousel-caption">虎跳峡的小陆</div>
						</div>
						<div class="item">
							<img src="./resources/imgs/yunnanxw.jpg" alt="pic2"
								style="width: 100%;">
							<div class="carousel-caption">虎跳峡的小吴</div>
						</div>
					</div>

					<!-- Controls -->
					<a class="left carousel-control" href="#head_pics_carousel"
						role="button" data-slide="prev"> <span
						class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
						<span class="sr-only">Previous</span>
					</a> <a class="right carousel-control" href="#head_pics_carousel"
						role="button" data-slide="next"> <span
						class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
						<span class="sr-only">Next</span>
					</a>
				</div>
			</div>
		</div>
	</div>

	<div class="container-fluid">

		<!-- Content -->
		<div class="row"></div>

		<!-- Footer -->
		<div class="row"></div>
	</div>
	<script type="text/javascript"
		src="./resources/js/jquery-1.11.3.min.js"></script>
	<script type="text/javascript" src="./resources/js/bootstrap.min.js"></script>
</body>
</html>
