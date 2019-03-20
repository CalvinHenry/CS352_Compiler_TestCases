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
        int [] array;
        int tmp;
        int i;
        int j;
        boolean isSorted;
        array =  new int[8];
        array[0] = 60;
        array[1] = 40;
        array[2] = 20;
        array[3] = 0;
        array[4] = 50;
        array[5] = 70;
        array[6] = 10;
        array[7] = 30;

        i = 0;
        j = 0;
        while (i < 8) {
            j = 0;
            while (j < 8-i-1) {
                if (array[j] > array[j+1]) {
                    // swap array[j] and array[j+1]
                    tmp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = tmp;
                } else {}
                j = j + 1;
            }
            i = i+1;
        }

        // see if the array is already sorted.
        i = 0;
        isSorted = true;
        while (i < 8) {
            isSorted = isSorted && (array[i] == i*10);
            i = i + 1;
        }
        return isSorted;
    }
}
