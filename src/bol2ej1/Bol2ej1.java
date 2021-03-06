
package bol2ej1;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Bol2ej1 {
public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println(ANSI_RED + "|Ejercicio 1|"+ ANSI_RED);
        float base, altura;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca la base: ");
        base = teclado.nextFloat();
        System.out.println("Introduzca la altura: ");
        altura = teclado.nextFloat();
        float area = (base * altura) / 2;
        System.out.println("\nEl area del triángulo es: " + area);
        
        //Ejercicio 2
        System.out.println(ANSI_RED + "|Ejercicio 2|"+ ANSI_RED);
        float lado, areaCuadrado;
        System.out.println("Introduzca la longitud del lado: ");
        lado = teclado.nextFloat();
        areaCuadrado = (float)Math.pow(lado,2);
        System.out.println("El area del cuadrado es: " + areaCuadrado);
        
        //Ejercicio 3
        System.out.println(ANSI_RED + "|Ejercicio 3|"+ ANSI_RED);
        float euros, dolares;
        final float cambio = 1.11704f;
        System.out.println("Introduzca la cantidad de euros que quiere cambiar a dólares: ");
        euros = teclado.nextFloat();
        dolares = euros * cambio;
        System.out.println("Ahora usted tiene " + dolares + " $");
        
        //Ejercicio 4
        System.out.println(ANSI_RED + "|Ejercicio 4|"+ ANSI_RED);
        float n1, n2, suma, resta, multiplicacion, division;
        System.out.println("Teclee el numero 1:");
        n1 = teclado.nextFloat();
        System.out.println("Teclee el numero 2:");
        n2 = teclado.nextFloat();
        suma = n1 + n2;
        resta = n1 - n2;
        multiplicacion = n1 * n2;
        division = n1 / n2;
        System.out.println("La suma es " + suma + ", la resta es " + resta + ", la multiplicacion es " + multiplicacion + " y la division es " + division);
        
        //Ejercicio 5
        System.out.println(ANSI_RED + "|Ejercicio 5|"+ ANSI_RED);
        float millas, metros;
        final int milla_metros = 1852;
        System.out.println("Introduzca las millas marinas que quiere convertir a metros:");
        millas = teclado.nextFloat();
        metros  = millas * milla_metros;
        System.out.println("El resultado es: " + metros + " m");
        
        //Ejercicio 6
        System.out.println(ANSI_RED + "|Ejercicio 6|"+ ANSI_RED);
        float precioCompra, precioTarifa, desconto;
        System.out.println("Introduzca el valor de la compra:");
        precioCompra = teclado.nextFloat();
        System.out.println("Introduzca el valor de la tarifa:");
        precioTarifa = teclado.nextFloat();
        desconto = ((precioTarifa - precioCompra) * 100) / precioTarifa;
        System.out.println("El descuento de su compra es de: " + desconto + " %");
        
        //Ejercicio 7 
        System.out.println(ANSI_RED + "|Ejercicio 7|"+ ANSI_RED);
        float n, i, t, rendaMensual;
        System.out.println("Introduzca el nominal, el interés anual y el número de años:");
        n = teclado.nextFloat();
        i = teclado.nextFloat();
        t = teclado.nextFloat();
        t *= 12;
        i /= 12;
        rendaMensual = i * n * (float)Math.pow(1 + i,t);
        rendaMensual = rendaMensual / (float)(Math.pow(1+i,t) - 1);
        System.out.println("La renda mensual es igual a " + Math.round(rendaMensual));
        
        //Ejercicio 8
        System.out.println(ANSI_RED + "|Ejercicio 8|"+ ANSI_RED);
        float graosC, graosK, graosF;
        System.out.println("Introduzca os graos centígrados que quere pasar a kelvin e farenheit: ");
        graosC = teclado.nextByte();
        graosK = graosC + 273;
        graosF = graosC * (9/5) + 32;
        System.out.println(graosC + " ºC son " + graosK + " ºK e " + graosF + " ºF");
        
        //Ejercicio 9
        System.out.println(ANSI_RED + "|Ejercicio 9|"+ ANSI_RED);
        int billetes100, billetes20, billetes10, monedas, totalDinero;
        System.out.println("Introduzca cuantos billetes de 100, 20 y 10 tiene junto al numero de monedas respectivamente: ");
        billetes100 = teclado.nextInt();
        billetes20 = teclado.nextInt();
        billetes10 = teclado.nextInt();
        monedas = teclado.nextInt();
        totalDinero = (billetes100 * 100) + (billetes20 * 20) + (billetes10 * 10) + monedas;
        System.out.println("La cantidad de dinero que usted tiene es de " + totalDinero + "€");
        
        //Ejercicio 10
        System.out.println(ANSI_RED + "|Ejercicio 10|"+ ANSI_RED);
        int cantidadEuros, billetes_100, billetes_20, billetes_5, moedas;
        System.out.println("Introduzca la cantidad de dinero que tiene:");
        cantidadEuros = teclado.nextInt();
        billetes_100 = cantidadEuros / 100;
        billetes_20 = (cantidadEuros % 100) / 20;
        billetes_5 = (cantidadEuros % 20) / 5;
        moedas = (cantidadEuros % 5);
        System.out.print("100 --> " + billetes_100 + "\n20--> " + billetes_20 + "\n5--> " + billetes_5 + "\nMonedas--> " + moedas + "\n");
        
        //Ejercicio 11
        System.out.println(ANSI_RED + "|Ejercicio 11|"+ ANSI_RED);
        float soldoFixo, soldoLiquido, N_quilometros;
        int dias_desprazamentos, N_ventas;
        final int comision = 5;
        System.out.println("Introduce tu sueldo fijo: ");
        soldoFixo = teclado.nextFloat();
        System.out.println("Introduce el numero de ventas de este mes: ");
        N_ventas = teclado.nextInt();
        System.out.println("Introduce el numero de quilomtros recorridos: ");
        N_quilometros = teclado.nextFloat();
        System.out.println("Introduzca el numero de días que se ha desplazado este mes: ");
        dias_desprazamentos = teclado.nextInt();
        soldoLiquido = soldoFixo + (N_ventas * comision / 100) + (N_quilometros * 2) + (dias_desprazamentos * 30);
        System.out.println("Su sueldo líquido es de " + soldoLiquido + " €");
        
        //Ejercicio 12
        System.out.println(ANSI_RED + "|Ejercicio 12|"+ ANSI_RED);
        float soldoIRPFySS = (soldoFixo - (soldoFixo * 18 /100)) - 36;
        System.out.println("O soldo a precibir é de " + soldoIRPFySS + (N_ventas * comision / 100) + (N_quilometros * 2) + (dias_desprazamentos * 30));
        
    }
    
}
