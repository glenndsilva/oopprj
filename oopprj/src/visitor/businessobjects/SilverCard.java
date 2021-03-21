package businessobjects;

public class SilverCard implements Card {

	@Override
	public String name() {
		return "SilverCard";
	}

	@Override
	public void accept(Scheme scheme) {
		  scheme.calculate(this);
	}

}
