package decorators;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Displayable{
	   List<String> allemp = new ArrayList<String>();
	
		public Employees() {
			 this.allemp.add("A");
			 this.allemp.add("B");
		}

		@Override
		public List<?> printed() {
			// TODO Auto-generated method stub
			return this.allemp;
		}
}
