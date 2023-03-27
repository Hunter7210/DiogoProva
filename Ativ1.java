package AtivDiogo.Ativ1;

import java.util.Scanner;

public class Ativ1
{
    Scanner sc = new Scanner(System.in);

    public void Decisao1()
    {
        System.out.println("Por favor digite algum numero: ");
        double numero1 = sc.nextDouble();
        System.out.println("Por favor digite outro numero: ");
        double numero2 = sc.nextDouble();
        System.out.println("Por favor escolha qual operação será realizada: ");  
        System.out.println("1 = Adição;");
        System.out.println("2= Subtração;");
        System.out.println("3= Multiplicação;");
        System.out.println("4= Divisão.");        
        int operação = sc.nextInt();

        if(operação == 1){
           double resultado = (numero1 + numero2);
           System.out.println("O resultado é : " +resultado );
        }

        else if (operação == 2){
            double resultado1 = (numero1 - numero2);
            System.out.println("O resultado é : " +resultado1 );
        }

        else if (operação == 3){
            double resultado2 = (numero1 * numero2);
            System.out.println("O resultado é : " +resultado2 );
        }
        else if (operação==4 && numero2 ==0){
            System.out.println("Incapaz de dividir por 0");
        }
        else if (operação == 4){
            double resultado3 = (numero1 / numero2);
            System.out.println("O resultado é : " +resultado3 );
        }
      

    }  
    
}
