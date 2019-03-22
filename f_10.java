class p_Dog {

	public static void main (String [] id) {
            System.out.println(new Cat().woof(4 + 2));
	}

}


class Cat {
	int lmao;

	public int woof(boolean x){
            int [][][] c;
            int [][] d;
            boolean local;
            c = new int[5][5][5];
            d = new int[2][3];

            c[1] = d;//Should be valid
            c[2][3] = d;//Should be invalid
		
		local = x;
		return 0;
	}

}

