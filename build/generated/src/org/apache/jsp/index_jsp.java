package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.leapfrog.entity.Course;
import com.leapfrog.impl.CourseDAOImpl;
import com.leapfrog.CourseDAO;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Course</title>\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" integrity=\"sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css\" integrity=\"sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\" integrity=\"sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1> <span class=\"glyphicon glyphicon-book\" aria-hidden=\"true\"></span></span> Courses</h1> \n");
      out.write("            <div class=\"pull-right\">\n");
      out.write("\n");
      out.write("                <a href=\"add.jsp\" class=\"btn btn-primary\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-plus\" aria-hidden=\"true\"></span> Add\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table class=\"table table-hover table-bordered\">\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th> ID</th>\n");
      out.write("                    <th> Name </th>\n");
      out.write("                    <th>Description</th>\n");
      out.write("                    <th> Fees </th>\n");
      out.write("                </tr>\n");
      out.write("                ");

                    CourseDAO courseDAO = new CourseDAOImpl();
                    for (Course c : courseDAO.getAll()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
      out.print(c.getId());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(c.getCourseName());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(c.getDescription());
      out.write("</td>\n");
      out.write("                    <td>");
      out.print(c.getFees());
      out.write("</td>\n");
      out.write("                    <td>\n");
      out.write("                        <a href=\"editCourse.jsp?id=");
      out.print(c.getId());
      out.write("\" class=\"btn btn-success\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>edit\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"Index.jsp\" class=\"btn btn-danger\">\n");
      out.write("                            <span class=\"glyphicon glyphicon-trash\" aria-hidden=\"true\"></span> Delete\n");
      out.write("                        </a>\n");
      out.write("                    </td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
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
