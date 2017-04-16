

<%@page import="com.leapfrog.entity.Course"%>
<%@page import="com.leapfrog.impl.CourseDAOImpl"%>
<%@page import="com.leapfrog.CourseDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course</title>

        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>


    </head>
    <body>
        <div class="container">
            <h1> <span class="glyphicon glyphicon-book" aria-hidden="true"></span></span> Courses</h1> 
            <div class="pull-right">

                <a href="add.jsp" class="btn btn-primary">
                    <span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add
                </a>
            </div>


            <table class="table table-hover table-bordered">

                <tr>
                    <th> ID</th>
                    <th> Name </th>
                    <th>Description</th>
                    <th> Fees </th>
                </tr>
                <%
                    CourseDAO courseDAO = new CourseDAOImpl();
                    for (Course c : courseDAO.getAll()) {
                %>
                <tr>
                    <td><%=c.getId()%></td>
                    <td><%=c.getCourseName()%></td>
                    <td><%=c.getDescription()%></td>
                    <td><%=c.getFees()%></td>                              
                    <td>
                        <a href="editCourse.jsp?id=<%=c.getId()%>" class="btn btn-success">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>edit
                        </a>
                        <a href="Index.jsp" class="btn btn-danger">
                            <span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Delete
                        </a>
                    </td>

                </tr>


                <% }%>
            </table>
        </div>
    </body>
</html>
