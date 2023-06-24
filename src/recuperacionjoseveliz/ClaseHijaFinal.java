
package recuperacionjoseveliz;
import java.util.Scanner;

public class ClaseHijaFinal {


    private String nombreHija;
    private int cantidadEjercicios;

    public void setNombreHija(String nombre) {
        this.nombreHija = nombre;
    }

    public String getNombreHija() {
        return nombreHija;
    }

    public void setCantidadEjercicios(int cantidad) {
        this.cantidadEjercicios = cantidad;
    }

    public int getCantidadEjercicios() {
        return cantidadEjercicios;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        ClaseHijaFinal hija = new ClaseHijaFinal();

   
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        hija.setNombreHija(nombre);

    
        System.out.print("Ingrese la cantidad de ejercicios: ");
        int cantidad = scanner.nextInt();
        hija.setCantidadEjercicios(cantidad);

       
        System.out.println("Nombre: " + hija.getNombreHija());
        System.out.println("Cantidad de ejercicios: " + hija.getCantidadEjercicios());
    
        int[] numeros = {2, 3, 4, 5, 6, 7};
        int sumaImpares = sumarImpares(numeros);
        System.out.println("La suma de los números impares es: " + sumaImpares);
    }

    public static int sumarImpares(int[] numeros) {
        int suma = 0;
        int i = 0;
        while (i < numeros.length) {
            if (numeros[i] % 2 != 0) {
                suma += numeros[i];
            }
            i++;
        }
        return suma;
    }
        }

