package java17.partners;

import java17.company.C_01_AppleProduct;

public class C_03_Manufacturer extends C_01_AppleProduct {

	public static void main(String[] args) {
		C_03_Manufacturer product = new C_03_Manufacturer();

		System.out.println("* Accessing from Manufacturer *");

		// System.out.println(myProduct.secretDesign); // * Error: Private
		// System.out.println(myProduct.productionCost); // * Error: Private
		// System.out.println(myProduct.internalCode); // * Error: Default

		System.out.println("Supplier: " + product.supplier);
		product.showSupplier();

		System.out.println("Product: " + product.productName);
		System.out.println("Selling Price: $" + product.sellingPrice);
		product.showProductDetails();
	}

}
