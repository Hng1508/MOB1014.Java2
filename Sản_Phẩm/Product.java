package Sản_Phẩm;

public class Product {
	private String id;
	private String name;
	private double basePrice;
	
	public Product () {}
	
	public Product(String id, String name, double basePrice) {
		this.setId(id);
		this.setName(name);
		this.setBasePrice(basePrice);
	}

	public String getId() {
		return this.id;
	}

	public boolean setId(String id) {
		if (id != null && !id.trim().isEmpty()) {
			this.id = id;
			return true;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public boolean setBasePrice(double basePrice) {
		if (basePrice >= 0) {
			this.basePrice = basePrice;
			return true;
		}
		return false;
	}
	
	public double finalPrice() {
		return this.basePrice;
	}
	
	@Override
    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Base Price: " + basePrice +
               ", Final Price: " + finalPrice();
    }
}