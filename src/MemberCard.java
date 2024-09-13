public class MemberCard {
    private String name;
    private double purchaseAmout;

    public MemberCard(String name, double purchaseAmount) {
        this.name = name;
        this.purchaseAmout = purchaseAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPurchaseAmout() {
        return purchaseAmout;
    }

    public void setPurchaseAmout(double purchaseAmout) {
        this.purchaseAmout = purchaseAmout;
    }

    public double calculateDiscount() {
        return getPurchaseAmout();
    }


    public void display() {
        System.out.println("Customer name : " + name);
        System.out.println("Purchase Amout : " + purchaseAmout);
        System.out.println("Discount : " + calculateDiscount());
        System.out.println("total Amout : " + (purchaseAmout - calculateDiscount()));
    }

    
}