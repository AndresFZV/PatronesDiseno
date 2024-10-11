package co.edu.uniquindio.patronesDiseno.AbstracFactory.factory;

import co.edu.uniquindio.patronesDiseno.AbstracFactory.model.CamisetaRetro;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.model.ChaquetaRetro;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.model.PantalonetaRetro;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IAdidasFactory;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.ICamiseta;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IChaqueta;
import co.edu.uniquindio.patronesDiseno.AbstracFactory.services.IPantaloneta;

public class ColeccionRetroFactory implements IAdidasFactory {

    @Override
    public IChaqueta crearChaqueta() {
        return new ChaquetaRetro();
    }

    @Override
    public ICamiseta crearCamiseta() {
        return new CamisetaRetro();
    }

    @Override
    public IPantaloneta crearPantaloneta() {
        return new PantalonetaRetro();
    }
}
