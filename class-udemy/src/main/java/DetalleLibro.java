public class DetalleLibro {

    static void main(String[] args) {
        //Detakke de un libro

        String tituloLibro ="El señor de los anillos";
        int anioPrublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        //Imprimir valor de variabls
        System.out.println(tituloLibro);
        System.out.println(anioPrublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);

        //Modificar titulo libro - crea un nuevo objeto en memoria heap - memoria stack se reemplaza
        tituloLibro = "El Señor de los Anillos";
        System.out.println(tituloLibro);
    }
}
