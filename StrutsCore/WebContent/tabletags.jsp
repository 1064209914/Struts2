<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:iterator value="{'zhangsan','lisi','wangwu' }" id="name" status="st" >
		<table>
		<tr <s:if test="#st.Odd">
		   style="background-color:red" </s:if> > 
		<td> <s:property value="name" /> </td> </tr>
		
		
		</table>
	</s:iterator>

</body>
</html>