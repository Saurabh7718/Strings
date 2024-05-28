public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "my name is saurabh";
        String output = capitalizeWords(input);
        System.out.println(output);
    }

    public static String capitalizeWords(String str) {
        // Split the input string into words
        String[] words = str.split(" ");
        StringBuilder capitalizedString = new StringBuilder();

        // Iterate through each word
        for (String word : words) {
            // Capitalize the first letter of each word and add the rest of the letters in lowercase
            if (word.length() > 0) {
                capitalizedString.append(Character.toUpperCase(word.charAt(0)))
                                  .append(word.substring(1).toLowerCase())
                                  .append(" ");
            }
        }

        // Remove the trailing space
        return capitalizedString.toString().trim();
    }
}
