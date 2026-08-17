package Recursion;

public class removeDuplicate {
    public static boolean[] map=new boolean[26];

    public static void RemoveDuplicate(String str, int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar = str.charAt(idx);
        if(map[currchar-'a']){
            RemoveDuplicate(str, idx+1, newString);
        }else{
            newString+=currchar;
            map[currchar-'a']=true;
            RemoveDuplicate(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str ="aadjdnw";
        RemoveDuplicate( str, 0, "");
    }
}

