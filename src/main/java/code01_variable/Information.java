package code01_variable;

public class Information {
    /**
     * Instance variable
     */
    long price = 10000;

    /**
     * Instance variable
     */
    static long discountPrice = 1000;

    /**
     * Parameter And Local variable
     */
    public String multiplyPriceAndDiscount(long price, int quantity) { // <- long price, quantity : Parameter

        String typeOfMoney = "WON";     // typeOfMoney : Local variable

        return (price * quantity) - discountPrice + typeOfMoney;
    }

    public static void main(String[] args) {

    }

}
