<%-- 
    Document   : add
    Created on : Sep 14, 2016, 9:49:37 AM
    Author     : Prabishan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
            <h2><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add</h2>
            <tr>
            <form method ="post" action="addCourse.jsp">
                <div class="form-group">
                    <label>Course Name</label>
                    <input type="text" name="CourseName" class="form-control" required="required" placeholder="Course Name">
                </div>

                <div class="form-group">
                    <label>Description</label>
                    <textarea type="text" name="Description" class="form-control" required="required" placeholder="Description" style="height:200px" ></textarea>
                </div>
                <div class="form-group">
                    <label>Fees</label>
                    <input type="text" name="Fees" class="form-control" required="required" placeholder="Fees">
                </div>
                <button type="submit" class="btn btn-success"  >
                    <span class="glyphicon glyphicon-ok" aria-hidden="true" ></span> Submit</button>

                <a href="index.jsp" class="btn btn-danger"  >
                    <span class="glyphicon glyphicon-remove" aria-hidden="true" ></span> Cancel</a>

            </form>


        </div>
    </body>
</html>
