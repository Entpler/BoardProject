
<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



${info.boardNo}
<form method="get" action="/board/insertReplyForm/${info.boardNo}">
<table border="1">
    <tr>
        <th>글번호</th>
        <th>작성자</th>
        <th>제목</th>
        <th>작성시간</th>
    </tr>
    <tr>
        <td>${info.boardNo}</td>
        <td>${info.writer}</td>
        <td>${info.title}</td>
        <td>${info.regDate}</td>
    </tr>
</table>


<button type="submit">답글달기</button>
</form>