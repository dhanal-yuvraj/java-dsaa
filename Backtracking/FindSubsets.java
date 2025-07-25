class FindSubsets{
    public static void findSubsets(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return ;
        }
        //If string says  yes
        findSubsets(str, ans+str.charAt(i), i+1);
        //If string says no
        findSubsets(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, "", 0);
    }
}