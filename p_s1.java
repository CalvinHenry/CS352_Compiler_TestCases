class p_T1 {
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
        y = new int[2][3];
        //test array length on indexes
        z = y.length;
        System.out.println(z);
        //test array assignments
        y[0][1] = 3;
        System.out.println(y[0][1]);
        supClassVariable = 5;
        System.out.println(supClassVariable);
        return 0;
    }
}
