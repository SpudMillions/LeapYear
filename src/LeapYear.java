import java.util.Scanner;

public class LeapYear {

	/**
	 * Determine if a given year is a leap year.
	 * @author	SpudMillions
	 * @since	07/01/2016
	 * @param	
	 */
	public static void main(String[] args) {
		//set up instance of scanner class
		Scanner sc = new Scanner(System.in);
		//declare year variable to set
		int year;
		
		//prompt user for the year
		System.out.println("Enter a year, "
				+ "and I will check if it is a leap year: ");
		year = sc.nextInt();
		sc.close();
		
		//test if user input is a leap year
		if(year % 4 == 0 && year % 100 != 0){
			System.out.println(year + " is a leap year!");
		}else if(year % 400 == 0){
			System.out.println(year + " is a leap year!");
		}else{
			System.out.println(year + " is not a leap year :(");
		}
		
		
	}

}
