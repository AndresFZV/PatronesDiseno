package co.edu.uniquindio.patronesDiseno.Prototype;

public class Cuchara implements ICubierto {
    private String material;
    private String tamaño;

    public Cuchara(String material, String tamaño) {
        this.material = material;
        this.tamaño = tamaño;
    }

    @Override
    public Cuchara clonar() {
        return new Cuchara(this.material, this.tamaño);
    }

    @Override
    public void usar() {
        System.out.println("Usando una cuchara de " + material + " de tamaño " + tamaño);
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

