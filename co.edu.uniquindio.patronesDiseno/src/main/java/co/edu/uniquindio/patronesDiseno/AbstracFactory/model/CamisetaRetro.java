package co.edu.uniquindio.patronesDiseno.AbstracFactory.model;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.ICamiseta;

public class CamisetaRetro implements ICamiseta {
    @Override
    public void mostrar() {
        System.out.println("Camiseta retro de la Selección Colombia (Italia 90)");
    }
}
