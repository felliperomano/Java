/*Fellipe Soares Romano CB3005411*/
/*3. Entrar via teclado com N valores quaisquer. O valor N (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos N valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
Após exibir os dados, perguntar ao usuário de deseja ou não uma nova execução do
programa. Consistir a resposta no sentido de aceitar somente S ou N e encerrar o
programa em função dessa resposta.*/
import java.util.Scanner;
import java.util.regex.Pattern;

public class TP02Ex03 {
 public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);
 
double v;
 int valor = 1;
 int n;
 double soma = 0;
 double media = 0;
 double maior;
 double menor; 
 int negativo = 0;
 int positivo = 0;
 double ppositivo = 0;
 double pnegativo = 0;
 char verificacao = 'S';

while(verificacao == 'S' )
{

 System.out.println("Digite a quantidade de valores a serem digitados (menos que 20 valores e positivo): ");
 n = scanner.nextInt();

 while ((n >= 20) || (n <= 0))
 {
    System.out.println("Numero invalido. Digite a quantidade de valores a serem digitados (menos que 20 valores e positivo): ");
    n = scanner.nextInt();
 }
 double vetor[] = new double[n];

 
 while (valor <= n)
 {
    System.out.println("Digite o "+valor+"° valor: ");
    v = scanner.nextDouble();

    vetor[valor-1] = v;

    valor++;
   
 }

 maior = vetor[0];
 menor = vetor[0];
 for(int i=0; i<n; i++)
 {

      soma += vetor[i];

      if(vetor[i] > maior){
        maior = vetor[i];
      }

      if(vetor[i] < menor){
          menor = vetor[i];
      }

      if(vetor[i] < 0)
      {
           negativo +=1;
      }

      if(vetor[i] > 0){
          positivo +=1;
      }
 }

 media = soma/n;

    pnegativo = (negativo * 100)/n;
    ppositivo = (positivo * 100)/n;
 
    System.out.println("Soma: "+ soma);
    System.out.println("Media: "+ media);
    System.out.println("Maior: "+ maior);
    System.out.println("Menor: "+ menor);
    System.out.println("Porcentagem de negativos: "+ pnegativo);
    System.out.println("Porcentagem de positivos: "+ ppositivo);

    System.out.println("Deseja realizar a operacao novamente? (S/N)");
    verificacao = scanner.next().charAt(0);

    while((verificacao != 'S') && (verificacao != 'N')){
        System.out.println("Digite uma letra valida. Deseja realizar a operacao novamente? (S/N)");
        verificacao = scanner.next().charAt(0);
      
        
    }   

}

 scanner.close();
    }
}