/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment5;

/**
 *
 * @author Krisnicole
 */
public class Assessment5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String str1 = "the happy yellow duck";
         String str2 = "noime";
    System.out.println("The given string is: " + str1);
    System.out.println("The given mask string is: " + str2);
        char arr[] = new char[str1.length()];
        char[] mask = new char[256];
    for (int i = 0; i < str2.length(); i++)
        mask[str2.charAt(i)]++;
    System.out.println("\nThe new string is: ");
    for (int i = 0; i < str1.length(); i++) {
    if (mask[str1.charAt(i)] == 0)
    System.out.print(str1.charAt(i));
  }
  }
    
}
