<%-- 
    Document   : home
    Created on : Mar 31, 2024, 11:18:07 AM
    Author     : Hoang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin: Home</title>
        <%@include file="allCss.jsp" %>
        <style>
            a{
                text-decoration: none;
                color: black;
            }
            a:hover{
                text-decoration: none;
                color: black;
            }
        </style>
    </head>
    <body>
        <%@include file="narbar.jsp" %>
        <c:if test="${empty userobj}">
            <c:redirect url="../login.jsp"/>
        </c:if>
        <div class="container">
            <div class="row p-5">
                <div class="col-md-3">
                    <a href="add_book.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fa-solid fa-plus fa-3x text-primary"></i><br/>  
                                <h4>Add book</h4>
                                -------------
                            </div>

                        </div>
                    </a>
                </div>
                <div class="col-md-3">
                    <a href="all_books.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fa-solid fa-book-tanakh fa-3x text-danger"></i><br/>  
                                <h4>All book</h4>
                                -------------
                            </div>

                        </div>
                    </a>

                </div>
                <div class="col-md-3">
                    <a href="orders.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fa-solid fa-box-open fa-3x text-warning"></i><br/>  
                                <h4>Orders book</h4>
                                -------------
                            </div>

                        </div>
                    </a>
                </div>
                <div class="col-md-3">
                    <a href="logout_book.jsp">
                        <div class="card">
                            <div class="card-body text-center">
                                <i class="fa-solid fa-right-from-bracket fa-3x text-primary"></i><br/>  
                                <h4>logout book</h4>
                                -------------
                            </div>

                        </div>
                    </a>
                </div>
            </div>

        </div>
        <div style="margin-top: 295px;">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
