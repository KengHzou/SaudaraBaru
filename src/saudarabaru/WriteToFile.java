/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saudarabaru;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author KengHzou
 */
public class WriteToFile {
    static void WRITE(profile[] array, int index)throws IOException{	
        
            File file = new File("C:\\Users\\KengHzou\\Documents\\NetBeansProjects\\SaudaraBaru\\file\\"+array[index].getname()+".txt");

			// if file doesn't exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}

			
			
                        BufferedWriter writer = null;
                        try
                        {
                            writer = new BufferedWriter( new FileWriter(file));
                            writer.write(array[index].getname());
                            writer.newLine();
                            writer.write(array[index].getage());
                            writer.newLine();
                            writer.write(array[index].getgender());
                            writer.newLine();
                            writer.write(array[index].getnationality());
                            writer.newLine();
                            writer.write(array[index].getstatus());
                            writer.newLine();
                            writer.write(array[index].getpermit());
                            
                        }
                        catch (IOException e) {}
                        finally
                        {
                            try
                            {
                                if (writer!=null)
                                    writer.close();
                            }
                            catch (IOException e) {}
			
			
			

		
		}
    }
}