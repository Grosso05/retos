import java.util.Scanner;
public class reto4 {
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

        System.out.println("Bienvenido al juego de piedra papel o tijera apostando");
    System.out.println("Digite cuantos creditos desea apostar");
    creditos=Leer.nextInt();

    totalcreditos = creditos;

        while(totalcreditos>0) {
            


 
        seleccionmaquina = (int)(Math.random() * 2) + 1;
 
        System.out.println("Seleccione 1 para piedra 2 para papel o 3 para tijera ");
        seleccionusuario = Leer.nextInt();
 
        
        switch (seleccionusuario)
        { 
            case 1: System.out.println(" Haz seleccionado PIEDRA ");
            break;
            case 2: System.out.println(" Haz seleccionado PAPEL ");
            break;
            case 3: System.out.println(" Haz seleccionado TIJERA ");
            break;
        }
            
        System.out.print(" Ha caido : ");
//Operaciones 

        switch ( seleccionmaquina )
        {
            case 1:
                System.out.println(" PIEDRA ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz empatado ");
                    break;
                   case 2: System.out.println(" Haz ganado ");
                   totalcreditos=creditos*2;
                    break;
                    case 3: System.out.println("Haz perdido");
                   totalcreditos=creditos-creditos;
                    break;
                }
                break;
 
                case 2:
                System.out.println(" PAPEL ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz perdido ");
                   totalcreditos=creditos-creditos;
                    break;
                   case 2: System.out.println(" Haz empatado ");
                    break;
                    case 3: System.out.println("Haz ganado");
                    totalcreditos=creditos*2;
                    break;
                }
                break;

                case 3:
                System.out.println(" TIJERA ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz ganado ");
                   totalcreditos=creditos*2;
                    break;
                   case 2: System.out.println(" Haz perdido ");
                   totalcreditos=creditos-creditos;
                    break;
                    case 3: System.out.println("Haz empatado");
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