package ie.gmit.sw;

import java.util.ArrayList;
import java.util.List;

public class Runner {

	public static void main(String[] args) throws Throwable {
		List<Person> list = new ArrayList<>();

		int j = System.in.read();
		Person p = null;
		for (int i = 0; i < 1000000000; i++) {
			p = new Person(i);

			if (i % 100 == 0)
				list.add(p);
		}
	}

}
