//Write a Java program to separate even and odd numbers from a given array of integers. Put all even numbers first, and then odd numbers

import java.util.Scanner;

public class EvenOddSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Taking input for the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        //Intializing the array
        int array[] = new int[size];

        //Taking input for the elelments of the array
        System.out.println("Enter the elements of Array:");
        for(int i=0;i<size;i++){
            array[i] = scanner.nextInt();
        }

        //Separating even and odd numbers
        int[] resultArray = separateEvenOdd(array);

        //Printing the result
        System.out.println("array after seperating even and odd numbers:");
        for(int num : resultArray){
            System.out.print(num + " ");
        }
    }

        public static int[] separateEvenOdd(int[] array){

        int[] resultArray = new int[array.length];
        int evenIndex = 0;
        int oddIndex = array.length- 1;

        //Seperate even and odd numbers
        for(int num : array){
            if(num % 2 == 0){
                resultArray[evenIndex++] = num;
            }else{
                resultArray[oddIndex--] = num;
            }

        }

        //Reverse the odd part to maintain the original order of odd numbers
        int start = evenIndex;
        int end = resultArray.length -1;
        while(start < end){
            int temp = resultArray[start];
            resultArray[start] = resultArray[end];
            resultArray[end] = temp;
            start++;
            end--;
        }
        return resultArray;

    }
}
