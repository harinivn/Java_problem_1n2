public class Largenumbers {
    public static void main(String[] args) {
        //The array elements
        int arr[] = { 10,2, 3, -5, 99, 12, 0, -1};

        //Storing the first element in both variables
        int first = arr[0], second = arr[0];

        //to find the largest element
        for(int i=0; i<arr.length; i++){
            //If array element is larger than current largest element, then swap
            if(arr[i]> first)
            first = arr[i];
        }

        //to find the second largest element
        for(int i=0; i< arr.length; i++){
            //If array element is larger than current largest element ad not equals to 
            //largest element, then swap
            if(arr[i]> second && arr[i] != first)
                second = arr[i];
            }

            //Print the product
            System.out.println("largest product = " + (first*second));
            System.out.println("The elements are " +first +" and " + second);

        }

    }



