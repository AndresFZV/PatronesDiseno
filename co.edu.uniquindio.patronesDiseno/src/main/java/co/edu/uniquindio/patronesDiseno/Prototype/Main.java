package co.edu.uniquindio.patronesDiseno.Prototype;

public class Main {
    public static void main(String[] args) {

        Cuchara cucharaPrototipo = new Cuchara("Acero Inoxidable", "Grande");
        Cuchillo cuchilloPrototipo = new Cuchillo("Plata", "Mediano");
        Tenedor tenedorPrototipo = new Tenedor("Plástico", "Pequeño");

        FabricaCubiertos fabrica = new FabricaCubiertos(
                cucharaPrototipo,
                cuchilloPrototipo,
                tenedorPrototipo
        );

        System.out.println("Cubiertos originales:");
        ICubierto cuchara1 = fabrica.crearCuchara();
        ICubierto cuchillo1 = fabrica.crearCuchillo();
        ICubierto tenedor1 = fabrica.crearTenedor();

        cuchara1.usar();
        cuchillo1.usar();
        tenedor1.usar();


        System.out.println("\nCubiertos Personalizados:");

        ICubierto cuchara2 = fabrica.crearCuchara();
        cuchara2.usar();
        ((Cuchara) cuchara2).setMaterial("Oro");
        ((Cuchara) cuchara2).setTamano("Pequeña");
        cuchara2.usar();

        ICubierto cuchillo2 = fabrica.crearCuchillo();
        cuchillo2.usar();
        ((Cuchillo) cuchillo2).setMaterial("Acero al carbono");
        ((Cuchillo) cuchillo2).setTamano("Grande");
        cuchillo2.usar();

        ICubierto tenedor2 = fabrica.crearTenedor();
        tenedor2.usar();
        ((Tenedor) tenedor2).setMaterial("Titanio");
        ((Tenedor) tenedor2).setTamano("Mediano");
        tenedor2.usar();

        ICubierto cuchillo3 = fabrica.crearCuchillo();
        ((Cuchillo) cuchillo3).setMaterial("Cerámica");
        ((Cuchillo) cuchillo3).setTamano("Pequeño");
        cuchillo3.usar();

        ICubierto tenedor3 = fabrica.crearTenedor();
        ((Tenedor) tenedor3).setMaterial("Acero Inoxidable");
        ((Tenedor) tenedor3).setTamano("Grande");
        tenedor3.usar();

    }
}