<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<s:debug></s:debug>
	User name <s:property value="userName" /><br/>
	Gender <s:property value="gender" /><br/>
	Country <s:property value="country" /><br/>
	About you <s:property value="about" /><br/>
	Community <s:property value="community" /><br/>
	Mailing list <s:property value="mailinglist" /><br/>

</body>
</html>