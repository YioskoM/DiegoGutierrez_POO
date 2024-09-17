import java.util.Scanner;

public class Ejercicio2 {

/* 
    26. LEER LOS SIGUIENTES DATOS DE LOS ALUMNOS DE UNA ESCUELA:
      NUMERO DE CONTROL
      NIVEL
      ESPECIALIDAD
    CALCULAR
     CUANTOS ALUMNOS SON DE BACHILLER
     CUANTOS ALUMNOS SON DE PROFECIONAL
     CUANTOS SON DE MAESTRIA
     CUANTOS SON DE SISTEMAS
*/  




     public static void main(String []args){
        Scanner IngresoValorAlumno = new Scanner(System.in);
        System.out.println("INGRESO DE ALUMNOS");
        int NumeroAlumnos;
        
        int[][] TablaAlumnos;

        Scanner IngresoNumbControl = new Scanner(System.in);
        Scanner IngresoNivelEstudiante = new Scanner(System.in);
        Scanner IngresoEspecialidadEstudiante = new Scanner(System.in);

        
        
        NumeroAlumnos = IngresoValorAlumno.nextInt();

        TablaAlumnos = new int[NumeroAlumnos][3];
        
        
        for(int i = 0 ; i < NumeroAlumnos; i++) {
        System.out.println("ingresa el numero de control del estudiante: " + (i+1));
        int NumbControl = IngresoNumbControl.nextInt();
        
        }
     }
     
}

