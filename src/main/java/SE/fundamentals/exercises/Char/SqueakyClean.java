package SE.fundamentals.exercises.Char;

import java.util.stream.Collectors;

public class SqueakyClean {
    // The Java char type represents the smallest addressable components of text. Multiple chars can
    // comprise a string such as "word" or chars can be processed independently. Their literals have
    // single quotes e.g. 'A'.
    //
    // Java chars support Unicode encoding so in addition to the Latin character set pretty much all
    // the writing systems in use worldwide can be represented, e.g. the Greek letter 'β'.
    //
    // There are many builtin library methods to inspect and manipulate chars. These can be found as
    // static methods of the java.lang.Character class.
    //
    // chars are sometimes used in conjunction with a StringBuilder object. This object has methods
    // that allow a string to be constructed character by character and manipulated. At the end of
    // the process toString can be called on it to output a complete string.

    // Control characters are non-printable characters that are used as transmitting signals to control
    // devices, perform special actions in a program, or manipulate the flow of text or data.

    // In Java and many other programming languages, there are special control characters represented
    // by escape sequences, starting with a backslash () followed by one or more characters that have
    // a special meaning.

    // For instance, some common control characters include:
    // \n: It stands for a line break (new line). When used in a string, it moves the cursor to the next line.
    // \t: Represents a tab character. When used in a string, it inserts a space equivalent to the size of a tab.
    // \r: Stands for a carriage return. In some systems, used together with \n to indicate a new line.

    public static void main(String[] args) {
//        SqueakyClean.clean("my   Id");
//        SqueakyClean.clean("my\0Id");
//        SqueakyClean.clean("à-ḃç");
        SqueakyClean.clean("a1😀2😀3😀b");
    }

    public static String clean(String str) {
        if (str == null) {
            throw new UnsupportedOperationException();
        }

        String formattedStrWithoutUnderscore = replaceSpacesWithUnderscores(str);
        String formattedStrWithoutControlCharacters = replaceControlCharactersWithCTRL(formattedStrWithoutUnderscore);
        String formattedStrWithoutKebab = kebabCaseToCamelCase(formattedStrWithoutControlCharacters);
        String formattedStrWithLetters = omitCharactersThatAreNotLetters(formattedStrWithoutKebab);

        System.out.printf(formattedStrWithLetters);

        return formattedStrWithLetters;
    }

    private static String replaceSpacesWithUnderscores(String str) {
        return String.format("%s", str.trim().replaceAll(" ", "_"));
    }

    private static String replaceControlCharactersWithCTRL(String str) {
        return str.chars().mapToObj(c -> Character.isISOControl(c) ? "CTRL" : Character.toString(c)).collect(Collectors.joining());
    }

    private static String kebabCaseToCamelCase(String str) {
        if (!str.contains("-")) {
            return str;
        }

        String[] splittedString = str.split("-");
        String str01 = splittedString[0];
        String str02 = splittedString[1];

        return String.format("%s%s%s", str01, str02.substring(0, 1).toUpperCase(), str02.substring(1));
    }

    private static String omitCharactersThatAreNotLetters(String str) {
                                                            // This is a method reference, the same as String.valueOf(c)
        return str.chars().filter(Character::isLetter).mapToObj(String::valueOf).collect(Collectors.joining());
    }

}
