public class MyString {
    public static void main(String[] args) {
        boolean test1 = MyString.contains("baba yaga", "baba");
        boolean test2 = MyString.contains("baba yaga", "");
        boolean test3 = !MyString.contains("baba yaga", "John Wick is the baba yaga");
        boolean test4 = !MyString.contains("baba yaga", "Yaga");
        boolean test5 = !MyString.contains("baba yaga", "babayaga");

        int passed = (test1 ? 1 : 0) + (test2 ? 1 : 0) + (test3 ? 1 : 0) + (test4 ? 1 : 0) +
                (test5 ? 1 : 0);
        
        System.out.println(passed + ": " + test1 + " " + test2 + " " + test3 + " " + test4 + " " + test5);

        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        // Replace the following statement with your code
        String lowerCaseStr = "";
        
        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (letter >= 'A' && letter <= 'Z') {
                letter += 32;
            }

            lowerCaseStr += letter;
        }

        return lowerCaseStr;
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str1 == "" || str2 == "") {
            return true;
        }
        
        for (int i = 0; i <= str1.length() - str2.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    break;
                }
                if (j == str2.length() - 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
