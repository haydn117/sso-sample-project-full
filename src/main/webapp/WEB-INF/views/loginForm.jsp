
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="layout.jsp" %>
<div class="container">
  <h2>로그인</h2>
  <form action="/login" method="post">
    <label>ID:</label><br/>
    <input type="text" name="userId" required /><br/>
    <label>비밀번호:</label><br/>
    <input type="password" name="password" required /><br/>
    <button type="submit">로그인</button>
  </form>
  <c:if test="${not empty param.warn}">
    <p style="color:red">⚠ ${param.warn}</p>
  </c:if>
</div>