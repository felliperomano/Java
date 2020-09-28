/*Fellipe Soares Romano CB3005411*/
/*6. Armazenar seis nomes em uma matriz de ordem 2x3. Apresentar os nomes na tela.*/
import java.util.Scanner;

public class TP02Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] matriz = new String[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o nome que ficara na  matriz na posicao ["+Integer.toString(i)+"]["+Integer.toString(j)+"]: ");
                matriz[i][j] = scanner.nextLine();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println();
        }

        scanner.close();
    }
}