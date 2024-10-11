package Prototype;

public class FabricaCubiertos {
    private ICubierto prototipoCuchara;
    private ICubierto prototipoCuchillo;
    private ICubierto prototipoTenedor;

    public FabricaCubiertos(ICubierto cuchara, ICubierto cuchillo,ICubierto tenedor) {
        this.prototipoCuchara = cuchara;
        this.prototipoCuchillo = cuchillo;
        this.prototipoTenedor = tenedor;
    }

    public ICubierto crearCuchara() {
        return prototipoCuchara.clonar();
    }

    public ICubierto crearCuchillo() {
        return prototipoCuchillo.clonar();
    }

    public ICubierto crearTenedor() {
        return prototipoTenedor.clonar();
    }
}
