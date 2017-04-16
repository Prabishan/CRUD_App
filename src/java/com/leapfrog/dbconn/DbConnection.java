/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.dbconn;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Prabishan
 */
public class DbConnection {
    String conn=null;
    public void open()throws Exception{
         Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/Academy","root" , null);
        
    }
    
}
