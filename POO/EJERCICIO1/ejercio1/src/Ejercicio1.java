
import java.util.Scanner;


    /*
    
     ! Diego Gutierrez
     Codigo: u20241221440 

     Se esta usando VSC
    } */

    /*
     * Ejercicio 1
     * 
     * Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades si a este se le asigna
        un porcentaje de su salario mensual que depende de su antigüedad en la empresa de acuerdo
        con la siguiente tabla:

    !   Tiempo                                                 Utilidad
        Menos de 1 año                                         5 % del salario
        1 año o más y menos de 2 años                          7% del salario
        2 años o más y menos de 5 años                         10% del salario
        5 años o más y menos de 10 años 1                      5% del salario
        10 años o más                                          20% del salario
     */
    

public class Ejercicio1 {

    public static void main(String[] args) throws Exception {
        System.out.println("reparto de trabajadores al año"); //mensaje que imprime en la terminal

        Scanner TiempoLaburado = new Scanner(System.in); // input para que el usuario ingrese variable

        Scanner SalarioTrabajador = new Scanner(System.in);

        float salario;

        System.out.println("Cuanto es tu salario?");

        salario = SalarioTrabajador.nextFloat();

        int año; //variable flotante

        

        if (salario > 0){


            System.out.println("Cuantos meses llevas trabajando?");

            año = TiempoLaburado.nextInt();
            if (año < 12 && año > 0) {
               System.out.println("tu utilidad es del 5% de un salario");
                float utilidad = salario * 0.05f;
                
               System.out.println("tu utilidad respecto a el salario es de :" + utilidad);
            
            } else if (año >= 12 && año < 24) {
               System.out.println("Tu utilidad es del 7% de un salario");

              float utilidad = salario * 0.07f;

              System.out.println("utilidad respecto al salario: " + utilidad);

          } else if (año >= 24 && año < 60) {
             System.out.println("Tu utilidad es del 10% de un salario");
             float utilidad = salario * 0.10f;

             System.out.println("utilidad respecto al salario: " + utilidad);
         } else if (año >= 60 && año < 120) {
             System.out.println("Tu utilidad es del 15% de un salario");
             float utilidad = salario * 0.15f;

                System.out.println("utilidad respecto al salario: " + utilidad);

          } else if (año >= 120) {
              System.out.println("Tu utilidad es del 20% de un salario");
             float utilidad = salario * 0.20f;

             System.out.println("utilidad respecto al salario: " + utilidad);

          } else {
              System.out.println("valor de meses incorrecto");
          }
    }else {
        System.out.println("Este salario no se puede obtener");
    }
        


     }
}
