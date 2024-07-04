public class counting_capita {
    public static void main(String[] args) {
        // Input text containing words with different capitalizations
        String text = "My Name IS shiv.";

        // Splitting the input text into an array of words using space as the delimiter
        String[] words = text.split(" ");

        // Initializing a counter to keep track of words that start with a capital
        // letter
        int count = 0;

        // Iterating through each word in the words array
        for (String word : words) {
            /*  Checking if the current word is not empty and if its first character is
             uppercase*/
            /* The expression Character.isUpperCase(word.charAt(0)) is used to check whether
            the first character of a given word is in uppercase (capitalized) or not.
             It's an important part of the code because it helps determine if a word*/ 
            // should be counted as one that starts with a capital letter.
            if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                // If the conditions are met, increment the count
                count++;
            }
        }
        // Printing the total number of words that start with a capital letter
        System.out.println("Number of words that start with a capital letter: " + count);
    }
}
