/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;
import java.io.File;
/**
 *
 * @author Acer
 */
public class IO {
   public static void main(String[] args) {
        File file = new File ("C:\\Users\\Krisnicole\\Documents");
        
        
            String [] files = file.list();
            for (int i = 0; i < files.length; i++) {
            System.out.println(files[i]);
        }
    }

} 

