
public class Student implements Comparable<Student> {
	private int number;
	private String name;
	
	public Student() {
		
	}
	public Student(int number, String name) {
		this.number= number;
		this.name=name;
	}
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number=number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	@Override
	public String toString() {
		return "NUMARA: "+number+", İSİM: "+name;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.number-o.number;
		//büyükten küçüğe sıralama
		//return o.number-this.number;
		
		//isime göre sıralama 
		//return this.name.compareTo(o.name);
	}
	
	


}
