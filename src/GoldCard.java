public class GoldCard extends MemberCard {
    public GoldCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculateDiscount() {
        if (getPurchaseAmout() >= 1500) {
            return getPurchaseAmout() * .03d;
        }
        return 0;
        
    }
}