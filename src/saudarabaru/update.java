/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudarabaru;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class update extends WriteToFile{
    
    
    
    static void existfile()
    {String user_file="C:\\Users\\KengHzou\\Documents\\NetBeansProjects\\SaudaraBaru\\file";
    File dit = new File(user_file);
    for (File f:dit.listFiles()){
        if(f.getName().contains(".txt"))
        {System.out.print(f.getName()+"\n");   
    }}}
    
    
    static void update(profile [] array, int index)throws IOException
        {
            BufferedReader bk = new BufferedReader(new InputStreamReader(System.in));
            
                
                File folder = new File("C:\\Users\\KengHzou\\Documents\\NetBeansProjects\\SaudaraBaru\\file");
                File[] listOfFiles =folder.listFiles();
               
                do
                { 
                   
                
                File file = listOfFiles[index]; 
               Scanner s = new Scanner(file);
		ArrayList<String>List = new ArrayList<String>();
                while(s.hasNextLine()){List.add(s.nextLine());}
                s.close();
                array[index].profile(List.get(0), List.get(1), List.get(2), List.get(3), List.get(4), List.get(5));
                
                index++;
               
            
        }while(index <listOfFiles.length);}
    
    
    static void updateinsidememory(profile newprofile)throws IOException
    {BufferedReader bk = new BufferedReader(new InputStreamReader(System.in));
            
                
                
		
               
                String C;
                
                do{
                selection.display4();
                C = bk.readLine();
                switch(C){
                        case "1":
                            newprofile.setname(bk.readLine());
                            break;
                        case "2":
                            newprofile.setage(bk.readLine());
                            break;
                        case "3":
                            String B;
                            do{
                      System.out.println("F \t for female \nM \t for male");
                      B=bk.readLine();
                  switch (B)
                          {case "F":
                              newprofile.setgender("Female");
                              break;
                          case "M":
                              newprofile.setgender("Male");
                              break;
                          default:
                              break;
                              
                  }}while(!B.equals("M")&&!B.equals("F"));
                            break;
                        case "4":
                            newprofile.setnationality(bk.readLine());
                            break;
                        case "5":
                            newprofile.setstatus(bk.readLine());
                            break;
                        case "6":
                            newprofile.setpermit(bk.readLine());
                            break;
                        case "7":
                            break;
                }}
                while(!C.equals("7"));}
}


