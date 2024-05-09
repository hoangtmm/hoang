<%-- 
    Document   : add_book
    Created on : Apr 2, 2024, 7:28:11 PM
    Author     : Hoang
--%>

<%@page import="DB.DBConnect"%>
<%@page import="entity.BookDtls"%>
<%@page import="DAO.BookDAOImpl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin: Edit Books</title>
        <%@include file="allCss.jsp" %>
    </head>
    <body style="background-color: #f0f2f2">
        <%@include file="narbar.jsp" %>
        <div class="container">
            <div class="row">
                <div class="col-md-4 offset-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h4 class="text-center">Edit Books</h4>
                          
                            <%
                                int id = Integer.parseInt(request.getParameter("bookId"));
                                BookDAOImpl dao = new BookDAOImpl(DBConnect.getConnection());
                                BookDtls b = dao.getBookById(id);
                            %>
                            <form action="../editbooks" method="post" enctype="multipart/form-data">
                                <input type="hidden" name="bookId" value="<%= b.getBookId() %>">
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Book Name*</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="bname" value="<%=b.getBookName()%>">
                                </div>  
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Author Name*</label>
                                    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="author" value="<%=b.getAuthor()%>">
                                </div>  
                                <div class="form-group">
                                    <label for="exampleInputEmail1">Price*</label>
                                    <input type="number" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" name="price" value="<%=b.getPrice()%>">
                                </div>  

                                <div class="form-group">
                                    <label for="inputState">Book Status</label>
                                    <select id="inputState" name="status" class="form-control">
                                        <% if ("Active".equals(b.getStatus())) {%>
                                        <option value="Active">Active</option>
                                        <option value="Inactive">Inactive</option>
                                        <%
                                        } else {
                                        %>
                                        <option value="Active">Active</option>
                                        <option value="Inactive">Inactive</option>

                                        <%
                                            }
                                        %>

                                    </select>
                                </div> 

                                <button type="submit" class="btn btn-primary">Update</button>
                            </form>
                        </div>

                    </div>

                </div>

            </div>
        </div>
        <div style="margin-top: 20px;">
            <%@include file="footer.jsp" %>
        </div>
    </body>
</html>
