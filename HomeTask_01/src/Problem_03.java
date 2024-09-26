public class Problem_03 {

	public static void main(String[] args) {
		
		 String text = "To be or not to be, that is the question;"
                 + "Whether `tis nobler in the mind to suffer"
                 + " the slings and arrows of outrageous fortune,"
                 + " or to take arms against a sea of troubles,"
                 + " and by opposing end them?";
     
     int spaces = 0;
     int vowels = 0;
     int letters = 0;
     
     // Loop through each character in the text
     for (int i = 0; i < text.length(); i++) {
         char c = text.charAt(i);
         
         // Count spaces
         if (c == ' ') {
             spaces++;
         }
         // Check if the character is a letter
         else if (Character.isLetter(c)) {
             letters++;  // Count letters
             
             // Check if the letter is a vowel (both uppercase and lowercase)
             if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                 c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                 vowels++;
             }
         }
     }
     
     // Output the results
     System.out.println("The text contained vowels: " + vowels + "\n"
     + "consonants: " + (letters - vowels) + "\n" 
     + "spaces: " + spaces);

	}

}
