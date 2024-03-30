package Recusion;

public class PrintNum {
    public static void PrintNumr(int n ){
        if ( n == 0) {
            return;
        }
        
      PrintNumr(n-1);// Recursive call it here he call his previous and after done his job the following will happen
      System.out.print(n);
     
    }
    public static void main(String[] args) {
        PrintNumr(8);
    }
}
