import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
	SortedSet<Integer> sortedSet=new TreeSet<>();
		sortedSet.add(3);
		sortedSet.add(5);
		sortedSet.add(1);
		sortedSet.add(0);
		sortedSet.add(11);
		sortedSet.add(9);
		
		Iterator<Integer> iterator= sortedSet.iterator();
		while(iterator.hasNext()) {
			Integer next= iterator.next();
			System.out.println(next);
		}
		
		SortedSet<String> sortedSetString=new TreeSet<>();
		sortedSetString.add("Ahmet");
		sortedSetString.add("Ali");
		sortedSetString.add("Ayşe");
		sortedSetString.add("Domurcuk");
		sortedSetString.add("Fatma");
		sortedSetString.add("Elif");
		
		Iterator<String> iteratorString= sortedSetString.iterator();
		while(iteratorString.hasNext()) {
			String next= iteratorString.next();
			System.out.println(next);

		}
		
		SortedSet<Student> sortedSetStudent=new TreeSet<>();
		sortedSetStudent.add(new Student(4, "Ahmet"));
		sortedSetStudent.add(new Student(3, "Ali"));
		sortedSetStudent.add(new Student(2, "Ayşe"));
		sortedSetStudent.add(new Student(9,"Domurcuk"));
		sortedSetStudent.add(new Student(10,"Fatma"));
		sortedSetStudent.add(new Student(15,"Elif"));
		
		System.out.println(sortedSetStudent.size());
		
		Iterator<Student> iteratorStudent= sortedSetStudent.iterator();
		while(iteratorStudent.hasNext()) {
			Student next= iteratorStudent.next();
			System.out.println(next);

		}

	}

}
