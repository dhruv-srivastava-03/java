public class inheritance {
    static class Animals{
        static boolean walk;
        static boolean blood;

        public Animals(boolean b, boolean b1) {
            walk = b;
            blood = b1;
        }


    }
    static class Dogs extends Animals{
        int legs;
        boolean mamals;

        public Dogs(boolean b, boolean b1) {
            super(b, b1);
        }
    }
    public static void main(String[] args) {
        Animals labrador = new Animals(true , true );
        Dogs german = new Dogs(true , true);

    }
}
