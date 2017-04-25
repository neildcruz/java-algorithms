package ctci.ch01;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 
 * @author NDcruz
 *
 */
public class StringUniqueChars {

	public static void main(String[] args) {
		String s = "ABCDEFGHIJKLMBOP";
		System.out.println("hasUniqueChars : " + hasUniqueChars(s));
		System.out.println("hasUniqueCharsLambda : " + hasUniqueCharsLambda(s));
	}
	
	//First solution
	public static boolean hasUniqueChars(String s) {
		Set<Character> seenChars = new HashSet<>(); 
		for (Character c : s.toCharArray()) {
			if(!seenChars.contains(c)) {
				seenChars.add(c);
			}else {
				return false;
			}
		}
		return true;
	}
	
	//Using java 8 stream - not efficient since it will traverse entire string regardless of repeating char
	public static boolean hasUniqueCharsLambda(String s) {
		return s.length() == s.chars().mapToObj(c -> (char)c).collect(Collectors.toSet()).size();
	}

}
