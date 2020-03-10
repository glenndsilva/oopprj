package dtos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarsImpl implements Cars{
    List <Car> car;
	
	CarsImpl(List<Car> car){
		this.car = car;
		
	}
	@Override
	public Iterator<Car> iterator() {
		return this.car.iterator();
	}

	@Override
	public Cars filter(String price) {
		return  new FilteredCars(this, price);
	}

	public static void main(String args[]) {
		List <Car> c1 = new ArrayList<Car>();
		c1.add(new Car("A","10"));
		c1.add(new Car("B", "20"));
	
		CarsImpl cl = new CarsImpl(c1);
		Cars f = cl.filter("10");
		
		 Iterator <Car> c = f.iterator();
          
		 while(c.hasNext()) {
			 Car d = c.next();
			 System.out.println(d.model());
		 }
	}
}
