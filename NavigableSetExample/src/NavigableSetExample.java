import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetExample {

	public static void main(String[] args) {
		NavigableSet<Integer>navigableSet= new TreeSet<>();
		navigableSet.add(2);
		navigableSet.add(2);
		navigableSet.add(7);
		navigableSet.add(1);
		navigableSet.add(0);
		navigableSet.add(20);
		
		//2 tane aynı sayı olduğu için 5 yazacaktır.
		System.out.println("Eleman Sayısı: "+ navigableSet.size());

		
		Iterator<Integer> iterator= navigableSet.iterator();
		System.out.println("Küçükten Büyüğe Sıralama: ");
		while(iterator.hasNext()) {
			Integer next= iterator.next();
			System.out.println(next);
			
		}
		
		//2 ve daha büyük değerleri ekranan getirecek.
		System.out.println(" 2 veya 2' den Büyük Değerler: ");
		System.out.println(navigableSet.ceiling(2));
		
		
		//3 veya daha küçük değerleri ekrana getirecektir.
		System.out.println("3 veya 3' den Küçük Değerler: ");
		System.out.println(navigableSet.floor(3));
		
		//2'den daha küçük değerleri ekrana getirecektir.
		System.out.println("2' den Küçük Değerler: ");
		System.out.println(navigableSet.lower(3));
		
		//4'den daha büçük değerleri ekrana getirecektir.
		System.out.println("3' den Büyük Değerler: ");
		System.out.println(navigableSet.higher(3));
		
		//5' e kadar olan sayıları ekrana getireektir. eğer headSet(5,true) dersek 5' i de dahil ediyor.
		SortedSet<Integer> sortedSet= navigableSet.headSet(5);
		Iterator<Integer> iterator2= sortedSet.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
	}

}
