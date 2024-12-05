import java.util.Random;
import java.util.Scanner;

public class SoalSedang3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        Random rand = new Random();
        boolean LanjutQuiz = true; 

        System.out.println("    ------ Selamat Datang di Quiz Matematika Sederhana  ------  ");

        while (LanjutQuiz) {
            int bil1 = rand.nextInt(10) +1; 
            int bil2 = rand.nextInt(9) + 1; 
            String operator = ""; 
            int correctAnswer = 0; 

            switch (rand.nextInt(3)) { 
                case 0 -> {
                    operator = "*";
                    correctAnswer = bil1 * bil2;
                    break;
                }
                case 1 -> {
                    operator = "/";
                    correctAnswer = bil1 / bil2;
                    break;
                }
                case 2 -> {
                    operator = "%";
                    correctAnswer = bil1 % bil2;
                    break;
                }
                default -> {
                    break;
            }
        }

            System.out.println("Soal: " + bil1 + " " + operator + " " + bil2+ " = ?");
            int userAnswer = input.nextInt(); 

            // Cek jawaban
            if (userAnswer == correctAnswer) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah, yang benar adalah " + correctAnswer);
            }

            System.out.print("Apakah Anda ingin melanjutkan Quiz (iya/tidak)? ");
            LanjutQuiz = input.next().equals("iya");
        }

        System.out.println("Terima kasih telah berpartisipasi dalam quiz matematika sederhana!"); 
        input.close();
    }
}
