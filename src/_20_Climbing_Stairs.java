public class _20_Climbing_Stairs {
    public static int climbStairs(int n){

    }
    public static void main(String[] args) {
        for (int n = 1; n <= 6; n++) {
            System.out.printf("n=%d -> %d%n", n, climbStairs(n));
        }
        // Example single runs:
        System.out.println("climbStairs(4) should be 5 -> " + climbStairs(4));
        System.out.println("climbStairs(5) should be 8 -> " + climbStairs(5));
    }

}
