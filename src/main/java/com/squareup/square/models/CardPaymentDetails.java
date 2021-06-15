
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for CardPaymentDetails type.
 */
public class CardPaymentDetails {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Card card;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String entryMethod;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String cvvStatus;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String avsStatus;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String authResultCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String applicationIdentifier;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String applicationName;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String applicationCryptogram;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String verificationMethod;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String verificationResults;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String statementDescription;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final DeviceDetails deviceDetails;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final CardPaymentTimeline cardPaymentTimeline;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final Boolean refundRequiresCardPresence;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final List<Error> errors;

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     * @param  card  Card value for card.
     * @param  entryMethod  String value for entryMethod.
     * @param  cvvStatus  String value for cvvStatus.
     * @param  avsStatus  String value for avsStatus.
     * @param  authResultCode  String value for authResultCode.
     * @param  applicationIdentifier  String value for applicationIdentifier.
     * @param  applicationName  String value for applicationName.
     * @param  applicationCryptogram  String value for applicationCryptogram.
     * @param  verificationMethod  String value for verificationMethod.
     * @param  verificationResults  String value for verificationResults.
     * @param  statementDescription  String value for statementDescription.
     * @param  deviceDetails  DeviceDetails value for deviceDetails.
     * @param  cardPaymentTimeline  CardPaymentTimeline value for cardPaymentTimeline.
     * @param  refundRequiresCardPresence  Boolean value for refundRequiresCardPresence.
     * @param  errors  List of Error value for errors.
     */
    @JsonCreator
    public CardPaymentDetails(
            @JsonProperty("status") String status,
            @JsonProperty("card") Card card,
            @JsonProperty("entry_method") String entryMethod,
            @JsonProperty("cvv_status") String cvvStatus,
            @JsonProperty("avs_status") String avsStatus,
            @JsonProperty("auth_result_code") String authResultCode,
            @JsonProperty("application_identifier") String applicationIdentifier,
            @JsonProperty("application_name") String applicationName,
            @JsonProperty("application_cryptogram") String applicationCryptogram,
            @JsonProperty("verification_method") String verificationMethod,
            @JsonProperty("verification_results") String verificationResults,
            @JsonProperty("statement_description") String statementDescription,
            @JsonProperty("device_details") DeviceDetails deviceDetails,
            @JsonProperty("card_payment_timeline") CardPaymentTimeline cardPaymentTimeline,
            @JsonProperty("refund_requires_card_presence") Boolean refundRequiresCardPresence,
            @JsonProperty("errors") List<Error> errors) {
        this.status = status;
        this.card = card;
        this.entryMethod = entryMethod;
        this.cvvStatus = cvvStatus;
        this.avsStatus = avsStatus;
        this.authResultCode = authResultCode;
        this.applicationIdentifier = applicationIdentifier;
        this.applicationName = applicationName;
        this.applicationCryptogram = applicationCryptogram;
        this.verificationMethod = verificationMethod;
        this.verificationResults = verificationResults;
        this.statementDescription = statementDescription;
        this.deviceDetails = deviceDetails;
        this.cardPaymentTimeline = cardPaymentTimeline;
        this.refundRequiresCardPresence = refundRequiresCardPresence;
        this.errors = errors;
    }

    /**
     * Getter for Status.
     * The card payment's current state. The state can be AUTHORIZED, CAPTURED, VOIDED, or FAILED.
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Getter for Card.
     * Represents the payment details of a card to be used for payments. These details are
     * determined by the payment token generated by Web Payments SDK.
     * @return Returns the Card
     */
    @JsonGetter("card")
    public Card getCard() {
        return card;
    }

    /**
     * Getter for EntryMethod.
     * The method used to enter the card's details for the payment. The method can be `KEYED`,
     * `SWIPED`, `EMV`, `ON_FILE`, or `CONTACTLESS`.
     * @return Returns the String
     */
    @JsonGetter("entry_method")
    public String getEntryMethod() {
        return entryMethod;
    }

    /**
     * Getter for CvvStatus.
     * The status code returned from the Card Verification Value (CVV) check. The code can be
     * `CVV_ACCEPTED`, `CVV_REJECTED`, or `CVV_NOT_CHECKED`.
     * @return Returns the String
     */
    @JsonGetter("cvv_status")
    public String getCvvStatus() {
        return cvvStatus;
    }

    /**
     * Getter for AvsStatus.
     * The status code returned from the Address Verification System (AVS) check. The code can be
     * `AVS_ACCEPTED`, `AVS_REJECTED`, or `AVS_NOT_CHECKED`.
     * @return Returns the String
     */
    @JsonGetter("avs_status")
    public String getAvsStatus() {
        return avsStatus;
    }

    /**
     * Getter for AuthResultCode.
     * The status code returned by the card issuer that describes the payment's authorization
     * status.
     * @return Returns the String
     */
    @JsonGetter("auth_result_code")
    public String getAuthResultCode() {
        return authResultCode;
    }

    /**
     * Getter for ApplicationIdentifier.
     * For EMV payments, the application ID identifies the EMV application used for the payment.
     * @return Returns the String
     */
    @JsonGetter("application_identifier")
    public String getApplicationIdentifier() {
        return applicationIdentifier;
    }

    /**
     * Getter for ApplicationName.
     * For EMV payments, the human-readable name of the EMV application used for the payment.
     * @return Returns the String
     */
    @JsonGetter("application_name")
    public String getApplicationName() {
        return applicationName;
    }

    /**
     * Getter for ApplicationCryptogram.
     * For EMV payments, the cryptogram generated for the payment.
     * @return Returns the String
     */
    @JsonGetter("application_cryptogram")
    public String getApplicationCryptogram() {
        return applicationCryptogram;
    }

    /**
     * Getter for VerificationMethod.
     * For EMV payments, the method used to verify the cardholder's identity. The method can be
     * `PIN`, `SIGNATURE`, `PIN_AND_SIGNATURE`, `ON_DEVICE`, or `NONE`.
     * @return Returns the String
     */
    @JsonGetter("verification_method")
    public String getVerificationMethod() {
        return verificationMethod;
    }

    /**
     * Getter for VerificationResults.
     * For EMV payments, the results of the cardholder verification. The result can be `SUCCESS`,
     * `FAILURE`, or `UNKNOWN`.
     * @return Returns the String
     */
    @JsonGetter("verification_results")
    public String getVerificationResults() {
        return verificationResults;
    }

    /**
     * Getter for StatementDescription.
     * The statement description sent to the card networks. Note: The actual statement description
     * varies and is likely to be truncated and appended with additional information on a per issuer
     * basis.
     * @return Returns the String
     */
    @JsonGetter("statement_description")
    public String getStatementDescription() {
        return statementDescription;
    }

    /**
     * Getter for DeviceDetails.
     * Details about the device that took the payment.
     * @return Returns the DeviceDetails
     */
    @JsonGetter("device_details")
    public DeviceDetails getDeviceDetails() {
        return deviceDetails;
    }

    /**
     * Getter for CardPaymentTimeline.
     * The timeline for card payments.
     * @return Returns the CardPaymentTimeline
     */
    @JsonGetter("card_payment_timeline")
    public CardPaymentTimeline getCardPaymentTimeline() {
        return cardPaymentTimeline;
    }

    /**
     * Getter for RefundRequiresCardPresence.
     * Whether the card must be physically present for the payment to be refunded. If set to `true`,
     * the card must be present.
     * @return Returns the Boolean
     */
    @JsonGetter("refund_requires_card_presence")
    public Boolean getRefundRequiresCardPresence() {
        return refundRequiresCardPresence;
    }

    /**
     * Getter for Errors.
     * Information about errors encountered during the request.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    public List<Error> getErrors() {
        return errors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, card, entryMethod, cvvStatus, avsStatus, authResultCode,
                applicationIdentifier, applicationName, applicationCryptogram, verificationMethod,
                verificationResults, statementDescription, deviceDetails, cardPaymentTimeline,
                refundRequiresCardPresence, errors);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CardPaymentDetails)) {
            return false;
        }
        CardPaymentDetails other = (CardPaymentDetails) obj;
        return Objects.equals(status, other.status)
            && Objects.equals(card, other.card)
            && Objects.equals(entryMethod, other.entryMethod)
            && Objects.equals(cvvStatus, other.cvvStatus)
            && Objects.equals(avsStatus, other.avsStatus)
            && Objects.equals(authResultCode, other.authResultCode)
            && Objects.equals(applicationIdentifier, other.applicationIdentifier)
            && Objects.equals(applicationName, other.applicationName)
            && Objects.equals(applicationCryptogram, other.applicationCryptogram)
            && Objects.equals(verificationMethod, other.verificationMethod)
            && Objects.equals(verificationResults, other.verificationResults)
            && Objects.equals(statementDescription, other.statementDescription)
            && Objects.equals(deviceDetails, other.deviceDetails)
            && Objects.equals(cardPaymentTimeline, other.cardPaymentTimeline)
            && Objects.equals(refundRequiresCardPresence, other.refundRequiresCardPresence)
            && Objects.equals(errors, other.errors);
    }

    /**
     * Converts this CardPaymentDetails into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardPaymentDetails [" + "status=" + status + ", card=" + card + ", entryMethod="
                + entryMethod + ", cvvStatus=" + cvvStatus + ", avsStatus=" + avsStatus
                + ", authResultCode=" + authResultCode + ", applicationIdentifier="
                + applicationIdentifier + ", applicationName=" + applicationName
                + ", applicationCryptogram=" + applicationCryptogram + ", verificationMethod="
                + verificationMethod + ", verificationResults=" + verificationResults
                + ", statementDescription=" + statementDescription + ", deviceDetails="
                + deviceDetails + ", cardPaymentTimeline=" + cardPaymentTimeline
                + ", refundRequiresCardPresence=" + refundRequiresCardPresence + ", errors="
                + errors + "]";
    }

    /**
     * Builds a new {@link CardPaymentDetails.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardPaymentDetails.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .status(getStatus())
                .card(getCard())
                .entryMethod(getEntryMethod())
                .cvvStatus(getCvvStatus())
                .avsStatus(getAvsStatus())
                .authResultCode(getAuthResultCode())
                .applicationIdentifier(getApplicationIdentifier())
                .applicationName(getApplicationName())
                .applicationCryptogram(getApplicationCryptogram())
                .verificationMethod(getVerificationMethod())
                .verificationResults(getVerificationResults())
                .statementDescription(getStatementDescription())
                .deviceDetails(getDeviceDetails())
                .cardPaymentTimeline(getCardPaymentTimeline())
                .refundRequiresCardPresence(getRefundRequiresCardPresence())
                .errors(getErrors());
        return builder;
    }

    /**
     * Class to build instances of {@link CardPaymentDetails}.
     */
    public static class Builder {
        private String status;
        private Card card;
        private String entryMethod;
        private String cvvStatus;
        private String avsStatus;
        private String authResultCode;
        private String applicationIdentifier;
        private String applicationName;
        private String applicationCryptogram;
        private String verificationMethod;
        private String verificationResults;
        private String statementDescription;
        private DeviceDetails deviceDetails;
        private CardPaymentTimeline cardPaymentTimeline;
        private Boolean refundRequiresCardPresence;
        private List<Error> errors;



        /**
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for card.
         * @param  card  Card value for card.
         * @return Builder
         */
        public Builder card(Card card) {
            this.card = card;
            return this;
        }

        /**
         * Setter for entryMethod.
         * @param  entryMethod  String value for entryMethod.
         * @return Builder
         */
        public Builder entryMethod(String entryMethod) {
            this.entryMethod = entryMethod;
            return this;
        }

        /**
         * Setter for cvvStatus.
         * @param  cvvStatus  String value for cvvStatus.
         * @return Builder
         */
        public Builder cvvStatus(String cvvStatus) {
            this.cvvStatus = cvvStatus;
            return this;
        }

        /**
         * Setter for avsStatus.
         * @param  avsStatus  String value for avsStatus.
         * @return Builder
         */
        public Builder avsStatus(String avsStatus) {
            this.avsStatus = avsStatus;
            return this;
        }

        /**
         * Setter for authResultCode.
         * @param  authResultCode  String value for authResultCode.
         * @return Builder
         */
        public Builder authResultCode(String authResultCode) {
            this.authResultCode = authResultCode;
            return this;
        }

        /**
         * Setter for applicationIdentifier.
         * @param  applicationIdentifier  String value for applicationIdentifier.
         * @return Builder
         */
        public Builder applicationIdentifier(String applicationIdentifier) {
            this.applicationIdentifier = applicationIdentifier;
            return this;
        }

        /**
         * Setter for applicationName.
         * @param  applicationName  String value for applicationName.
         * @return Builder
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }

        /**
         * Setter for applicationCryptogram.
         * @param  applicationCryptogram  String value for applicationCryptogram.
         * @return Builder
         */
        public Builder applicationCryptogram(String applicationCryptogram) {
            this.applicationCryptogram = applicationCryptogram;
            return this;
        }

        /**
         * Setter for verificationMethod.
         * @param  verificationMethod  String value for verificationMethod.
         * @return Builder
         */
        public Builder verificationMethod(String verificationMethod) {
            this.verificationMethod = verificationMethod;
            return this;
        }

        /**
         * Setter for verificationResults.
         * @param  verificationResults  String value for verificationResults.
         * @return Builder
         */
        public Builder verificationResults(String verificationResults) {
            this.verificationResults = verificationResults;
            return this;
        }

        /**
         * Setter for statementDescription.
         * @param  statementDescription  String value for statementDescription.
         * @return Builder
         */
        public Builder statementDescription(String statementDescription) {
            this.statementDescription = statementDescription;
            return this;
        }

        /**
         * Setter for deviceDetails.
         * @param  deviceDetails  DeviceDetails value for deviceDetails.
         * @return Builder
         */
        public Builder deviceDetails(DeviceDetails deviceDetails) {
            this.deviceDetails = deviceDetails;
            return this;
        }

        /**
         * Setter for cardPaymentTimeline.
         * @param  cardPaymentTimeline  CardPaymentTimeline value for cardPaymentTimeline.
         * @return Builder
         */
        public Builder cardPaymentTimeline(CardPaymentTimeline cardPaymentTimeline) {
            this.cardPaymentTimeline = cardPaymentTimeline;
            return this;
        }

        /**
         * Setter for refundRequiresCardPresence.
         * @param  refundRequiresCardPresence  Boolean value for refundRequiresCardPresence.
         * @return Builder
         */
        public Builder refundRequiresCardPresence(Boolean refundRequiresCardPresence) {
            this.refundRequiresCardPresence = refundRequiresCardPresence;
            return this;
        }

        /**
         * Setter for errors.
         * @param  errors  List of Error value for errors.
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link CardPaymentDetails} object using the set fields.
         * @return {@link CardPaymentDetails}
         */
        public CardPaymentDetails build() {
            return new CardPaymentDetails(status, card, entryMethod, cvvStatus, avsStatus,
                    authResultCode, applicationIdentifier, applicationName, applicationCryptogram,
                    verificationMethod, verificationResults, statementDescription, deviceDetails,
                    cardPaymentTimeline, refundRequiresCardPresence, errors);
        }
    }
}
