<%@ taglib prefix="e" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>宠物商店</title>
</head>
<body>

<%--<from>--%>
<%--用户名：    <input type="text"/><br />--%>
<%--密  码：       <input type="password"/><br />--%>
<%--确认密码：       <input type="password" /><br />--%>
<%--</from>--%>

<%--<form name="Form2" action="/file/fileUpload2" method="post"  enctype="multipart/form-data">--%>
<%--<h1>采用multipart提供的file.transfer方法上传文件</h1>--%>
<%--<input type="file" name="file">--%>
<%--<input type="submit" value="upload"/>--%>
<%--</form>--%>


<form action="/" method="post">
    宠物名：<input type="text" name="name"/><br/>
    宠物类型：<input type="text" name="category"/><br/>
    宠物状态：<input type="text" name="status"/><br/>
    宠物标签：<input type="text" name="tags"/><br/>
    <input type="submit" value="新增">
</form>


<table border="1" cellspacing="0" cellpadding="1" id="stable" style="text-align: center">
    <tr>
        <th>宠物名</th>
        <th>宠物类型</th>
        <th>宠物状态</th>
        <th>宠物标签</th>
        <th>删除</th>
    </tr>
    <e:forEach items="${pets}" var="p">
        <tr>
            <td>${p.name}</td>
            <td>${p.category}</td>
            <td>${p.status}</td>
            <td>${p.tags}</td>
            <td><a href="/delete?petId=${p.id}">删除</a></td>
        </tr>
    </e:forEach>
</table>

<%--<c:forEach items="${pets}" var="pet">--%>
<%--<tr>--%>
<%--<td>--%>
<%--<a href="/pet/selectByPrimaryKey?petId=${pet.petId}">--%>
<%--${pet.petName}--%>
<%--</a></td>--%>
<%--<td>${pet.category.categoryName}</td>--%>
<%--<td>${pet.petPrice}</td>--%>
<%--<td>${pet.petStatus}</td>--%>
<%--<td><a href="/pet/delete?petId=${pet.petId}">删除</a></td>--%>
<%--</tr>--%>
<%--</c:forEach>--%>


<%--private Integer id;--%>

<%--private Integer category;--%>

<%--private String name;--%>

<%--private Integer photourls;--%>

<%--private Integer tags;--%>

<%--private String status;--%>


</body>
</html>
