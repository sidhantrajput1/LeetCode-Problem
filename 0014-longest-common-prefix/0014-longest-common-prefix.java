class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length,i=0,j=0;
        if(n==1 || strs[0].equals("")){
            return strs[0];
        }
        String str="";
        for(i=0;i<n;i++){
            String str1=strs[i];
            int m=Math.min(str1.length(),str.length());
            if(str.length()==0){
                str=str1;
            }
            else{
                for(j=0;j<m;j++){
                    if(str.charAt(j)!=str1.charAt(j)){
                        break;
                    }
                }
                str=str.substring(0,j);
                if(str.length()==0){
                    return "";
                }
            }
        }
        return str;
    }
}