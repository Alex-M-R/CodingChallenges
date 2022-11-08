package Week_10312022.JavaPrompt1;

/*
The Atbash cipher is an encryption method in which each letter of a word is replaced with its "mirror" letter in the alphabet: A <=> Z; B <=> Y; C <=> X; etc.

        Create a function that takes a string and applies the Atbash cipher to it.

        Examples

        atbash("apple") ➞ "zkkov"
        atbash("Hello world!") ➞ "Svool dliow!"
        atbash("Christmas is the 25th of December") ➞ "Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"

        Notes

        Capitalization should be retained.

        Non-alphabetic characters should not be altered.
*/

public class Prompt
{
    public static void main(String[] args)
    {
        System.out.println("zkkov".equals(Cipher.weakEncryption("apple")));
        System.out.println("Hello world!".equals(Cipher.weakEncryption("Svool dliow!")));
        System.out.println("Christmas is the 25th of December".equals(Cipher.weakEncryption("Xsirhgnzh rh gsv 25gs lu Wvxvnyvi")));

        System.out.println("apple".equals(Cipher.weakEncryption("zkkov")));
        System.out.println("Hello world!".equals(Cipher.weakEncryption("Svool dliow!")));
        System.out.println("Christmas is the 25th of December".equals(Cipher.weakEncryption("Xsirhgnzh rh gsv 25gs lu Wvxvnyvi")));

        System.out.println("Th!s !$ @ v3ry gr0$$ $tr!ng 4 t3$t!ng ~~./\\]::;''\"+=-)(*^%".equals(Cipher.weakEncryption("Gs!h !$ @ e3ib ti0$$ $gi!mt 4 g3$g!mt ~~./\\]::;''\"+=-)(*^%")));
        System.out.println("Gs!h !$ @ e3ib ti0$$ $gi!mt 4 g3$g!mt ~~./\\]::;''\"+=-)(*^%".equals(Cipher.weakEncryption("Th!s !$ @ v3ry gr0$$ $tr!ng 4 t3$t!ng ~~./\\]::;''\"+=-)(*^%")));
    }
}
