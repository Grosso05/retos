import java. util.Scanner;

public class reto2 {
    public static void main(String[] args)
     {

        //declaracion de variables
        String nombpro;
        String nombma;
        String nombbe;
        double peso;
        double dosis;
        int semananac;
        double edad;
        //instanciar objeto
    	Scanner leer =new Scanner(System.in);
        //solicitar datos al usuario
        System.out.println("Ingrese el nombre del doctor:");
        nombpro=leer.next();
        System.out.println("Ingrese el nombre de la madre del bebe:");
    	nombma=leer.next();
        System.out.println("Ingrese el nombre del bebe:");
    	nombbe=leer.next();
    	System.out.println("Ingrese el peso del bebe:");
    	peso=leer.nextDouble();
    	System.out.println("Ingrese cuantas semanas tiene su bebe:");
    	semananac=leer.nextInt();
//operaciones

edad= semananac / 4;
        dosis= (peso + 15) / (edad * 10) * 8  ;
    
        System.out.println("Querido doctor :" + nombpro + " El bebe " + nombbe + " Hijo de " + nombma);
        System.out.println("Requiere de dosis :"+dosis + "Mg");
        System.out.println("Los meses de su bebe son :" + edad);

 leer.close();

    }
}