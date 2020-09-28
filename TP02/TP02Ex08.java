/*Fellipe Soares Romano CB3005411*/
/*8. Entrar via teclado com doze valores e armazená-los em uma matriz de ordem 3x4. Após a
digitação dos valores solicitar uma constante multiplicativa, que deverá multiplicar cada
valor matriz e armazenar o resultado em outra matriz de mesma ordem, nas posições
correspondentes. Exibir as matrizes na tela, sob a forma matricial, ou seja, linhas por
colunas.*/
import java.util.Scanner;

public class TP02Ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[3][4];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite o valor da matriz na posicao ["+Integer.toString(i)+"]["+Integer.toString(j)+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite a constante multiplicativa: ");
        int constante_multiplicativa = scanner.nextInt();

        int[][] matriz2 = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matriz2[i][j] = matriz[i][j] * constante_multiplicativa;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("["+Integer.toString(matriz2[i][j])+"]");
            }
            System.out.println();
        }

        scanner.close();
    }
}