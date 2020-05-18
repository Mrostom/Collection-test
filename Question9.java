	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
public class Question9 {
	 public static void main(String args[]){
		   ArrayList<Question9A > arraylist = new ArrayList<Question9A >();
		   arraylist.add(new Question9A (223, "Alex", 26));
		   arraylist.add(new Question9A (245, "Tom", 24));
		   arraylist.add(new Question9A (209, "Chuck", 32));
		   Collections.sort(arraylist);
		   for(Question9A  str: arraylist){
				System.out.println(str);
		   }
	     }
	}


