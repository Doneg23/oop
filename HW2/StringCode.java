import java.util.Set;
import java.util.HashSet;

/**
 * A class with three static methods that manipulate strings in different ways.
 */
public class StringCode {

	/**
	 * Returns the length of the longest run in the given string.
	 * A run is a sequence of the same character appearing consecutively.
	 *
	 * @param str the input string
	 * @return the length of the longest run
	 */
	public static int maxRun(String str) {
		if (str.length() == 0) {
			return 0;
		}
		int maxRun = 1;
		int sameRun = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == str.charAt(i - 1)) {
				sameRun++;
			} else {
				maxRun = Math.max(maxRun, sameRun);
				sameRun = 1;
			}
		}
		return Math.max(maxRun, sameRun); // Kiểm tra lần cuối
	}

	/**
	 * Expands the given string based on digit characters.
	 * Each digit `d` is replaced by `d` copies of the next character.
	 *
	 * @param str the input string
	 * @return the transformed string
	 */
	public static String blowup(String str) {
		int l = str.length();
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < l; i++) {
			char a = str.charAt(i);
			if (Character.isDigit(a)) {
				int count = a - '0';
				if (i + 1 < l) {
					char next_a = str.charAt(i + 1);
					ans.append(String.valueOf(next_a).repeat(count));
				}
			} else {
				ans.append(a);
			}
		}
		return ans.toString();
	}

	/**
	 * Checks if there exists a common substring of length `len` between two strings.
	 *
	 * @param a   the first string
	 * @param b   the second string
	 * @param len the length of the substring
	 * @return true if a common substring of length `len` exists, false otherwise
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		if (len < 1 || a.length() < len || b.length() < len) {
			return false;
		}
		HashSet<String> strbool = new HashSet<>();
		for (int i = 0; i <= a.length() - len; i++) {
			strbool.add(a.substring(i, i + len));
		}
		for (int i = 0; i <= b.length() - len; i++) {
			if (strbool.contains(b.substring(i, i + len))) {
				return true;
			}
		}
		return false;
	}
}
