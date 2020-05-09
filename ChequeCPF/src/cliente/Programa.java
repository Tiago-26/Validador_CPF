package cliente;

import java.util.Scanner;

        public class Programa {

          public static void main(String[] args) {
            Scanner ler = new Scanner(System.in);

            ValidaCPF val = new ValidaCPFService().getValidaCPFPort();


            System.out.println("Informe um CPF: ");
            String CPF = ler.next();

            System.out.println("Resultado: " + val.isCPF(CPF));

            }

}