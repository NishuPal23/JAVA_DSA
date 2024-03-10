package String;

public class MobileNumericKeypad {
    public static String convert(String str){
        String arr[] = {"2","22","222","3","33","333","4","44","444","5","55","555","6","66","666","7","77","777","7777","8","88","888","9","99","999","9999"};
        String output = "";
        for(int i =0;i<str.length();i++){
            if(str.charAt(i)==' '){
                  output+="0";
;            }
            else{
               int index = str.charAt(i)-'A'; 
               output+=arr[index];
            }

        }
        return output;
    }
   public static void main(String[] args) {
    String str = "GEEKSFORGEEKS";
    String ans = convert(str);
    System.out.println(ans);
   } 
}
