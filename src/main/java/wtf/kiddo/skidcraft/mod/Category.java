package wtf.kiddo.skidcraft.mod;

/**
 * Author: zcy
 * Created: 2022/5/1
 */
public enum Category {
    COMBAT("a"),
    WORLD("b"),
    UTILITY("c"),
    VISUALS("d"),
    GLOBAL("e");

    private final String character;

    Category(String character) {
        this.character = character;
    }

    public String getCharacter() {
        return character;
    }
}