package ClassesAndObject;

public interface Playable{
    final static String abc = "abc";

    void play();

    static void score() {
        System.out.println("Basketball is playing");
    }

    default void forfiet() {
        System.out.println("Forfeited");
    }

    public static void main(String[] args) {


    }


}
