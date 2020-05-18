/**
 *@author ROSTOM
 *@Date 5/18/2020 
 *@Verison 1.0
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
public class Question1 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		java.util.Iterator<Entry<String, String>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			@SuppressWarnings("rawtypes")
			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println("[Key] : " + entry.getKey() + " [Value] : " + entry.getValue());
		}
	}

}
