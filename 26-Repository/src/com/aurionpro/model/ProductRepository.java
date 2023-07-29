package com.aurionpro.model;

public class ProductRepository implements IRepository{

	@Override
	public void create() {
		// TODO Auto-generated method stub
		System.out.println("Product created");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub
		System.out.println("Reading products");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Updating products");
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Deleting products");
	}
	
	public int printCategoriesCount() {
		return categories;
	}

}
