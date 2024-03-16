package exercises;

/*
Implement a function which convert the given boolean value into its string representation.

Note: Only valid inputs will be given.
*/
public class BooleanToString {

    public static String convert(boolean b) {
        return String.valueOf(b);
    }

    public static String convertBestSolution(boolean b) {
        return b ? "true" : "false";
    }

}
