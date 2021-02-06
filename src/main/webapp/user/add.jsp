<%--
  Created by IntelliJ IDEA.
  User: patryk
  Date: 04/02/2021
  Time: 08:14
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
            <h6 class="m-0 font-weight-bold text-primary">Dodaj nowego użytkownika</h6><br/>
            <form action="/user/add" method="post">
                <div class="form-group">
                    <label for="userName">Nazwa Użytkownika:</label>
                    <input name="username" type="text" class="form-control" id="userName" placeholder="Nazwa użytkownika">
                </div>
                <div class="form-group">
                    <label for="userEmail">Email:</label>
                    <input name="email" type="text" class="form-control" id="userEmail" placeholder="Adres e-mail">
                </div>
                <div class="form-group">
                    <label for="userPass">Hasło:</label>
                    <input name="password" type="password" class="form-control" id="userPass" placeholder="Hasło">
                </div>
                <button type="submit" class="brn btn-primary">Zapisz</button>
            </form>
        </div>
        <div class="card-body">


        </div>
    </div>
</div>

<%@ include file="footer.jsp" %>