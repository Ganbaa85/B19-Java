public class Sports {
    public Sports() {
        System.out.println("Needs to win a game(constructor is called)");
    }

    static {
        System.out.println("Football and Basketball");
    }

    {
        System.out.println("5 person on the court");
    }

    {
        System.out.println("11 person on the field");
    }

    public static void main(String[] args) {
        Sports basketball = new Sports();
        Sports football = new Sports();
    }

}
