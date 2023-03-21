import java.util.Scanner;
public class reto6 {
    public static void main(String [] args) {
//Declarar variables    
   int seleccionusuario;
   int seleccionmaquina;
   int creditosglobal=0;
   int vidas=3;
 
   

    //instanciar clase
    Scanner Leer  = new Scanner(System.in);

    //solicitar datos
                                        

        System.out.println("Bienvenido al juego de cara y sello apostando");
       
        
        System.out.println("Digite cuanto tiene destinado en total para apostar");
    creditosglobal=Leer.nextInt();

    
    while (creditosglobal > 0) {
        while (vidas>0) {
            System.out.println("Actualmente tiene : " + vidas + "vidas");
        System.out.print("Ingrese su apuesta (1-" + creditosglobal + "): ");
        int apuesta = Leer.nextInt();
        if (apuesta < 1 || apuesta > creditosglobal) {
          System.out.println("Apuesta inválida. Intente de nuevo.");
          continue;
        }


            
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
                   creditosglobal+=apuesta;
                   System.out.println("¡Felicidades! Usted ganó " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                    break;
                   case 2: System.out.println(" Haz perdido ");
                   creditosglobal -= apuesta;
                   System.out.println("Lo siento, usted perdió " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                   vidas--;
                    break;
                }
                break;
 
                case 2:
                System.out.println(" SELLO ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz perdido ");
                   creditosglobal -= apuesta;
                   System.out.println("Lo siento, usted perdió " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                   vidas--;
                    break;
                   case 2: System.out.println(" Haz ganado");
                   creditosglobal+=apuesta;
                   System.out.println("¡Felicidades! Usted ganó " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                    break;
                }
                break;

        



                                          }
                                                    }
                                                    
                                                }  

   

    Leer.close();

                    }
                }