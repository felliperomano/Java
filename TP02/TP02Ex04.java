/*Fellipe Soares Romano CB3005411*/
/*4. Armazenar seis valores em uma matriz de ordem 2x3. Apresentar os valores na tela.*/
import java.util.Scanner;


import java.util.Scanner;

public class TP02Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor da matriz na posicao ["+Integer.toString(i)+"]["+Integer.toString(j)+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("["+Integer.toString(matriz[i][j])+"]");
            }
            System.out.println();
        }

        scanner.close();
    }
}