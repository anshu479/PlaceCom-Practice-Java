public class Strings {

    public static int atoi(String s) {
        if(s.length() < 1) {
            return 0;
        }
        int first = 0;
        boolean isNegative = false;
        if(s.charAt(0) == '-') {
            first = 1;
            isNegative = true;
        }
        int ans = 0;
        for(int i = first; i < s.length(); i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int x = s.charAt(i) - '0';
                ans = ans * 10 + x;
            }

            else return -1;
        }

        if(isNegative == true) {
            ans = ans * (-1);
        }

        return ans;
    }

    public static double stringToFloat(String s) {
        double ans = 0;
        double firstPart = 0;
        for(int i = 0; i < s.length() && s.charAt(i) != '.'; i++) {
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                int x = s.charAt(i) - '0';
                firstPart = firstPart * 10 + x;
            }
        }
        double secondPart = 0;
        for(int i = s.length() - 1; i >= 0 && s.charAt(i) != '.'; i--) {
            int x = s.charAt(i) - '0';
            secondPart = (secondPart + x)/ 10;
        }

        ans = firstPart + secondPart;


        return ans;
    }

    public static String addLongStrings(String s1, String s2) {
        int i = s1.length() - 1;
        int j = s2.length() - 1;
        int sum = 0;
        int carry = 0;
        String ans = "";
        while(i >= 0 && j >= 0) {
            int a = s1.charAt(i) - '0';
            int b = s2.charAt(j) - '0';

            sum = a + b + carry;
            carry = sum / 10;
            sum = sum % 10;

            ans = (sum + "") + ans;
            i--;
            j--;
        }

        while(i >= 0) {
            int a = s1.charAt(i) - '0';
            sum = a + carry;
            carry = sum / 10;
            sum = sum % 10;

            ans = (sum + "") + ans;
            i--;
        }

        while(j >= 0) {
            int a = s2.charAt(j) - '0';
            sum = a + carry;
            carry = sum / 10;
            sum = sum % 10;

            ans = (sum + "") + ans;
            j--;
        }

        return ans;
    }

    public static int  findStartIndex(String source, String pattern) {
        int ans = -1;
        int j = 0;
        for(int i = 0; i < source.length() && j < pattern.length(); i++) {
            if(source.charAt(i) == pattern.charAt(j)) {
                ans = i;
                j++;
            }
            else {
                if(j != pattern.length() - 1) {
                    j = 0;
                    ans = -1;
                }

            }
        }
        if(ans == -1) {
            return ans;
        }

        return ans - (pattern.length() - 1) ;
    }


    public static void main(String[] args) {
//        System.out.println(atoi("-134"));
//        System.out.println(stringToFloat("134.567"));
//        System.out.println(addLongStrings("1234", "123456"));
        System.out.println(findStartIndex("abcdefghicde", "c"));
    }
}
