package businessobjects;

public class MainClass {
		public static void main(String args[]){
			Card card = new SilverCard();
			Scheme scheme = new GasDiscount();
			card.accept(scheme);
	  }
}
