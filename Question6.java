import java.util.ArrayList;
import java.util.LinkedList;
/**
 * @since 5/18/2020
 * @author ROSTOM
 * @version 1.0
 */
public class Question6 {
	public static void main(String[] args) {
		  LinkedList<String> linkedlist = new LinkedList<String>();
		    linkedlist.add("Ford");
		    linkedlist.add("Chevy");
		    ArrayList<String> list = new ArrayList<String>(linkedlist);
		    for (String str : list){
		      System.out.println(str);
		    }
		 }
		}