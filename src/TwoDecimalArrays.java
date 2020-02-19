import java.util.Arrays;

public class TwoDecimalArrays {

    public int[] return1dArray(int[][] array2d) {
        int biggestArray = 0;
        int currentArray = 0;
        int index = 0;
        for (int i = 0; i < array2d.length; i++) {

            for (int j = 0; j < array2d[i].length; j++) {
                currentArray = currentArray + array2d[i][j];
            }
            if (currentArray > biggestArray) {
                biggestArray = currentArray;
                index = i;
            }
        }
        return array2d[index];
    }

    public int lowerNumber(int[] array) {
        int sum = biggerNumber(array);
        for (int i = 0; i < array.length; i++) {
            if (sum > array[i])
                sum = array[i];
        }
        return sum;
    }

    public int biggerNumber(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (sum < array[i])
                sum = array[i];
        }
        return sum;
    }

    public int[][] bigger2dArray(int[][] array1, int[][] array2) {
        int sumArray1 = countEveryElement(array1);
        int sumArray2 = countEveryElement(array2);
        if (sumArray1 > sumArray2)
            return array1;
        return array2;
    }

    public String[] longer2dArray(String[] stringArray1, String[] stringArray2) {
        int array1Length = countCharLength(stringArray1);
        int array2Length = countCharLength(stringArray2);
        if (array1Length > array2Length)
            return stringArray1;
        return stringArray2;
    }

    public int countLengthOfArrays(String[][] stringArray) {
        int sum = 0;
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                String word = stringArray[i][j];
                sum = sum + word.toCharArray().length;
            }
        }
        return sum;
    }

    public int countEveryElement(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
        }
        return sum;
    }

    public int countCharLength(String[] array) {
        int length = 0;
        for (int i = 0; i < array.length; i++) {

            length = length + array[i].toCharArray().length;
        }
        return length;
    }

    public void printInt2dArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printStringArray(String[] array) {
        for (String s : array) {
            System.out.print(s + " ");
        }
    }

    public void printIntArray(int[] array){
        for (int i : array) {
            System.out.println(i + " ");
        }
    }
}