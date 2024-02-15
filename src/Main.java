import java.util.Scanner;
import PotenciaMaquina.Potencia;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Potencia potencia = new Potencia(122, 455, 321, 12);

        float potencias;
        float maiorValor;
        float menorValor;
        int i;

        for (i=0; i<20;i++){
            System.out.println("Digite valor da potencia: ");
            potencias = sc.nextFloat();
        }

        maiorValor = potencias = 1255;
        for(i=0;i>20;i++){
            if(potencias > maiorValor) {
                maiorValor = potencias;
                System.out.println("Potencia de maior valor é: ");
                maiorValor = sc.nextFloat();
            }
        }


        menorValor = potencias = 122;
        for(i=0; i<20;i++){
            if(potencias < menorValor){
                menorValor = potencias;
                System.out.println("Potencia de menor valor é : ");
                menorValor = sc.nextFloat();
            }
        }

        System.out.println("A maior potencia atingida pela maquina é: ");
        System.out.println(potencias = maiorValor/12 + maiorValor);
        
        System.out.println("A menor potencia atingida pela maquina é: ");
        System.out.println(potencias = menorValor/12 + menorValor);




    }
}