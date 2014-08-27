package com.javatest.cv;

public class Sale
{
	Employee seller;
	Product product;
	Integer quantity;
	Double totalSale;
	
	public Sale(Employee theSeller, Product theProduct, Integer theQuantity)
	{
		seller=theSeller;
		product=theProduct;
		quantity=theQuantity;
		totalSale=theProduct.getCost()*theQuantity;
	}

}
