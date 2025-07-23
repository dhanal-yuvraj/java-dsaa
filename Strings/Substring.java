public class Substring {
    public static String subString(String str,int si,int ei){
        String substring = "";
        for(int i=si;i<ei;i++){
            substring += str.charAt(i);
        }
        return substring;
    }

    public static void main(String[] args) {
        String example = "HelloWorld";
        System.out.println(example.substring(0,5));
        System.out.println(subString(example, 0, 5));
    }
}
