 package stringusingdsa;

public class reversevowels {
	public static  String reverseVowel(String s) {
        char ch[]=s.toCharArray();
        int left=0;
        int right=ch.length-1;
        while(left<right){
            while(left<right && !isvowel(ch[left])){
                left++;
            }
            while(left<right && !isvowel(ch[right])){
                right--;
            }
            char temp=ch[left];
            ch[left]=ch[right];
            ch[right]=temp;
            left++;
            right--;
        }
        return new String(ch);
       
    }
     private static boolean isvowel(char c){
            return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||
            c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
        }
     public static void main(String[] args) {
	        String s = "hello ajinkyA";
	        System.out.println("Reversed String: " + reverseVowel(s));
	    }
}
