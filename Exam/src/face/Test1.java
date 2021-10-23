package face;

public class Test1 {
    public static void main(String[] args) {
        System.out.println(countTiger(7));
        String s = "abc";
        String s2 = "abc";
        System.out.println(s == s2);
    }

    public static int countTiger (int month) {
        int tigerNumber = 0;
        if (month < 3)
            tigerNumber = 2;
        else {
            tigerNumber = 2 + (month-2)*2;
            if (month > 3)
                return 2 + (month-2)*2;
        }

        return tigerNumber;
    }


}
