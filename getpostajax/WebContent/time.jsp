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
<title>時間時間</title>
<script src="./js/test.js"></script>
</head>
<body>

	<div class="container">
		<div class="row">
			<div class="col-xs-12 col-lg-12"
				style="background: red; height: 0px;">
				現在の時刻
				<div id="time">
					<s:property value="model.time" />
				</div>

<s:property value="object.get('itemB[0].itemName')"/>

			<table class="table table-bordered">
				<thead>
					<tr style= "border-top: #b3b3b3 4px solid; border-bottom: #b3b3b3 4px solid;">
					<th>No</th>
						<th>名前</th>
					</tr>
				</thead>
					<thead class="dl">
					</thead>
			</table>


<s:iterator value="object.get('itemB')" var="listJsonArray">
<s:property value="itemName" />
    <s:iterator value="listJsonArray" var="row">
    <s:property value="itemName" />
        <s:iterator value="row" var="jsonObject" >
        <s:property value="itemName" />
            <s:property/>
        </s:iterator>
    </s:iterator>
</s:iterator>


				<input type="button" onclick="update();" value="update">
			</div>
		</div>


	</div>
	<%--jQueryの読み込み bootstrap.jsよりさきに読み込まないといけない--%>
	<script
		src="//ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
	<%--bootstrap.jsの読み込み --%>
	<script
		src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>
</html>