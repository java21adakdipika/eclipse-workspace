package test17;

public class LongestSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String wordd = "Dipika";
		int[] lengthofchar;
		char[] letters = null;
		
		for (int i=0; i<wordd.length();i++) {
			char letter = wordd.charAt(i);
			boolean check = searchletterinarray(letters, letter);
			if (check == false) {
				
			}
		}

	}
	
	public static boolean searchletterinarray(char[] letters, char letter) {
		for (int j=0; j<letters.length; j++) {
			if (letters[j] == letter) {
				return true;
			}
		}
		return false;
	}

}
