public class LogLevels {
    // Each log line is a string formatted as follows: "[<LEVEL>]: <MESSAGE>".
    public static String message(String logLine) {
        String substring = logLine.substring(logLine.indexOf(":") + 1);
        return substring.trim();
    }

    public static String logLevel(String logLine) {
        String substring = logLine.substring(1, logLine.indexOf("]"));
        return substring.toLowerCase(); // it should be returned in lowercase
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
