package AtivDiogo.Ativ1;

import java.util.Scanner;

/**
 * Ativ2
 */
public class Ativ2 {
    Scanner sc = new Scanner(System.in);

    public void Decisao2(){
        System.out.println("Digite o n° de sua matricula: ");

        int nmat = sc.nextInt();

        int resultado = (nmat % 4);

        if(resultado == 0){
            System.out.println("Vá para o Time Chris");
        }
        if(resultado == 1){
            System.out.println("Vá para o Time do Greg");
        }
        
        if(resultado == 2){
            System.out.println("Vá para o Time do Caruso");
        }
        
        if(resultado == 3){
            System.out.println("Vá para o Time do Jerome");
        }
    }
    
}