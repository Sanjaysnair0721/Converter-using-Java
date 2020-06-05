
/**
 * Write a description of converter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.applet.*;
import java.util.*;
import java.text.DecimalFormat;
 
public class converter extends Applet {
 
	public static void main(String[] args) {
 
		double amount, dollar, pound, code, euro, yen, ringgit, rupee;
 
		DecimalFormat f = new DecimalFormat("##.##");
 
		Scanner sc = new Scanner(System.in);
 
		System.out.println("hi, Welcome to the Currency Converter!");
 
		System.out.println("which currency You want to Convert ? ");
		
		System.out.println("1:Ruppe \t2:Dollar \t3:Pound \n4:Euro \t5:Yen \t6:Ringgit ");
		code = sc.nextInt();
		
		System.out.println("How much Money you want to convert ?");
		amount = sc.nextFloat();
 
		// For amounts Conversion
		if (code == 1) {
 
			dollar = amount / 75.82;
			System.out.println("Your " + amount + " Rupee is : " + f.format(dollar) + " Dollar");
 
			pound = amount / 92.43;
			System.out.println("Your " + amount + " Rupee is : " + f.format(pound) + " Pound");
 
			euro = amount / 82.76;
			System.out.println("Your " + amount + " Rupee is : " + f.format(euro) + " Euro");
 
			yen = amount / 0.71;
			System.out.println("Your " + amount + " Rupee is : " + f.format(yen) + " Yen");
 
			ringgit = amount / 17.36;
			System.out.println("Your " + amount + " Rupee is : " + f.format(ringgit) + " ringgit");
		} else if (code == 2) {
			// For Dollar Conversion
 
			rupee = amount * 75.82;
			System.out.println("Your " + amount + " Dollar is : " + f.format(rupee) + " Ruppes");
 
			pound = amount * 0.82;
			System.out.println("Your " + amount + " Dollar is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.92;
			System.out.println("Your " + amount + " Dollar is : " + f.format(euro) + " Euro");
 
			yen = amount * 107.44;
			System.out.println("Your " + amount + " Dollar is : " + f.format(yen) + " Yen");
 
			ringgit = amount * 4.36;
			System.out.println("Your " + amount + " Dollar is : " + f.format(ringgit) + " ringgit");
		} else if (code == 3) {
			// For Pound Conversion
 
			rupee = amount * 92.57;
			System.out.println("Your " + amount + " pound is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 1.22;
			System.out.println("Your " + amount + " pound is : " + f.format(dollar) + " Dollar");
 
			euro = amount * 1.12;
			System.out.println("Your " + amount + " pound is : " + f.format(euro) + " Euro");
 
			yen = amount * 130.95;
			System.out.println("Your " + amount + " pound is : " + f.format(yen) + " Yen");
 
			ringgit = amount * 5.32;
			System.out.println("Your " + amount + " pound is : " + f.format(ringgit) + " ringgit");
		} else if (code == 4) {
			// For Euro Conversion
 
			rupee = amount * 82.86;
			System.out.println("Your " + amount + " euro is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 1.09;
			System.out.println("Your " + amount + " euro is : " + f.format(dollar) + " Dollar");
 
			pound = amount * 0.89;
			System.out.println("Your " + amount + " euro is : " + f.format(pound) + " Pound");
 
			yen = amount * 117.21;
			System.out.println("Your " + amount + " euro is : " + f.format(yen) + " Yen");
 
			ringgit = amount * 4.76;
			System.out.println("Your " + amount + " euro is : " + f.format(ringgit) + " ringgit");
		} else if (code == 5) {
 
			// For Yen Conversion
 
			rupee = amount * 0.71;
			System.out.println("Your " + amount + " yen is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 0.0093;
			System.out.println("Your " + amount + " yen is : " + f.format(dollar) + " Dollar");
 
			pound = amount * 0.0076;
			System.out.println("Your " + amount + " yen is : " + f.format(pound) + " Pound");
 
			euro = amount * 0.0085;
			System.out.println("Your " + amount + " yen is : " + f.format(euro) + " Euro");
 
			ringgit = amount * 0.041;
			System.out.println("Your " + amount + " yen is : " + f.format(ringgit) + " ringgit");
		} else if (code == 6) {
			// For Ringgit Conversion
 
			rupee = amount * 17.36;
			System.out.println("Your " + amount + " ringgit is : " + f.format(rupee) + " Ruppes");
 
			dollar = amount * 0.23;
			System.out.println("Your " + amount + " ringgit is : " + f.format(dollar) + " dollar");
 
			pound = amount * 0.19;
			System.out.println("Your " + amount + " ringgit is : " + f.format(pound) + " pound");
 
			euro = amount * 0.21;
			System.out.println("Your " + amount + " ringgit is : " + f.format(euro) + " euro");
 
			yen = amount * 26.63;
			System.out.println("Your " + amount + " ringgit is : " + f.format(yen) + " yen");
		} else {
			System.out.println("Invalid input");
		}
		
	
	}
 
}