package Recusion;

class FactorialUsingRec {
public static int factorial(int n){
    if (n == 0) {
        return 1;
    }
    int factorial = factorial(n-1);
    return n*factorial;
}
   public static void main(String[] args) {
    System.out.print(factorial(4));
   } 
}