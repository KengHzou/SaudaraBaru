/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudarabaru;

/**
 *
 * @author KengHzou
 */
public class profile {
    private String name;
    private String age;
    private String nationality;
    private String gender;
    private String status;
    private String permit;
    
    void profile()
    {   name = "";
        age = "";
        gender = "";
        nationality = "";
        status = "";
        permit ="";
    }
    void profile( String Name, String Age, String Gender , String Nationality, String Status, String Permit)
    {
        name = Name;
        age = Age;
        gender = Gender;
        nationality=Nationality;
        status = Status;
        permit =  Permit;
    }
    
    void setname( String Name )
    { name = Name ;}
    void setage ( String Age)
    {   age = Age;}
    void setnationality(String Nationality)
    {   nationality = Nationality;}
    void setgender( String Gender)
    {   gender = Gender;}
    void setstatus( String Status)
    { status = Status;}
    void setpermit( String Permit)
    { permit= Permit;}
    String getname()
    {   return name;}
    String getage()
    { return age;}
    String getnationality()
    {   return nationality;}
    String getgender()
    {   return gender;}
    String getstatus()
    { return status;}
    String getpermit()
    { return permit;}
    
    }
    

