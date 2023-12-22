public class Main {
    public static void main(String[] args) {

        /**
         * You are climbing a staircase. It takes n steps to reach the top.
         *
         * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
         *
         * Example 1:
         *
         * Input: n = 2
         * Output: 2
         * Explanation: There are two ways to climb to the top.
         * 1. 1 step + 1 step
         * 2. 2 steps
         * Example 2:
         *
         * Input: n = 3
         * Output: 3
         *
         * Explanation: There are three ways to climb to the top.
         * 1. 1 step + 1 step + 1 step
         * 2. 1 step + 2 steps
         * 3. 2 steps + 1 step
         */
//        int steps = climbStairs_solution1(1);
//        int steps = climbStairs_solution1(2);
//        int steps = climbStairs_solution1(3);
//        int steps = climbStairs_solution1(4);


//        int steps = climbStairs_solution2(1);
//        int steps = climbStairs_solution2(2);
//        int steps = climbStairs_solution2(3);
        int steps = climbStairs_solution2(4);
        System.out.println(steps);
    }

    // solutionOne
    public static int climbStairs_solution1(int n){
        if (n <= 2) {
            return n;
        } else {
            int result = 0, n1 = 1, n2 = 2;
            for (int i = 3; i <= n; i++) {
                result = n1 + n2;
                n1 = n2;
                n2 = result;
            }
            return result;
        }
    }

    // solutionTwo
    public static int climbStairs_solution2(int n) {
        if (n <= 2) return n;
        return climbStairs_solution2(n - 1) + climbStairs_solution1(n - 2);
    }
}