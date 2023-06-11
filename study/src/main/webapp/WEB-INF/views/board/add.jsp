<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<form method="post" action="/board/insertQna">
<table border="1">
    <tr>
        <th>제목</th>
        <th>내용</th>
        <th>작성자</th>
        <th>작성일</th>
    </tr>
    <tr>
        <td><input type="text" name="title"></td>
        <td><input type="text" name="content"></td>
        <td><input type="text" name="writer"></td>
        <td><input type="text" name="regDate"></td>
    </tr>
    <div style="margin-bottom: auto">
        <button type="submit">글쓰기</button>
    </div>


</table>
</form>