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
	<div class="search">
		<form method="get" action="index.html">
			<input type="text" name="keywords" class="input-text" /><input type="submit" name="submit" class="input-button" value="" />
		</form>
	</div>
</div>
<div id="message" class="box">
	<h2>��ʾ��Ϣ</h2>
	<div class="content">
		<p>��ϲ��ͶƱ�ɹ���<a href="Subject!list.action">����ͶƱ��ҳ&gt;&gt;</a></p>
	</div>
</div>
<div id="footer" class="wrap">
	Դ����Ϣ &copy; ��Ȩ����
</div>
</body>
</html>
