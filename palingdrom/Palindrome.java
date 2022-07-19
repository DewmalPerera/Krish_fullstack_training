package palingdrom;

import java.util.LinkedList;
import java.util.Scanner;

public class Palindrome {
	
	    public static void main(String[] args){
	        LinkedList<Integer> list = new LinkedList<>();
	        LinkedList<Integer> reversedList = new LinkedList<>();
	        Scanner input = new Scanner(System.in);
	        
	        System.out.println("Number Of Elements: ");
	        int length = input.nextInt();
	        //get user inputs for linkedList
	        System.out.println("Insert the Elements: ");

	        try {
	            for (int i = 0; i < length; i++) {
	                int x = input.nextInt();
	                list.add(x);

	            }
	        }catch(Exception e){
	            System.out.println("Input Values are Invalid");
	        }

	        System.out.println("list = "+list);

	        for(int i = (length - 1); i >=0; i--){
	            reversedList.add(list.get(i));
	        }

	        System.out.println("Reversed list = "+reversedList);

	        if(list.equals(reversedList)){
	            System.out.println("Is a PALINDROME!");
	        }
	        else{
	            System.out.println("Is not a PALINDROME!");
	        }


	    }
}
	
