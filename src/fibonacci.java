
public class fibonacci{
   public static void main(String[] args){
        int n = 10; 
        int a = 0, b = 1;
        System.out.print("Serie de Fibonacci: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(a + " ");
            int s = a + b;
            a = b;
            b = s;
        }
    }
}
