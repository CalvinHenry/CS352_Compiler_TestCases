class p_MainClass {
    public static void main(String[] args) {
        {
            System.out.print("The value should be 1: ");
            System.out.println(new RNG().Generate());
            System.out.print("The value should be 1: ");
            System.out.println(new BetterRNG().Generate());
            System.out.print("The value should be 2: ");
            System.out.println(new BetterRNG().BetterGenerate());
        }
    }
}

class RNG {
    int x;
    public int Generate() {
        x = 3;
        //y = 1;
        return 1;
    }
}

class BetterRNG extends RNG {
    //int x;
    //boolean x;
    int y;
    public int BetterGenerate() {
        x = 3;
        y = 1;
        return 2;
    }
}
