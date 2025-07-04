<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
  <title>SSO 통합 페이지</title>
  <link rel="stylesheet" href="/resources/css/style.css">
  <script src="/resources/js/script.js"></script>
</head>
<body>
  <header>
    <h1>SSO Sample 시스템</h1>
    <nav>
      <a href="/main">🏠 홈</a>
      <a href="/notice/list">📢 공지사항</a>
      <a href="/board/list">📝 게시판</a>
      <a href="/logout">🔒 로그아웃</a>
    </nav>
  </header>

  <main>
    <c:import url="${body}" />
  </main>
  <!--
  <main>
    <jsp:include page="${body}" />
  </main>
  -->

  <footer>
    <p>© 2025 MySSO Corp. All rights reserved.</p>
  </footer>
</body>
</html>
