/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment6;

import java.io.File;

/**
 *
 * @author Krisnicole
 */
public class Assessment6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File Noime_Files = new File("C:\\Users\\Krisnicole\\Documents\\Noime Files");
         if (Noime_Files.exists()) 
           {
            System.out.println("The directory or file exists.\n");
           } 
         else
          {
            System.out.println("The directory or file does not exist.\n");
          }
    }
    
}
