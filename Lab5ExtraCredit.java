//James Zhang
package lab5;
import java.util.Scanner;
public class Lab5ExtraCredit {
    public static void main(String[] args) {
        String dayLabel = "Day",
               newPopulationLabel = "New Zombies",
               totalPopulationLabel = "Total Zombies";
        String dashes1 = "====",
               dashes2 = "============",
               dashes3 = "==============";
        long newPopulation,
             totalPopulation,
             initialPopulation;
        double growthRate;
        int daysNum;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter starting zombie population: ");
        initialPopulation = keyboard.nextLong();
        
        while (initialPopulation < 2)
        {
            System.out.print("\nError: Starting Population must be at "
                    + "least 2\n");
            System.out.print("\nEnter starting zombie population: ");
            initialPopulation = keyboard.nextLong();
        }
        
        System.out.print("Enter zombie growth rate% (example 2.5): ");
        growthRate = keyboard.nextDouble();
        
        while (growthRate < 0)
        {
            System.out.print("\nError: Zombie Growth Rate must be at least "
                    + "0.0\n");
            System.out.print("\nEnter zombie growth rate% (example 2.5): ");
            growthRate = keyboard.nextDouble();
        }
        
        System.out.print("Enter number of days for predictor to run: ");
        daysNum = keyboard.nextInt();
        
        while (daysNum < 1)
        {
            System.out.print("\nError: number of days for predictor must be "
                    + "at least 1\n");
            System.out.print("\nEnter number of days for predictor to run: ");
            daysNum = keyboard.nextInt();
        }
        
        System.out.printf("\nStarting with %,d zombies growing at "
                          + "%,.1f%%\n", initialPopulation, growthRate);
        
        System.out.printf("\n%5s %15s %15s\n", dayLabel, 
                          newPopulationLabel, totalPopulationLabel);
        System.out.printf("%5s %15s %15s\n", dashes1, dashes2, 
                          dashes3);
        
        totalPopulation = initialPopulation;
        
        for (int day = 1; day <= daysNum; day++)
        {
            newPopulation = (long)(totalPopulation * growthRate/100);
            totalPopulation += newPopulation;
            
            System.out.printf("%,5d %,15d %,15d\n", day, 
                              newPopulation, totalPopulation);
            
        }
        
        System.out.printf("\nAfter %,d days, the zombie population will "
                + "grow from %,d to %,d\n", daysNum, initialPopulation, 
                totalPopulation);
        
    }
    
}