<%@page import="com.leapfrog.CourseDAO" %>
<%@page import = "com.leapfrog.entity.Course" %>
<%@page import = "com.leapfrog.impl.CourseDAOImpl"%>


<%
    CourseDAO cdao = new CourseDAOImpl();

    Course c = new Course();

    c.setCourseName(request.getParameter("CourseName"));
    c.setDescription(request.getParameter("Description"));
    c.setFees(request.getParameter("Fees"));

    cdao.insert(c);

    response.sendRedirect("index.jsp");

%>
