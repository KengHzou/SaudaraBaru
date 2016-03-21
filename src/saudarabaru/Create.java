/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudarabaru;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Create extends WriteToFile {
   
    
       
                    
    
        public static void Create (profile[] array, int index)throws IOException 
        {
            
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String B;
                 selection.vname();
                 array[index].setname(br.readLine());
                 selection.vage();
                  array[index].setage(br.readLine());
                  
                  do{
                      selection.vgender();
                      B=br.readLine();
                  switch (B)
                          {case "F":
                              array[index].setgender("Female");
                              break;
                          case "M":
                              array[index].setgender("Male");
                              break;
                          default:
                              break;
                              
                  }}while(!B.equals("M")&&!B.equals("F"));
                  
                  
                  selection.vnationality();
                 array[index].setnationality(br.readLine());
                selection.vstatus();
                 array[index].setstatus(br.readLine());
                 selection.vpermit();
                 array[index].setpermit(br.readLine());
        }           
 
	static void displayinfo(profile newprofile,int index)
        {System.out.println("\n"+index);
         System.out.println("Name               :"+newprofile.getname());
         System.out.println("Age                :"+newprofile.getage());
         System.out.println("Gender             :"+newprofile.getgender());
         System.out.println("Nationality        :"+newprofile.getnationality());
         System.out.println("Status             :"+newprofile.getstatus());
         System.out.println("Permit Expire Date :"+newprofile.getpermit());
	}
        
}
        



