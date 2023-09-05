package ar.edu.unlu.prog1.punto8;

import java.util.Random;

public class Password {
    private String password;
    private int longitud;

    public Password() {
        this(8);
    }

    public Password(int longitud) {
        this.longitud = longitud;
        generatePassword();
    }

    private void generatePassword() {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnoprqrstuvwxyz";
        String digitos = "0123456789";

        Random random = new Random();
        StringBuilder newPassword = new StringBuilder();

        newPassword.append(mayusculas.charAt(random.nextInt(mayusculas.length())));
        newPassword.append(mayusculas.charAt(random.nextInt(mayusculas.length())));
        newPassword.append(minusculas.charAt(random.nextInt(minusculas.length())));
        newPassword.append(digitos.charAt(random.nextInt(digitos.length())));
        newPassword.append(digitos.charAt(random.nextInt(digitos.length())));

        for (int i = 5; i < longitud; i++) {
            String todosloscaracteres = mayusculas + minusculas + digitos;
            newPassword.append(todosloscaracteres.charAt(random.nextInt(todosloscaracteres.length())));

        }
        password = newPassword.toString();
    }

    public boolean esFuerte() {
        int contadorMayus = 0;
        int contadorMinus = 0;
        int contadorDigit = 0;

        for (char caracter : password.toCharArray()) {
            if (Character.isUpperCase(caracter)) {
                contadorMayus++;
            } else if (Character.isLowerCase(caracter)) {
                contadorMinus++;
            } else if (Character.isDigit(caracter)) {
                contadorDigit++;
            }
        }
        return contadorMayus > 2 && contadorMinus > 1 && contadorDigit > 1;

    }

    public void cambiarLongitud(int newLongitud){
        longitud = newLongitud;
        generatePassword();
    }

    public String getPassword(){
        return password;
    }

    public int getLongitud(){
        return longitud;
    }
}
