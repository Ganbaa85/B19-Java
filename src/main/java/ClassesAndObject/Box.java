package ClassesAndObject;

public class Box {
    int height;
    int width;
    int depth;

    Box() {

    }

    Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    Box(int size){
        this(size,size,size);
    }

    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box(2);
        Box box2 = new Box(5,6,9);
        System.out.println();

    }



}
