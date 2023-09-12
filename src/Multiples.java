public class Multiples {
    public static void main(String[] args) {
        System.out.println(multiplesOf3And5(1000));
    }

    public static int multiplesOf3And5(int x) {
        int cnt = 0;
        for (int i = 1; i < x; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                cnt++;
        }
        return cnt;
    }
}
