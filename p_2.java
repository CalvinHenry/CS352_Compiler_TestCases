class p_Dog {

	public static void main (String [] id) {
            System.out.println(new Cat().woof(false));
	}

}


class Cat {
	int lmao;

	public int woof(boolean x){
		boolean local;
                int i;
		local = x;
                if(x)
                    return 0;
                else {}
                i = new Fish().blub(true);
                return 0;
	}

}

class Fish {
    Cat c;

    public int blub(boolean y){
        int x;
        c = new Cat();
        x = c.woof(y);

        return 0;
    }

}
