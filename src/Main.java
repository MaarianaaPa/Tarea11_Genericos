import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // maneja cadenas de text
        Caja<String> miCaja = new Caja<>(new String[10]);

        miCaja.add(0, "hola");
        miCaja.add(1, "adios");
        miCaja.add(3, "hi");

        String temp = miCaja.get(0);
        // no genericos
        System.out.println("---");
        CajaSinGenericos cajasin = new CajaSinGenericos(new Object[10]);
        CajaSinGenericos.add(1, "Hola");
        CajaSinGenericos.add(1, "adios");
        CajaSinGenericos.add(1, "hi");
        // regresa object, se arregla forzando un casting
        String temp2 = (String) cajasin.get(0);

        // comida
        System.out.println("-- comida --");
        Caja<Comida> cajaComida = new Caja<>(new Comida [10]);
        cajaComida.add(0,  new Comida("yogurt", true));
        System.out.println(cajaComida.get(0));
        // se convierte en objeto y se ejecuta el to string

        // el generico al saber su tipo de dato lo regresa de ese estilo

        //pag 130 JCF
        // arreglo dinamico, empieza vacio y se puede agregar o eliminar
        ArrayList<Comida> comidas = new ArrayList<>();
        // clase que se comporta como arreglo
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Manzana", false));
        comidas.add(new Comida("Zanahoria", false));
        comidas.add(new Comida("Zanahoria", false));
        System.out.println(comidas.size());
        // sacar
        System.out.println(comidas.get(2));

        ArrayList<Comida> comidas2 = new ArrayList<>();
        comidas2.add(new Comida("Zanahoria", false));
        comidas2.add(new Comida("Yogurt", true));
        comidas2.add(new Comida("Danonimo", true));
        comidas2.add(new Comida("Manzana", false));
        comidas2.add(new Comida("Bistec", false));
        System.out.println(comidas2.get(3));
        comidas2.set(3, new Comida("Fresa", false));
        //se agrega
        comidas2.add(3, new Comida("Naranja", false));
        System.out.println("---final---");
        for (Comida comida : comidas2) {
            System.out.println(comida);
        }

    }
}