package co.edu.uniquindio.patronesDiseno.AbstracFactory.model;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IPantaloneta;

public class PantalonetaMundial implements IPantaloneta {
    @Override
    public void mostrar() {
        System.out.println("Pantaloneta del mundial 2014 de la Selección Colombia");
    }
}
