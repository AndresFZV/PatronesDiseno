package co.edu.uniquindio.patronesDiseno.AbstracFactory.model;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IChaqueta;

public class ChaquetaActual implements IChaqueta {


    @Override
    public void mostrar() {
        System.out.println("Chaqueta actual de la Selección Colombia");
    }
}
