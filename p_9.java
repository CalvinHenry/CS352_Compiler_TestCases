class p_Dog {

	public static void main (String [] id) {
            System.out.println(new Cat().woof(false));
	}

}


class Cat {
	int lmao;

	public int woof(boolean b){
            int [][][] c;
            int [][] d;
            int x;
            int y;
            boolean local;
            c = new int[5][5][5];
            d = new int[5][5];
            x = 0;
            y = 0;
            while(x < 5){
                while(y < 5){
                    d[x][y] = 20;
                    y = y + 1;
                }
                y = 0;
                x = x + 1;
            }
            c[1][2][3] = 10;
            
            c[1] = d;//Should be valid
            //c[2][3] = d;//Should be invalid
            System.out.println(d[2][3]);
            System.out.println(c[1][2][3]);
            local = b;
            return 0;
	}

}

