public class _20_Climbing_Stairs {
    public static int climbStairs(int n){
        if(n<=2) return n;
        int onestep=1;
        int twostep=2;
        int totalways=0;
        for (int i=3;i<=n;i++){
            totalways=onestep+twostep;//0=1+2
            onestep=twostep;//1=2
            twostep=totalways;//2=0 => 2
        }
        return totalways;
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
