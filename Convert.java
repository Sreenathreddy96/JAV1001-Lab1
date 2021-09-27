import java.util.Scanner;
/*
Name: Sreenath Reddy Challuri
Student Number: A00247493

Program Description: Unit Conversion - Converts One unit to another unit based on inputs.
*/

//Convert Class
public class Convert
{
	//Start of the program
	public static void main (String args[])
	{
		//Print Welcome statement
		System.out.println("Welcome to Unit Converter");
		//Print List Message
		System.out.println("The following list are the units can be converted and vice versa");
		//Print all available units to convert
		System.out.println("1)KM to MI \n2)CM to IN \n3)KG to LB \n4)G to OZ \n5)C to F \n6)L to Cups");
		// Initiating scanner object from library to read the input from console
		Scanner scnr=new Scanner(System.in);
		//Variable to print final result
		String converted_value_output="";
		// Print text for user to enter input in numeric format
		System.out.print("First enter the numeric value to convert:");
		// Converting the received input into double and storing it in variable.
		double input_value=scnr.nextDouble();
		// Prints the message to enter second value
		System.out.print("Second enter the current unit of measure:");
		//Declaring string variable to store unit string
		String unit_input_received=scnr.next();
		// Converting inout to lower case using string function.
		unit_input_received=unit_input_received.toLowerCase(); 
		//Switch conditon to read the input and append the logic required based on condition
		switch (unit_input_received)
		{
		//Checks the received input matches with case and execute the logic and breaks the loop, else it checks the next condition
		case "km":converted_value_output=(input_value*0.62)+"mi";break;
		case "mi":converted_value_output=(input_value*1.61)+"km";break;
		case "cm":converted_value_output=(input_value*0.39)+"in";break;
		case "in":converted_value_output=(input_value*2.54)+"cm";break;
		case "kg":converted_value_output=(input_value*2.2)+"lb";break;
		case "lb":converted_value_output=(input_value*0.45)+"kg";break;
		case "g":converted_value_output=(input_value*0.04)+"oz";break;
		case "oz":converted_value_output=(input_value*28.35)+"g";break;
		case "c":converted_value_output=(((input_value*9)/5)+32)+"f";break;
		case "f":converted_value_output=(((input_value-32)*5)/9)+"c";break;
		case "l":converted_value_output=(input_value*4.17)+"cups";break;
		case "cups":converted_value_output=(input_value*0.24)+"l";break;
		//Validation printed when received input doesnt match with output
		default:System.out.println("Please enter a valid unit type from above options. Ex: km,mi,cm,in,kg,,lb,g,oz,c,f,l,cups etc.,");
		}
		//checking if convertion executed correctly
		if(!converted_value_output.equals(""))
		{
		//Converting value to uppercase to resolve type conversion errors
		if(unit_input_received.equals("c")||unit_input_received.equals("f")||unit_input_received.equals("cups"))
		{
			//convert value into upper case using string functions
			converted_value_output=converted_value_output.toUpperCase();
			//checks for cups as the intial unit is in lower case so no conversion required on the value
			if(!unit_input_received.equals("cups"))
			unit_input_received=unit_input_received.toUpperCase();
		}
		//Result to print on console
		System.out.println(input_value+unit_input_received+" is equal to "+converted_value_output);
		}
		else
		{
			System.out.println("Please try Again");
		}


	}
}
