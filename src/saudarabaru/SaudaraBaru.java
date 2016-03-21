/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudarabaru;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**1
 *
 * @author KengHzou
 */
public class SaudaraBaru extends Create {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException
    {
        BufferedReader bn = new BufferedReader(new InputStreamReader(System.in));
       
        selection view = new selection();
        profile [] np= new profile[500];
        for ( int i = 0; i<500; i++)
        { np[i] = new profile();}
        int index = 0;
       
         boolean menu =true;
         String A = "";
         String B = "1";
         
         
        int temp=0;
         do{
             view.displaymenu();
             A = bn.readLine();
        switch(A){
            
            case "1":
            view.instruction();
            Create.Create(np,index);
            Create.displayinfo(np[index],index);
            index++;
            break;
            
            case "2":
            index=0;
            update.existfile();
            update.update(np, index-1);
            
            break;
            
            case "3":
            File folder = new File("C:\\Users\\KengHzou\\Documents\\NetBeansProjects\\SaudaraBaru\\file");
            File[] listOfFiles =folder.listFiles();
            temp=listOfFiles.length;
           
            for(index =0; index < temp ; index++)
            Create.displayinfo(np[index],index+1);
            index=Integer.parseInt(bn.readLine());
            update.updateinsidememory(np[index]);
            
            case "4":
                temp = index;
                index = 0;
                if(np[index].getage()==null)
                {System.out.println("no profile entered");
                 break;   }
                else{
                try{
                for (index=0 ; index <=temp ; index ++)
                WriteToFile.WRITE(np,index);} 
                catch(NullPointerException e){}; 
                break;}
                
            case "5":
                temp = index;
                index = 0;
                try{
                for (index=0 ; index <temp ; index ++)
                WriteToFile.WRITE(np,index);} 
                catch(NullPointerException e){};
                System.exit(0);
                break;
                
            case "6":
                System.exit(0);
                
            
            default:
                System.out.println("PLEASE ENTER RIGHT NuMER");
                break;
                }
           
            
         
         }while (!A.equals("!@$@^#@#&"));
       
         
        
       System.out.println("thx");
        
       
        
        
              
      
    }
    
}
