import java.util.*;

public class main
{
    public static void main(String[] args)
    {
        ArrayList<String> Arreglo = new ArrayList<>();
        Arreglo.add("Uno");
        Arreglo.add("Dos");
        Arreglo.add("Tres");
        Arreglo.add("Cuatro");
        Arreglo.add("Cinco");
        Arreglo.add("Seis");
        Arreglo.add("Siete");
        Arreglo.add("Ocho");
        Arreglo.add("Nueve");
        Arreglo.add("Diez");

        //Clase anonima
        Anonima anon = new Anonima()
        {
            public void Ordenar()
            {
                System.out.println("Arreglo ordenado por clase anonima");
                System.out.println("");

                System.out.println("Palabras ordenadas por tamano: ");
                Collections.sort(Arreglo, Comparator.comparing(String::length));
                Arreglo.forEach(System.out::println);
                System.out.println("");

                System.out.println("Palabras ordenadas alfabeticamente: ");
                Arreglo.sort(String::compareToIgnoreCase);
                Arreglo.forEach(System.out::println);
            }
        };
        anon.Ordenar();

        //Expresion LAMBDA
        System.out.println("\nArreglo ordenado por LAMBDA");
        System.out.println("");

        System.out.println("Palabras ordenadas por tamano: ");
        Collections.sort(Arreglo, (x, y) -> Float.compare(x.length(), y.length()));
        Arreglo.forEach(Array -> System.out.println(Array));
        System.out.println("");

        System.out.println("Palabras ordenadas alfabeticamente: ");
        Arreglo.sort((x,y) -> x.compareToIgnoreCase(y));
        Arreglo.forEach(Array -> System.out.println(Array));

        //Metodo de referencia
        System.out.println("\nArreglo ordenado por referencia");
        System.out.println("");

        MetodoDeReferencias tamano = MetodoDeReferencia::OrdenTamano;
        System.out.println("Palabras ordenadas por tamano: " + tamano.Arreglo(Arreglo));

        MetodoDeReferencias alfabetico = MetodoDeReferencia::OrdenAlfabetico;
        System.out.println("Palabras ordenadas alfabeticamente: " + alfabetico.Arreglo(Arreglo));
    }

    class MetodoDeReferencia
    {
        static ArrayList<String> OrdenTamano(ArrayList<String> Arreglo)
        {
            Collections.sort(Arreglo, (x,y) -> Float.compare(x.length(), y.length()));
            return Arreglo;
        }

        static ArrayList<String> OrdenAlfabetico(ArrayList<String> Arreglo)
        {
            Collections.sort(Arreglo, (x,y) -> x.compareToIgnoreCase(y));
            return Arreglo;
        }
    }
}
