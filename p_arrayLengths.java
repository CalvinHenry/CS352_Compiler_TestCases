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
        int []array2;
        int [][][]array3;
        int tmp;
        int i;
        int j;
        boolean isSorted;
        array =  new int[8];
        array2 = new int[8];
        array3 = new int[2][4][6];
        array2[0] = 60;
        array2[1] = 40;
        array2[2] = 20;
        array2[3] = 0;
        array2[4] = 50;
        array2[5] = 70;
        array2[6] = 10;
        array2[7] = 30;
        array = array2;
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
            System.out.println(array[i]);
            isSorted = isSorted && (array[i] == i*10);
            i = i + 1;
        }
        System.out.println(array.length);
        System.out.println(array3.length);
        System.out.println(array3[0].length);
        System.out.println(array3[0][0].length);
        array3 = new int[1][1][1];
        System.out.println(array.length);
        return isSorted;
    }
}
