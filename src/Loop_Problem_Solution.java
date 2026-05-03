public class Loop_Problem_Solution {
    public static void main(String[] args) {
        int n = 2536;
        System.out.println("The digits available in number "+ n + " is: "+ numberDigitsCount(n));
    }

    /*
    Date:-3/5/2026
    Question: Count the number of digits for a given number n
     */
    public static int numberDigitsCount(int n) {
        int ans = 0;
        while (n > 0) {
            n = n / 10;
            ans++;
        }
        return ans;
    }


}
