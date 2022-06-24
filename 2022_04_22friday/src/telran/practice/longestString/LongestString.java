package telran.practice.longestString;

//Дана строка , состоящая из разного количества повторяющихся символов типа "abbbcc".
// Найти длину максимальной подстроки повторяющихся символов. abbbcc -> 3
public class LongestString {
    public static void main(String[] args) {


    }

    public static int longestRepeatedSubstring(String str) {
        int count = 1;
        int res = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;

            } else {
                count = 1;
            }
            if (count>res){
                res=count;
            }
        }
        return res;
    }
}
