import java.util.*;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                            A la mamá de Juan le preguntan su edad, y contesta: tengo 3 hijos, pregúntele a\s
                            Juan su edad. Alberto tiene 2/3 de la edad de Juan, Ana tiene 4/3 de la edad de Juan \s
                            y mi edad es la suma de las tres""");
        System.out.println("Ingresa la edad de Juan");
        System.out.println(edades(scanner.nextDouble()));
    }

    public static String edades(double edadJuan){
        double edadAlberto = edadJuan * 2/3;
        double edadAna = edadJuan * 4/3;
        double edadMamaJuan = edadJuan + edadAlberto + edadAna;
        return "Las edades son: \nJuan " + edadJuan +
                ", Alberto " + edadAlberto + ", Ana " + edadAna + " y la mamá " + edadMamaJuan + "\n";
    }
}