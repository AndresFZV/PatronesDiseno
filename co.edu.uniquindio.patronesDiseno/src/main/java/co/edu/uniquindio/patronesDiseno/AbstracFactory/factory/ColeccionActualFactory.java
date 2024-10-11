package co.edu.uniquindio.patronesDiseno.AbstracFactory.factory;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.model.CamisetaActual;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.model.ChaquetaActual;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.model.PantalonetaActual;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IAdidasFactory;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.ICamiseta;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IChaqueta;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IPantaloneta;

public class ColeccionActualFactory implements IAdidasFactory {

    @Override
    public IChaqueta crearChaqueta() {
        return new ChaquetaActual();
    }

    @Override
    public ICamiseta crearCamiseta() {
        return new CamisetaActual();
    }

    @Override
    public IPantaloneta crearPantaloneta() {
        return new PantalonetaActual();
    }
}
