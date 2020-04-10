package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("  <title>Home page</title>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.6.3/css/all.css\" integrity=\"sha384-UHRtZLI+pbxtHCWp1t77Bi1L4ZtiqrqD80Kn4Z8NTSRyMA2Fd33n5dQ8lWUE00s/\" crossorigin=\"anonymous\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("      .background{\n");
      out.write("          background-color: whitesmoke;\n");
      out.write("      }\n");
      out.write("      .font-color{\n");
      out.write("          color: white;\n");
      out.write("      }\n");
      out.write("      .nav-link:hover {\n");
      out.write("          color: black;\n");
      out.write("          background-color:whitesmoke; \n");
      out.write("          margin: 0;\n");
      out.write("          display: block;\n");
      out.write("      }\n");
      out.write("      .link:hover{\n");
      out.write("           color: tomato; \n");
      out.write("           text-decoration: none;\n");
      out.write("          margin: 0;\n");
      out.write("      }\n");
      out.write("      \n");
      out.write("      \n");
      out.write("  </style>\n");
      out.write("  \n");
      out.write("</head>\n");
      out.write("<body class=\"background\">\n");
      out.write("<header>\n");
      out.write("<nav class=\"navbar navbar-expand-sm bg-dark fixed-top\">\n");
      out.write("  <!-- Links -->\n");
      out.write("  <ul class=\"navbar-nav\" >\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link font-color\" href=\"home.jsp\" style=\"padding-left:20px;\"><i class=\"fas fa-home\"></i> Home</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item \">\n");
      out.write("      <a class=\"nav-link font-color\" href=\"bookmark.jsp\" style=\"padding-left:20px;\"><i class=\"fas fa-bookmark\"></i> Bookmark</a>\n");
      out.write("    </li>\n");
      out.write("    <li class=\"nav-item\">\n");
      out.write("      <a class=\"nav-link font-color\" href=\"contact.jsp\" style=\"padding-left:20px;\"><i class=\"fas fa-user-friends\"></i> Contact</a>\n");
      out.write("    </li>   \n");
      out.write("  </ul>\n");
      out.write("  \n");
      out.write("  <ul class=\"navbar-nav ml-auto\">           \n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link font-color\" href=\"about.jsp\" style=\"padding-left:20px;\"><i class=\"fas fa-user-circle\"></i> Profile</a>\n");
      out.write("     </li>\n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("        <a class=\"nav-link font-color\" href=\"index.jsp\" style=\"padding-left:20px;\"><i class=\"fas fa-sign-out-alt\"></i> Logout</a>\n");
      out.write("     </li>\n");
      out.write("  </ul>\n");
      out.write("\n");
      out.write("</nav>\n");
      out.write("<br>\n");
      out.write("</header>\n");
      out.write("<div class=\"container\">\n");
      out.write("  ");
 for(int i=1;i<=20;i++){ 
      out.write("\n");
      out.write("  <br>\n");
      out.write("  ");
 } 
      out.write("\n");
      out.write("</div>\n");
      out.write("<footer>\n");
      out.write("    <div class=\"container-fluid \">\n");
      out.write("        <div class=\"row font-color\" style=\"background-color: black;padding-top: 20px;padding-left: 30px;padding-bottom: 20px;\">\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <h6>Quick Links</h6>\n");
      out.write("                <a href=\"home.jsp\" class=\"font-color link\">Home</a><br>\n");
      out.write("                <a href=\"bookmar.jsp\" class=\"font-color link\">Bookmark</a><br>\n");
      out.write("                <a href=\"contact.jsp\" class=\"font-color link\">Contact</a><br>\n");
      out.write("                <a href=\"about.jsp\" class=\"font-color link\">Profile</a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <h6>Contuct Us</h6>\n");
      out.write("                <h7>01933245746</h7><br>\n");
      out.write("                <h7>0161167654</h7><br>               \n");
      out.write("                <a href=\"\" class=\"font-color link\">samim825.blogspot.com</a>\n");
      out.write("                <p class=\"font-color\">samimhossain825@gmail.com</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-4\">\n");
      out.write("                <h6>About Us</h6>\n");
      out.write("                <p>We are softtech limited.We provide different types of service.This is our bookmarking and Contact saving web app.</p>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <div class=\"row \" align='center' style=\"padding-left: 10px;\">\n");
      out.write("            <p> softtech@2020 , All right's reserved</p>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</footer>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
