import java.util.Scanner;

public class reto8 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);

        String nombreap;
        String documento;
        String documentoregistrado=" ";
        int eleccionauxilio;
        int repeticion=1;
        int auxiliosAsignados = 0;
        

        do {
            System.out.println("Bienvenido al sistema de registro para subsidios del aprendiz");
            System.out.print("Ingrese el nombre del aprendiz: ");
            nombreap= Leer.nextLine();


            System.out.print("Ingrese el numero de  documento del Aprendiz : ");
            documento = Leer.nextLine();
            

  
            if (documento.equals(documentoregistrado)) {
                System.out.println("Este documento ya ha sido registrado");
                continue; // Saltar a la siguiente iteración del ciclo
            }


            documentoregistrado = documento;

            

            while (auxiliosAsignados < 1) {
                System.out.println("Seleccione 1 para auxilio de transporte,2 para sostenimiento o 3 para alimentacion");
                eleccionauxilio = Leer.nextInt();
                System.out.println();
                

                switch (eleccionauxilio) {
                    case 1:
                        if (auxiliosAsignados == 0) {
                            auxiliosAsignados++;
                            System.out.println("El auxilio de transporte fue asignado al aprendiz " + nombreap + " con numero de documento " + documentoregistrado);
                        } else {
                            System.out.println("El estudiante " + nombreap + " con numero de documento " + documentoregistrado +  " ya tiene asignado un auxilio");
                        }
                        break;
                    case 2:
                        if (auxiliosAsignados == 0) {
                            auxiliosAsignados++;
                            System.out.println(" El auxilio de sostenimiento fue asignado al aprendiz " + nombreap + " con numero de documento " + documentoregistrado);
                        } else {
                            System.out.println("El estudiante " + nombreap + " con numero de documento " + documentoregistrado +  " ya tiene asignado un auxilio");
                        }
                        break;
                    case 3:
                        if (auxiliosAsignados == 0) {
                            auxiliosAsignados++;
                            System.out.println("El auxilio de alimentacion fue asignado al aprendiz  " + nombreap + " con numero de documento " + documentoregistrado);
                        } else {
                            System.out.println("El estudiante " + nombreap + " con numero de documento " + documentoregistrado + " ya tiene asignado un auxilio");
                        }
                        break;
                        default:
                        System.out.println("La opcion seleccionada no es valida");
                        break;
                }
            }

            System.out.print("Digite 1 para registrar otro aprendiz o 2 para finalizar ");
            repeticion = Leer.nextInt();
  

        } while (repeticion == 1);

        System.out.println("Gracias por usar nuestros servicios.");
        Leer.close();
 }

}