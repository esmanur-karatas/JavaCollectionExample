import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<Integer> hashSet= new LinkedHashSet<>();
		hashSet.add(2);
		hashSet.add(5);
		hashSet.add(3);
		hashSet.add(3);
		
		System.out.println("ELEMAN SAYISI: "+ hashSet.size());
		System.out.println("BOŞ MU? "+hashSet.isEmpty());
		
		System.out.println("İÇİNDEKİ DEĞERLER:");
		Iterator<Integer> iterator= hashSet.iterator();
		while(iterator.hasNext()) {
			Integer next= iterator.next();
			System.out.println( next);
		}
		
		LinkedHashSet<Car> hashSet1 = new LinkedHashSet<>();
		hashSet1.add(new Car("33AA7893", "X", "Y"));
		hashSet1.add(new Car("33AA7895", "A", "B"));
		hashSet1.add(new Car("33AA7896", "D", "C"));
		hashSet1.add(new Car("33AA7897", "E", "F"));
		hashSet1.add(new Car("33AA7898", "H", "G"));
		hashSet1.add(new Car("33AA7899", "V", "N"));
		hashSet1.add(new Car("33AA7899", "V", "N"));
		
		Iterator<Car> iterator1=hashSet1.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		} 
	}

}
