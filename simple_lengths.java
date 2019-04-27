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
        int [][][]array3;

        boolean isSorted;
        isSorted = true;

        array3 = new int[2][4][6];


        System.out.println(array3.length);
        System.out.println(array3[0].length);
        System.out.println(array3[0][0].length);
        array3 = new int[1][1][1];
        return isSorted;
    }
}
