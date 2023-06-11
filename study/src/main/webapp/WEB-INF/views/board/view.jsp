<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<div style="width: 50%; margin: 0 auto;">
    ${info.boardNo}
    <form method="get" action="/board/insertReplyForm/${info.boardNo}">
        <button type="submit">답글달기</button>
    </form>

    <table border="1" style="width: 100%;">
        <tr>
            <th style="width: 20%;">작성자</th>
            <th style="width: 30%;">제목</th>
            <th style="width: 30%;">내용</th>
            <th style="width: 20%;">작성시간</th>
        </tr>
        <tr>
            <td>${info.writer}</td>
            <td>${info.title}</td>
            <td>${info.content}</td>
            <td>${info.regDate}</td>
        </tr>
    </table>

    <!-- 댓글 창 -->
    <form method="post" action="/board/addComment/${info.boardNo}">
        <table border="1" style="width: 100%;">
            <tr>
                <td colspan="4">
                    <textarea name="commentContent" rows="4" style="width: 100%;"></textarea>
                </td>
            </tr>
            <tr>
                <td colspan="4" style="text-align: right;">
                    <input type="hidden" name="boardNo" value="${info.boardNo}">
                    <button type="submit">댓글 작성</button>
                </td>
            </tr>
        </table>
    </form>

    <!-- 댓글 목록 -->
    <table border="1" style="width: 100%;">
        <tr>
            <th style="width: 100%;">댓글</th>
        </tr>
        <c:forEach var="comment" items="${commentList}">
            <tr>
                <td>${comment.commentContent}</td>
            </tr>
        </c:forEach>
    </table>
</div>
