public class Content {
    private String paragraph;

    public Content(String p) {
        this.paragraph = p;
    }

    public int getCount(String word) {
        String trimmed = paragraph.trim();
        String trimmedLowerCase = trimmed.toLowerCase();
        int count = 0, wl = word.length(), tl = trimmedLowerCase.length();

        if (tl < wl) {
            return 0;
        }
        // count the match if the trimmed string equals the target = the
        if (tl == wl && trimmedLowerCase.substring(0, wl).equals(word)) {
            return 1;
        }
        // from now in tl > wl is implied
        // count the first word if it matches the search a word!?
        if (trimmedLowerCase.substring(0, wl).equals(word)) {
            count++;
        }
        // count the last word if it matches the search
        if ((trimmedLowerCase.substring(tl - wl)).equals(word)
                && trimmedLowerCase.charAt(tl - wl -1) == ' '){
            count++;
        }

        // finish checking the first and last words
        // go through the middle substring with a window
        // count word is it is surrounded by spaces

        for (int i = wl; i < tl - wl ; i++) {
            if ((trimmedLowerCase.substring(i, i + wl)).equals(word)
                    && trimmedLowerCase.charAt(i + wl) == ' '
                    && trimmedLowerCase.charAt(i - 1) == ' ')
                count++;
        }
        return count;
    }
}
