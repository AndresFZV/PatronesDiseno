package co.edu.uniquindio.patronesDiseno.Prototype.model;

import co.edu.uniquindio.patronesDiseno.Prototype.services.ICubierto;

public class Cuchillo implements ICubierto {
    private String material;
    private String tamano;

    public Cuchillo(String material, String tamano) {
        this.material = material;
        this.tamano = tamano;
    }

    @Override
    public Cuchillo clonar() {
        return new Cuchillo(this.material, this.tamano);
    }

    @Override
    public void usar() {
        System.out.println("Usando un cuchillo de " + material + " de tamaño " + tamano);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }
}
