package service;
import java.util.Scanner;

public class Validaciones {

    Scanner sc = new Scanner(System.in);

    public int capturarInt(String mensaje) {
        int valor;
        while (true) {
            System.out.println(mensaje);
            String entrada = sc.nextLine();
            try {
                valor = Integer.parseInt(entrada);
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese por favor un valor valido");
            }
        }
    }

    public double capturarDouble (String mensaje) {
        double valor;
        while (true) {
            System.out.println(mensaje);
            String entrada = sc.nextLine();
            try {
                valor = Double.parseDouble(entrada);
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Ingrese por favor un valor valido");
            }
        }
    }

    public String capturarString (String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }

    public String validacionStringLenght (int tamanio, String mensaje) {
        String entrada;

        while(true){
            System.out.println(mensaje);
            entrada = sc.nextLine();

            if(entrada.length() == tamanio){
                return entrada;
            }else{
                System.out.println("Ingrese por favor un valor valido, el tamaño del valor a registrar debe ser de " + tamanio + " caracteres" );
            }
        }

    }

}
