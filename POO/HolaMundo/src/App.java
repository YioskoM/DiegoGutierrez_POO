    

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //objeto clase scanner
        String nombre; // se debe declarar una variable antes de usar
        nombre = input.nextLine(); //input recibe strings
        System.out.println("Hola "+ nombre); //mensaje de salida 

        System.out.println("Dime tu edad"); //mensaje de salida
        
        int edad = input.nextInt(); //ingresa tipo int 

        // NO ES NECESARIO INICIALIZAR LAS VARIABLES    

        if (edad <= 18){
            System.out.println("Eres menor");
        } else {
            System.out.println("vente pa aca mami");

        }

        float talla= 0, peso= 0;

        System.out.println("ingrese su peso");
        peso = input.nextFloat();
        System.out.println("tu peso es de: "+ peso);

        float nota;

        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese la nota");

        nota = in.nextFloat();

        if (nota > 0 && nota < 3) {
            System.out.println("nota erronea");
        } else if (nota >= 3 && nota <= 4){
            System.out.println("pasaste raspa'o ");
        } else if (nota <= 5) {
            System.out.println("pasaste re bien");
        } else {
            System.out.println("error");
        }
    }
}
