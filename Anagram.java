import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println(isAnagramSort("Pawel", "lwaPE"));
        System.out.println(isAnagramSort("xxxx111", "111xxx1"));
    }

    static boolean isAnagramSort(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] array1 = a.toCharArray();
        char[] array2 = b.toCharArray();
        Arrays.sort(array1);
        Arrays.sort(array2);

        return Arrays.equals(array1, array2);

    }
