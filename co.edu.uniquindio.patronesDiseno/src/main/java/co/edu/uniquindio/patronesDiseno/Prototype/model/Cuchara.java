package co.edu.uniquindio.patronesDiseno.Prototype.model;

import co.edu.uniquindio.patronesDiseno.Prototype.services.ICubierto;

public class Cuchara implements ICubierto {
    private String material;
    private String tamano;

    public Cuchara(String material, String tamano) {
        this.material = material;
        this.tamano = tamano;
    }

    @Override
    public Cuchara clonar() {
        return new Cuchara(this.material, this.tamano);
    }

    @Override
    public void usar() {
        System.out.println("Usando una cuchara de " + material + " de tamaño " + tamano);
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