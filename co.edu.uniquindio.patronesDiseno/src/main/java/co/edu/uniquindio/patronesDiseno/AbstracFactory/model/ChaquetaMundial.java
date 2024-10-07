package co.edu.uniquindio.patronesDiseno.AbstracFactory.model;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IChaqueta;

public class ChaquetaMundial implements IChaqueta {


    @Override
    public void mostrar() {
        System.out.println("Chaqueta del mundial 2014 de la Selección Colombia");
    }
}
