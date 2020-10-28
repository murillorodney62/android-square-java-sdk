
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


/**
 * This is a model class for TenderCardDetails type.
 */
public class TenderCardDetails {
    private final String status;
    private final Card card;
    private final String entryMethod;

    /**
     * Initialization constructor.
     * @param status String value for status.
     * @param card Card value for card.
     * @param entryMethod String value for entryMethod.
     */
    @JsonCreator
    public TenderCardDetails(
            @JsonProperty("status") String status,
            @JsonProperty("card") Card card,
            @JsonProperty("entry_method") String entryMethod) {
        this.status = status;
        this.card = card;
        this.entryMethod = entryMethod;
    }

    /**
     * Getter for Status.
     * Indicates the card transaction's current status.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return this.status;
    }

    /**
     * Getter for Card.
     * Represents the payment details of a card to be used for payments. These details are
     * determined by the `card_nonce` generated by `SqPaymentForm`.
     * @return Returns the Card
     */
    @JsonGetter("card")
    public Card getCard() {
        return this.card;
    }

    /**
     * Getter for EntryMethod.
     * Indicates the method used to enter the card's details.
     * @return Returns the String
     */
    @JsonGetter("entry_method")
    public String getEntryMethod() {
        return this.entryMethod;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(status, card, entryMethod);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TenderCardDetails)) {
            return false;
        }
        TenderCardDetails other = (TenderCardDetails) obj;
        return Objects.equals(status, other.status)
            && Objects.equals(card, other.card)
            && Objects.equals(entryMethod, other.entryMethod);
    }

    /**
     * Builds a new {@link TenderCardDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TenderCardDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .status(getStatus())
            .card(getCard())
            .entryMethod(getEntryMethod());
        return builder;
    }

    /**
     * Class to build instances of {@link TenderCardDetails}.
     */
    public static class Builder {
        private String status;
        private Card card;
        private String entryMethod;



        /**
         * Setter for status.
         * @param status String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for card.
         * @param card Card value for card.
         * @return Builder
         */
        public Builder card(Card card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for entryMethod.
         * @param entryMethod String value for entryMethod.
         * @return Builder
         */
        public Builder entryMethod(String entryMethod) {
            this.entryMethod = entryMethod;
            return this;
        }

        /**
         * Builds a new {@link TenderCardDetails} object using the set fields.
         * @return {@link TenderCardDetails}
         */
        public TenderCardDetails build() {
            return new TenderCardDetails(status,
                card,
                entryMethod);
        }
    }
}
