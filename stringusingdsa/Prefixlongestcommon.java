package stringusingdsa;

public class Prefixlongestcommon {
	public static String commonprefix(String [] strs) {
		if(strs==null || strs.length==0) {
			return "";
		}
		String prefix=strs[0];
		for(int i=1;i<strs.length;i++) {
			while(!strs[i].startsWith(prefix)) {
				prefix=prefix.substring(0,prefix.length()-1);
				
				if(prefix.isEmpty()) {
					return " ";
				}
			}
		}
		return prefix;
		
	}
	public static void main (String args[]) {
		String strs[]= {"flower","fly","flow"};
		String result=commonprefix(strs);
		System.out.println(result);
	}

}
