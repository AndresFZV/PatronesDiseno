package co.edu.uniquindio.patronesDiseno.Prototype;

public class Cuchillo implements ICubierto {
    private String material;
    private String tamaño;

    public Cuchillo(String material, String tamaño) {
        this.material = material;
        this.tamaño = tamaño;
    }

    @Override
    public Cuchillo clonar() {
        return new Cuchillo(this.material, this.tamaño);
    }

    @Override
    public void usar() {
        System.out.println("Usando un cuchillo de " + material + " de tamaño " + tamaño);
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
}
