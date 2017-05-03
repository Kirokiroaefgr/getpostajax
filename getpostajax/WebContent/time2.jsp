<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%--bootstrap.cssの読み込み --%>
<link rel="stylesheet"
	href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<%--jQueryの読み込み bootstrap.jsよりさきに読み込まないといけない--%>
<script src="//ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
<%--bootstrap.jsの読み込み --%>
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>時間時間</title>
<link rel="stylesheet" href="./css/time2.css">
<script src="./js/test2.js"></script>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-lg-12"
				style="background: red; height: 0px;">


				<input type="number" id="processDateForm" name="processDate" />
				<button id="mimi" class="btn btn-primary">送る</button>

				<button id="b1">ボタン</button>

<div class="panel panel-default">
  <div class="panel-heading">商品       <div class="oko"></div></div>
  <div class="panel-body">
    <div id="item">検索結果なし</div>
  </div>
</div>


<div id="content">
    <div id="rect">box</div>
</div>

			</div>
		</div>
	</div>

</body>
</html>