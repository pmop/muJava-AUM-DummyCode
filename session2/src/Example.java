import java.util.*;

//Dummy = should be touched by the rule
//NDummy = should not be touched by the rule
public class Example {
	public Example () {
	}
	public void erule21Dummy1() {
		int v2 = 5;
		StringBuilder v1 = new StringBuilder(v2 + 2);
	}
	public void erule21Dummy2() {
		int v2 = 5;
		StringBuilder v1 = new StringBuilder(v2 - 2);
	}
	public void erule21Dummy3() {
		int v2 = 5;
		StringBuilder v1 = new StringBuilder(v2 * 2);
	}
	public void erule21Dummy4() {
		int v2 = 5;
		StringBuilder v1 = new StringBuilder(v2 / 2);
	}
	public void erule21Dummy5() {
		int v2 = 5;
		StringBuilder v1 = new StringBuilder(v2 % 2);
	}
	public void erule21Dummy6() {
		List<Integer> v2 = new ArrayList<Integer>();
		v2.add(1); v2.add(2); v2.add(3);
		StringBuilder v1 = new StringBuilder(v2.size() % 2);
	}
	public void erule21NDummy1() {
		String imAstring = new String("Dummy");
		//implicit conversion of 2 to string for + operator
		StringBuilder v1 = new StringBuilder(imAstring + 2);
	}
}
