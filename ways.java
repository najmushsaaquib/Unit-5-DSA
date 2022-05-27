public class ways {

    public static void main(String[] args) {

        int x = 5;
        int[] bank = new int[x + 1];
        int ans = stair(x, bank);
        System.out.println(ans);
        ;
    }

    static int stair(int x, int[] bank) {

        if (x == 1)
            return 1;

        if (x == 2)
            return 2;

        if (x == 3)
            return 4;

        if (bank[x] != 0)
            return bank[x];

        int total = stair(x - 1, bank) + stair(x - 2, bank) + stair(x - 3, bank);

        bank[x] = total;

        return total;

    }

}
