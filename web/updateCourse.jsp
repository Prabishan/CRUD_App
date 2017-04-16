<%@page import="java.io.IOException"%>
<%@page import="com.leapfrog.impl.CourseDAOImpl"%>
<%@page import="com.leapfrog.CourseDAO" %>
<%@page import = "com.leapfrog.entity.Course" %>
<%@page import = "com.leapfrog.impl.CourseDAOImpl"%>


<%
    
    
    if(!request.getMethod().equalsIgnoreCase("post")){
        out.println(" Error 404");
    }else{
    
    CourseDAO courseDAO = new CourseDAOImpl();

    Course c = new Course();
   
    c.setCourseName(request.getParameter("CourseName"));
    c.setDescription(request.getParameter("Description"));
    c.setFees(request.getParameter("Fees"));
    
    
    courseDAO.Update(c,c.getId());
        

    response.sendRedirect("index.jsp?Soolved");
    }

%>
