
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for CreateCustomerCardRequest type.
 */
public class CreateCustomerCardRequest {
    private final String cardNonce;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Address billingAddress;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String cardholderName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String verificationToken;

    /**
     * Initialization constructor.
     * @param  cardNonce  String value for cardNonce.
     * @param  billingAddress  Address value for billingAddress.
     * @param  cardholderName  String value for cardholderName.
     * @param  verificationToken  String value for verificationToken.
     */
    @JsonCreator
    public CreateCustomerCardRequest(
            @JsonProperty("card_nonce") String cardNonce,
            @JsonProperty("billing_address") Address billingAddress,
            @JsonProperty("cardholder_name") String cardholderName,
            @JsonProperty("verification_token") String verificationToken) {
        this.cardNonce = cardNonce;
        this.billingAddress = billingAddress;
        this.cardholderName = cardholderName;
        this.verificationToken = verificationToken;
    }

    /**
     * Getter for CardNonce.
     * A card nonce representing the credit card to link to the customer. Card nonces are generated
     * by the Square payment form when customers enter their card information. For more information,
     * see [Walkthrough: Integrate Square Payments in a
     * Website](https://developer.squareup.com/docs/web-payments/take-card-payment). __NOTE:__ Card
     * nonces generated by digital wallets (such as Apple Pay) cannot be used to create a customer
     * card.
     * @return Returns the String
     */
    @JsonGetter("card_nonce")
    public String getCardNonce() {
        return cardNonce;
    }

    /**
     * Getter for BillingAddress.
     * Represents a physical address.
     * @return Returns the Address
     */
    @JsonGetter("billing_address")
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Getter for CardholderName.
     * The full name printed on the credit card.
     * @return Returns the String
     */
    @JsonGetter("cardholder_name")
    public String getCardholderName() {
        return cardholderName;
    }

    /**
     * Getter for VerificationToken.
     * An identifying token generated by
     * [Payments.verifyBuyer()](https://developer.squareup.com/reference/sdks/web/payments/objects/Payments#Payments.verifyBuyer).
     * Verification tokens encapsulate customer device information and 3-D Secure challenge results
     * to indicate that Square has verified the buyer identity.
     * @return Returns the String
     */
    @JsonGetter("verification_token")
    public String getVerificationToken() {
        return verificationToken;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cardNonce, billingAddress, cardholderName, verificationToken);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CreateCustomerCardRequest)) {
            return false;
        }
        CreateCustomerCardRequest other = (CreateCustomerCardRequest) obj;
        return Objects.equals(cardNonce, other.cardNonce)
            && Objects.equals(billingAddress, other.billingAddress)
            && Objects.equals(cardholderName, other.cardholderName)
            && Objects.equals(verificationToken, other.verificationToken);
    }

    /**
     * Converts this CreateCustomerCardRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CreateCustomerCardRequest [" + "cardNonce=" + cardNonce + ", billingAddress="
                + billingAddress + ", cardholderName=" + cardholderName + ", verificationToken="
                + verificationToken + "]";
    }

    /**
     * Builds a new {@link CreateCustomerCardRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CreateCustomerCardRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(cardNonce)
                .billingAddress(getBillingAddress())
                .cardholderName(getCardholderName())
                .verificationToken(getVerificationToken());
        return builder;
    }

    /**
     * Class to build instances of {@link CreateCustomerCardRequest}.
     */
    public static class Builder {
        private String cardNonce;
        private Address billingAddress;
        private String cardholderName;
        private String verificationToken;

        /**
         * Initialization constructor.
         * @param  cardNonce  String value for cardNonce.
         */
        public Builder(String cardNonce) {
            this.cardNonce = cardNonce;
        }

        /**
         * Setter for cardNonce.
         * @param  cardNonce  String value for cardNonce.
         * @return Builder
         */
        public Builder cardNonce(String cardNonce) {
            this.cardNonce = cardNonce;
            return this;
        }

        /**
         * Setter for billingAddress.
         * @param  billingAddress  Address value for billingAddress.
         * @return Builder
         */
        public Builder billingAddress(Address billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        /**
         * Setter for cardholderName.
         * @param  cardholderName  String value for cardholderName.
         * @return Builder
         */
        public Builder cardholderName(String cardholderName) {
            this.cardholderName = cardholderName;
            return this;
        }

        /**
         * Setter for verificationToken.
         * @param  verificationToken  String value for verificationToken.
         * @return Builder
         */
        public Builder verificationToken(String verificationToken) {
            this.verificationToken = verificationToken;
            return this;
        }

        /**
         * Builds a new {@link CreateCustomerCardRequest} object using the set fields.
         * @return {@link CreateCustomerCardRequest}
         */
        public CreateCustomerCardRequest build() {
            return new CreateCustomerCardRequest(cardNonce, billingAddress, cardholderName,
                    verificationToken);
        }
    }
}
