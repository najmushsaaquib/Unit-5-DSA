import java.util.*;

class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x = 5;
        int[] qb = new int[x + 1];
        int ans = fib(x, qb);
        ;
        System.out.println(ans);

    }

    public static int fib(int x, int[] qb) {
        if (x == 0 || x == 1)
            return x;

        if (qb[x] != 0)
            return qb[x];

        int fibx1 = fib(x - 1, qb);
        int fibx2 = fib(x - 2, qb);
        int fibnum = fibx1 + fibx2;

        qb[x] = fibnum;

        return fibnum;
    }




    
}

