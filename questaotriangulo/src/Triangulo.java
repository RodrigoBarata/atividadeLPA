
    public class Triangulo {
        private int l1,l2,l3;
        public Triangulo(int l1,int l2,int l3) {
            if ((l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l2 + l1)) {
                this.l1 = l1;
                this.l2 = l2;
                this.l3 = l3;
                System.out.println("forma triangulo");
            }else {
                l1 = 0;
                l2 = 0;
                l3 = 0;
                System.out.println("nao forma triangulo");

            }
        }
        public int perimetro() {
            return this.l1+this.l2+this.l3;
        }

    }


