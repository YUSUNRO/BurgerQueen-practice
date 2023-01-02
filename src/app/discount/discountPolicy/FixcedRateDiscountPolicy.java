package app.discount.discountPolicy;

public class FixcedRateDiscountPolicy {
    private int discountRate;

    public FixcedRateDiscountPolicy(int discountRate) {
        this.discountRate = discountRate;
    }

    public int calculateDiscountedPrice(int price) {
        return price - (price * discountRate / 100);
    }
}
