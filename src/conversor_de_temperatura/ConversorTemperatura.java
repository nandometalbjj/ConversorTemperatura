package conversor_de_temperatura;

import java.util.Scanner;

public class ConversorTemperatura {

    public static void main(String[] args) {

        //declaracao de variaveis
        float temp, cel, far, kev, conv;

        //scaner de criacao e instancia do objeto classe
        Scanner entrada = new Scanner(System.in);

        //apresentacao
        System.out.println("\n\t\t\t***CONVERSOR DE TEMPERATURA***\n");

        System.out.println("[1]-Celsius para Farenheit");
        System.out.println("[2]-Celsius para Farenheit");
        System.out.println("[3]-Celsius para Kelvin");
        System.out.print("Opcao: ");
        conv = entrada.nextInt();

        if (conv == 1) {
            //entrada de dados
            System.out.println("CELSIUS PARA FARENHEIT");
            System.out.print("Digite a temperatura em ºC: ");
            temp = entrada.nextFloat();

            //processamento
            far = (float) (1.8 * temp + 32);

            //saida de dados
            System.out.println("A temperatura em Farenheit e: ºF " + far);
            
        } else if (conv == 2) {
            //entrada de dados
            System.out.println("FARENHEIT PARA CELSIUS");
            System.out.print("Digite a temperatura em ºF: ");
            temp = entrada.nextFloat();

            //processamento
            cel = (temp-32) / (float) 1.8 ;

            //saida de dados
            System.out.println("A temperatura em celsius e: ºC " + cel); 
        } else if (conv == 3) {
            //entrada de dados
            System.out.println("CELSIUS PARA KELVIN");
            System.out.print("Digite a temperatura em ºC: ");
            temp = entrada.nextFloat();

            //processamento
            kev = temp + (float)273.15;

            //saida de dados
            System.out.println("A temperatura em Kelvin e: K " + kev); 
        }else {
            System.out.println("Opcao invalida!");
       }
    }
}
