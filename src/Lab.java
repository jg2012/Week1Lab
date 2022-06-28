
public class Lab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create a variable to hold the quantity of available plane seats left on a flight. 
		
		int availablePlaneseats = 10; 
		
		//create a variable to hold the cost of groceries at check out
		
		double groceryCost = 2.15; 
		
		//create a variable to hold a person's middle initial
		
		char middleInitial = 'C'; 
		
		//create a variable to hold true if it's hot outside and false if it's cold outside
		
		boolean hotOutside = true; 
		
		//create a variable to hold a customer's first name. 
		
		String firstName = "Jose "; 
		
		//create a variable to hold a street address 
		
		String streetAddress = "704 N. 85th St.";
		
		//print all variable to the console 
		
		System.out.println(availablePlaneseats);
		System.out.println(groceryCost);
		System.out.println(middleInitial);
		System.out.println(hotOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);
		
		
		// a customer booked 2 plane seats, removes 2 seats from the available  seats variable. 
		
		availablePlaneseats -=2 ; 
		System.out.println(availablePlaneseats);
		
		// impulse candy bar purchase, add 2.15 to the grocery total 
		
		groceryCost += 2.15;
		System.out.println(groceryCost);
		
		//birth certificates were printed incorrectly, change the middle initial to something else. 
		
		middleInitial = 'L'; 
		System.out.println(middleInitial);
		
		//the season has changed, update the hot outside variables to the opposite of what it was 
		
		hotOutside = !true; 
		System.out.println(hotOutside);
		
		//create a new variable called full name using the customer's first name, the middle initial, and a last name of your choice. 
		
		String fullName = firstName + " " + middleInitial + " Guzman"; 
		System.out.println(fullName);
		
		//print a line to the console that introduces the customer and says they live at the address variable. 
		
		System.out.println("Hello my name is " + fullName + " and I live on " + streetAddress);
		
		
		
	}

}
