class Dog {

	public static void main (String [] id) {
            System.out.println(new Cat().woof(false));
	}

}


class Cat {
	int lmao;

    public int woof(boolean x){ //It's Daniel H's fault that the cat says woof
		boolean local;
                int i;
		local = x;
                
		return 0;
                i = new Fish().blub(x);
                return 0;
	}

}

class Fish {
    Cat c;

    public int blub(boolean y){
        int x;
        x = c.woof(y);

        return 0;
    }

}

class Tuna {

    public int blub(boolean y, boolean x){
        if(x)
            return this.blub(y);
        else
            return -1;

        return 0;
    }
}
