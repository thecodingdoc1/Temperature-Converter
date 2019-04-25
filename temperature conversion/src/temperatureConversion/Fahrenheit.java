package temperatureConversion;

public class Fahrenheit implements Conversions {
	//if/else statement depending on the newUnit, then the logic in each statement
	@Override
	public double convertTo(double origTemp, String oldUnit) {
		double newTemp = 0;
		if(oldUnit.equals("Kelvin") || oldUnit.equals("kelvin")) { //Kelvin to Fahernheit
			newTemp = (origTemp - 273.15) * 1.8 + 32;
			return newTemp;
		} else if (oldUnit.contentEquals("Celsius") || oldUnit.contentEquals("celsius") ) { //Celsius to Fahrenheit
			newTemp = ((origTemp * 1.8) + 32.0);
			return newTemp;
		}
		return newTemp;
	}
}
