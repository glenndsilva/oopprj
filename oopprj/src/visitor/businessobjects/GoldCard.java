package businessobjects;

public class GoldCard implements Card {
	@Override
	public String name() {
		return "GoldCard";
	}

	@Override
	public void accept(Scheme scheme) {
		scheme.calculate(this);
	}
}
