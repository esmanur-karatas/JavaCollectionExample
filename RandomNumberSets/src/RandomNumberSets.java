import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class RandomNumberSets {
	public static void randomNumber(SortedSet<Integer> integers,int NumberOfRows) {
	integers.clear();
	Random random = new Random();
	while(integers.size() <NumberOfRows) {
		int number= random.nextInt(49) +1;
		integers.add(number);
	}
}
	public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	System.out.print("Satır Sayısını Giriniz: ");
	int NumberOfRows = scan.nextInt();
	System.out.print("Sütun Sayısısını Giriniz: ");
	int NumberOfColumn= scan.nextInt();
	SortedSet<Integer> integers= new TreeSet<>();
	for(int i=0; i<NumberOfRows; i++) {
		randomNumber(integers, NumberOfRows);
		Iterator<Integer> iterator= integers.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+"\t");
		}
		System.out.println();
	}
  }
}
	

	
