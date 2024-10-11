package co.edu.uniquindio.patronesDiseno.AbstracFactory.model;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IPantaloneta;

public class PantalonetaActual implements IPantaloneta {
    @Override
    public void mostrar() {
        System.out.println("Pantaloneta actual de la Selección Colombia");
    }
}
