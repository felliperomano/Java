/*Fellipe Soares Romano CB3005411*/
/*5. Armazenar seis valores em uma matriz de ordem 3x2. Apresentar os valores na tela.*/
import java.util.Scanner;

public class TP02Ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][2];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o valor da matriz na posicao ["+Integer.toString(i)+"]["+Integer.toString(j)+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("["+Integer.toString(matriz[i][j])+"]");
            }
            System.out.println();
        }

        scanner.close();
    }
}