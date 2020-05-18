import java.util.ArrayList;
import java.util.Collections;
/**
 * @date 5/18/2020
 * @author ROSTOM
 *@version 1.0
 */
public class Question3 {
	public static void main(String args[]){
	   ArrayList<String> arraylist = new ArrayList<String>();
	   arraylist.add("1");
	   arraylist.add("2");
	   arraylist.add("3");
	   arraylist.add("4");
	   System.out.println("Before Sorting:");
	   for(String str: arraylist){
			System.out.println(str);
		}
	   Collections.sort(arraylist, Collections.reverseOrder());
	   System.out.println("ArrayList in descending order:");
	   for(String str: arraylist){
			System.out.println(str);
		}
	}
}
