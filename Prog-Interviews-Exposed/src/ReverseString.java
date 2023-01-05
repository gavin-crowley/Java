public class ReverseString {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverse(str));
    }

//    public static String reverse(String in) {
//        String out = "";
//        for (int i = in.length()-1; i >= 0 ; i--) {
//            out += in.charAt(i);
//        }
//        return out;
//    }

    public static String reverse(String in) {
     int len = in.length();
     StringBuilder out = new StringBuilder(len);
        for (int i = len -1; i >= 0 ; i--) {
            out.append(in.charAt(i));
        }
        return out.toString();
    }
}
