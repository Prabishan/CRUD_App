<%-- 
    Document   : add
    Created on : Sep 14, 2016, 9:49:37 AM
    Author     : Prabishan
--%>
<%@page import="com.sun.javafx.application.ParametersImpl"%>
<%@page import="com.leapfrog.CourseDAO"%>
<%@page import="com.leapfrog.impl.CourseDAOImpl"%>
<%@page import="com.leapfrog.entity.Course"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
     <%
         if(request.getMethod().equals("post")){
          Course course = new Course(); 
                    CourseDAO courseDAO = new CourseDAOImpl();
                    if(request.getParameter("id") == null || request.getParameter("id").isEmpty()){
                       response.sendRedirect("index.jsp");
                    } else{
                    int id = Integer.parseInt(request.getParameter("id"));
                    course = courseDAO.getById(id);
                    
                    if(course==null){
                        course = new Course();
                        response.sendRedirect("Index.jsp");
                    }
                 // course = courseDAO.getById(id);
                    }
                       
                %>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add Course</title>
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
     
    </head>
    
    <body>
        <div class ="container">
            <h2><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Edit</h2>
            <tr>
          
            <form method ="post" action="updateCourse.jsp">
                <div class="form-group">
                    <label>Course Name</label>
                    <input type="text" name="CourseName" class="form-control" required="required"  value="<%=course.getCourseName()%>">
                </div>

                <div class="form-group">
                    <label>Description</label>
                    <textarea type="text" name="Description" class="form-control" required="required" value="<%=course.getDescription()%>" style="height:200px" ></textarea>
                </div>
                <div class="form-group">
                    <label>Fees</label>
                    <input type="text" name="Fees" class="form-control" required="required" value="<%=course.getFees()%>">
                </div>
                
                <input type="hidden" name="course_id" />
                <button type="submit" class="btn btn-success">
                    <span class="glyphicon glyphicon-ok" aria-hidden="true" ></span> Update</button>

                <a href="Index.jsp" class="btn btn-danger"  >
                    <span class="glyphicon glyphicon-remove" aria-hidden="true" ></span> Cancel</a>

            </form>
                <%
                    }
                    
                %>
       
        </div>
    </body>
</html>
