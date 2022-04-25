package day7;
import java.util.*;

public class ListTrim {

	static void listTrim(List<String> strings) {
        for (ListIterator<String> lit = strings.listIterator(); lit.hasNext(); ) {
            lit.set(lit.next().trim());
        }
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l = Arrays.asList("  hello  ", " good ", " morning! ");
        listTrim(l);
        for (String s : l) {
            System.out.format("\"%s\"%n", s);
        }
	}

}
