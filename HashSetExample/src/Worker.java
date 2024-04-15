
public class Worker {
private String tcNumber;
private String name;

public Worker() {
	
}

public Worker(String tcNumber, String name) {
	this.tcNumber=tcNumber;
	this.name= name;
}
public String getTcNumber() {
	return tcNumber;
}
public void setTcNumber(String tcNumber) {
	this.tcNumber= tcNumber;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name= name;
}

@Override
public String toString() {
	return "TC No: "+tcNumber+ ", İSİM: "+name;
}
}
