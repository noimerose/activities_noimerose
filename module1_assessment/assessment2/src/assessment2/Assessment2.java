/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment2;

/**
 *
 * @author Krisnicole
 */
public class Assessment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][]a = new int[10][10];    
      for(int i = 0; i < 10; i++)
    {
      for(int j = 0; j < 10; j++)
      {
         System.out.printf("%2d ", a[i][j]);
      }
      System.out.println();
    }
    }
}
