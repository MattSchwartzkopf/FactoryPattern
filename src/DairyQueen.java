
public abstract class DairyQueen extends IceCreamShop {
	
	public IceCream getIceCream(String type) {
		IceCream cone = null;

		if (type.equals("Chocolate"))
			cone = new Chocolate();
		else if (type.equals("Strawberry"))
			cone = new Strawberry();
		else if (type.equals("Vanilla"))
			cone = new Vanilla();

		return cone;
	}
}
