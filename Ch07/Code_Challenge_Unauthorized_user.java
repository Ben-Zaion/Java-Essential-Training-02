// Java code​​​​​‌​​​​‌​‌​‌‌‌‌​​‌​​‌​​​‌​‌‌ below

/** *************************************************
 * Write your answer here, and then test your code.
 * Your job is to implement the checkAccess() method.
 *************************************************** */
import java.util.List;

class Answer {

    public static void main(String[] args) {
        String username = "angie";
        try {
            Answer.checkAccess(username);
        } catch (UnauthorizedException e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * *************************************************
     * Change these boolean values to control whether you see the expected
     * result and/or hints. **************************************************
     */
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static List<String> authorizedUsers = List.of("techwizard87", "codeNinja123", "dataQueen99", "cyberPioneer", "byteMaster", "algorithmGuru", "cloudSurfer55", "pixelPilot", "javaJedi", "scriptScribe");
    static String accessDeniedMessage = "Access denied";

    static void checkAccess(String username) throws UnauthorizedException {
        /**
         * *****************************************************
         * TODO: Your code goes here.
         *
         *          *Implement this method to throw an UnauthorizedException if the
         * provided username is not in the authorizedUsers list. Use
         * accessDeniedMessage as the exception's message
         * ******************************************************
         */
        if (!authorizedUsers.contains(username)) {
            throw new UnauthorizedException(accessDeniedMessage);
        }
    }
}

// Do not change this class
class UnauthorizedException extends Exception {

    public UnauthorizedException() {
        this("Unauthorized to access");
    }

    public UnauthorizedException(String message) {
        super(message);
    }
}
