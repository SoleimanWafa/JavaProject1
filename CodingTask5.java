package JavaProject1;

public class CodingTask5 {
    public static void main(String[] args) {
        int x = 15;
        int y = 25;

        System.out.println("Before Swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("Before Swapping");
        System.out.println("Value of x is :" + x);
        System.out.println("Value of y is :" + y);
    }
}


