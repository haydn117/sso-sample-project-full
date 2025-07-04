
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="layout.jsp" %>
<div class="container">
  <h2>공지사항 목록</h2>
  <table>
    <thead>
      <tr><th>No</th><th>제목</th><th>작성일</th></tr>
    </thead>
    <tbody>
      <c:forEach var="notice" items="${noticeList}">
        <tr>
          <td>${notice.noticeId}</td>
          <td><a href="/notice/view/${notice.noticeId}">${notice.title}</a></td>
          <td>${notice.createdAt}</td>
        </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
