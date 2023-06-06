<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<table border="1">
    <tr>
        <th>글번호</th>
        <th>작성자</th>
        <th>제목</th>
        <th>작성시간</th>
    </tr>
    <c:if test="${not empty list}">
        <c:forEach items="${list}" var="item">
            <tr>
                <td>${item.boardNo}</td>
                <td>${item.writer}</td>
                <td><a href="/boardRead?num=${item.boardNo}">${item.title}</a></td>
                <td>${item.regDate}</td>
            </tr>
        </c:forEach>
    </c:if>
</table>
