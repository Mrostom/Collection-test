import java.util.ArrayList;
import java.util.Collections;
/**
 * @since 5/18/2020
 * @author ROSTOM
 * @version 1.0
 */
public class Question8 {
	public static void main(String[] args) {
		 ArrayList<String> arrlist = new ArrayList<String>(); 
	        arrlist.add("SharkTank");         
	        arrlist.add("WichkedTuna");        
	        arrlist.add("StrangerThings");
	        arrlist.add("Blacklist");
	        arrlist.add("WalkingDead");         
	        System.out.println("Before Reverse ArrayList:");         
	        System.out.println(arrlist);     
	        Collections.reverse(arrlist);      
	        System.out.println("After Reverse ArrayList:");         
	        System.out.println(arrlist);
	    }
	}

