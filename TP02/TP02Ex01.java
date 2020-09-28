/*Fellipe Soares Romano CB3005411*/
/*Entrar com dois valores via teclado, onde o segundo valor deverá ser maior que o primeiro.
Caso contrário solicitar novamente apenas o segundo valor.*/
import java.util.Scanner;

public class TP02Ex01 {
 public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);
 double v1, v2;
 
 System.out.println("Digite o primeiro valor: ");
 v1 = scanner.nextDouble();
 
 System.out.println("Digite o segundo valor (maior do que o primeiro): ");
 v2 = scanner.nextDouble();

 while(v1 >= v2){
    System.out.println("Digite o segundo valor (maior do que o primeiro): ");
    v2 = scanner.nextDouble();

 }
 
 System.out.println("Valor 1: " + v1);
 System.out.println("Valor 2: " + v2);

 scanner.close();
    }
}