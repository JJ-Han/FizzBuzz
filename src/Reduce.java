public class Reduce {
    public static void main(String[] args) {
//        System.out.println(reduceToZero(2));
        System.out.println(reduceToZero(100));
    }

    public static int reduceToZero(int x) {
        int steps = 0;
        while (x > 0) {
            if ((x & 1) == 0)
                x /= 2;
            else x--;
            steps++;
        }
        return steps;
    }
}
