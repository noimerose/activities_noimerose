/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tla_coding1;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Krisnicole
 */
public class Tla_coding1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       	  String siblings[]={"Noime Rose", "Roselyn", "Ronel"};

	  ArrayList<String> siblinglist= new ArrayList<String>(Arrays.asList(siblings));

	  
	  siblinglist.add("Rhoda");
	  siblinglist.add("Queenie");

	  for (String str: siblinglist)
	  {
		System.out.println(str);
       	  }
    }
    
}
