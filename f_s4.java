class T1 {
    public static void main(String[] a) {
       	{
            System.out.println(new T5().test());
        }
    }
}

class T4 {
    //test access of variable from super class
    int supClassVariable;
}

class T5 extends T4{
    //test access of class variable
    int z;
    public int test(){
        int x;
        int[][] y;
        //test array length on non array
        z = x.length;
        //test array length on indexes
        z = y.length;
        System.out.println(z);
        //test array length on too many indexes
        z = y[2][3][4].length;
        //test array length on all indexes used
        z = y[2][3].length;
        supClassVariable = 5;
        System.out.println(supClassVariable);
        return 0;
    }
}