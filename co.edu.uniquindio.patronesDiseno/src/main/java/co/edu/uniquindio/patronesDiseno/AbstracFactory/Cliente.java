package co.edu.uniquindio.patronesDiseno.AbstracFactory;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.factory.ColeccionActualFactory;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.factory.ColeccionMundialFactory;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.factory.ColeccionRetroFactory;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IAdidasFactory;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.ICamiseta;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IChaqueta;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IPantaloneta;

public class Cliente {
    public static void main(String[] args) {

        IAdidasFactory coleccionActual = new ColeccionActualFactory();
        IAdidasFactory coleccionMundial = new ColeccionMundialFactory();
        IAdidasFactory coleccionRetro = new ColeccionRetroFactory();
        IChaqueta chaquetaActual =  coleccionActual.crearChaqueta();
        ICamiseta camisetaActual = coleccionActual.crearCamiseta();
        IPantaloneta pantalonetaActual = coleccionActual.crearPantaloneta();
        IChaqueta chaquetaMundial =  coleccionMundial.crearChaqueta();
        ICamiseta camisetaMundial = coleccionMundial.crearCamiseta();
        IPantaloneta pantalonetaMundial = coleccionMundial.crearPantaloneta();
        IChaqueta chaquetaRetro =  coleccionRetro.crearChaqueta();
        ICamiseta camisetaRetro = coleccionRetro.crearCamiseta();
        IPantaloneta pantalonetaRetro = coleccionRetro.crearPantaloneta();

        System.out.println("Colección actual: ");
        chaquetaActual.mostrar();
        camisetaActual.mostrar();
        pantalonetaActual.mostrar();
        System.out.println("\nColección mundial 2014: ");
        chaquetaMundial.mostrar();
        camisetaMundial.mostrar();
        pantalonetaMundial.mostrar();
        System.out.println("\nColección retro (Mundial Italia 90): ");
        chaquetaRetro.mostrar();
        camisetaRetro.mostrar();
        pantalonetaRetro.mostrar();

    }
}
