package ar.edu.unlu.prog1.punto9;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Fecha {

    public static LocalDate setearFecha(String dateString, String format){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return LocalDate.parse(dateString, formatter);
    }

    public static boolean fechaEstaEntre(LocalDate dateToCheck, LocalDate startDate, LocalDate endDate){
        return dateToCheck.isAfter(startDate) && dateToCheck.isBefore(endDate);
    }

    public static boolean fechaEsMayor(LocalDate fecha1, LocalDate fecha2) {
        return fecha1.isAfter(fecha2);
    }

    public static boolean fechaEsMenor(LocalDate fecha1, LocalDate fecha2){
        return fecha1.isBefore(fecha2);
    }

    public static void main (String[] args){
        LocalDate fecha1 = setearFecha("03-09-2023", "dd-MM-yyyy");
        LocalDate fecha2 = setearFecha("15-08-2023" , "dd-MM-yyyy");
        LocalDate fecha3 = setearFecha("25-09-2023", "dd-MM-yyyy");

        System.out.println("Fecha 1 es mayor que Fecha 2: " + fechaEsMayor(fecha1, fecha2));
        System.out.println("Fecha 1 es menor que Fecha 2: " + fechaEsMenor(fecha1, fecha2));
        System.out.println("Fecha 1 está entre Fecha 2 y Fecha 3: " + fechaEstaEntre(fecha1, fecha2, fecha3));

        LocalDate fecha4 = setearFecha("03-09-2023", "MM-dd-yyyy");
        LocalDate fecha5 = setearFecha("08-15-2023" , "MM-dd-yyyy");
        LocalDate fecha6 = setearFecha("09-25-2023", "MM-dd-yyyy");

        System.out.println("Fecha 4 es mayor que Fecha 5: " + fechaEsMayor(fecha4, fecha5));
        System.out.println("Fecha 4 es menor que Fecha 5: " + fechaEsMenor(fecha4, fecha5));
        System.out.println("Fecha 4 está entre Fecha 5 y Fecha 6: " + fechaEstaEntre(fecha4, fecha5, fecha6));


        System.out.println("Fecha 4 (dd-MM-yyyy): " + fecha4.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Fecha 4 (MM-dd-yyyy): " + fecha4.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));

        System.out.println("Fecha 5 (dd-MM-yyyy): " + fecha5.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Fecha 5 (MM-dd-yyyy): " + fecha5.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));

        System.out.println("Fecha 6 (dd-MM-yyyy): " + fecha6.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Fecha 6 (MM-dd-yyyy): " + fecha6.format(DateTimeFormatter.ofPattern("MM-dd-yyyy")));
    }

}
