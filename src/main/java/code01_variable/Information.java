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
        float min = 1.123123f;
        double max = 1.123123d;

        System.out.println("float 의 최소값 =" + Float.MIN_VALUE + ", 최대값= " + Float.MAX_VALUE);
        System.out.println("double 의 최소값 =" + Double.MIN_VALUE + ", 최대값= " + Double.MAX_VALUE);

        boolean isDouble = Float.BYTES * 2 == Double.BYTES;
        System.out.println(isDouble);
    }

}
