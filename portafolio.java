import java.util.Scanner;

public class portafolio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {

            System.out.println("    _                        ");
            System.out.println("   | | ___ _ __ __ _ ___     ");
            System.out.println(" _ | |/ _ \\| '__/ _` |/ _ \\ ");
            System.out.println("| |_| | (_) | | | (_| | __/ ");
            System.out.println(" \\___/ \\___/|_| \\__, |\\___| ");
            System.out.println("                 |___/       ");


            System.out.println(" [?] Selecciona una opcion para continuar");
            System.out.println("proyecto iniciado --->> Mar 18 8 :45 an 2025");
            System.out.println("");




            //Menú Principal
             System.out.println("[1] La suma de dos números"); 
             System.out.println("[2]");  
            System.out.println("[3]");
            System.out.println("[0] Salir");
            System.out.print("[?]");
            opcion = scanner.nextInt();
        
            //Opciones del menú principal
            switch (opcion){
            case 1:
            System.out.println("+-----------------------------------+");
            System.out.println("Número 1:");
         }

        } while (opcion != 0);
    }
}
