<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>HOME PAGE</h1>
<form action="<%=request.getContextPath()%>/Controller" method="post">
Full Name : <input name="name" type="text" required/><br/>
Gender :  <input type="radio" name="gender" value ="male" checked="checked"/>Male
 <input type="radio" name="gender" value ="female"/>Female
 <br/>
 Languages Known : <input type="checkbox" name="language" value ="english"/>English
                   <input type="checkbox" name="language" value ="frence"/>Frence
                   <input type="checkbox" name="language" value ="hindi"/>Hindi
 <br/>
 Country :<select name="country">
           <option value="India">India</option>
           <option value="USA">USA</option>
           <option value="DUBI">DUBI</option>
           <option value="America">America</option>
           
 </select>
 <br/>
 <input type="submit" value="Submit">
</form>

</body>
</html>