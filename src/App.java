import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] levelmember = { "Silver", "Gold", "Platinum" };

        System.out.print("Enter your Member name: ");
        String name = scanner.nextLine();

        System.out.println("Select your Member level");
        for (int i = 0; i < levelmember.length; i++) {
            System.out.println((i) + ": " + levelmember[i]);
        }
        
        System.out.print("Enter your Member level: ");
        int level = scanner.nextInt();

        System.out.println("Enter your price: ");
        double price = scanner.nextDouble();
        scanner.close();

        if (level == 2) {
            MemberCard platinumCard = new PlatinumCard(name, price);
            System.out.println("platinum info");
            platinumCard.display();
        }
        if (level == 1) {
            MemberCard goldCard = new GoldCard(name, price);
            System.out.println("gold info");
            goldCard.display();
        }
        if (level == 0) {
            MemberCard silverCard = new SilverCard(name, price);
            System.out.println("silver info");
            silverCard.display();
        }
    }

}