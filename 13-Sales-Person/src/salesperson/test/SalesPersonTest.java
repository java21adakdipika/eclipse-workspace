package salesperson.test;

import salesperson.model.Cities;
import salesperson.model.SalesPerson;


public class SalesPersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SalesPerson[] salesperson = {
				new SalesPerson(1, "Dipika", Cities.Mumbai, 2, 2000), 
				new SalesPerson(2, "Pratigya", Cities.Banglore, 3, 5000),
				new SalesPerson(3, "Joe", Cities.Delhi, 5, 1000),
				new SalesPerson(4, "Diya", Cities.Mumbai, 4, 60000),
				new SalesPerson(5, "Pranjal", Cities.Banglore, 3, 2000),
				new SalesPerson(5, "Manali", Cities.Delhi, 3, 7000),
		};

//		for (SalesPerson sale : salesperson) {
//			System.out.println(sale);
//		}
		
		SalesPerson highSalesPerson = salemanHighestSales(salesperson); // SalesPerson(5, "Manali", Cities.Delhi, 3, 7000)
		System.out.println("Salesman with highest sales is " + highSalesPerson.getName() + " with sales amount Rs. " + highSalesPerson.getSalesAmount());
		
		double sumAmount = sumAmount(salesperson);
		System.out.println("Sum of all salesAmount is " + sumAmount);
		
		double sumAmountMum = sumAmountCity(salesperson, Cities.Mumbai);
		System.out.println("Sum of all salesAmount in Mumbai is " + sumAmountMum);
		
		double sumAmountBang = sumAmountCity(salesperson, Cities.Banglore);
		System.out.println("Sum of all salesAmount in Banglore is " + sumAmountBang);
		
		double sumAmountDel = sumAmountCity(salesperson, Cities.Delhi);
		System.out.println("Sum of all salesAmount in Delhi is " + sumAmountDel);
	
		SalesPerson highSalesPersonBang = salemanHighestSalesCity(salesperson, Cities.Banglore);
		System.out.println("Salesman with highest sales in Bangalore is " + highSalesPersonBang.getName() + " with sales amount Rs. " + highSalesPersonBang.getSalesAmount());
		
		SalesPerson highSalesPersonMum = salemanHighestSalesCity(salesperson, Cities.Mumbai);
		System.out.println("Salesman with highest sales in Mumbai is " + highSalesPersonMum.getName() + " with sales amount Rs. " + highSalesPersonMum.getSalesAmount());
		
		SalesPerson highSalesPersonDel = salemanHighestSalesCity(salesperson, Cities.Delhi);
		System.out.println("Salesman with highest sales in Banglore is " + highSalesPersonDel.getName() + " with sales amount Rs. " + highSalesPersonDel.getSalesAmount());
	}
	
	public static SalesPerson salemanHighestSales(SalesPerson[] salesperson) {
		SalesPerson highSales  = salesperson[0]; // SalesPerson(2, "Pratigya", Cities.Banglore, 3, 5000)
		
		for (int i=0; i<salesperson.length; i++) { // i = 2
			
			if (salesperson[i].getSalesAmount() > highSales.getSalesAmount()) { // 5000 > 2000
				highSales  = salesperson[i];
			}
		}

		return highSales;
	}
	
	public static SalesPerson salemanHighestSalesCity(SalesPerson[] salesperson, Cities city) {
		SalesPerson highSalesCity  = null;
		for (int i=0; i<salesperson.length; i++) {
			if (salesperson[i].getCity().equals(city)) {
				highSalesCity  = salesperson[i];
				break;
			}
		}
		
		for (int i=0; i<salesperson.length; i++) {
			if (salesperson[i].getSalesAmount() > highSalesCity.getSalesAmount() && salesperson[i].getCity().equals(city)) {
				highSalesCity  = salesperson[i];
			}
		}

		return highSalesCity;
	}
	
	public static double sumAmount(SalesPerson[] salesperson) {
		double sum  = 0;
		
		for (int i=0; i<salesperson.length; i++) {
			sum = sum + salesperson[i].getSalesAmount();
		}

		return sum;
	}
	
	public static double sumAmountCity(SalesPerson[] salesperson, Cities city) { // city = mumbai
		double sumCity  = 0;
		
		for (int i=0; i<salesperson.length; i++) {
			if (salesperson[i].getCity().equals(city)) {
				sumCity = sumCity + salesperson[i].getSalesAmount();
			}
		}

		return sumCity;
	}

}
