/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ulb.infoh400.project.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thoma
 */
public class Person {

    private Integer IDperson;
    
    private String FirstName; 
    
    private String FamilyName; 
    
    private Date DateOfBirth; 
    
    private String Password; 

    public Person(){}
    
    public Person (Integer id){ this.IDperson = id;  }
    
    
    /* All the getProp */
    public Integer getIDperson() { return IDperson ;}
    public String getFirstName() { return FirstName ;}
    public String getFamilyName() { return FamilyName ;}
    public Date getDoB() { return DateOfBirth ;}
    public String getPW() {return Password ;}
    
    /* All the setProp */
    public void setIDperson( Integer ID) { this.IDperson =  ID;}
    public void setFirstName(String str) {  this.FirstName = str;}
    public void setFamilyName(String str) { this.FamilyName = str;}
    public void setDoB(Date D) { this.DateOfBirth = D ;}
    public void setPW(String PW) { this.Password = PW;}
    
    @Override
    public String toString() {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
        return FamilyName.toUpperCase() + " " + FirstName    + " (" + fmt.format(DateOfBirth) + ")";
    }
    
    public void print() {
        System.out.println(this.toString());
    }
}
