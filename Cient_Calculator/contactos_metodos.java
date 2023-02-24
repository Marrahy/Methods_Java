public class contactos_metodos {
    
    String[] nombre = new String[100];
    String[] email = new String[100];
    int[] numero = new int[100];

    public static void imprimeMenu() {      //Imprime el menú de la calculadora\\

        System.out.println("1.- Ver contactos.");       //Imprime "n. Nombre: + nombres + " " + "Telf: " + numero + "Mail: " + email"
        System.out.println("2.- Agregar contacto.");    //Imprime un input para el usuario, estos inputs serían: (String)nombre -- (int)numero -- (String)email, los cuales se guardarían en sus respectivas arrays
        System.out.println("3.- Eliminar contatco.");   //Elimina (String)nombre -- (int)numero -- (String)email de sus respectivas arrays basandose en el (String)nombre
        System.out.println("4.- Buscar por nombre.");
        System.out.println("5.- Buscar por teléfono.");
        System.out.println("6.- Buscar por email.");
        System.out.println("7.- Búsqueda global.");
        System.out.println("8.- Salir");
    }
}
