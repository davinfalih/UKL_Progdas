import java.util.Scanner;

public class SoalMudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Masukkan bilangan yang akan diperiksa: ");
        int bilangan = input.nextInt(); 
        

        if (CPrima(bilangan)) { 
            System.out.println(bilangan + " adalah bilangan prima.");
        } else {
            System.out.println(bilangan + " bukan bilangan prima.");
        }
        input.close(); 
    }

    
    public static boolean CPrima(int bilangan) {
        if (bilangan <= 1) {
            return false; 
        }
        for (int i = 2; i < bilangan; i++) { 
            if (bilangan % i == 0) { 
                return false;
            }
        }
        return true; 
    }
    
}
