<%--
  Created by IntelliJ IDEA.
  User: patryk
  Date: 04/02/2021
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Użytkownicy</h1>
        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Dodaj nowego użytkownika</a>
    </div>

    <!-- panel administratora -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Lista wszystkich użytkowników</h6>
        </div>
        <div class="card-body">
            <table>
                <tr>
                    <th>ID</th>
                    <td>${user.id}</td>
                </tr>
                <tr>
                    <th>Nazwa użytkownika</th>
                    <td>${user.userName}</td>
                </tr>
                <tr>
                    <th>e-mail</th>
                    <td>${user.email}</td>
                </tr>
            </table>
        </div>
    </div>
</div>

<%@ include file="footer.jsp" %>
