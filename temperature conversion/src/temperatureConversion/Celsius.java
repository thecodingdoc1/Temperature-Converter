package temperatureConversion;

public class Celsius implements Conversions {
	//if/else statement depending on the newUnit, then the logic in each statement
	@Override
	public double convertTo(double origTemp, String oldUnit) {
		double newTemp = 0;
		if(oldUnit.equals("Kelvin") || oldUnit.equals("kelvin")) { // Kelvin to Celsius
			newTemp = origTemp - 273.15;
			return newTemp;
		} else if (oldUnit.contentEquals("Fahrenheit") || oldUnit.contentEquals("fahrenheit")) { //Fahrenheit to Kelvin
			newTemp = ((origTemp - 32.0) * .5556);
			return newTemp;
		}
		return newTemp;
	}
}
