import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> hashSet= new HashSet<String>();
		hashSet.add("İstanbul");
		hashSet.add("İstanbul");
		hashSet.add("Muğla");
		hashSet.add("Ankara");
		System.out.println("Değerler: "+ hashSet.size());
		
		Iterator<String> iterator= hashSet.iterator();
		while(iterator.hasNext()) {
			String next= iterator.next();
			System.out.println(next);
		}
		
		HashSet<Worker> hashSet1= new HashSet<>();
		hashSet1.add(new Worker("1", "Ali"));
		hashSet1.add(new Worker("5", "Mehmet"));
		hashSet1.add(new Worker("2", "Aslı"));
		hashSet1.add(new Worker("3", "Ayşe"));
		hashSet1.add(new Worker("4", "Ahmet"));
		
		Iterator<Worker> iterator1= hashSet1.iterator();
		while(iterator1.hasNext()) {
			Worker worker= iterator1.next();
			System.out.println(worker);
			System.out.println(worker.hashCode());
		}
		
	}

}
