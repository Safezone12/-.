public class SilverCard extends MemberCard {
    public SilverCard(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculateDiscount() {
        if (getPurchaseAmout() >= 1000) {
            return getPurchaseAmout() * .02d;
        }
        return 0;

    }
}