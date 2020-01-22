package com.squareup.square.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;


/**
 * This is a model class for TenderCardDetails type.
 */
public class TenderCardDetails {

    /**
     * Initialization constructor.
     * @param status
     * @param card
     * @param entryMethod
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

    private final String status;
    private final Card card;
    private final String entryMethod;
    /**
     * Getter for Status.
     * Indicates the card transaction's current status.
     */
    @JsonGetter("status")
    public String getStatus() {
        return this.status;
    }

    /**
     * Getter for Card.
     * Represents the payment details of a card to be used for payments. These
     * details are determined by the `card_nonce` generated by `SqPaymentForm`.
     */
    @JsonGetter("card")
    public Card getCard() {
        return this.card;
    }

    /**
     * Getter for EntryMethod.
     * Indicates the method used to enter the card's details.
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
        if(obj == this) {
            return true;
        }
        if(!(obj instanceof TenderCardDetails)) {
            return false;
        }
        TenderCardDetails tenderCardDetails = (TenderCardDetails) obj;
        return Objects.equals(status, tenderCardDetails.status) &&
            Objects.equals(card, tenderCardDetails.card) &&
            Objects.equals(entryMethod, tenderCardDetails.entryMethod);
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
     * Class to build instances of {@link TenderCardDetails}
     */
    public static class Builder {
        private String status;
        private Card card;
        private String entryMethod;

        /**
         * Initialization constructor
         */
        public Builder() {
           
        }

        /**
         * Setter for status
         * @param status
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }
        /**
         * Setter for card
         * @param card
         * @return Builder
         */
        public Builder card(Card card) {
            this.card = card;
            return this;
        }
        /**
         * Setter for entryMethod
         * @param entryMethod
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
