package businessobjects;

public class ElectricityDiscount implements Scheme{
	@Override
	public void calculate(GoldCard goldcard) {
		     System.out.println(goldcard.name() + " " + "10%");
	}

	@Override
	public void calculate(SilverCard silvercard) {
	     System.out.println(silvercard.name() + " " + "20%");
	}

	@Override
	public void calculate(BronzeCard bronzecard) {
	     System.out.println(bronzecard.name() + " " + "30%");
	}
}
