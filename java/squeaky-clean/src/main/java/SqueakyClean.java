import java.util.regex.Pattern;

class SqueakyClean {
    static String clean(String identifier) {
        return Pattern.compile("-(.)").matcher(identifier).replaceAll(x -> x.group(1).toUpperCase())
                .replaceAll("\s", "_")
                .replaceAll("\\p{Cntrl}", "CTRL")
                .replaceAll("[^\\p{IsAlphabetic}_]", "")
                .replaceAll("[α-ω]", "");
    }
}
