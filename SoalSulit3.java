
import java.util.Scanner;

public class SoalSulit3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        System.out.println("---- Mencari Angka yang Duplikat dan Frekuensi ----");
        System.out.print("Masukkan Panjang Array: ");
        int length = input.nextInt();

        int[] array = new int[length];

        for (int i = 0; i < length; i++) { 
            System.out.print("Masukkan Angka ke-" + (i + 1) + ": ");
            array[i] = input.nextInt(); 
        }
        checkDuplicates(array); 
    }
   
    public static void checkDuplicates(int[] array) {
        int maxFrekuensi = 0;
        int elemenTerbanyak = 0;

        for (int i = 0; i < array.length; i++) { 
            int frekuensi = 0;

            for (int j = 0; j < array.length; j++) { 
                if (array[i] == array[j]) {
                    frekuensi++; 
                }
            }

            if (frekuensi > maxFrekuensi) { 
                maxFrekuensi = frekuensi;
                elemenTerbanyak = array[i];
            }
        }
        if (maxFrekuensi > 1) {
            System.out.println("Angka yang paling sering muncul adalah " + elemenTerbanyak + " sebanyak " + maxFrekuensi + " kali.");
        } else {
            System.out.println("Tidak ada Angka duplikat.");
        }
    }
}

