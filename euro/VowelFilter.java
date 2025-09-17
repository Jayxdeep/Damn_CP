package euro;

public class VowelFilter {
    public static void main(String[] args) {
        System.out.println(filter("Cat"));      // Ct
        System.out.println(filter("America"));  // mrc
        System.out.println(filter("Seattle"));  // Seattl
    }

    public static String filter(String s) {
        String vowels = "aeiouAEIOU";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (vowels.indexOf(c) != -1) {
                boolean leftVowel = (i > 0 && vowels.indexOf(s.charAt(i - 1)) != -1);
                boolean rightVowel = (i < s.length() - 1 && vowels.indexOf(s.charAt(i + 1)) != -1);
                if (leftVowel || rightVowel) {
                    result.append(c);
                }
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
