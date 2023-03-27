package AtivDiogo.Ativ1;

import java.util.Scanner;

public class Ativ3 {
    Scanner sc = new Scanner(System.in);

    public void Decisao3(){
        System.out.println("Escreva quantos quilos foram comprados de banana: ");
        double banana = sc.nextDouble();
        System.out.println("Escreva quantos quilos foram comprados de morango: ");
        double morango = sc.nextDouble();
        System.out.println("Escreva quantos quilos foram comprados de maçã: ");
        double maca = sc.nextDouble();
        
        double resultadok = (banana+morango+maca); // Resultado em KG

        double resulbanana = (banana*3.5);
        double resulmorango = (morango*2.3);
        double resulmaca = (maca*1.8);

        double resultadop = (resulbanana+resulmaca+resulmorango); // Resultado em Reais
        
        if (resultadok >= 15 || resultadop >= 30) {
            double dfinal = (resultadop-(resultadop*0.1));
            System.out.println("O valor em KG de sua compra é de: " + resultadok);
            System.out.println("O valor final é de: " + dfinal);
        }
        else
        {
            System.out.println("O valor me KG de sua compra é de: " + resultadok);
            System.out.println("O valor final é de: " + resultadop);
        }

    }
}
