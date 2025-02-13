package java17.company;

public class C_02_AppleEngineer {

	public static void main(String[] args) {
		C_01_AppleProduct product = new C_01_AppleProduct();

		System.out.println("* Accessing from AppleEngineer *");

		// System.out.println(product.secretDesign); // * Error: Private
		// System.out.println(product.productionCost); // * Error: Private

		System.out.println("Internal Code: " + product.internalCode);
		product.showInternalCode();

		System.out.println("Supplier: " + product.supplier);
		product.showSupplier();

		System.out.println("Product: " + product.productName);
		System.out.println("Selling Price: $" + product.sellingPrice);
		product.showProductDetails();
	}

}
