<%-- 
    Document   : all_recent_book
    Created on : Apr 24, 2024, 2:14:08 PM
    Author     : Hoang
--%>

<%@page import="java.util.List"%>
<%@page import="DAO.BookDAOImpl"%>
<%@page import="DAO.BookDAOImpl"%>
<%@page import="entity.BookDtls"%>
<%@page import="DB.DBConnect"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>All Recent Book</title>
        <%@include file="all_component/allCss.jsp"%>
        <style type="text/css">
             
            .crd-ho:hover{
                background-color: #f7f7f7;  
            }
        </style>
    </head>
    <body>
        <%@include file="all_component/narbar.jsp"%>
        <div class="container-fluid">
            <div class="row p-3">

            <%
                    BookDAOImpl dao = new BookDAOImpl(DBConnect.getConnection());
                    List<BookDtls> list = dao.getAllOldBook();
                    for (BookDtls b : list) {%>
                <div class="col-md-3">

                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhoto()%>" style="width: 100px; height: 150px"
                                 class="img-thumblin">
                            <p><%=b.getBookName()%></p>
                            <p><%=b.getAuthor()%></p>
                            <p>Categories: <%=b.getBookCategory()%></p>

                            <div class="row">
                                <a href="" class="btn btn-danger btn-sm ml-5"><i class="fa-solid fa-cart-shopping"></i> Add Cart</a>
                                <a href="" class="btn btn-success btn-sm ml-1 mr-1">View Details</a>
                                <a href="" class="btn btn-danger btn-sm"><%=b.getPrice()%><i class="fa-solid fa-dollar-sign"></i></a>

                            </div>
                        </div>
                    </div>
                </div>

                <%}
                %>


            </div>
        </div>
    </body>
</html>
