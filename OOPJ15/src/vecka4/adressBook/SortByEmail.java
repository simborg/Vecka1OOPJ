package vecka4.adressBook;

import java.util.Comparator;
import java.util.Map;

public class SortByEmail implements Comparator<String> {

	private Map<String, Person> map;

	public SortByEmail(Map<String,Person> map) {
		this.map = map;
	}
	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return map.get(o1).getEmail().compareTo(map.get(o2).getEmail());
	}

}
