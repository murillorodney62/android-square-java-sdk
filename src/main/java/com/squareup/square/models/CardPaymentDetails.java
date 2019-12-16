package com.squareup.square.models;

import java.util.Objects;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonGetter;

public class CardPaymentDetails {

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
        this.errors = errors;
    }

    private final String status;
    private final Card card;
    private final String entryMethod;
    private final String cvvStatus;
    private final String avsStatus;
    private final String authResultCode;
    private final String applicationIdentifier;
    private final String applicationName;
    private final String applicationCryptogram;
    private final String verificationMethod;
    private final String verificationResults;
    private final String statementDescription;
    private final DeviceDetails deviceDetails;
    private final List<Error> errors;

    @Override
    public int hashCode() {
        return Objects.hash(status, card, entryMethod, cvvStatus, avsStatus, authResultCode, applicationIdentifier, applicationName, applicationCryptogram, verificationMethod, verificationResults, statementDescription, deviceDetails, errors);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof CardPaymentDetails)) {
            return false;
        }
        CardPaymentDetails cardPaymentDetails = (CardPaymentDetails) o;
        return Objects.equals(status, cardPaymentDetails.status) &&
            Objects.equals(card, cardPaymentDetails.card) &&
            Objects.equals(entryMethod, cardPaymentDetails.entryMethod) &&
            Objects.equals(cvvStatus, cardPaymentDetails.cvvStatus) &&
            Objects.equals(avsStatus, cardPaymentDetails.avsStatus) &&
            Objects.equals(authResultCode, cardPaymentDetails.authResultCode) &&
            Objects.equals(applicationIdentifier, cardPaymentDetails.applicationIdentifier) &&
            Objects.equals(applicationName, cardPaymentDetails.applicationName) &&
            Objects.equals(applicationCryptogram, cardPaymentDetails.applicationCryptogram) &&
            Objects.equals(verificationMethod, cardPaymentDetails.verificationMethod) &&
            Objects.equals(verificationResults, cardPaymentDetails.verificationResults) &&
            Objects.equals(statementDescription, cardPaymentDetails.statementDescription) &&
            Objects.equals(deviceDetails, cardPaymentDetails.deviceDetails) &&
            Objects.equals(errors, cardPaymentDetails.errors);
    }

    /**
     * Getter for Status.
     * The card payment's current state. It can be one of: `AUTHORIZED`, `CAPTURED`, `VOIDED`,
     * `FAILED`.
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
     * The method used to enter the card's details for the payment.  Can be
     * `KEYED`, `SWIPED`, `EMV`, `ON_FILE`, or `CONTACTLESS`.
     */
    @JsonGetter("entry_method")
    public String getEntryMethod() { 
        return this.entryMethod;
    }

    /**
     * Getter for CvvStatus.
     * Status code returned from the Card Verification Value (CVV) check. Can be
     * `CVV_ACCEPTED`, `CVV_REJECTED`, `CVV_NOT_CHECKED`.
     */
    @JsonGetter("cvv_status")
    public String getCvvStatus() { 
        return this.cvvStatus;
    }

    /**
     * Getter for AvsStatus.
     * Status code returned from the Address Verification System (AVS) check. Can be
     * `AVS_ACCEPTED`, `AVS_REJECTED`, `AVS_NOT_CHECKED`.
     */
    @JsonGetter("avs_status")
    public String getAvsStatus() { 
        return this.avsStatus;
    }

    /**
     * Getter for AuthResultCode.
     * Status code returned by the card issuer that describes the payment's
     * authorization status.
     */
    @JsonGetter("auth_result_code")
    public String getAuthResultCode() { 
        return this.authResultCode;
    }

    /**
     * Getter for ApplicationIdentifier.
     * For EMV payments, identifies the EMV application used for the payment.
     */
    @JsonGetter("application_identifier")
    public String getApplicationIdentifier() { 
        return this.applicationIdentifier;
    }

    /**
     * Getter for ApplicationName.
     * For EMV payments, the human-readable name of the EMV application used for the payment.
     */
    @JsonGetter("application_name")
    public String getApplicationName() { 
        return this.applicationName;
    }

    /**
     * Getter for ApplicationCryptogram.
     * For EMV payments, the cryptogram generated for the payment.
     */
    @JsonGetter("application_cryptogram")
    public String getApplicationCryptogram() { 
        return this.applicationCryptogram;
    }

    /**
     * Getter for VerificationMethod.
     * For EMV payments, method used to verify the cardholder's identity.  Can be one of
     * `PIN`, `SIGNATURE`, `PIN_AND_SIGNATURE`, `ON_DEVICE`, or `NONE`.
     */
    @JsonGetter("verification_method")
    public String getVerificationMethod() { 
        return this.verificationMethod;
    }

    /**
     * Getter for VerificationResults.
     * For EMV payments, the results of the cardholder verification.  Can be one of
     * `SUCCESS`, `FAILURE`, or `UNKNOWN`.
     */
    @JsonGetter("verification_results")
    public String getVerificationResults() { 
        return this.verificationResults;
    }

    /**
     * Getter for StatementDescription.
     * The statement description sent to the card networks.
     * Note: The actual statement description will vary and is likely to be truncated and appended with
     * additional information on a per issuer basis.
     */
    @JsonGetter("statement_description")
    public String getStatementDescription() { 
        return this.statementDescription;
    }

    /**
     * Getter for DeviceDetails.
     * Details about the device that took the payment.
     */
    @JsonGetter("device_details")
    public DeviceDetails getDeviceDetails() { 
        return this.deviceDetails;
    }

    /**
     * Getter for Errors.
     * Information on errors encountered during the request.
     */
    @JsonGetter("errors")
    public List<Error> getErrors() { 
        return this.errors;
    }

 
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
            .errors(getErrors());
            return builder;
    }

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
        private List<Error> errors;

        public Builder() { }

        public Builder status(String value) {
            status = value;
            return this;
        }
        public Builder card(Card value) {
            card = value;
            return this;
        }
        public Builder entryMethod(String value) {
            entryMethod = value;
            return this;
        }
        public Builder cvvStatus(String value) {
            cvvStatus = value;
            return this;
        }
        public Builder avsStatus(String value) {
            avsStatus = value;
            return this;
        }
        public Builder authResultCode(String value) {
            authResultCode = value;
            return this;
        }
        public Builder applicationIdentifier(String value) {
            applicationIdentifier = value;
            return this;
        }
        public Builder applicationName(String value) {
            applicationName = value;
            return this;
        }
        public Builder applicationCryptogram(String value) {
            applicationCryptogram = value;
            return this;
        }
        public Builder verificationMethod(String value) {
            verificationMethod = value;
            return this;
        }
        public Builder verificationResults(String value) {
            verificationResults = value;
            return this;
        }
        public Builder statementDescription(String value) {
            statementDescription = value;
            return this;
        }
        public Builder deviceDetails(DeviceDetails value) {
            deviceDetails = value;
            return this;
        }
        public Builder errors(List<Error> value) {
            errors = value;
            return this;
        }

        public CardPaymentDetails build() {
            return new CardPaymentDetails(status,
                card,
                entryMethod,
                cvvStatus,
                avsStatus,
                authResultCode,
                applicationIdentifier,
                applicationName,
                applicationCryptogram,
                verificationMethod,
                verificationResults,
                statementDescription,
                deviceDetails,
                errors);
        }
    }
}
