package co.edu.uniquindio.patronesDiseno.Prototype;

    public class Tenedor implements ICubierto {
        private String material;
        private String tamano;

        public Tenedor(String material, String tamano) {
            this.material = material;
            this.tamano = tamano;
        }

        @Override
        public Tenedor clonar() {
            return new Tenedor(this.material, this.tamano);
        }

        @Override
        public void usar() {
            System.out.println("Usando un tenedor de " + material + " de tamaño " + tamano);
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

        public void setTamano(String tamaño) {
            this.tamano = tamano;
        }
    }


