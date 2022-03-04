package subTask;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;

public class DateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		  LocalDate startDate = LocalDate.parse("2022-01-01");
	      LocalDate endDate = LocalDate.parse("2022-03-03");
	      System.out.println("The start date is: " + startDate);
	      System.out.println("The end date is: " + endDate);
	      Period period = Period.between(startDate, endDate);
	      System.out.println("\nThe Period between the start and end date is : " );
	      System.out.println( period.getYears()+" Years "  +  period.getMonths() + " months " +period.getDays()+ " days ");
		}
		catch (DateTimeException e)
		{
			System.out.println("you entered an invalid date "+e);
		}
		
	}

}
