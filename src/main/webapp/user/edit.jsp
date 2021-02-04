<%--
  Created by IntelliJ IDEA.
  User: patryk
  Date: 04/02/2021
  Time: 23:43
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="header.jsp" %>


<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Użytkownicy</h1>
        <a href="/user/add" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Dodaj nowego użytkownika</a>
    </div>

    <!-- panel administratora -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Edytuj użytkownika</h6>
            <form action="/user/edit" method="post">
                nazwa użytkownika: <br> <input name="username" value="${user.userName}" type="text"> <br><br>
                email: <br> <input type="text" name="email" value="${user.email}"> <br><br>
                hasło: <br><input type="password" name="password" placeholder="podaj ponownie hasło"><br><br>
                <input type="hidden" type="text" name="id" value="${user.id}">
                <input type="submit" value="wyślij">
            </form>
        </div>

    </div>
</div>

<%@ include file="footer.jsp" %>
