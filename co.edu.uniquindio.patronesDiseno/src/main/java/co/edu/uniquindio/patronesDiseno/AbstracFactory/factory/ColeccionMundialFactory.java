package co.edu.uniquindio.patronesDiseno.AbstracFactory.factory;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.model.CamisetaMundial;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.model.ChaquetaMundial;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.model.PantalonetaMundial;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IAdidasFactory;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.ICamiseta;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IChaqueta;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IPantaloneta;

public class ColeccionMundialFactory implements IAdidasFactory {

    @Override
    public IChaqueta crearChaqueta() {
        return new ChaquetaMundial();
    }

    @Override
    public ICamiseta crearCamiseta() {
        return new CamisetaMundial();
    }

    @Override
    public IPantaloneta crearPantaloneta() {
        return new PantalonetaMundial();
    }
}
