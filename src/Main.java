public class Main {
    public static void main(String[] args) {
        Main a = new Main();
        System.out.println(a.toBinary(6642));
        System.out.println(a.toOctal(6642));
        System.out.println(a.toHex(6979));
    }

    public String toHex(int num) {
        if (num == 0) {
            return "";
        }
        int n = num;
        if (num % 16 < 10) {
            return toHex(n / 16) + n % 16;
        } else if (num % 16 == 10) {
            return toHex(n / 16) + "A";
        } else if (num % 16 == 11) {
            return toHex(n / 16) + "B";
        } else if (num % 16 == 12) {
            return toHex(n / 16) + "C";
        } else if (num % 16 == 13) {
            return toHex(n / 16) + "D";
        } else if (num % 16 == 14) {
            return toHex(n / 16) + "E";
        } else {
            return toHex(n / 16) + "F";
        }
    }

    public String toOctal(int num) {
        if (num == 0) {
            return "";
        }
        int n = num;
        return toOctal(n / 8) + n % 8;
    }

    public String toBinary(int num) {
        if (num == 0) {
            return "";
        }
        int n = num;
        return toBinary(n / 2) + n % 2;
    }

    public String toBinaryNonRec(int num) {
        String tempRes = "";
        int n = num;
        while (n != 0) {
            if (n % 2 == 1) {
                tempRes += "1";
            } else {
                tempRes += "0";
            }
            n /= 2;
            System.out.println(n);
        }
        String result = "";
        for (int i = tempRes.length() - 1; i >= 0; i--) {
            result += tempRes.substring(i, i + 1);
        }
        return result;
    }
}