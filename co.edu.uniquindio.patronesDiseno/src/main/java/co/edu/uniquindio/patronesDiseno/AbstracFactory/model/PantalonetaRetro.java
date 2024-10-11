package co.edu.uniquindio.patronesDiseno.AbstracFactory.model;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IPantaloneta;

public class PantalonetaRetro implements IPantaloneta {
    @Override
    public void mostrar() {
        System.out.println("Pantaloneta retro de la Selección Colombia (Italia 90)");
    }
}
