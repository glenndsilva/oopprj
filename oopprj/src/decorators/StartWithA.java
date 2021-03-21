package decorators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StartWithA implements Displayable{
	Displayable disp;
	
	public StartWithA(Displayable disp) {
		this.disp = disp;
	}
	@Override
	public List<?> printed() {
		ArrayList<String> onlyA = new ArrayList<String>();
	    for(int i=0; i < disp.printed().size();i++) {
	    	 String a = (String)disp.printed().get(i);
	    	 if(a.equals("A")) {
	    	 onlyA.add(a);
	    	 }
	    }
		return onlyA;
	}
	
	public static void main(String args[]) {
		Displayable disp = new StartWithA(new Employees());
		//System.out.println((String)disp.get());
		System.out.println(disp.printed().size());
		Iterator<String> k = (Iterator<String>) disp.printed().iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
	}
}
