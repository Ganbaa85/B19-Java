public class Currency {
    public static void main(String[] args) {
    int givenMin = 3456789;
    int minInYear = (60*24*365);
       int years = givenMin/minInYear;
        System.out.println("years "+ years);

        int remindMint = givenMin % minInYear;
        System.out.println(remindMint + " remind minutes");

        int days = remindMint /  (24 * 60);
        System.out.println(days);









    }
}
