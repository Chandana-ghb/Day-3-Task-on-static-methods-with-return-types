public class TemperatureConverter
{
	public static double convertTOFahrenheit(double celsius)
	{
		return (celsius*9/5) + 32;
	}
	public static void main(String []args)
	{
		System.out.println(TemperatureConverter.convertTOFahrenheit(25));
	}
}
