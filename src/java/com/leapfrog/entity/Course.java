/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.entity;

/**
 *
 * @author Prabishan
 */
public class Course {

    private int id;
    private String CourseName, Description, Fees;

    public Course() {

    }

    public Course(int id, String CourseName, String Description, String Fees) {
        this.id = id;
        this.CourseName = CourseName;
        this.Description = Description;
        this.Fees = Fees;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String CourseName) {
        this.CourseName = CourseName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getFees() {
        return Fees;
    }

    public void setFees(String Fees) {
        this.Fees = Fees;
    }

}
