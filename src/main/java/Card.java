public class Card {
    private String denomination;
    private String pattern;

    public String getDenomination() {
        return denomination;
    }

    public Card(String denomination, String pattern) {
        this.denomination = denomination;
        this.pattern = pattern;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    @Override
    public String toString() {
        return "Card{" +
                "denomination='" + denomination + '\'' +
                ", pattern='" + pattern + '\'' +
                '}';
    }
}
