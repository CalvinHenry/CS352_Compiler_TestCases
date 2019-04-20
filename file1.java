class p_Dog {

	public static void main (String [] id) {
            {
                System.out.println("Hello World!");
                System.out.println(new cat().newMethod());
                /*System.out.println("10 + 20 - 4");
                System.out.println(10 + 20 - 4);
                System.out.println(305);
                System.out.println("2 Plus 2");
                System.out.println(2 + 2);
                System.out.println(5 + 3 * 2 - 3 * 5 + 4 - 23 + 2 - 9 * 1 - 3 + 5 + 4 + 3 - 4 - 5 * 3);*/
            }



	}

}

class cat {

    public int newMethod(){
        int x;
        int y;
        int a;
        int b;
        int c;
        int d;
        int e;
        int f;

        a = 1;
        b = 2;
        c = 3;
        d = 4;
        e = 5;
        f = 6;
        y = 12;
        x = 10;
        x = x + 8;
        y = y -x;
        a = a * 2 + b - c + d * 4 -f * e;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(6-4);
        System.out.println(5 * 6 + 8 - 3 * 2);
        if( 1 <= 2){
            System.out.println("It's true");
        }else {
            System.out.println("it's false");
            }
        System.out.println("The function is calling from INSIDE the class!!!!!");
        return 0;
    }
}
