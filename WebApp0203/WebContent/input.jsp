<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Math</title>
</head>
<body>
	<%
		String errorA="";
		if(request.getAttribute("errorA")!=null){
			errorA=(String)request.getAttribute("errorA");
		}
		String errorB="";
		if(request.getAttribute("errorB")!=null){
			errorB=(String)request.getAttribute("errorB");
		}
		String errorC="";
		if(request.getAttribute("errorC")!=null){
			errorC=(String)request.getAttribute("errorC");
		}
		String a;
		String b;
		int c;
		if(request.getAttribute("a")!=null){
			a=(String)request.getAttribute("a");
		}else{
			a="0";
		}
		if(request.getAttribute("b")!=null){
			b=(String)request.getAttribute("b");
		}else{
			b="0";
		}
		if(request.getAttribute("c")!=null){
			c=(Integer)request.getAttribute("c");
		}else{
			c=0;
		}
		
	%>
	<form action = "../WebApp0203/math" method = "post">
		
		<br/>
		
		a: <input type = "text"  id = "a" name = "a" value = '<%=a%>'/>
		<br/>
		<%=errorA %>
		<br/>
		b: <input type = "text"  id = "b" name = "b" value = '<%=b%>'/>
		<br/>
		<%=errorB %>
		<br/>
		c: <input type = "text" id = "c" name = "c" value = '<%=c%>'/>
		<br/>
		<%= errorC %>
		<br/>
		<input type = "submit" value = "plus" name = "operation" id = "operation" />
		<input type = "submit" value="minus" name = "operation" id = "operation" />
	</form>

</body>
</html>