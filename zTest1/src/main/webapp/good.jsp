<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title></title>
</head>
<body>

<table border="1" width="300">
    <tr>
        <th>商品名称</th>
        <th>商品价格</th>
        <th>商品生成日期</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="g">
        <tr>
            <td>${g.name}</td>
            <td>${g.price}</td>
            <fmt:formatDate value="${g.date}" pattern="yyyy-MM-dd"/>
            <td>
                <a href="delete?id=${g.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
