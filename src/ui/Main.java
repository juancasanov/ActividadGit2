package ui;
import java.util.Scanner;
import model.Recursive;

public class Main {
    Scanner reader;
    Recursive recursive;

    public Main() {
        reader = new Scanner(System.in);
        recursive = new Recursive();
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.menu();
    }

    public void menu(){
        System.out.println("Seleccionar ejercicio:\n(1) Suma de los numeros dentro de un arreglo\n(2) Invertir una cadena de caracteres");
        System.out.println("(3) Promedio de los numeros de un arregla\n(4)  Posicion de un numero dentro de un arreglo");
        System.out.println("(5) Promedio de los numeros de un arregla\n(6)  Posicion de un numero dentro de un arreglo");
        System.out.println("(7) Promedio de los numeros de un arregla");

        int selection = reader.nextInt();

        switch (selection) {
            case 1:
                case1();
                break;
            case 2:
                case2();
                break;
            case 3:
                case3();
                break;
            case 4:
                case4();
                break;
            case 5:
                case5();
                break;
            case 6:
                case6();
                break;
            case 7:
                case7();
            case 8:
                case8();
                break;
            default:
                System.out.println("Adios usuario");
        }
    }

    public void case1(){
        reader.nextLine();

        System.out.println("Ingrese el tamaño del arreglo");
        int n = reader.nextInt();
        int[] num = new int[n];

        System.out.println("Digite un listado de " + n + " numeros");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Numero " + (i + 1));
            num[i] = reader.nextInt();
        }

        System.out.println("Suma: " + recursive.sum(num, n - 1, 0));
    }

    public void case2(){
        reader.nextLine();

        System.out.println("Digite una palabra");
        String msg = reader.nextLine();

        System.out.println("Caracteres invertidos: " + recursive.rev(msg, msg.length() - 1, ""));
    }

    public void case3() {
        reader.nextLine();

        System.out.println("Ingrese el tamaño del arreglo");
        int n = reader.nextInt();
        int[] num = new int[n];

        System.out.println("Digite un listado de " + n + " numeros");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Numero " + (i + 1));
            num[i] = reader.nextInt();
        }

        System.out.println("Promedio de los numeros ingresados " + recursive.prom(num, n - 1, 0)/n);
    }

    public void case4() {
        reader.nextLine();

        System.out.println("Ingrese el tamaño del arreglo");
        int n = reader.nextInt();
        int[] num = new int[n];

        System.out.println("Digite un listado de " + n + " numeros");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Numero " + (i + 1));
            num[i] = reader.nextInt();
        }

        System.out.println("Digite un número dentro del arreglo");
        int p = reader.nextInt();

        System.out.println("Posición del número digitado: " + recursive.pos(num, p, 0));
    }

    public void case5() {
        reader.nextLine();

        System.out.println("Digite el dividendo");
        int n = reader.nextInt();

        System.out.println("Digite el divisor");
        int m = reader.nextInt();

        System.out.println("Resultado: " + recursive.division(n, m, 0)[0] + "\nResiduo: " + recursive.division(n, m, 0)[1]);
    }

    public void case6() {
        reader.nextLine();

        System.out.println("Digite el primer numero");
        int n = reader.nextInt();

        System.out.println("Digite el segundo numero");
        int m = reader.nextInt();

        System.out.println("MCD: " + recursive.mcd(n, m, 0));
    }

    public void case7() {
        reader.nextLine();
        int[] s = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50};

        System.out.println("Ingrese el valor");
        double n = reader.nextDouble();
        int[] r = new int[20];

        for (int i = 0; i < s.length; i++) {
            System.out.println("Billete: " + s[i] + " - Cantidad: " + recursive.billetes(n, r, 0, 0, 0)[i]);
        }

        //Calcular factorial
        public void case8() {
            reader.nextLine();

            System.out.println("Ingrese un número para calcular su factorial:");
            int n = reader.nextInt();

            System.out.println("Factorial de " + n + ": " + recursive.factorial(n));
    }
}