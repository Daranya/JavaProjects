public class Problem_04 {

	public static void main(String[] args) {
		
		/*
         * Definition of a Word:
         * In this solution, a word is defined as any sequence of
         * letters (a-z, A-Z) and apostrophes ('), which allows for
         * contractions like 'tis to be treated as a single word.
         * The text is split based on non-letter, non-apostrophe
         * characters such as spaces, punctuation, etc.
         */
		
		String text = "To be or not to be, that is the question;"
                + " Whether 'tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

    // 1. Extract words from the text by splitting on non-word characters (like spaces, punctuation)
    String[] words = text.split("[^a-zA-Z']+"); // Only consider letters and apostrophes as part of a word

    // 2. Sort the words using bubble sort
    bubbleSort(words);

    // 3. Output the sorted words
    System.out.println("Sorted words:");
    for (String word : words) {
        if (!word.isEmpty()) { // Skip empty strings caused by split
            System.out.println(word);
        }
    }
}

// Bubble sort algorithm to sort an array of Strings
	public static void bubbleSort(String[] words) {
		int n = words.length;
		boolean swapped;
    
		do {
			swapped = false;
			for (int i = 0; i < n - 1; i++) {
				// Compare words[i] and words[i+1] in alphabetic order
				if (words[i].compareToIgnoreCase(words[i + 1]) > 0) {
					// Swap if the first word is greater than the second word
					String temp = words[i];
					words[i] = words[i + 1];
					words[i + 1] = temp;
					swapped = true;
				}
			}
			n--; // Reduce the range of comparison in each iteration
	} while (swapped);

}

}
