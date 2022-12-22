public class Problem5 {
    private static boolean palindrome(String value) {
        // your code here
        if (value.length() == 0 || value.length() == 1)
            return true;

        char first = value.charAt(0);
        char last = value.charAt(value.length() - 1);

        if (first != last)
            return false;
        else {
            value = value.substring(1, value.length() - 1);
            return palindrome(value);
        }
    }


    public static void main(String[] args) {
        System.out.println(palindrome("civic"));
        System.out.println(palindrome("katak"));
        System.out.println(palindrome("kasur rusak"));
        System.out.println(palindrome("kupu-kupu"));
        System.out.println(palindrome("lion"));
        System.out.println(palindrome("membaca"));
    }

}
