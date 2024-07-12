import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListSearch {
    public static void main(String args[]){
        LinkedList<Integer> linkedlist = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number of elements you want to add in Linked List");
        int n = scanner.nextInt();

        System.out.println("Enter the elements of LinkedList:");
        for(int i=0; i<n; i++){
            int element = scanner.nextInt();
            linkedlist.add(element);
        }

        System.out.println("Enter the element to search for:");
        int searchElement = scanner.nextInt();

        if(linkedlist.contains(searchElement)){
           System.out.println("Element "+ searchElement+ "exists in the LinkedList.");
        }else{
            System.out.println("ELement"+ searchElement+ "does not exist in LinkedList");
        }
         scanner.close();
    }
}
