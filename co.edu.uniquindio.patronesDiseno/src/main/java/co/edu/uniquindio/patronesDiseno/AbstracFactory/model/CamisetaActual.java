package co.edu.uniquindio.patronesDiseno.AbstracFactory.model;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.ICamiseta;

public class CamisetaActual implements ICamiseta {

    @Override
    public void mostrar() {
        System.out.println("Camiseta actual de la Selección Colombia");
    }
}
