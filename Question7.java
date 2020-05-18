import java.util.ArrayList;
import java.util.HashSet;
/**
 * @since 5/18/2020
 * @author ROSTOM
 * @version 1.0
 */
public class Question7 {
	public static void main(String[] args) {
		  HashSet<String> Hashset = new HashSet<String>();
		    Hashset.add("Ford");
		    Hashset.add("Chevy");
		    ArrayList<String> list = new ArrayList<String>(Hashset);
		    for (String str : list){
		      System.out.println(str);
		    }
		 }
	}
