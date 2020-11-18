
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for Card type.
 */
public class Card {
    private final String id;
    private final String cardBrand;
    private final String last4;
    private final Long expMonth;
    private final Long expYear;
    private final String cardholderName;
    private final Address billingAddress;
    private final String fingerprint;
    private final String cardType;
    private final String prepaidType;
    private final String bin;

    /**
     * Initialization constructor.
     * @param id String value for id.
     * @param cardBrand String value for cardBrand.
     * @param last4 String value for last4.
     * @param expMonth Long value for expMonth.
     * @param expYear Long value for expYear.
     * @param cardholderName String value for cardholderName.
     * @param billingAddress Address value for billingAddress.
     * @param fingerprint String value for fingerprint.
     * @param cardType String value for cardType.
     * @param prepaidType String value for prepaidType.
     * @param bin String value for bin.
     */
    @JsonCreator
    public Card(
            @JsonProperty("id") String id,
            @JsonProperty("card_brand") String cardBrand,
            @JsonProperty("last_4") String last4,
            @JsonProperty("exp_month") Long expMonth,
            @JsonProperty("exp_year") Long expYear,
            @JsonProperty("cardholder_name") String cardholderName,
            @JsonProperty("billing_address") Address billingAddress,
            @JsonProperty("fingerprint") String fingerprint,
            @JsonProperty("card_type") String cardType,
            @JsonProperty("prepaid_type") String prepaidType,
            @JsonProperty("bin") String bin) {
        this.id = id;
        this.cardBrand = cardBrand;
        this.last4 = last4;
        this.expMonth = expMonth;
        this.expYear = expYear;
        this.cardholderName = cardholderName;
        this.billingAddress = billingAddress;
        this.fingerprint = fingerprint;
        this.cardType = cardType;
        this.prepaidType = prepaidType;
        this.bin = bin;
    }

    /**
     * Getter for Id.
     * Unique ID for this card. Generated by Square.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }

    /**
     * Getter for CardBrand.
     * Indicates a card's brand, such as `VISA` or `MASTERCARD`.
     * @return Returns the String
     */
    @JsonGetter("card_brand")
    public String getCardBrand() {
        return this.cardBrand;
    }

    /**
     * Getter for Last4.
     * The last 4 digits of the card number.
     * @return Returns the String
     */
    @JsonGetter("last_4")
    public String getLast4() {
        return this.last4;
    }

    /**
     * Getter for ExpMonth.
     * The expiration month of the associated card as an integer between 1 and 12.
     * @return Returns the Long
     */
    @JsonGetter("exp_month")
    public Long getExpMonth() {
        return this.expMonth;
    }

    /**
     * Getter for ExpYear.
     * The four-digit year of the card's expiration date.
     * @return Returns the Long
     */
    @JsonGetter("exp_year")
    public Long getExpYear() {
        return this.expYear;
    }

    /**
     * Getter for CardholderName.
     * The name of the cardholder.
     * @return Returns the String
     */
    @JsonGetter("cardholder_name")
    public String getCardholderName() {
        return this.cardholderName;
    }

    /**
     * Getter for BillingAddress.
     * Represents a physical address.
     * @return Returns the Address
     */
    @JsonGetter("billing_address")
    public Address getBillingAddress() {
        return this.billingAddress;
    }

    /**
     * Getter for Fingerprint.
     * __Not currently set.__ Intended as a Square-assigned identifier, based on the card number, to
     * identify the card across multiple locations within a single application.
     * @return Returns the String
     */
    @JsonGetter("fingerprint")
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * Getter for CardType.
     * Indicates a card's type, such as `CREDIT` or `DEBIT`.
     * @return Returns the String
     */
    @JsonGetter("card_type")
    public String getCardType() {
        return this.cardType;
    }

    /**
     * Getter for PrepaidType.
     * Indicates a card's prepaid type, such as `NOT_PREPAID` or `PREPAID`.
     * @return Returns the String
     */
    @JsonGetter("prepaid_type")
    public String getPrepaidType() {
        return this.prepaidType;
    }

    /**
     * Getter for Bin.
     * The first six digits of the card number, known as the Bank Identification Number (BIN). Only
     * the Payments API returns this field.
     * @return Returns the String
     */
    @JsonGetter("bin")
    public String getBin() {
        return this.bin;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cardBrand, last4, expMonth, expYear, cardholderName, billingAddress,
                fingerprint, cardType, prepaidType, bin);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Card)) {
            return false;
        }
        Card other = (Card) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(cardBrand, other.cardBrand)
            && Objects.equals(last4, other.last4)
            && Objects.equals(expMonth, other.expMonth)
            && Objects.equals(expYear, other.expYear)
            && Objects.equals(cardholderName, other.cardholderName)
            && Objects.equals(billingAddress, other.billingAddress)
            && Objects.equals(fingerprint, other.fingerprint)
            && Objects.equals(cardType, other.cardType)
            && Objects.equals(prepaidType, other.prepaidType)
            && Objects.equals(bin, other.bin);
    }

    /**
     * Converts this Card into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Card [" + "id=" + id + ", cardBrand=" + cardBrand + ", last4=" + last4
                + ", expMonth=" + expMonth + ", expYear=" + expYear + ", cardholderName="
                + cardholderName + ", billingAddress=" + billingAddress + ", fingerprint="
                + fingerprint + ", cardType=" + cardType + ", prepaidType=" + prepaidType + ", bin="
                + bin + "]";
    }

    /**
     * Builds a new {@link Card.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Card.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .cardBrand(getCardBrand())
                .last4(getLast4())
                .expMonth(getExpMonth())
                .expYear(getExpYear())
                .cardholderName(getCardholderName())
                .billingAddress(getBillingAddress())
                .fingerprint(getFingerprint())
                .cardType(getCardType())
                .prepaidType(getPrepaidType())
                .bin(getBin());
        return builder;
    }

    /**
     * Class to build instances of {@link Card}.
     */
    public static class Builder {
        private String id;
        private String cardBrand;
        private String last4;
        private Long expMonth;
        private Long expYear;
        private String cardholderName;
        private Address billingAddress;
        private String fingerprint;
        private String cardType;
        private String prepaidType;
        private String bin;



        /**
         * Setter for id.
         * @param id String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for cardBrand.
         * @param cardBrand String value for cardBrand.
         * @return Builder
         */
        public Builder cardBrand(String cardBrand) {
            this.cardBrand = cardBrand;
            return this;
        }

        /**
         * Setter for last4.
         * @param last4 String value for last4.
         * @return Builder
         */
        public Builder last4(String last4) {
            this.last4 = last4;
            return this;
        }

        /**
         * Setter for expMonth.
         * @param expMonth Long value for expMonth.
         * @return Builder
         */
        public Builder expMonth(Long expMonth) {
            this.expMonth = expMonth;
            return this;
        }

        /**
         * Setter for expYear.
         * @param expYear Long value for expYear.
         * @return Builder
         */
        public Builder expYear(Long expYear) {
            this.expYear = expYear;
            return this;
        }

        /**
         * Setter for cardholderName.
         * @param cardholderName String value for cardholderName.
         * @return Builder
         */
        public Builder cardholderName(String cardholderName) {
            this.cardholderName = cardholderName;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param billingAddress Address value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(Address billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for fingerprint.
         * @param fingerprint String value for fingerprint.
         * @return Builder
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * Setter for cardType.
         * @param cardType String value for cardType.
         * @return Builder
         */
        public Builder cardType(String cardType) {
            this.cardType = cardType;
            return this;
        }

        /**
         * Setter for prepaidType.
         * @param prepaidType String value for prepaidType.
         * @return Builder
         */
        public Builder prepaidType(String prepaidType) {
            this.prepaidType = prepaidType;
            return this;
        }

        /**
         * Setter for bin.
         * @param bin String value for bin.
         * @return Builder
         */
        public Builder bin(String bin) {
            this.bin = bin;
            return this;
        }

        /**
         * Builds a new {@link Card} object using the set fields.
         * @return {@link Card}
         */
        public Card build() {
            return new Card(id, cardBrand, last4, expMonth, expYear, cardholderName, billingAddress,
                    fingerprint, cardType, prepaidType, bin);
        }
    }
}
