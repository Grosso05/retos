public class reto1 {
    public static void main(String[] args)
     {

        // Declaracion de variables
        final double gradcen = 350;
        double grados;
        double harina;
        double divi;
        final int harinper = 13;
    	
    	// operaciones
        grados= gradcen + 273.15;
        harina= harinper * 10;
        divi= harina / 1000;
        

        System.out.println("350 grados centigrados son  :" + grados +   "  grados kelvin ");
        System.out.println("La harina de vainilla necesaria para 10 personas son:" + divi + "KG");

 
    }
}