public class FindFirstAndLastIndex {
    public static void main(String[] args) {
        String input = "amazonaanazzz";
        char target = 'a';
        
        int firstIndex = input.indexOf(target);
        int lastIndex = input.lastIndexOf(target);
        
        System.out.println("First occurrence of '" + target + "' is at index: " + firstIndex);
        System.out.println("Last occurrence of '" + target + "' is at index: " + lastIndex);
    }
}
