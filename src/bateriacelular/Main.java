package bateriacelular;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor=0;
 

        escolher(valor);
    }

    public static void escolher(int valor) {
        Scanner scan = new Scanner(System.in);
        BateriaCelular volks1 = new BateriaCelular();
        
        System.out.println("Sua bateria esta quantos %(por-cento) de carga?");
        valor = scan.nextInt();
        volks1.setNivel(valor);

        System.out.print("Carregar celular ---> digite (1).\n");
        System.out.print("Usar o celular ---> digite (2).\n");
        System.out.print("\nDigite aqui: ");
        int escolha = scan.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("\nDeseja aumentar quantos % da bateria: ");
                int nivel = scan.nextInt();
                volks1.carregar(nivel);
                volks1.status(nivel);
                break;

            case 2:
                System.out.println("\nDeseja usar quantos % da bateria: ");
                int nivel2 = scan.nextInt();
                volks1.usar(nivel2);
                volks1.status(nivel2);
                break;
            default:
                System.out.print("\nEscolha invalida!");

        //testando GIT HUB
        }
    }
}
