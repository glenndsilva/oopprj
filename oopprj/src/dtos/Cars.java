package dtos;

import java.util.Iterator;

public interface Cars extends Iterable<Car> {
		public Iterator<Car> iterator();
	    public Cars filter (final String price);
}
