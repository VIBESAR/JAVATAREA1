import java.util.Scanner;
public class Main {

    public static void holaMundo(){
        System.out.println("HOLA, MUNDO!");
        System.out.println(" ");
    }

    public static void suma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Un Numero: ");
        int a =  sc.nextInt();
        System.out.println("Ingrese Un Segundo Numero: ");
        int b =  sc.nextInt();
        int c = a + b ;
        System.out.println("El Resultado De La Suma Es: "+ c);
        System.out.println(" ");
    }

public static void par(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Un Numero");
        int num =  sc.nextInt();
        if (num % 2 == 0){
            System.out.println("El Resultado Es Par");
        }else
            System.out.println("El Resultado Es Impar");
    System.out.println(" ");

}
public static void facto(){
    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese Un Numero Facto: ");
    long num =  sc.nextInt();

     int factorial = 1;

    for (int i = 2; i <= num ; i++){
        factorial = factorial * i;
    }

    System.out.println("El Factorial De El : "+ num + "Es: "+ factorial);
}

public static void tabla (){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese El Numero Para La Tabla");
        int num =  sc.nextInt();

    System.out.println("La Tabla De Multiplicar Ascendente Es: ");
        for (int i = 1; i <= 10 ; i++){
            System.out.println(num +" X " + i + " = " + (num * i));
        }
    System.out.println(" ");

    System.out.println("La Tabla De Multiplicar Descendente Es: ");
    for (int i = 10; i >= 1 ; i--){
        System.out.println(num +" X " + i + " = " + (num * i));
    }
    System.out.println(" ");
}

public static void mayor(){
        Scanner sc = new Scanner(System.in);
int num = 0, mayor = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
    System.out.println("Ingrese Una Secuencia De Numeros Y Terminara De Almacenar Cuando Se Ingrese Un Numero Negativo");
do {
   try {

       num = sc.nextInt();
       if (num >= 0) {
           if (num > mayor) {
               mayor = num;
           }
           if (num < menor) {
               menor = num;
           }
       }
   }catch (Exception e){
       System.out.println("No Es Un Numero");
    sc.next();
   }
}while (num >=0);
    System.out.println("El Numero Mayor Es: "+ mayor);
    System.out.println(" ");
    System.out.println("El Numero Menor Es: "+ menor);
    System.out.println(" ");
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int opcion;
        System.out.println("Menu de opciones");
        System.out.println("Que desea hacer?");
        System.out.println(" ");
        do {
            System.out.println("1. Hola Mundo ⬅");

            System.out.println("2. Sumar 2 Numeros ⬅");

            System.out.println("3. Determinar Si Un Numero Es Par O Impar ⬅");

            System.out.println("4. Calcular El Factorial De Un Numero ⬅");

            System.out.println("5. Crear Una Tabla De Multiplicar Ascendente Y Descendente ⬅");

            System.out.println("6. Determinar Si Un Numero Es Mayor y/o Menor De Una Secuencia ⬅");

            System.out.println("7. Salir ⬅");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    holaMundo();
                    break;
                case 2:
                    suma();
                    break;
                case 3:
                    par();
                    break;
                case 4:
                    facto();
                    break;
                    case 5:
                    tabla();
                    break;
                case 7:
                    System.out.println("Saliendo Del Programa");
                    break;
                case 6:
                    mayor();
                    break;
                default:
                    System.out.println("Esta Opcion Es Invalida");
                    System.out.println(" ");
                    break;

            }
        }while (opcion !=7);
        sc.close();
    }

}
