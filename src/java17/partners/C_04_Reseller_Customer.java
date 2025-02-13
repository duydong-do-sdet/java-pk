package java17.partners;

import java17.company.C_01_AppleProduct;

public class C_04_Reseller_Customer {

	public static void main(String[] args) {
		C_01_AppleProduct product = new C_01_AppleProduct();

		System.out.println("* Accessing from Reseller & Customer *");

		// System.out.println(product.secretDesign); // * Error: Private
		// System.out.println(product.productionCost); // * Error: Private
		// System.out.println(product.internalCode); // * Error: Default
		// System.out.println(product.supplier); // * Error: Protected

		System.out.println("Product: " + product.productName);
		System.out.println("Selling Price: $" + product.sellingPrice);
		product.showProductDetails();
	}

}
