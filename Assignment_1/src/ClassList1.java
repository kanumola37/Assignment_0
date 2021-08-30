import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.sun.tools.classfile.CharacterRangeTable_attribute.Entry;

public class ClassList1 {
	Map<String,String> classList = new HashMap<String,String>();
		public void printClassList() {
			Iterator entries = (Iterator) classList.entrySet().iterator();
			while(entries.next()) {
			Entry entry = entries.next();
			System.out.println("key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
		}
		public void printClassList2() {
			for(Map.Entry<String, String> entry : classList.entrySet()) {
				System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
			}
			//iterating over keys only
			for (String Key : classList.keySet()) {
				System.out.println("Key = " + Key);
			}
			//iterating values only
			for (String value : classList.values()) {
				System.out.println("Value = " + value);
			}
		}
		public static void main(String[] args) {
			ClassGrades myClassList = new ClassGrades();
			myClassList.printClassList();
		}
}

