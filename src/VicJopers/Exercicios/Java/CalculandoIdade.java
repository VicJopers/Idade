package VicJopers.Exercicios.Java;

import java.util.Scanner;

public class CalculandoIdade {
    public static void main(String[] args){
        int anos, meses, dias;
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Bem vindo ao programa para calcular quantos dias vc tem. Deseja prosseguir?");
            String op = scan.nextLine();
            if(op.equals("S")){
                System.out.println("Digite quantos anos você tem: ");
                anos = scan.nextInt();
                System.out.println("Digite quantos meses você tem: ");
                meses = scan.nextInt();
                System.out.println("Digite quantos dias você tem: ");
                dias = scan.nextInt();

                int total = (anos*365)+(meses*30)+dias;
                System.out.println("Sua idade total expressa em dias é: "+total);
                System.out.println("DIGITE N PARA PARAR E S PARA RETORNAR");
                scan = new Scanner(System.in);
            } else if (op.equals("N")) {
                break;
            }
        }
    }
}
