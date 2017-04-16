/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.impl;

import com.leapfrog.CourseDAO;
import com.leapfrog.dbconn.DbConnection;
import com.leapfrog.entity.Course;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Prabishan
 */
public class CourseDAOImpl implements CourseDAO {
    
    DbConnection db = new DbConnection();
 List<Course> courseList = new ArrayList<>();
    @Override
    public List<Course> getAll() throws Exception {
       
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Academy", "root", null);

        String query = "SELECT * FROM tbl_course";
        PreparedStatement st = conn.prepareStatement(query);
        ResultSet rs = st.executeQuery();
        
        while (rs.next()) {
            Course c = new Course();
            c.setId(rs.getInt("id"));
            c.setCourseName(rs.getString("CourseName"));
            c.setDescription(rs.getString("Description"));
            c.setFees(rs.getString("Fees"));
            courseList.add(c);

        }
            
        conn.close();
        return courseList;
    }

    @Override
    public int insert(Course c) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Academy", "root", null);
        String query = "INSERT INTO tbl_course(id,CourseName,Description,Fees) VALUES(?,?,?,?)";
        PreparedStatement st = conn.prepareStatement(query);

        st.setInt(1, c.getId());
        st.setString(2, c.getCourseName());
        st.setString(3, c.getDescription());
        st.setString(4, c.getFees());

        int Result = st.executeUpdate();
        conn.close();
        return Result;
    }

@Override
    public int Update(Course c, int id) throws Exception{
      
         Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Academy","root" , null);
        
       
        String query = "UPDATE tbl_course SET  CourseName=? , Description = ? , Fees = ? WHERE id=? ";
        PreparedStatement st= conn.prepareStatement(query);
        
        st.setInt(1, c.getId());
        st.setString(2, c.getCourseName());
        st.setString(3, c.getDescription());
        st.setString(4, c.getFees());
        
        int Result = st.executeUpdate();
        conn.close();
        return Result;
        
        
    }

    
 @Override
  public Course getById(int id) throws Exception {
        Course c = null;
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Academy","root" , null);
        String query = "select * from tbl_course where id =? ";
        PreparedStatement st= conn.prepareStatement(query);
        st.setInt(1, id);
        ResultSet rs = st.executeQuery();
        
         while (rs.next()) {
            c = new Course();
            c.setId(rs.getInt("id"));
            c.setCourseName(rs.getString("CourseName"));
            c.setDescription(rs.getString("Description"));
            c.setFees(rs.getString("Fees"));

        }
            
        conn.close();
        return c;
    
    }
    
}

