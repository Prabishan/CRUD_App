/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog;

import com.leapfrog.entity.Course;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface CourseDAO {

    List<Course> getAll() throws Exception;

    int insert(Course c) throws Exception;
    
    int Update(Course c,int id) throws Exception;
    
    Course getById(int id) throws Exception;
}
