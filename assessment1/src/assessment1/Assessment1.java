/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment1;

import java.util.Arrays;

/**
 *
 * @author Krisnicole
 */
public class Assessment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] source = {1,2,3,4,5,6,7,8,9};
        int[] source1 = {1,2,3};
        int[] destination=null;
        System.out.println("Source array = "+Arrays.toString(source));
        
        destination = copyFirstFiveFieldsOfArrayUsingSystem(source);
        System.out.println(" First five elements of array if available. Result array = "+Arrays.toString(destination));
        
        destination = copyFirstFiveFieldsOfArrayUsingSystem(source1);
        System.out.println(" First five elements of array if available. Result array = "+Arrays.toString(destination));
        
        destination = copyFullArrayUsingSystem(source);
        System.out.println(" full array using System.copyarray() function. Result array = "+Arrays.toString(destination));
        
        destination = copyFullArrayUsingClone(source);
        System.out.println(" full array using clone() function. Result array = "+Arrays.toString(destination));
        
        destination = copyFullArrayUsingArrayOf(source);
        System.out.println(" full array using Arrays.copyOf() function. Result array = "+Arrays.toString(destination));
        
        destination = copyLastThreeUsingArrayOfRange(source);
        System.out.println(" last three elements using Arrays.copyOfRange() function. Result array = "+Arrays.toString(destination));
    }
    private static int[] copyFullArrayUsingArrayOf(int[] source) {
        return Arrays.copyOf(source, source.length);
    }
    private static int[] copyLastThreeUsingArrayOfRange(int[] source) {
        //length check is necessary to avoid java.lang.ArrayIndexOutOfBoundsException
        //but for simplicity I am not doing that
        return Arrays.copyOfRange(source, source.length-3, source.length);
    }
    private static int[] copyFullArrayUsingClone(int[] source) {
        return source.clone();
    }
    private static int[] copyFullArrayUsingSystem(int[] source) {
        int[] temp=new int[source.length];
        System.arraycopy(source, 0, temp, 0, source.length);
        return temp;
    }
    private static int[] copyFirstFiveFieldsOfArrayUsingSystem(int[] source) {
        if(source.length > 5){
            int[] temp=new int[5];
            System.arraycopy(source, 0, temp, 0, 5);
            return temp;
        }else{
            int[] temp=new int[source.length];
            System.arraycopy(source, 0, temp, 0, source.length);
            return temp;
        }
        
    
    }
    
}
