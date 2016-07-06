import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class revStringList {

	public  static void main(String args[]){
		String input = "My name is Bond";
	     char[] hello=input.toCharArray();
	     List<Character> trial1= new LinkedList<>();
	     for(char c: hello)
	     trial1.add(c);
	     Collections.reverse(trial1);
	     @SuppressWarnings("rawtypes")
		ListIterator li = trial1.listIterator();  
	     while(li.hasNext())
	    {System.out.print(li.next());}  
	   }
	}
	

