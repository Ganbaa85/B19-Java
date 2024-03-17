package ClassesAndObject;

public class Penguin extends Bird {
    @Override
    public boolean live(){
        System.out.println("Bird is here ");
        return true;
    }
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.live();
    }
}
