package WhileLoop;

public class HomeWorkClock {
    public static void main(String[] args) {
        for (int hours = 1; hours <= 1; hours++)
            for (int minutes = 0; minutes <= 59; minutes++)
                for (int seconds = 0; seconds <= 59; seconds++) {
                    if (minutes < 10 && seconds < 10) {
                        System.out.println(hours + ":0" + minutes + ":0" + seconds);

                    } else
                        System.out.println(hours + ":" + minutes + ":" + seconds);
                }

    }

}
