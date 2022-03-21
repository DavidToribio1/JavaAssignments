import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class UsingIterator {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(2);
		list.add(5);
		list.add(6);
		list.add(9);
		list.add(4);
		
		System.out.println("Print array list" + list);
		
		System.out.println("Before Sorting: "+ list);   
        // Sorting ArrayList in ascending Order   
        Collections.sort(list);   
        // printing the sorted ArrayList   
        System.out.println("After Sorting: "+ list);  
        
		//create iterator list
		ListIterator<Integer> iterate = list.listIterator();
		//loop through iterate and print out list
		System.out.println("List before removal");
		for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
		//The Iterator object is used to iterate over the elements of the list 
		//using the hasNext() and next() methods.
		 while(iterate.hasNext())
	     //An if the condition is used within the while loop and when the condition is satisfied, 
		//the particular element is removed using the remove() method.  
		 {
	            if(iterate.next()%2==0)
	                iterate.remove();
	        }
	      
	        System.out.println("\nList after removal");
	        
	        for(int i=0;i<list.size();i++)
	        {
	            System.out.print(list.get(i)+" ");
	        }
	        
	        
	    }
	  
	}