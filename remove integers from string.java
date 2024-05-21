public class HelloWorld {
    public static void main(String[] args) {
        // Original string with numbers
        String input = "saurabh123";
        
        // Remove all numeric characters
        String output = input.replaceAll("\\d", "");
        
        // Print the resulting string
        System.out.println("Original string: " + input);
        System.out.println("String after removing numbers: " + output);
    }
}

//output saurabh
