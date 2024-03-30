package Recusion;

public class ToThePower {
    public static int ToThePowerN(int n , int m){
        if ( m == 0) {
            return 1;
        }
        int t = ToThePowerN(n, m-1);
        return n*t;
    }

    public static void main(String[] args) {
        System.out.print(ToThePowerN(5, 3));
    }
}
// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.

// Do this recursively.