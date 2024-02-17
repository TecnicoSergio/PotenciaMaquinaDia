import java.util.Scanner;
import PotenciaMaquina.Potencia;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Potencia potencia = new Potencia(122, 455, 321, 12);

        float potencias;
        float maiorValor = 0;
        float menorValor = 0;
        int i;

        for (i=0; i<5; i++){
            System.out.println("Digite valor da potencia: " );
            potencias = sc.nextFloat();

            if(potencias <= maiorValor){
                potencias = maiorValor = 455;
                System.out.println(maiorValor/12);
                System.out.println("A potencia atingida foi de alto valor: " + maiorValor);
                maiorValor = sc.nextFloat();

            }if(potencias >= menorValor){
                potencias = menorValor = 125;
                System.out.println(menorValor/12);
                System.out.println("A potencia atingida foi de baixo valor: " + menorValor);
                menorValor = sc.nextFloat();

            }else{
                System.out.println("A maquina precisa de reparos: " );
            }

        }
        

        /*maiorValor = potencias = 456;
        for(j=0; j>20; j++){
            if(potencias > maiorValor) {
                maiorValor = potencias;
                System.out.println("Digite o maior valor: " );
                maiorValor = sc.nextFloat();
            }
        }
        menorValor = potencias = 123;
        for(k=0; k<20;k++){
            if(potencias < menorValor){
                menorValor = potencias;
                System.out.println("Digite o menor valor:  " );
                menorValor = sc.nextFloat();
            }
        }
        P = W / t, onde P é a potência, W é o trabalho e t é o tempo
        System.out.println("A maior potencia atingida pela maquina é: ");
        System.out.println(potencias = maiorValor/12 + maiorValor );

        System.out.println("A menor potencia atingida pela maquina é: ");
        System.out.println(potencias = menorValor/12 + menorValor);*/




    }
}