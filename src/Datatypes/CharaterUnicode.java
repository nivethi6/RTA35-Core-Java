package Datatypes;

public class CharaterUnicode {
    public static void main(String[] args) {
        char ch = 429;
        System.out.println("Character : "+ch);

        char unicodeChar2 = '\u0259';
        System.out.println("Character : "+unicodeChar2);

        char unicodeChar3 = '\u2764';
        System.out.println("Character : "+unicodeChar3);

        String smileEmoji = "\uD83D\uDE0A"; // 😊
        System.out.println("Smiling Face Emoji : "+smileEmoji);

        String fireEmoji = "\uD83D\uDD25"; // 🔥
        System.out.println("Fire Emoji : "+fireEmoji);

        String thumbsUpEmoji = "\uD83D\uDC4D"; // 👍
        System.out.println("Thumbs-up Emoji : "+thumbsUpEmoji);

    }
}
