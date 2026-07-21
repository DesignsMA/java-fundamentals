import java.util.Map;

class SqueakyClean {
    private static final Map<Character, Character> LEET_SPEAK_MAP = Map.of(
        '4', 'a',
        '3', 'e',
        '0', 'o',
        '1', 'l',
        '7', 't'
    );

    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder();
        boolean capitalizeNext = false;

        for (char ch : identifier.toCharArray()) {
            if (ch == ' ') {
                sb.append('_');
            } else if (ch == '-') {
                capitalizeNext = true;
            } else if (Character.isLetter(ch)) {
                if (capitalizeNext) {
                    sb.append(Character.toUpperCase(ch));
                    capitalizeNext = false;
                } else {
                    sb.append(ch);
                }
            } else {
                Character replacement = LEET_SPEAK_MAP.get(ch);
                if (replacement != null) {
                    sb.append(replacement);
                }
            }
        }
        return sb.toString();
    }
}
