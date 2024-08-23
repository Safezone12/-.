import java.util.Scanner;

public class work2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] member = {"Silver", "Gold", "Platinum"};
        
        System.out.println("Select your membership");
        for (int i = 0; i < member.length; i++) {
            System.out.println(i + ": " + member[i]);
        }
      
        System.out.print("Number of your type: ");
        int choice = scanner.nextInt();
        System.out.print("How much is the price? ");    
        int priceall = scanner.nextInt();
        scanner.close();

     
        if (choice < 0 || choice >= member.length) {
            System.out.println("Invalid choice. Please select a valid membership type.");
            return;
        }

        int discountP = mathdis(choice, priceall);
        System.out.println("Discount: $" + discountP + " for " + member[choice]);
    }

  
    public static int mathdis(int choice, int priceall) {
        int discountPercent = 0;

        switch (choice) {
            case 0: // Silver
            if (priceall >=1000) {
                discountPercent = 2;
            }else {
                discountPercent = 0;
            }
                break;
            case 1: // Gold
             if (priceall >=1000) {
                discountPercent = 3;
             }else{
                discountPercent = 0;
             }
                break;
            case 2: // Platinum
            if (priceall >= 1000) {
                discountPercent = 5;
            }  
                break;
            default:
                System.out.println("Invalid membership type.");
                return 0;
        }

        // Calculate the discount amount
        int discountAmount = (priceall * discountPercent) / 100;
        return discountAmount;
    }
}