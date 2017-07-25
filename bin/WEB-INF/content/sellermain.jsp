<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div id="divForm">
   <input type="file" id="myfile">
   <input type="button" id="btnOpen" value="选择文件">
   
    $(function(){
        $("#btnOpen").click(function(){
            var path=$("#myfile").val(); //得到选择的文件的路径及文件名
        });
    });
    
 </div>
</body>
</html>