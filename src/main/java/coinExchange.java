public class coinExchange {
    public static void main(String[] args) {
 int givenAmount = 236;
 int quarter = 25, dime = 10, nickel = 5, penny = 1;
 quarter = givenAmount/ 25;
 givenAmount %= 25;
 dime = givenAmount/10;
 givenAmount %= 10;
 nickel = givenAmount/ 5;
 givenAmount %= 5;
 penny = givenAmount/1;
 givenAmount %= 1;
        System.out.println("quarters " + quarter  );
        System.out.println("dimes " + dime);
        System.out.println("nickels " +nickel);
        System.out.println("pennies " +penny);






    }
}
