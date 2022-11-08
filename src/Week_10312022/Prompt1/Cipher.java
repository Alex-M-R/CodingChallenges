package Week_10312022.Prompt1;

import java.util.HashMap;
import java.util.Map;

public class Cipher
{
    private static final Map<Character, Character> cipher = new HashMap<>()
    {{
        put('A', 'Z');      put('a', 'z');
        put('B', 'Y');      put('b', 'y');
        put('C', 'X');      put('c', 'x');
        put('D', 'W');      put('d', 'w');
        put('E', 'V');      put('e', 'v');
        put('F', 'U');      put('f', 'u');
        put('G', 'T');      put('g', 't');
        put('H', 'S');      put('h', 's');
        put('I', 'R');      put('i', 'r');
        put('J', 'Q');      put('j', 'q');
        put('K', 'P');      put('k', 'p');
        put('L', 'O');      put('l', 'o');
        put('M', 'N');      put('m', 'n');
        put('N', 'M');      put('n', 'm');
        put('O', 'L');      put('o', 'l');
        put('P', 'K');      put('p', 'k');
        put('Q', 'J');      put('q', 'j');
        put('R', 'I');      put('r', 'i');
        put('S', 'H');      put('s', 'h');
        put('T', 'G');      put('t', 'g');
        put('U', 'F');      put('u', 'f');
        put('V', 'E');      put('v', 'e');
        put('W', 'D');      put('w', 'd');
        put('X', 'C');      put('x', 'c');
        put('Y', 'B');      put('y', 'b');
        put('Z', 'A');      put('z', 'a');
    }};

    public static String weakEncryption(String string)
    {
        StringBuilder result = new StringBuilder();

        for (char c : string.toCharArray())
            result.append(Character.isAlphabetic(c) ? cipher.get(c) : c);

        return result.toString();
    }
}
