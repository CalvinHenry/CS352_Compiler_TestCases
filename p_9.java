class p_Dog {

	public static void main (String [] id) {
            System.out.println(new Cat().woof(false));
	}

}


class Cat {
	int lmao;

	public int woof(boolean x){
            int [][][] c;
            int [][] d;
            boolean local;
            c = new int[5][5][5];
            d = new int[5][5];
            c[1][2][3] = 10;
            
            c[1] = d;//Should be valid
            //c[2][3] = d;//Should be invalid
            System.out.print(c[1][2][3]);
            local = x;
            return 0;
	}

}

