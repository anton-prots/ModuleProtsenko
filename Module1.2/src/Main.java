import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 1, 2, 7, 7, 5};
        System.out.println(uniqueCount(array));
    }
    static int uniqueCount(int[] array) {
        int result;
        int countUnique = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            countUnique++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count++;
                }
            }
        }
        return result = countUnique - count+1;
    }
}
