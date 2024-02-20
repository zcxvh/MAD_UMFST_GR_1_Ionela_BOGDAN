// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
/*
        boolean flag=false;

        for (int i = 0; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i + " este număr prim.");
                if(isPrime(i) && isPrime(i-1)){
                    if(isPrime(i) && isPrime(i-1))
                    System.out.println("("+isPrime(i-1)+","+isPrime(i)+")");
                }
            }
        }*/
        System.out.println("Perechi de numere prime:");
        int previousPrime = 2; // Retine numarul prim anterior
        for (int i = 3; i <= 100; i++) { // Pornim de la 3 pentru a evita verificarea pentru 2 (primul numar prim)
            if (isPrime(i)) {
                if (i - previousPrime == 2) { // Verifica daca diferenta este exact 2
                    System.out.println("(" + previousPrime + "," + i + ")");
                }
                previousPrime = i; // Actualizeaza numarul prim anterior
            }    }    }
    }

