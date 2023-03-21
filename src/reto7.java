import java.util.Scanner;
public class reto7 {
    public static void main(String [] args) {
//Declarar variables    
   int seleccionusuario;
   int seleccionmaquina;
   int creditosglobal=0;
   int vidas=3;
 
   

    //instanciar clase
    Scanner Leer  = new Scanner(System.in);

    //solicitar datos
                                        

        System.out.println("Bienvenido al juego de piedra papel o tijera apostando");
       
        
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
 
        System.out.println("Seleccione 1 para piedra 2 para papel o 3 para tijera ");
        seleccionusuario = Leer.nextInt();
 
        
        switch (seleccionusuario)
        { 
            case 1: System.out.println(" Haz seleccionado PIEDRA ");
            break;
            case 2: System.out.println(" Haz seleccionado PAPEL");
            break;
            case 3: System.out.println("Haz seleccionado TIJERA");
        }
            
        System.out.print(" Ha caido : ");
//Operaciones 

        switch ( seleccionmaquina )
        {
            case 1:
                System.out.println(" PIEDRA ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz EMPATADO ");
                   creditosglobal+=apuesta;
                   System.out.println("¡Felicidades! Usted ganó " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                    break;
                   case 2: System.out.println(" Haz GANADO ");
                   creditosglobal+=apuesta;
                   System.out.println("¡Felicidades! Usted ganó " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                    break;
                    case 3: System.out.println("Haz perdido");
                    creditosglobal -= apuesta;
                   System.out.println("Lo siento, usted perdió " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                   vidas--;
                   break;
                }
                break;
 
                case 2:
                System.out.println(" PAPEL ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz perdido ");
                   creditosglobal -= apuesta;
                   System.out.println("Lo siento, usted perdió " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                   vidas--;
                    break;
                    case 2 : System.out.println("Haz EMPATADO");
                    break;
                   case 3: System.out.println(" Haz ganado");
                   creditosglobal+=apuesta;
                   System.out.println("¡Felicidades! Usted ganó " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                    break;
                }
                break;

                case 3:
                System.out.println(" TIJERA ");
                switch ( seleccionusuario )
                {
                   case 1: System.out.println(" Haz GANADO ");
                   creditosglobal+=apuesta;
                   System.out.println("¡Felicidades! Usted ganó " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                    break;
                    case 2 : System.out.println("Haz PERDIDO");
                    creditosglobal -= apuesta;
                   System.out.println("Lo siento, usted perdió " + apuesta + " créditos. Su nuevo total es " + creditosglobal + ".");
                   vidas--;
                    break;
                   case 3: System.out.println(" Haz EMPATADO");
                   break;
                }
                break;

        



                                          }
                                                    }
                                                    
                                                }  

   

    Leer.close();

                    }
                }