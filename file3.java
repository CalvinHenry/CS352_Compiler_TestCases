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
        int a;
        a = 0;

        while(a < 10){
            a = a + 1;
            System.out.println(a);
        }
         
        return 0;
    }
}
