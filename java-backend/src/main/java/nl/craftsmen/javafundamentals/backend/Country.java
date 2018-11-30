package nl.craftsmen.javafundamentals.backend;

public enum Country {
    NETHERLANDS("NL"), GERMANY("DE");

    private final String countryCode;

    Country(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCode() {
        return countryCode;
    }
}
