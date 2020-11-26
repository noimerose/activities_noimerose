/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment3;

/**
 *
 * @author Krisnicole
 */
public class Assessment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
        int sum = 0;
       for(int i=0; i < numbers.length ; i++)
        sum = sum + numbers[i];
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
    
}
