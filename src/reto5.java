import java.util.Scanner;

public class reto5 {
    public static void main(String[] args) {
        //Declaramos variables
        String nombreRegistrado = "Juan";
        //Instanciamos un objeto
        Scanner Leer = new Scanner(System.in);
    
        System.out.println("Actualmente se encuentra registrado el empleado : " + nombreRegistrado);
        //Solicitamos datos
        System.out.print("Ingresa el nombre del empleado: ");
        String nombreUsuario = Leer.nextLine();
        //Realizamos una validacion
        if (nombreRegistrado.equals(nombreUsuario)) {
            System.out.println("Bienvenido, " + nombreUsuario);
            metodo2();
        } else {
            System.out.println("Tu nombre no coincide con el registrado.");
            System.out.println("Registrando tu nombre...");
            nombreRegistrado = nombreUsuario;
            System.out.println("Tu nombre ha sido registrado como " + nombreRegistrado);
            metodo2();
        }
        Leer.close();
    }

// Creamos un segudo metodo con el fin de validar el nombre del cliente
public static void metodo2() {
    String nombreRegistrado = "Pedro";
        Scanner Leer = new Scanner(System.in);
        System.out.println("Actualmente se encuentra registrado el cliente : " + nombreRegistrado);
        System.out.print("Ingresa el nombre del cliente : ");
        String nombreUsuario = Leer.nextLine();
        if (nombreRegistrado.equals(nombreUsuario)) {
            System.out.println("Bienvenido, " + nombreUsuario);
            metodo3();
        } else {
            System.out.println("El nombre no coincide con el registrado.");
            System.out.println("Registrando el nombre...");
            nombreRegistrado = nombreUsuario;
            System.out.println("El nombre ha sido registrado como " + nombreRegistrado);
            metodo3();
        }
        Leer.close();
}

//creamos un tercer metodo para el proceso normal de una caja
    public static void metodo3() {
        Scanner Leer = new Scanner(System.in);
        double total = 0;
        boolean seguirComprando = true;
        while (seguirComprando) {
            System.out.print("Ingresa el precio del producto o escribe 'fin' para terminar la compra: ");
            String input = Leer.nextLine();
            if (input.equals("fin")) {
                seguirComprando = false;
            } else {
                double precio = Double.parseDouble(input);
                total += precio;
            }
        }
        System.out.println("El total de la compra es: $" + total);
        Leer.close();
    }
}

