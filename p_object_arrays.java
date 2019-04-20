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
        Integer temp;
        Integer temp2;
        int tmp;
        int i;
        int j;
        boolean isSorted;
        int ret;
        array =  new Integer[8];
        temp = new Integer();
        temp2 = new Integer();
        ret = temp2.create(4);
        ret = temp.create(10);
        array[5] = temp;
        array[4] = temp2;
        temp2 = array[5];
        System.out.println(temp2.getInt());
        return true;
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
