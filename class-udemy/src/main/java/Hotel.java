public class Hotel {
    static void main(String[] args) {
        System.out.println("** Sistema de reserva de Hoteles ***");

        //Definir variables
        var nombreCliente = "Gabriel";
        var diasEstancia = 7;
        var tarifaDiaria = 13000.00;
        var tieneVistaAlMar = true;

        //Mostrar detalle de la reserva
        System.out.println("nombreCliente: " + nombreCliente);
        System.out.println("diasEstancia: " + diasEstancia);
        System.out.println("tarifaDiaria: " + tarifaDiaria);
        System.out.println("tieneVistaAlMar: " + tieneVistaAlMar);

        //Modificar algunos valores
        nombreCliente = "Veronica";
        diasEstancia = diasEstancia + 1;
        tarifaDiaria = tarifaDiaria + 10;
        tieneVistaAlMar = false;

        //Mostrar datos
        System.out.println("---------------------");
        System.out.println("nombreCliente: " + nombreCliente);
        System.out.println("diasEstancia: " + diasEstancia);
        System.out.println("tarifaDiaria: " + tarifaDiaria);
        System.out.println("tieneVistaAlMar: " + tieneVistaAlMar);

    }
}
