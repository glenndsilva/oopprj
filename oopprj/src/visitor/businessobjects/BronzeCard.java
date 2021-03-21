package businessobjects;

public class BronzeCard  implements Card{
	@Override
	public String name() {
		return "BronzeCard";
	}

	@Override
	public void accept(Scheme scheme) {
		scheme.calculate(this);
	}

}
