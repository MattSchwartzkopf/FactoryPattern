
public abstract class LetsEat {
	
	private DairyQueen factory;

	public LetsEat(DairyQueen factory) {
		this.factory = factory;
	}

	public IceCream orderCone(String type) {
		IceCream cone;

		cone = factory.getIceCream(type);

		cone.scoop();

		return cone;
	}

	public static void main(String[] args) {
		IceCreamFactory factory = new IceCreamFactory();
		IceCreamShopV1 shop = new IceCreamShopV1(factory);

		shop.orderCone("Chocolate");
		shop.orderCone("Vanilla");
		shop.orderCone("Strawberry");
	}
}
