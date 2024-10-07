package co.edu.uniquindio.patronesDiseno.AbstracFactory.model;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IChaqueta;

public class ChaquetaRetro implements IChaqueta {
    @Override
    public void mostrar() {
        System.out.println("Chaqueta retro de la Selección Colombia (Italia 90)");
    }
}
