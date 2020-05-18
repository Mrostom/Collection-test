import java.util.ArrayList;
import java.util.Arrays;

/**
 * @version 1.0
 * @author ROSTOM
 * @since 5/18/2020
 */
public class Question5 {
	public static void main(String[] args) {
	     ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "BMW", "Volvo", "Chevy","Ford") );
	        System.out.println(namesList);
	        namesList.remove("Ford");
	        System.out.println(namesList);
	    }
	}

