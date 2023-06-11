<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }

    th, td {
        border: 1px solid black;
        padding: 8px;
    }

    th {
        background-color: lightgray;
    }

    .reply-title {
        padding-left: 20px;
    }
</style>

<table>
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
                <td><a href="/board/view/${item.boardNo}">${item.title}</a></td>
                <td>${item.regDate}</td>
            </tr>
            <c:if test="${not empty item.replyList}">
                <c:forEach items="${item.replyList}" var="reply">
                    <tr>
                        <td>${reply.replyNo}</td>
                        <td>${reply.writer}</td>
                        <td class="reply-title">└ RE: ${reply.replyTitle}</td>
                        <td>${reply.regDate}</td>
                    </tr>
                </c:forEach>
            </c:if>
        </c:forEach>
    </c:if>
    <tr>
        <td colspan="4" class="button-container">
            <form method="get" action="/board/insertQna">
                <input type="hidden" name="boardNo" value="${item.boardNo}">
                <button type="submit">글쓰기</button>
            </form>
        </td>
    </tr>
</table>
