public class RemoveDuplicates {
    
    public static void RemoveDup(String str, int idx, StringBuilder newStr, boolean map[]){

        //base case
        if (idx==str.length()) {
            System.out.println(newStr);
            return;
        }

        //main case

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']== true) {
            // duplicates 

            RemoveDup(str, idx+1, newStr, map);
        }else{
            map[currChar - 'a'] = true;
            RemoveDup(str, idx+1, newStr.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        RemoveDup(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
