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
        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i
                class="fas fa-download fa-sm text-white-50"></i> Dodaj nowego użytkownika</a>
    </div>

    <!-- Approach -->
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Development Approach</h6>
        </div>
        <div class="card-body">
            <p>Lista wszystkich użytkowników</p>

            <table>
                <tr>
                    <th>Lp.</th>
                    <th>Użytkownik</th>
                    <th>e-mail</th>
                    <th>Akcja</th>
                </tr>
                <c:forEach items="${users}" var="user" varStatus="count">
                    <tr>
                        <td>${count.count}</td>
                        <td>${user.userName}</td>
                        <td>${user.email}</td>
                        <td><a href="/delete">Usuń</a>
                            <a href="/edit">Edytuj</a>
                            <a href="/show">Pokaż</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>
</div>

<%@ include file="footer.jsp" %>