package recap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class App {

	public static void main(String[] args) {
		Ostrich os = new Ostrich();
		os.setName("pretty");
		System.out.println(os.getName());
		// Flamingoe fl = new Flamingoe();
		// fl.run();
		Information info1 = new Ostrich();
		info1.info();
		Information info2 = new Information() {

			@Override
			public void info() {
				System.out.println("I am disagreeing with the previous assuption.");

			}

		};
		info2.info();

		Pigeon.Colour pc = new Pigeon.Colour();
		pc.complexion();

		Flamingoe f1 = new Flamingoe(7, "Kamau");
		Flamingoe f2 = new Flamingoe(8, "Ian");
		Flamingoe f3 = new Flamingoe(9, "Allan");
		Flamingoe f4 = new Flamingoe(2, "Masha");
		Flamingoe f5 = new Flamingoe(8, "Ian");
		List<Flamingoe> list = new ArrayList<>();
		list.add(new Flamingoe(7, "Kamau"));
		list.add(new Flamingoe(8, "Ian"));
		list.add(new Flamingoe(9, "Allan"));
		list.add(new Flamingoe(2, "Masha"));
		list.add(new Flamingoe(8, "Ian"));
		Collections.sort(list,new Comparator<Flamingoe>() {

			@Override
			public int compare(Flamingoe o1, Flamingoe o2) {
				if(o1.getAge() > o2.getAge()) {
					return 1;
				}else if(o1.getAge() < o2.getAge()) {
					return -1;
				}
				return 0;
			}
			
		});
		for (Flamingoe value : list) {
			System.out.println(value);
		}
		 Map<Flamingoe, String> map = new LinkedHashMap();
		map.put(f1, "young");
		map.put(f2, "old");
		map.put(f3, "oldest");
		map.put(f4, "younger");
		map.put(f5, "older");
		System.out.println("\n");
		for (Map.Entry<Flamingoe, String> entry : map.entrySet()) {
			Flamingoe key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " " + value);
		}
	}

}
