package List;


import java.util.ArrayList;
import java.util.List;

public class FindCommonCharacters {
	public static List<String> commonChars(String[] words) {

        // Step 1: Store the frequency of the first word
        int[] common = new int[26];

        for (char ch : words[0].toCharArray()) {
            common[ch - 'a']++;
        }

        // Step 2: Compare with every remaining word
        for (int i = 1; i < words.length; i++) {

            int[] current = new int[26];

            // Count frequency of current word
            for (char ch : words[i].toCharArray()) {
                current[ch - 'a']++;
            }

            // Keep the minimum frequency
            for (int j = 0; j < 26; j++) {
                common[j] = Math.min(common[j], current[j]);
            }
        }

        // Step 3: Prepare answer
        List <String> ans = new ArrayList<>();

        for (int i = 0; i < 26; i++) {

            while (common[i] > 0) {
                ans.add(String.valueOf((char)(i + 'a')));
                common[i]--;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        String[] words = {"bella","label","roller"};

        System.out.println(commonChars(words));
    }
}
