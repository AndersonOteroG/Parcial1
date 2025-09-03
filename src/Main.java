public class Main {
    public static void main(String[] args) {
       
        libro primerLibro = new libro("los cuatro acuerdos", "Don Miguel Ruiz.", 10, 1);

      
        libro segundoLibro = new libro();
        segundoLibro.setTitulo("Como hacer que te pasen cosas buenas");
        segundoLibro.setAutor("Marian rojas estape");
        segundoLibro.setNumeroEjemplares(3);
        segundoLibro.setNumeroEjemplaresPrestados(0);

        System.out.println(primerLibro);
        System.out.println("¿Se prestó el primer libro? " + primerLibro.prestar());
        System.out.println(primerLibro);

        System.out.println(segundoLibro);
        System.out.println("¿Se devolvió el segundo libro? " + segundoLibro.devolver());
        System.out.println(segundoLibro);
    }
}
