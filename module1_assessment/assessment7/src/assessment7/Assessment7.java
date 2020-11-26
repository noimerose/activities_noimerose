/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment7;

import java.io.File;

/**
 *
 * @author Krisnicole
 */
public class Assessment7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File file = new File("C:\\Users\\Krisnicole\\Documents\\Noime Files\\BSIT 2-1\\1st SEM");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
    }
    }
}
