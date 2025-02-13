package java17.company;

public class C_01_AppleProduct {
	private String secretDesign = "iPhone 16 Prototype";
	private double productionCost = 500.0;
	String internalCode = "AIP-2025";
	protected String supplier = "Foxconn";
	public String productName = "iPhone 16";
	public double sellingPrice = 1200.0;

	private void showSecretDesign() {
		System.out.println("Secret Design: " + secretDesign);
		System.out.println("Production Cost: $" + productionCost);
	}

	void showInternalCode() {
		System.out.println("Internal Code: " + internalCode);
	}

	protected void showSupplier() {
		System.out.println("Supplier: " + supplier);
	}

	public void showProductDetails() {
		System.out.println("Product: " + productName);
		System.out.println("Selling Price: $" + sellingPrice);
	}

	public void checkAccess() {
		showSecretDesign();
		showInternalCode();
		showSupplier();
		showProductDetails();
	}

	public static void main(String[] args) {
		C_01_AppleProduct product = new C_01_AppleProduct();

		System.out.println("* Accessing from AppleProduct *");

		product.checkAccess();
	}

}
