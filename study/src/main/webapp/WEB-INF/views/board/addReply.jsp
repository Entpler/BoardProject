<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%--<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

${info.boardNo}
<form method="post" action="/board/insertReply/${info.boardNo}">
    <input type="hidden" name="boardNo" value="${info.boardNo}">
    <table border="1">
        <tr>
            <th>답글제목</th>
            <th>답글내용</th>
            <th>작성자</th>
            <th>작성일</th>
        </tr>
        <tr>
            <td><input type="text" name="replyContent"></td>
            <td><input type="textarea" name="replyTitle"></td>
            <td><input type="text" name="writer"></td>
            <td><input type="text" name="regDate"></td>
            <td><input type="hidden" name="boardNo" value="${info.boardNo}"></td>
        </tr>
        <tr>
            <td colspan="4">
                <button type="submit">답글쓰기</button>
            </td>
        </tr>
    </table>
</form>
