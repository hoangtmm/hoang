<%-- 
    Document   : index
    Created on : Mar 24, 2024, 8:57:08 AM
    Author     : Hoang
--%>


<%@page import="java.util.List"%>
<%@page import="entity.BookDtls"%>
<%@page import="DB.DBConnect"%>
<%@page import="DAO.BookDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ebook: Index</title>
        <%@include file="all_component/allCss.jsp"%>
        <style type="text/css">
            .back-img{
                background: url("images/book.png");
                height: 40vh;
                width: 100%;
                background-size: cover;
                background-repeat: no-repeat;
            }   
            .crd-ho:hover{
                background-color: #f7f7f7;  
            }
        </style>
    </head>
    <body style="background-color: #f7f7f7">
        <%@include file="all_component/narbar.jsp" %>
        <div class="container-fluid back-img">
            <h2 class="text-center text-white">EBook Management System</h2> 
        </div>
        <!--Start Recent Book-->
        <div class="container">
            <h3 class="text-center">Recent Book</h3>
            <div class="row">

                <%
                    BookDAOImpl dao2 = new BookDAOImpl(DBConnect.getConnection());
                    List<BookDtls> list2 = dao2.getAllRecentBook();
                    for (BookDtls b : list2) {
                %>
                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhoto()%>" style="width: 150px; height: 200px"
                                 class="img-thumblin">
                            <p><%=b.getBookName()%></p>
                            <p><%=b.getAuthor()%></p>
                            <p>
                                <%
                                    if (b.getBookCategory().equals("Old")) {
                                %>
                                Categories: <%=b.getBookCategory()%></p>

                            <div class="row">
                                <a href="view_books.jsp?bid=<%=b.getBookId() %>" class="btn btn-success btn-sm ml-5">View Details</a>
                                <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%><i class="fa-solid fa-dollar-sign"></i></a>

                            </div>
                            <%
                            } else {
                            %>
                            Categories: <%=b.getBookCategory()%></p>

                            <div class="row">
                                <a href="" class="btn btn-danger btn-sm mr-1"><i class="fa-solid fa-cart-shopping"></i> Add Cart</a>
                                <a href="view_books.jsp?bid=<%=b.getBookId() %>" class="btn btn-success btn-sm mr-1">View Details</a>
                                <a href="" class="btn btn-danger btn-sm"><%=b.getPrice()%><i class="fa-solid fa-dollar-sign"></i></a>

                            </div>
                            <%
                                }
                            %>
                            </p>

                        </div>
                    </div>
                </div>  
                <%
                    }
                %>

            </div>
            <div class="text-center mt-1"><a href="all_recent_book.jsp" class="btn btn-danger btn-sm text-white">View all</a></div>
        </div>
        <!--End Recent Book-->
        <hr>
        <!--Start New Book-->
        <div class="container">
            <h3 class="text-center">New Book</h3>
            <div class="row">
                <%
                    BookDAOImpl dao = new BookDAOImpl(DBConnect.getConnection());
                    List<BookDtls> list = dao.getNewBook();
                    for (BookDtls b : list) {%>
                <div class="col-md-3">

                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhoto()%>" style="width: 150px; height: 200px"
                                 class="img-thumblin">
                            <p><%=b.getBookName()%></p>
                            <p><%=b.getAuthor()%></p>
                            <p>Categories: <%=b.getBookCategory()%></p>

                            <div class="row">
                                <a href="" class="btn btn-danger btn-sm mr-1"><i class="fa-solid fa-cart-shopping"></i> Add Cart</a>
                                <a href="view_books.jsp?bid=<%=b.getBookId() %>" class="btn btn-success btn-sm mr-1">View Details</a>
                                <a href="" class="btn btn-danger btn-sm"><%=b.getPrice()%><i class="fa-solid fa-dollar-sign"></i></a>

                            </div>
                        </div>
                    </div>
                </div>

                <%}
                %>







            </div>
            <div class="text-center mt-1"><a href="all_new_book.jsp" class="btn btn-danger btn-sm text-white">View all</a></div>
        </div>
        <!--End New Book-->
        <hr>

        <!--Start Old Book-->
        <div class="container">
            <h3 class="text-center">Old Book</h3>
            <div class="row">
                <%
                    BookDAOImpl dao3 = new BookDAOImpl(DBConnect.getConnection());
                    List<BookDtls> list3 = dao3.getOldBook();
                    for (BookDtls b : list3) {
                %>
                <div class="col-md-3">
                    <div class="card crd-ho">
                        <div class="card-body text-center">
                            <img alt="" src="book/<%=b.getPhoto()%>" style="width: 150px; height: 200px"
                                 class="img-thumblin">
                            <p><%=b.getBookName()%></p>
                            <p><%=b.getAuthor()%></p>
                            <p>Categories: <%=b.getBookCategory()%></p>
                            <div class="row">
                                <a href="view_books.jsp?bid=<%=b.getBookId() %>" class="btn btn-success btn-sm ml-5">View Details</a>
                                <a href="" class="btn btn-danger btn-sm ml-1"><%=b.getPrice()%><i class="fa-solid fa-dollar-sign"></i></a>

                            </div>
                        </div>
                    </div>
                </div>  
                <%
                    }
                %>




            </div>
            <div class="text-center mt-1"><a href="all_old_book.jsp" class="btn btn-danger btn-sm text-white">View all</a></div>
        </div>
        <!--End Old Book-->

        <%@include file="all_component/footer.jsp" %>
    </body>
</html>
