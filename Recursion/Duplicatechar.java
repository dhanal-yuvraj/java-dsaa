public class Duplicatechar {

    public static void Duplicate(String n,int idx,StringBuilder newStr,boolean map[]){
        if(idx==n.length()){
            System.out.println(newStr);
            return;
        }
        
        char currChar = n.charAt(idx);
        if(map[currChar-'a']==true){
            Duplicate(n, idx+1, newStr, map);
        }else{
            map[currChar-'a']= true;
            Duplicate(n, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnacollege";
        Duplicate(str, 0, new StringBuilder(), new boolean[25]);
    }
}
