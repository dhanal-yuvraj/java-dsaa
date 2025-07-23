public class Permutation {
    public static void perm(String str,String ans){
        //base
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i);
            //abcde = ab+de if we want to remove 'c' final abde
            String newString = str.substring(0, i)+str.substring(i+1);
            perm(newString, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        perm(str, "");
    }
}
