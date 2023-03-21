import java.util.Scanner;
public class reto3 {
    public static void main(String [] args) {
//Declarar variables
   int seleccionusuario;
   int seleccionmaquina;
   int totalcreditos=0,creditos;
   int repeticion=1;
   

    //instanciar clase
    Scanner Leer  = new Scanner(System.in);

    //solicitar datos
    while(repeticion==1) {
       
        System.out.println("Bienvenido al juego de cara y sello apostando");

    System.out.println("Digite cuantos creditos desea apostar");
    creditos=Leer.nextInt();

    totalcreditos = creditos;

        while(totalcreditos>0) {
            


 
        seleccionmaquina = (int)(Math.random() * 2) + 1;
 
        System.out.println("Seleccione 1 para cara o 2 para sello ");
        seleccionusuario = Leer.nextInt();
 
        
        switch (seleccionusuario)
        { 
            case 1: System.out.println(" Haz seleccionado CARA ");
            break;
            case 2: System.out.println(" Haz seleccionado SELLO");
            break;
        }
            
        System.out.print(" Ha caido : ");
//Operaciones 

        switch ( seleccionmaquina )
        {
            case 1:
                System.out.println(" CARA ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz ganado ");
                   totalcreditos=creditos*2;
                    break;
                   case 2: System.out.println(" Haz perdido ");
                   totalcreditos=creditos-creditos;
                    break;
                }
                break;
 
                case 2:
                System.out.println(" SELLO ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz perdido ");
                   totalcreditos=creditos-creditos;
                    break;
                   case 2: System.out.println(" Haz ganado");
                   totalcreditos=creditos*2;
                    break;
                }
                break;

        }
         System.out.println("Ahora tiene : " + totalcreditos + " creditos ");  
        }
         System.out.println("Digite 1 para volver a jugar o 2 para finalizar");
         repeticion = Leer.nextInt();


    }

    System.out.println("Gracias por jugar");

    Leer.close();
}
}