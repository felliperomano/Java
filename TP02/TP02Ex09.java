/*Fellipe Soares Romano CB3005411*/
/*9. Entrar com uma matriz de ordem MxN, onde a ordem também será escolhida pelo usuário,
sendo que no máximo 10x10. A matriz não precisa ser quadrática. Após a digitação dos
elementos, calcular e exibir a matriz transposta.*/
import java.util.Scanner;

public class TP02Ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int LIN, COL;

        
        do {
            System.out.print("Digite a quantidade de linhas: ");
            LIN = scanner.nextInt();    
        } while (LIN > 10 || LIN < 0);
        
        
        do {
            System.out.print("Digite a quantidade de colunas: ");
            COL = scanner.nextInt();    
        } while (COL > 10 || COL < 0);
        
        int[][] matriz = new int[LIN][COL];

        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("Digite o valor da matriz na posicao ["+Integer.toString(i)+"]["+Integer.toString(j)+"]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }



        System.out.println("Matriz: ");
        for (int i = 0; i < LIN; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print("["+Integer.toString(matriz[i][j])+"]");
            }
            System.out.println();
        }


        System.out.println("Matriz transposta: ");
        for (int i = 0; i < COL; i++) {
            for (int j = 0; j < LIN; j++) {
                System.out.print("["+Integer.toString(matriz[j][i])+"]");
            }
            System.out.println();
        }

        scanner.close();
    }
}