/*
Realizar un algoritmo que le permita determinar el porcentaje de escape de los gases,
mediante  herencia simple.
 */
package herenciasimplegases;

/**
 *
 * @author Anita Pico
 */

class EscapeGas{
String tipo;
double entrada_mezcla;
double carga;
double porcentaje_salida;

void MostrarEscapeGas(){
   System.out.println("El gas "+tipo+ "Tiene una mezcla de Biodiesel de Higuerilla de"+entrada_mezcla
                      +"a una carga de motor de"+carga+ "y por lo tanto tiene un escape de "+porcentaje_salida);
}
}
class Biodiesel extends EscapeGas{
  double entrada_mezcla;

  void MostrarMezclaBiodiesel(){
  System.out.println("La mezcla de entrada del  Biodiesel es: "+entrada_mezcla);
  }

}

class Motor extends EscapeGas{
     double carga;

    void MostrarCarga(){
   System.out.println("La carga del motor es "+carga+ "%");
}
}

class Escape extends EscapeGas{
    String tipo;
    double porcentaje_salida;
    
    void MostrarTipo(){
    System.out.println("el tipo de gas de escape es: "+tipo);
    }
    void Calcularporcentaje_salida(){
    System.out.println("El porcentaje de escape es: "+porcentaje_salida+" %");
    }

}

  class GasOxigeno extends EscapeGas{
      String Tipo;
      
      double CalcularPorcentajeSalida(){
      return entrada_mezcla*carga;
      }
      
      void MostrarTipo(){
      System.out.println("El tipo de gas es: "+tipo);
      }
         
      void MostrarEntradaMezcla(){
      System.out.println("La entrada de mezcla de Biodiesel es: "+entrada_mezcla+" %");
      }
        
      void MostrarCarga(){
   System.out.println("La carga del motor es "+carga+ " %");
}
   }

class GasMonoxidoCarbono extends EscapeGas{
      String Tipo;

      double CalcularPorcentajeSalida(){
      return entrada_mezcla*carga;
   }
      
      void MostrarTipo(){
      System.out.println("El tipo de gas es: "+tipo);
      }
        void MostrarEntradaMezcla(){
      System.out.println("La entrada de mezcla de Biodiesel es: "+entrada_mezcla+" %");
      }
        
    void MostrarCarga(){
   System.out.println("La carga del motor es "+carga+ " %");
}
            
}
class GasHidrocarburo extends EscapeGas{
      String Tipo;

       double CalcularPorcentajeSalida(){
      return entrada_mezcla*carga;
   }
       void MostrarTipo(){
      System.out.println("El tipo de gas es: "+tipo);
      }
             
       void MostrarEntradaMezcla(){
      System.out.println("La entrada de mezcla de Biodiesel es: "+entrada_mezcla+" %");
      }
         
    void MostrarCarga(){
   System.out.println("La carga del motor es "+carga+ " %");
}

}
public class HerenciaSimpleGases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("    UNIVERSIDAD DE LAS FUERZAS ARMADAS ESPE");
        System.out.println("             INGENIERIA AUTOMOTRIZ");
        System.out.println("Nombre: Pico Solis Ana Graciela");
        System.out.println("Materia: Programación ");
        System.out.println("NRC: 7450");    
        System.out.println("***************************************************"); 
        System.out.println("            Herencia Simple Gases ");   
        System.out.println("***************************************************");
        
        
        Biodiesel biodiesel=new Biodiesel();
        Motor   motor=new Motor();
        Escape  escape=new Escape();
        GasOxigeno gas1=new GasOxigeno();
        GasMonoxidoCarbono gas2=new GasMonoxidoCarbono();
        GasHidrocarburo gas3=new GasHidrocarburo();
        
        gas1.tipo="Gas Oxigeno";
        gas1.entrada_mezcla= 7.5;
        gas1.carga=11.8;
        gas1.porcentaje_salida=15.4;
        
        gas2.tipo="Gas Monóxido de Carbono";
        gas2.entrada_mezcla= 12.5;
        gas2.carga=26.7;
        gas2.porcentaje_salida=494;
        
        gas3.tipo="Gas Hidrocarburo";
        gas3.entrada_mezcla=17.5 ;
        gas3.carga=56.9;
        gas3.porcentaje_salida=11;
        
        System.out.println("**Los datos de Escape del Gas Oxigeno**");
        gas1.MostrarTipo();
        gas1.MostrarEntradaMezcla();
        gas1.MostrarCarga();
        System.out.println("La salida de escape es: "+gas1.CalcularPorcentajeSalida()+"% Vol");
        System.out.println();
        
        System.out.println("**Los datos de Escape del Gas Monóxido de Carbono**");
        gas2.MostrarTipo();
        gas2.MostrarEntradaMezcla();
        gas2.MostrarCarga();
        System.out.println("La salida de escape es: "+gas2.CalcularPorcentajeSalida()+" ppm");
        System.out.println();
        
        System.out.println("**Los datos de Escape del Gas Hidrocarburo**");
        gas3.MostrarTipo();
        gas3.MostrarEntradaMezcla();
        gas3.MostrarCarga();
        System.out.println("La salida de escape es: "+gas3.CalcularPorcentajeSalida()+" ppm");
        System.out.println();        

    }
    
}