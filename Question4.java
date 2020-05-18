import java.util.ArrayList;
import java.util.Arrays;
/**
 * @version 1.0
 * @author ROSTOM
 * @Data 5/18/2020
 */
public class Question4 {
	public static void main(String[] args) {
        ArrayList<String> namesList = new ArrayList<String>(Arrays.asList( "BMW", "Volvo", "Chevy") );
        System.out.println(namesList);
        namesList.add(0, "Ford");
        System.out.println(namesList);
    }
	}


