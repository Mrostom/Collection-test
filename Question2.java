/**
 * @author ROSTOM
 * @Version 1.0
 * @Date 5/18/2020
 */
import java.util.*; 
public class Question2 {
	public static void sortbykey()  { 
		    Map<String, Integer> map = new HashMap<>(); 
		    { 
		        TreeMap<String, Integer> sorted = new TreeMap<>(); 
		        sorted.putAll(map); 
		        for (Map.Entry<String, Integer> entry : sorted.entrySet())  
		            System.out.println("Key = " + entry.getKey() +  
		                         ", Value = " + entry.getValue());         
		    } 
	}
}
