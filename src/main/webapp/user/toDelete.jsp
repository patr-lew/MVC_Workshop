<%--
  Created by IntelliJ IDEA.
  User: patryk
  Date: 04/02/2021
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="header.jsp" %>


<!-- Begin Page Content -->
<div class="container-fluid">
    <div>
        <c:if test="${not empty param.info}">
            <c:if test="${param.info == 'success'}">
                <h4>Poprawnie dodano użytkownika</h4>
            </c:if>
        </c:if>
    </div>
    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Użytkownicy</h1>
        <a href="/user/add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Dodaj nowego użytkownika</a>
    </div>


    <!-- panel administratora -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Czy na pewno chcesz usunąć użytkownika ${param.username}?</h6>
        </div>
        <div>
            <form action="${pageContext.request.contextPath}/user/delete" method="get">
                <input type="hidden" value="${param.id}" name="id">
                <button type="submit" value="YAS!">YAS!</button>
            </form>
            <form action="${pageContext.request.contextPath}/user/list" method="get">
                <button type="submit" value="Nope, zmieniłem zdanie">Nope, zmieniłem zdanie</button>
            </form>
        </div>
    </div>
</div>

<%@ include file="footer.jsp" %>
