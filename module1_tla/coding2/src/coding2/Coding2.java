/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coding2;

/**
 *
 * @author Krisnicole
 */
public class Coding2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Hello World !";
	char ch1 = str.charAt(0);
	char ch2 = str.charAt(4);
	char ch3 = str.charAt(7);
	char ch4 = str.charAt(10);
		
	System.out.println("Character at 0 index is: "+ch1);
	System.out.println("Character at 5th index is: "+ch2);
	System.out.println("Character at 11th index is: "+ch3);
	System.out.println("Character at 20th index is: "+ch4);
    }
    
}
