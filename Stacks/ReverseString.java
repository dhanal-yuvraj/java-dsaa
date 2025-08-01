import java.util.*;
public class ReverseString {
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx<str.length()){
            char curr = str.charAt(idx);
            s.push(curr);
            idx++;
        }
        StringBuilder st = new StringBuilder("");
        while(!s.empty()){
            char curr = s.pop();
            st.append(curr);
        }

        return st.toString();
    }
    
    public static void main(String[] args) {
        String str = "yuvraj";
        String result = reverse(str);
        System.out.println(result);
    }
}
