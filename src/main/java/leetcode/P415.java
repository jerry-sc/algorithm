package leetcode;

public class P415 {

    public String addStrings(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;
        while (len1 >= 0 && len2 >=0)  {
            int a = num1.charAt(len1--) - '0';
            int b = num2.charAt(len2--) - '0';
            if (flag) {
                if (a+b+1 >= 10) {
                    flag = true;
                    stringBuilder.append(a+b+1-10);
                } else {
                    flag = false;
                    stringBuilder.append(a+b+1);
                }
            }else {
                if(a+b >= 10) {
                    flag = true;
                    stringBuilder.append(a+b-10);
                } else {
                    flag = false;
                    stringBuilder.append(a+b);
                }
            }
        }
        while (len1 >= 0) {
            int a = num1.charAt(len1--) - '0';
            if (flag) {
                if (a+1 == 10) {
                    stringBuilder.append(0);
                    flag = true;
                } else {
                    stringBuilder.append(a+1);
                    flag = false;
                }
            } else {
                stringBuilder.append(a);
            }
        }
        while (len2 >= 0) {
            int a = num2.charAt(len2--) - '0';
            if (flag) {
                if (a+1 == 10) {
                    stringBuilder.append(0);
                    flag = true;
                } else {
                    stringBuilder.append(a+1);
                    flag = false;
                }
            } else {
                stringBuilder.append(a);
            }
        }
        if (flag)
            stringBuilder.append(1);
        return stringBuilder.reverse().toString();
    }
}
