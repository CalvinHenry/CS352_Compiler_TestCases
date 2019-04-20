class p_Dog {

	public static void main (String [] id) {
            {
                System.out.println("Hello World!");
                System.out.println(new cat().fibonachi(10));
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

    public int fibonachi(int a){
        if(a == 0 || a == 1){
            
            return 1;
        }else if (a > 1){
            return this.fibonachi(a - 1) + a - 1;
        }else {}

        return 1;
    }
}
