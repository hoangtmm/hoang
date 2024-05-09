package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import entity.BookDtls;
import DB.DBConnect;
import DAO.BookDAOImpl;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/all_component/allCss.jsp");
    _jspx_dependants.add("/all_component/narbar.jsp");
    _jspx_dependants.add("/all_component/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ebook: Index</title>\n");
      out.write("        ");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\" integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("<link rel=\"stylesheet\" href=\"all_component/style.css\">");
      out.write("\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            .back-img{\n");
      out.write("                background: url(\"images/book.png\");\n");
      out.write("                height: 40vh;\n");
      out.write("                width: 100%;\n");
      out.write("                background-size: cover;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("            }   \n");
      out.write("            .crd-ho:hover{\n");
      out.write("                background-color: #f7f7f7;  \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #f7f7f7\">\n");
      out.write("        ");
      out.write("<div class=\"container-fluid\" style=\"height: 10px; background-color: #303f9f\"></div>\n");
      out.write("\n");
      out.write("<div class=\"container-fluid p-3 bg-light\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("        <div class=\"col-md-3 text-success\">\n");
      out.write("            <h3><i class=\"fa-solid fa-book\"></i> Ebooks</h3>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-6\">\n");
      out.write("            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("                <button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-3\">\n");
      out.write("            <a href=\"login.jsp\" class=\"btn btn-success\"><i class=\"fa-solid fa-right-to-bracket\"></i> Login</a>\n");
      out.write("            <a href=\"register.jsp\" class=\"btn btn-primary text-white\"><i class=\"fa-solid fa-registered\"></i> Register</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"#\"> <i class=\"fa-solid fa-house\"></i></a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"index.jsp\"> Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"all_recent_book.jsp\"><i class=\"fa-solid fa-book-open\"></i> Recent Book</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"all_new_book.jsp\"><i class=\"fa-solid fa-book-open\"></i> New Book</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link disabled\" href=\"all_old_book.jsp\"><i class=\"fa-solid fa-book-open\"></i> Old Book</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <button class=\"btn btn-light my-2 my-sm-0 mr-2\" type=\"submit\"><i class=\"fa-solid fa-gears\"></i> Setting</button>\n");
      out.write("            <button class=\"btn btn-light my-2 my-sm-0\" type=\"submit\"><i class=\"fa-solid fa-phone-volume\"></i> Contact Us</button>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("        <div class=\"container-fluid back-img\">\n");
      out.write("            <h2 class=\"text-center text-white\">EBook Management System</h2> \n");
      out.write("        </div>\n");
      out.write("        <!--Start Recent Book-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"text-center\">Recent Book</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                ");

                    BookDAOImpl dao2 = new BookDAOImpl(DBConnect.getConnection());
                    List<BookDtls> list2 = dao2.getAllRecentBook();
                    for (BookDtls b : list2) {
                
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card crd-ho\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"book/");
      out.print(b.getPhoto());
      out.write("\" style=\"width: 150px; height: 200px\"\n");
      out.write("                                 class=\"img-thumblin\">\n");
      out.write("                            <p>");
      out.print(b.getBookName());
      out.write("</p>\n");
      out.write("                            <p>");
      out.print(b.getAuthor());
      out.write("</p>\n");
      out.write("                            <p>\n");
      out.write("                                ");

                                    if (b.getBookCategory().equals("Old")) {
                                
      out.write("\n");
      out.write("                                Categories: ");
      out.print(b.getBookCategory());
      out.write("</p>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <a href=\"view_books.jsp\" class=\"btn btn-success btn-sm ml-5\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice());
      out.write("<i class=\"fa-solid fa-dollar-sign\"></i></a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");

                            } else {
                            
      out.write("\n");
      out.write("                            Categories: ");
      out.print(b.getBookCategory());
      out.write("</p>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm mr-1\"><i class=\"fa-solid fa-cart-shopping\"></i> Add Cart</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-success btn-sm mr-1\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm\">");
      out.print(b.getPrice());
      out.write("<i class=\"fa-solid fa-dollar-sign\"></i></a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center mt-1\"><a href=\"all_recent_book.jsp\" class=\"btn btn-danger btn-sm text-white\">View all</a></div>\n");
      out.write("        </div>\n");
      out.write("        <!--End Recent Book-->\n");
      out.write("        <hr>\n");
      out.write("        <!--Start New Book-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"text-center\">New Book</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");

                    BookDAOImpl dao = new BookDAOImpl(DBConnect.getConnection());
                    List<BookDtls> list = dao.getNewBook();
                    for (BookDtls b : list) {
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("\n");
      out.write("                    <div class=\"card crd-ho\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"book/");
      out.print(b.getPhoto());
      out.write("\" style=\"width: 150px; height: 200px\"\n");
      out.write("                                 class=\"img-thumblin\">\n");
      out.write("                            <p>");
      out.print(b.getBookName());
      out.write("</p>\n");
      out.write("                            <p>");
      out.print(b.getAuthor());
      out.write("</p>\n");
      out.write("                            <p>Categories: ");
      out.print(b.getBookCategory());
      out.write("</p>\n");
      out.write("\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm mr-1\"><i class=\"fa-solid fa-cart-shopping\"></i> Add Cart</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-success btn-sm mr-1\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm\">");
      out.print(b.getPrice());
      out.write("<i class=\"fa-solid fa-dollar-sign\"></i></a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                ");
}
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center mt-1\"><a href=\"all_new_book.jsp\" class=\"btn btn-danger btn-sm text-white\">View all</a></div>\n");
      out.write("        </div>\n");
      out.write("        <!--End New Book-->\n");
      out.write("        <hr>\n");
      out.write("\n");
      out.write("        <!--Start Old Book-->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h3 class=\"text-center\">Old Book</h3>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                ");

                    BookDAOImpl dao3 = new BookDAOImpl(DBConnect.getConnection());
                    List<BookDtls> list3 = dao3.getOldBook();
                    for (BookDtls b : list3) {
                
      out.write("\n");
      out.write("                <div class=\"col-md-3\">\n");
      out.write("                    <div class=\"card crd-ho\">\n");
      out.write("                        <div class=\"card-body text-center\">\n");
      out.write("                            <img alt=\"\" src=\"book/");
      out.print(b.getPhoto());
      out.write("\" style=\"width: 150px; height: 200px\"\n");
      out.write("                                 class=\"img-thumblin\">\n");
      out.write("                            <p>");
      out.print(b.getBookName());
      out.write("</p>\n");
      out.write("                            <p>");
      out.print(b.getAuthor());
      out.write("</p>\n");
      out.write("                            <p>Categories: ");
      out.print(b.getBookCategory());
      out.write("</p>\n");
      out.write("                            <div class=\"row\">\n");
      out.write("                                <a href=\"\" class=\"btn btn-success btn-sm ml-5\">View Details</a>\n");
      out.write("                                <a href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice());
      out.write("<i class=\"fa-solid fa-dollar-sign\"></i></a>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"text-center mt-1\"><a href=\"all_old_book.jsp\" class=\"btn btn-danger btn-sm text-white\">View all</a></div>\n");
      out.write("        </div>\n");
      out.write("        <!--End Old Book-->\n");
      out.write("\n");
      out.write("        ");
      out.write("<div class=\"container-fluid text-center text-white p-3 mt-1\" style=\"background-color: #303f9f\">\n");
      out.write("    <h5>Design and Developed by CodeWith Pabitra</h5>\n");
      out.write("    \n");
      out.write("</div>");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
