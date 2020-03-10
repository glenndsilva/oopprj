package dtos;

import java.util.ArrayList;
import java.util.Iterator;

public class FilteredCars implements Cars {
    String price;
    Cars cars;
    ArrayList<Car> fcar = new ArrayList<Car>();
    
	public FilteredCars(Cars car, String price) {
		this.cars  = car;
		this.price = price;
	}

	public Cars filter(String price) {
		return new CarsImpl(fcar);
	}

	@Override
	public Iterator<Car> iterator() {
		// TODO Auto-generated method stub
	//	List <Car> car = new ArrayList<Car>();
		Iterator <Car> car1 = this.cars.iterator();
		    while(car1.hasNext()) {
		     Car fc = car1.next();
			if(fc.price().equals(this.price)) {
				fcar.add(fc);
			}
		}
		return fcar.iterator();
	}
}
