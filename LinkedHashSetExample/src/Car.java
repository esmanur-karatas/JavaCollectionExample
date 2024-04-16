
public class Car {
private String plaka;
private String brand;
private String model;

public Car() {
	
}

public Car(String plaka, String brand, String model) {
	this.plaka= plaka;
	this.brand= brand;
	this.model=model;
}
public String getPlaka() {
	return plaka;
}

public void setPlaka(String plaka) {
	this.plaka= plaka;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand= brand;
}

public String getModel() {
	return model;
}

public void getModel(String model) {
	this.model= model;
}

@Override
public boolean equals(Object o) {
	Car car = (Car)o;
	return car.plaka.equals(this.plaka);
}

@Override
public int hashCode() {
	return this.plaka.hashCode();
}

@Override 
public String toString() {
	return "PLAKA: "+ plaka+ ", MARKA: "+brand+ ", MODEL: "+model;
}
}
