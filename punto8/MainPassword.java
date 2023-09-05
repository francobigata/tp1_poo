package ar.edu.unlu.prog1.punto8;
import ar.edu.unlu.prog1.punto8.Password;

import java.util.ArrayList;

import java.util.Scanner;

public class MainPassword {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la coleccion de contraseña: ");
        int tamanio= scanner.nextInt();
        scanner.nextLine();

        ArrayList<Password> passwords = new ArrayList<>();

        for ( int i = 0; i < tamanio; i++){
            Password password = new Password();
            passwords.add(password);
        }

        for (Password password : passwords){
            System.out.println(password.getPassword() + " - ");
            if (password.esFuerte()){
                System.out.println("Fuerte");
            } else {
                System.out.println("Debil");
                password.cambiarLongitud(12);
                System.out.println("Contrseña regenerada: " + password.getPassword());
            }
        }
    }
}
