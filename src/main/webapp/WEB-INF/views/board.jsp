
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="layout.jsp" %>
<div class="container">
  <h2>게시판 목록</h2>
  <a href="/board/write" class="btn">+ 글쓰기</a>
  <table>
    <thead>
      <tr><th>No</th><th>제목</th><th>작성자</th><th>작성일</th></tr>
    </thead>
    <tbody>
      <c:forEach var="board" items="${boardList}">
        <tr>
          <td>${board.boardId}</td>
          <td><a href="/board/view/${board.boardId}">${board.title}</a></td>
          <td>${board.writer}</td>
          <td>${board.createdAt}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
