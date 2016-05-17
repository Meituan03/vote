<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<base href="/Vote01/">
<meta charset="utf-8" />
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="css/style.css"/>
</head>
<body>

<div id="header" class="wrap">
	<img src="images/logo.gif" />
</div>
<div id="navbar" class="wrap">
	<div class="profile">
		您好，a
		<span class="return"><a href="Subject!list.action">返回列表</a></span>
		<span class="addnew"><a href="Subject!read.action">添加新投票</a></span>
		<span class="modify"><a href="Subject!modify.action">维护</a></span>
		
	</div>
	<div class="search">
		<form method="post" action="Subject!search.action">
			<input type="text" name="keywords" class="input-text" value=""/><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>

<div id="vote" class="wrap">
	<h2>参与投票</h2>
	<ul class="list">
		<li>
			<h4>${sessionScope.voteBean.vsTitle}</h4>
			<p class="info">共有 ${sessionScope.voteBean.optionCount}个选项，已有 ${sessionScope.voteBean.voteUserCount} 个网友参与了投票。</p>
			<form method="post" action="vote_save.action">
			    <input type="hidden" name="vsId" value="${sessionScope.voteBean.vsId }"/> 
			    <input type="hidden" name="vuId" value="${sessionScope.loginUser.vuId }"/> 
				<ol>
					<c:set var="sType" value="${sessionScope.voteBean.vsType eq 1? 'radio' :'checkbox'}"/>
				   	<c:forEach items="${sessionScope.voteBean.options }" var="option">
				   		<li><input type="${sType}" name="voId" value="${option.voId }"/>${options.vooption }</li>
				   	</c:forEach>
				</ol>
				<p class="voteView"><input type="image" src="images/button_vote.gif" /><a href="Vote!view.action?entityId=103"><img src="images/button_view.gif" /></a></p>
			</form>
		</li>
	</ul>
</div>
<div id="footer" class="wrap">
	源辰信息 &copy; 版权所有
</div>
</body>
</html>