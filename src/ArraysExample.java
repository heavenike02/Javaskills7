
/**
 * reverseArray takes an array of integers and outputs them in reverse order by swapping their indexes with Exclusive OR operator
 * splitParity checks if the current number is out even then swaps its index with the next odd number in the array
 * @author (Heaven Ike)
 * @version (22/10/2002)
 */
//import java.util.*;
public class ArraysExample
{
    //    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[] arr1 = {9, 2, 14, 12, -3};
        int[] arr2 = {3, 6, 4, 1, 12};
        System.out.print("\n Array before reverse: ");
        printArray(arr1);
        reverseArray(arr1);
        System.out.print("\n Array after reverse: ");
        printArray(arr1);
        System.out.print("\n Array before split: ");
        printArray(arr2);
        splitParity(arr2);
        System.out.print("\n Array before split: ");
        printArray(arr2);
    }//end main
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }

    public static void reverseArray(int[] arr){

        int i = 0;

        do {
            //assigning the last number in the array moving inwards to nextEndNum
            int nextEndNum =  arr.length - 1 - i;
            //using XOR operator  to swap the first and last number in the array
            arr[i] ^= arr[nextEndNum];
            arr[nextEndNum] ^= arr[i];
            arr[i] ^= arr[nextEndNum];
            i++;
        }
        //loop until i is equal to the  half of the array indexes
        while(i < arr.length/2 );
    }
// sorting odd number to the front of the array
    public static void splitParity(int[] arr){
        int i,j ;
        for(i = 0; i< arr.length; i++){
            //checks if number is even
            if(arr[i] % 2 == 0){
                //loops through array after i to check  whether upcoming numbers are odd
                for(j = i +1;j< arr.length;j++){
                    // if number is odd
                    if(arr[j] % 2 != 0){
                        //using XOR operator to swap the even number to the position of odd number in the array
                        arr[i] ^= arr[j];
                        arr[j] ^= arr[i];
                        arr[i] ^= arr[j];
                    }//end if

                }//end for

            }//end if

        }//end for

    }//end of splitParity

}//end of class
