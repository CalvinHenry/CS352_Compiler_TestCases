// This test case ask for interpreting array access.
class p_array {
    public static void main(String [] args) {
        if ((new Sorter().bubblesortDemo()) == true) {
            System.out.println("Sort successful");
        } else {
            System.out.println("Sort failed");
        }
    }
}

class Sorter {
    public boolean bubblesortDemo() {
        Integer [] array;
        Integer a;
        Integer b;
        Integer c;
        Integer x;
        Integer y;
        Integer tmp;
        int i;
        int j;
        int ret;
        boolean isSorted;
        array =  new Integer[3];
        a = new Integer();
        b = new Integer();
        c = new Integer();

        ret = a.create(0);
        ret = b.create(20);
        ret = c.create(10);
        array[0] = a;
        array[1] = b;
        array[2] = c;

        i = 0;
        j = 0;
        while (i < 3) {
            j = 0;
            while (j < 3-i-1) {
                x = array[j];
                y = array[j + 1];
                if (x.getInt() > y.getInt()) {
                    // swap array[j] and array[j+1]
                    tmp = y;
                    array[j+1] = x;
                    array[j] = tmp;
                } else {}
                j = j + 1;
            }
            i = i+1;
        }

        // see if the array is already sorted.
        i = 0;
        isSorted = true;
        while (i < 3) {
            x = array[i];
            
            isSorted = isSorted && (x.getInt() == i*10);
            i = i + 1;
            System.out.println(x.getInt());
        }
        return isSorted;
    }
}

class Integer {
    int i;

    public int create(int x){
	i = x;
	return 0;
    }
    public int getInt(){
	return i;
    }
}




