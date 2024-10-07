package co.edu.uniquindio.patronesDiseno.AbstracFactory.model;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.ICamiseta;

public class CamisetaMundial implements ICamiseta {
    @Override
    public void mostrar() {
        System.out.println("Camiseta del mundial 2014 de la Selección Colombia");
    }
}
