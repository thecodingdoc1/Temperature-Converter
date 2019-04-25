package temperatureConversion;

import java.util.Scanner;

public class Temperature {
	
	public static void main (String[] args) {
	String origUnit;
	String newUnit;
	double origTemp;
	double newTemp = 0;
	
	Scanner s = new Scanner(System.in);
	do {
		System.out.println("What is the original unit you are converting from?");
		origUnit = s.nextLine();
		if(!"Kelvin".contentEquals(origUnit) && !"Celsius".contentEquals(origUnit) && !"Fahrenheit".contentEquals(origUnit)) {
			System.out.println("Your input was invalid, please enter a valid unit... Kelvin, Celsius, or Fahrenheit");
		}
	} while (!"Kelvin".contentEquals(origUnit) && !"Celsius".contentEquals(origUnit) && !"Fahrenheit".contentEquals(origUnit));
	
	
	do {
		System.out.println("What is the unit you are converting to?");
		newUnit = s.nextLine();
		if(!"Kelvin".contentEquals(newUnit) && !"Celsius".contentEquals(newUnit) && !"Fahrenheit".contentEquals(newUnit)) {
			System.out.println("Your input was invalid, please enter a valid unit... Kelvin, Celsius, or Fahrenheit");
		}
	} while (!"Kelvin".contentEquals(newUnit) && !"Celsius".contentEquals(newUnit) && !"Fahrenheit".contentEquals(newUnit));
	
	while (true) {
	    System.out.println("What is the original temperature?");
	    try {
	        origTemp = Double.parseDouble(s.next());
	        break; // will only get to here if input was a double
	    } catch (NumberFormatException ignore) {
	        System.out.println("Your answer was invalid, pleasr enter a doube.. (Ex. 32.0)");
	    }
	}
	/*System.out.println(origUnit);
	System.out.println(origTemp);
	System.out.println(newUnit);*/
	if ("Kelvin".contentEquals(newUnit)) {
		Kelvin k = new Kelvin();
		newTemp = k.convertTo(origTemp, origUnit);
		System.out.println("Your new temperature is " + newTemp + " " + newUnit);
	} else if("Celsius".contentEquals(newUnit)) {
		Celsius c = new Celsius();
		newTemp = c.convertTo(origTemp, origUnit);
		System.out.println("Your new temperature is " + newTemp + " " + newUnit);
	} else {
		Fahrenheit f = new Fahrenheit();
		newTemp = f.convertTo(origTemp,  origUnit);
		System.out.println("Your new temperature is " + newTemp + " " + newUnit);
	}
	//eventually add a gui to be used with this
	s.close();
	}
	
}
