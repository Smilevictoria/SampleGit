import java.util.Scanner; // program uses class Scanner

public class BMICalculator 
{
   // main method begins execution of Java application
   public static void main(String[] args)
   {
      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      float height; 
      float weight; 
      float sum;

      System.out.print("Welcome to the BMI (Body Mass Index) calculator");
      System.out.print("\nPlease enter your weight (kilograms): "); // prompt 
      weight = input.nextFloat(); // read first number from user

      System.out.print("Please enter your height (centimeters): "); // prompt 
      height = input.nextFloat(); // read second number from user

      sum = weight*10000/(height*height); // add numbers, then store total in sum

      System.out.printf("Your BMI is %.1f", sum); // display sum
      if(sum<18.5)
      {
         System.out.printf("(Underweight)");
      }
      else if((sum>18.5) &&(sum<24.9) )
      {
         System.out.printf("(Normal)");
      }
      else if((sum>25) &&(sum<29.9) )
      {
         System.out.printf("(Overweight)");
      }
      else 
      {
         System.out.printf("(Obese)");
      }
   } // end method main
}
