public class Laskin {
    public static int yhteenlasku(int a, int b) {
        return a + b;
    }

    public static int vähennyslasku(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        System.out.println("5 + 3 = " + yhteenlasku(5, 3));
        System.out.println("5 - 3 = " + vähennyslasku(5, 3));
    }
}