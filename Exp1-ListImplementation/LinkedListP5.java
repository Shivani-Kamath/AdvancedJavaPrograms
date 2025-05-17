/* 1c. Linked List Programs
   5. Write a Java program that swaps two elements ( first and third elements ) in a linked list  ( using
 Collections.swap(l_list, 0, 2)) 
*/

package AdvancedJava;
import java.util.*;
public class LinkedListP5 {
	 public static void main(String[] args) {
	        LinkedList<String> ls = new LinkedList<>();
	        ls.add("Orange");
	        ls.add("geen");
	        ls.add("pink");
	        ls.add("red");
	        ls.add("Blue");

	        System.out.println("Before swapping:");
	        System.out.println(ls);

	        Collections.swap(ls, 0, 2);

	        System.out.println("After swapping:");
	        System.out.println(ls);
	    }
	}

