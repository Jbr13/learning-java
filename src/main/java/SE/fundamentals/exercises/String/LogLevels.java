package SE.fundamentals.exercises.String;

public class LogLevels {

    // The key thing to remember about Java strings is that they are immutable objects representing
    // text as a sequence of Unicode characters (letters, digits, punctuation, etc.). Double
    // quotes are used to define a String instance

    // Manipulating a string can be done using method of class String. As string values can never
    // change after having been defined, all string manipulation methods will return a new string.
    // A string is delimited by double quote (") characters. Some special characters need escaping
    // using the backslash (\) character. Characters to be escaped in Java: " \

    // String escaped = "c:\\test.txt"; => c:\test.txt

    // Finally, there are many ways to concatenate a string. The simplest one is the + operator:

    // String name = "Jane";
    // "Hello " + name + "!"; => "Hello Jane!"

    // For any string formatting more complex than simple concatenation, String.format method is preferred.
    // String name = "Jane";
    // String.format("Hello %s!",name); => "Hello Jane!"

    // Other possibilities are:

    // use StringBuilder class (https://docs.oracle.com/javase/tutorial/java/data/buffers.html)
    // use String.concat method (https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#concat-java.lang.String-)

    // Strings are manipulated by calling the string's methods. Once a string has been
    // constructed, its value can never change. Any methods that appear to modify a string will
    // actually return a new string. The String class provides some static methods to transform
    // the strings

    public static void main(String[] args) {
        LogLevels.message("[ERROR]: Invalid operation");
        LogLevels.message("[WARNING]:  Disk almost full\r\n");
        LogLevels.logLevel("[ERROR]: Invalid operation");
        LogLevels.reformat("[INFO]: Operation completed");
    }

    public static String message(String message) {
        String[] splittedMessage = message.split(":");
        String trimmedMessage = splittedMessage[1].trim();
        return trimmedMessage;
    }

    public static String logLevel(String message) {
        String[] splittedMessage = message.split(":");
        String formattedMessage = splittedMessage[0]
                .toLowerCase()
                .replaceAll("\\[", "")
                .replaceAll("\\]", "");
        return formattedMessage;
    }

    public static String reformat(String message) {
        String[] splittedMessage = message.split(":");
        String firstSentence = splittedMessage[0]
                .replaceAll("\\[", "(")
                .replaceAll("\\]", ")")
                .toLowerCase()
                .trim();
        String secondSentence = splittedMessage[1].trim();
        String newSentence = secondSentence + " " + firstSentence;

        return newSentence;
    }
}

