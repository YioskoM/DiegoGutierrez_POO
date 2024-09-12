
import java.util.Scanner;

/*
 * Nombre: Diego Alejandro Gutierrez Flores
 * Codigo: u20241221440
 * 
 */

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bodega camiones");

        Scanner IngresoCamiones = new Scanner(System.in);

        int IndiceCamiones ;

        Scanner TipoModo = new Scanner(System.in);

        System.out.println("hacerlo de manera: 1/ Manual  2/Automatica");

        double SumaCarga = 0.0;
        double PromedioCarga = 0.0;
        double PromC = 0;

        double SumaDescarga = 0.0;
        double PromedioDescarga = 0.0;
        double PromD = 0;
        
        double CantidaHora = 0;

        int Modo = TipoModo.nextInt();

        switch(Modo){

        case 1:
        System.out.println("Cuantos camiones ingresaron en el dia de hoy?");
        
        IndiceCamiones = IngresoCamiones.nextInt();
        
        if (IndiceCamiones <= 100) {
            double[][] TablaIngresos;

            TablaIngresos = new double[IndiceCamiones][6];

            for (int i = 0; i < IndiceCamiones; i++) {

                //Tiempo servicio
                    Scanner IngresoTipoServicio = new Scanner(System.in);
                
                    System.out.println("Tipo de servicio: 1. Carga / 2. Descarga. // Camión " + (i+1));

                    double TipoServicio = IngresoTipoServicio.nextDouble();

                    if (TipoServicio < 2 && TipoServicio > 0){
                        TablaIngresos[i][0] = TipoServicio;
                    } else {
                        TablaIngresos[i][0] = 2;
                    }

                //Ingreso del producto
                    Scanner IngresoTipoProducto = new Scanner(System.in);

                    System.out.println("Tipo de Producto: 1. Perecedero / 2. No perecedero // Camion " + (i+1));

                    double TipoProducto = IngresoTipoProducto.nextDouble();

                    if (TipoProducto <= 2 && TipoProducto > 0){
                    TablaIngresos[i][1] = TipoProducto;
                    } else {
                        TablaIngresos[i][1] = 2;
                    }

                //Ingreso del peso

                    Scanner IngresoPesoProducto = new Scanner(System.in);

                    System.out.println("Ingresa el peso // Camion " + (i+1));

                    double PesoProducto = IngresoPesoProducto.nextDouble();

                
                    TablaIngresos[i][2] = PesoProducto;
              
                    
                //Ingreso de permanencia

                    Scanner IngresoPermanencia = new Scanner(System.in);

                    System.out.println("cuantas horas estuvo el camion " + (i+1));

                    double TiempoPermanencia = IngresoPermanencia.nextDouble();

                  
                    TablaIngresos[i][3] = TiempoPermanencia;

                //Largo del camion    

                    Scanner LargoCamion = new Scanner(System.in);

                    System.out.println("cuanto mide el camion " + (i+1));

                    double DimencionCamion = LargoCamion.nextDouble();

                  
                    TablaIngresos[i][4] = DimencionCamion;

                //precio a pagar

                    double PrecioPagar;

                
                    if(TablaIngresos[i][0] == 2){
                    if (TablaIngresos[i][1] == 1){
                        if (TablaIngresos[i][2] < 8 && TablaIngresos[i][2] > 0) {
                            PrecioPagar = 15000 * TablaIngresos[i][2];

                            TablaIngresos[i][5]= PrecioPagar;
                        } else if (TablaIngresos[i][2] >= 8) {
                            PrecioPagar = 9000 * TablaIngresos[i][2];

                            TablaIngresos[i][5]= PrecioPagar;
                        } else {
                            TablaIngresos[i][5] = 1/0; //error
                        }
                    } else {
                        if (TablaIngresos[i][2] < 8 && TablaIngresos[i][2] > 0) {
                            PrecioPagar = 60000;

                            TablaIngresos[i][5]= PrecioPagar;
                        } else if (TablaIngresos[i][2] >= 8) {
                            PrecioPagar = 60000;
                            if (TablaIngresos[i][2] >= 10){
                                for (int in = 10; TablaIngresos[i][2] >= in; in+=10){
                                    PrecioPagar += 7000;

                                    TablaIngresos[i][5] = PrecioPagar;
                                }
                            }
                        } else {
                            TablaIngresos[i][5] = 1/0; //error
                        }
                    }

                } else {
                    if (TablaIngresos[i][3] <= 2) {
                        PrecioPagar = 0;
                        TablaIngresos[i][5] = PrecioPagar;
                    } else {
                        PrecioPagar = 4000 * TablaIngresos[i][3];

                        if(TablaIngresos[i][4] > 4){
                            double IncrementoLargo = 0.25 * PrecioPagar;

                            IncrementoLargo += PrecioPagar;
                            TablaIngresos[i][5] = IncrementoLargo;
                        } else {
                            TablaIngresos[i][5] = PrecioPagar;
                        }

                    }
                }
                
                if ((int)TablaIngresos[i][0] == 1) {

                            PromC++;
                            SumaCarga += TablaIngresos[i][5];

                            PromedioCarga = SumaCarga/PromC;


                } else if ((int)TablaIngresos[i][0] == 2) {
                    PromD++;
                    SumaDescarga += TablaIngresos[i][5];

                    PromedioDescarga = SumaDescarga/PromD;
                } 
                
                if(TablaIngresos[i][3] <= 2) {
                    CantidaHora+=1;
                }
                                 
            }

            System.out.println("TipoS   TipoP   Peso    Tiempo  Largo   valor");
            
            for(int fi = 0; fi < TablaIngresos.length; fi++) {
                System.out.println(" ");
                for(int col = 0; col < TablaIngresos[fi].length; col++){

                    System.out.print(TablaIngresos[fi][col] + "     ");
                }
            }
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("El promedio de ingresos para servicio de (Carga) es de " + PromedioCarga);
            System.out.println("El promedio de ingresos para servicio de (Descarga) es de " + PromedioDescarga);
            System.out.println("cantidad de vehiculos de servicio (Carga): " + PromC);
            System.out.println("cantidad de vehiculos de servicio (Descarga) " + PromD);
            System.out.println("ingresos para servicio de (Carga)" + SumaCarga);
            System.out.println("ingresos para servicio de (Descarga)" + SumaDescarga);
            System.out.println("Camiones que solo permanecieron 2 o menos horas" + CantidaHora);

        }
        break;

        case 2:
            IndiceCamiones = (int)(Math.random()*(100-1)) + 1;

            double[][] TablaIngresosAutomatica;

            TablaIngresosAutomatica = new double[IndiceCamiones][6];

            for (int i = 0; IndiceCamiones > i ; i++) {
                TablaIngresosAutomatica[i][0] = (int)(Math.random()*(3-1)) + 1; //Tipo de servicio
                TablaIngresosAutomatica[i][1] = (int)(Math.random()*(3-1)) + 1; //Tipo de producto
                TablaIngresosAutomatica[i][2] = (int)(Math.random()*(40-1)) + 1; //Peso toneladas
                TablaIngresosAutomatica[i][3] = (int)(Math.random()*(24-1)) + 1; //Tiempo
                TablaIngresosAutomatica[i][4] = (int)(Math.random()*(20-1)) + 1; //Largo

                double PrecioPagar;

                if(TablaIngresosAutomatica[i][0] == 2){
                    if (TablaIngresosAutomatica[i][1] == 1){
                        if (TablaIngresosAutomatica[i][2] < 8 && TablaIngresosAutomatica[i][2] > 0) {
                            PrecioPagar = 15000 * TablaIngresosAutomatica[i][2];

                            TablaIngresosAutomatica[i][5]= PrecioPagar;
                        } else if (TablaIngresosAutomatica[i][2] >= 8) {
                            PrecioPagar = 9000 * TablaIngresosAutomatica[i][2];

                            TablaIngresosAutomatica[i][5]= PrecioPagar;
                        } else {
                            TablaIngresosAutomatica[i][5] = 1/0; //error
                        }
                    } else {
                        if (TablaIngresosAutomatica[i][2] < 8 && TablaIngresosAutomatica[i][2] > 0) {
                            PrecioPagar = 60000;

                            TablaIngresosAutomatica[i][5]= PrecioPagar;
                        } else if (TablaIngresosAutomatica[i][2] >= 8) {
                            PrecioPagar = 60000;
                            if (TablaIngresosAutomatica[i][2] >= 10){
                                for (int in = 10; TablaIngresosAutomatica[i][2] >= in; in+=10){
                                    PrecioPagar += 7000;

                                    TablaIngresosAutomatica[i][5] = PrecioPagar;
                                }
                            }
                        } else {
                            TablaIngresosAutomatica[i][5] = 1/0; //error
                        }
                    }

                } else {
                    if (TablaIngresosAutomatica[i][3] <= 2) {
                        PrecioPagar = 0;
                        TablaIngresosAutomatica[i][5] = PrecioPagar;
                    } else {
                        PrecioPagar = 4000 * TablaIngresosAutomatica[i][3];

                        if(TablaIngresosAutomatica[i][4] > 4){
                            double IncrementoLargo = 0.25 * PrecioPagar;

                            IncrementoLargo += PrecioPagar;
                            TablaIngresosAutomatica[i][5] = IncrementoLargo;
                        } else {
                            TablaIngresosAutomatica[i][5] = PrecioPagar;
                        }

                    }
                }

                    if (TablaIngresosAutomatica[i][0] == 1) {

                        PromC+=1;
                        SumaCarga += TablaIngresosAutomatica[i][5];

                        PromedioCarga = SumaCarga/PromC;
 
                    }
                    if (TablaIngresosAutomatica[i][0] == 2){
                        PromD+=1;
                        SumaDescarga += TablaIngresosAutomatica[i][5];

                        PromedioDescarga = SumaDescarga/PromD;
                    }             
            
                    if(TablaIngresosAutomatica[i][3] <= 2) {
                        CantidaHora+=1;
                    }

                
            }
            System.out.println("TipoS   TipoP   Peso    Tiempo  Largo   valor");
            
            for(int fi = 0; fi < TablaIngresosAutomatica.length ; fi++) {
                System.out.println(" ");
                for(int col = 0; col < TablaIngresosAutomatica[fi].length; col++){

                    System.out.print(TablaIngresosAutomatica[fi][col] + "     ");
                }
            }

            System.out.println(" ");
            System.out.println(" ");
            System.out.println("El promedio de ingresos para servicio de (Carga) es de " + PromedioCarga);
            System.out.println("El promedio de ingresos para servicio de (Descarga) es de " + PromedioDescarga);
            System.out.println("cantidad de vehiculos de servicio (Carga): " + PromC);
            System.out.println("cantidad de vehiculos de servicio (Descarga) " + PromD);
            System.out.println("ingresos para servicio de (Carga) " + SumaCarga);
            System.out.println("ingresos para servicio de (Descarga) " + SumaDescarga);
            System.out.println("Camiones que solo permanecieron 2 o menos horas " + CantidaHora);
        break;

        }

    }
}
