import java.util.Scanner;
 public class Salario{
     public static void main(String[] args){
         Scanner sc = new Scanner (System.in);

         System.out.println("Digite o Salario R$: ");
         double salario = sc.nextDouble();
         double aumento =  salario * 15/100;
         double novosalario = salario + aumento;
         System.out.println("com o aumento de 15% o seu salario novo é " + novosalario);
     }
 }