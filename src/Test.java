public class Test {
    public static void main(String[] args) {
        TwoDecimalArrays arrays = new TwoDecimalArrays();
        int[][] first2dIntArray = new int[3][3];
        int[][] second2dIntArray = new int[3][3];
        int[] first1dArray = new int[3];
        String[] stringFirstArray = new String[3];
        String[] stringSecondArray = new String[3];

        first1dArray[0] = 5;
        first1dArray[1] = 10;
        first1dArray[2] = 15;

        stringFirstArray[0] = "aa";
        stringFirstArray[1] = "bb";
        stringFirstArray[2] = "cc";

        stringSecondArray[0] = "aaa";
        stringSecondArray[1] = "aba";
        stringSecondArray[2] = "aca";

        first2dIntArray[0][0] = 1;
        first2dIntArray[0][1] = 2;
        first2dIntArray[0][2] = 3;

        first2dIntArray[1][0] = 4;
        first2dIntArray[1][1] = 5;
        first2dIntArray[1][2] = 6;

        first2dIntArray[2][0] = 7;
        first2dIntArray[2][1] = 8;
        first2dIntArray[2][2] = 9;

        second2dIntArray[0][0] = 2;
        second2dIntArray[0][1] = 3;
        second2dIntArray[0][2] = 4;

        second2dIntArray[1][0] = 5;
        second2dIntArray[1][1] = 6;
        second2dIntArray[1][2] = 7;

        second2dIntArray[2][0] = 8;
        second2dIntArray[2][1] = 9;
        second2dIntArray[2][2] = 10;

        int[][] ints = arrays.bigger2dArray(first2dIntArray, second2dIntArray);
        System.out.println("Działania pierwszej metody: ");
        arrays.printInt2dArray(ints);
        System.out.println();

        System.out.println("Działanie drugiej metody:");
        String[] strings = arrays.longer2dArray(stringFirstArray, stringSecondArray);
        arrays.printStringArray(strings);
        System.out.println();

        System.out.println("Działanie trzeciej metody:");
        System.out.println(arrays.biggerNumber(first1dArray));
        System.out.println();

        System.out.println("Działanie czwartej metody: ");
        System.out.println(arrays.lowerNumber(first1dArray));
        System.out.println();

        System.out.println("Działanie piątej metody: ");
        int[] ints1 = arrays.return1dArray(second2dIntArray);
        arrays.printIntArray(ints1);

    }
}
