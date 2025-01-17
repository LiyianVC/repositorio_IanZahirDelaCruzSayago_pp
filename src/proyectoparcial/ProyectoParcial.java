package proyectoparcial;
import java.util.Scanner;


public class ProyectoParcial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del empleado
        System.out.println("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese las horas trabajadas: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.println("Ingrese la tarifa por hora: ");
        double tarifaPorHora = scanner.nextDouble();

        // Cálculos
        double sueldoBruto = horasTrabajadas * tarifaPorHora;
        double descuento = sueldoBruto * 0.13;
        double sueldoNeto = sueldoBruto - descuento;

        // Resultados
        System.out.println("\nResultados:");
        System.out.println("Empleado: " + nombre);
        System.out.println("Sueldo Bruto: " + sueldoBruto);
        System.out.println("Descuento (ONP): " + descuento);
        System.out.println("Sueldo Neto: " + sueldoNeto);
        

        scanner.close();
    }
}
