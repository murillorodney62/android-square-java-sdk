
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for TerminalCheckout type.
 */
public class TerminalCheckout {
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String id;
    private final Money amountMoney;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String referenceId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String note;
    private final DeviceCheckoutOptions deviceOptions;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String deadlineDuration;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String status;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String cancelReason;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final List<String> paymentIds;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String createdAt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String updatedAt;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String appId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String locationId;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String paymentType;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private final String customerId;

    /**
     * Initialization constructor.
     * @param  amountMoney  Money value for amountMoney.
     * @param  deviceOptions  DeviceCheckoutOptions value for deviceOptions.
     * @param  id  String value for id.
     * @param  referenceId  String value for referenceId.
     * @param  note  String value for note.
     * @param  deadlineDuration  String value for deadlineDuration.
     * @param  status  String value for status.
     * @param  cancelReason  String value for cancelReason.
     * @param  paymentIds  List of String value for paymentIds.
     * @param  createdAt  String value for createdAt.
     * @param  updatedAt  String value for updatedAt.
     * @param  appId  String value for appId.
     * @param  locationId  String value for locationId.
     * @param  paymentType  String value for paymentType.
     * @param  customerId  String value for customerId.
     */
    @JsonCreator
    public TerminalCheckout(
            @JsonProperty("amount_money") Money amountMoney,
            @JsonProperty("device_options") DeviceCheckoutOptions deviceOptions,
            @JsonProperty("id") String id,
            @JsonProperty("reference_id") String referenceId,
            @JsonProperty("note") String note,
            @JsonProperty("deadline_duration") String deadlineDuration,
            @JsonProperty("status") String status,
            @JsonProperty("cancel_reason") String cancelReason,
            @JsonProperty("payment_ids") List<String> paymentIds,
            @JsonProperty("created_at") String createdAt,
            @JsonProperty("updated_at") String updatedAt,
            @JsonProperty("app_id") String appId,
            @JsonProperty("location_id") String locationId,
            @JsonProperty("payment_type") String paymentType,
            @JsonProperty("customer_id") String customerId) {
        this.id = id;
        this.amountMoney = amountMoney;
        this.referenceId = referenceId;
        this.note = note;
        this.deviceOptions = deviceOptions;
        this.deadlineDuration = deadlineDuration;
        this.status = status;
        this.cancelReason = cancelReason;
        this.paymentIds = paymentIds;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.appId = appId;
        this.locationId = locationId;
        this.paymentType = paymentType;
        this.customerId = customerId;
    }

    /**
     * Getter for Id.
     * A unique ID for this `TerminalCheckout`.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return id;
    }

    /**
     * Getter for AmountMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not
     * explicitly define whether they are signed or unsigned are considered unsigned and can only
     * hold positive amounts. For signed fields, the sign of the value indicates the purpose of the
     * money transfer. See [Working with Monetary
     * Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for
     * more information.
     * @return Returns the Money
     */
    @JsonGetter("amount_money")
    public Money getAmountMoney() {
        return amountMoney;
    }

    /**
     * Getter for ReferenceId.
     * An optional user-defined reference ID that can be used to associate this `TerminalCheckout`
     * to another entity in an external system. For example, an order ID generated by a third-party
     * shopping cart. The ID is also associated with any payments used to complete the checkout.
     * @return Returns the String
     */
    @JsonGetter("reference_id")
    public String getReferenceId() {
        return referenceId;
    }

    /**
     * Getter for Note.
     * An optional note to associate with the checkout, as well as with any payments used to
     * complete the checkout.
     * @return Returns the String
     */
    @JsonGetter("note")
    public String getNote() {
        return note;
    }

    /**
     * Getter for DeviceOptions.
     * @return Returns the DeviceCheckoutOptions
     */
    @JsonGetter("device_options")
    public DeviceCheckoutOptions getDeviceOptions() {
        return deviceOptions;
    }

    /**
     * Getter for DeadlineDuration.
     * An RFC 3339 duration, after which the checkout is automatically canceled. A
     * `TerminalCheckout` that is `PENDING` is automatically `CANCELED` and has a cancellation
     * reason of `TIMED_OUT`. Default: 5 minutes from creation Maximum: 5 minutes
     * @return Returns the String
     */
    @JsonGetter("deadline_duration")
    public String getDeadlineDuration() {
        return deadlineDuration;
    }

    /**
     * Getter for Status.
     * The status of the `TerminalCheckout`. Options: `PENDING`, `IN_PROGRESS`, `CANCEL_REQUESTED`,
     * `CANCELED`, `COMPLETED`
     * @return Returns the String
     */
    @JsonGetter("status")
    public String getStatus() {
        return status;
    }

    /**
     * Getter for CancelReason.
     * @return Returns the String
     */
    @JsonGetter("cancel_reason")
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * Getter for PaymentIds.
     * A list of IDs for payments created by this `TerminalCheckout`.
     * @return Returns the List of String
     */
    @JsonGetter("payment_ids")
    public List<String> getPaymentIds() {
        return paymentIds;
    }

    /**
     * Getter for CreatedAt.
     * The time when the `TerminalCheckout` was created, as an RFC 3339 timestamp.
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * The time when the `TerminalCheckout` was last updated, as an RFC 3339 timestamp.
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Getter for AppId.
     * The ID of the application that created the checkout.
     * @return Returns the String
     */
    @JsonGetter("app_id")
    public String getAppId() {
        return appId;
    }

    /**
     * Getter for LocationId.
     * The location of the device where the `TerminalCheckout` was directed.
     * @return Returns the String
     */
    @JsonGetter("location_id")
    public String getLocationId() {
        return locationId;
    }

    /**
     * Getter for PaymentType.
     * @return Returns the String
     */
    @JsonGetter("payment_type")
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Getter for CustomerId.
     * An optional ID of the customer associated with the checkout.
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    public String getCustomerId() {
        return customerId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amountMoney, referenceId, note, deviceOptions, deadlineDuration,
                status, cancelReason, paymentIds, createdAt, updatedAt, appId, locationId,
                paymentType, customerId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TerminalCheckout)) {
            return false;
        }
        TerminalCheckout other = (TerminalCheckout) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(amountMoney, other.amountMoney)
            && Objects.equals(referenceId, other.referenceId)
            && Objects.equals(note, other.note)
            && Objects.equals(deviceOptions, other.deviceOptions)
            && Objects.equals(deadlineDuration, other.deadlineDuration)
            && Objects.equals(status, other.status)
            && Objects.equals(cancelReason, other.cancelReason)
            && Objects.equals(paymentIds, other.paymentIds)
            && Objects.equals(createdAt, other.createdAt)
            && Objects.equals(updatedAt, other.updatedAt)
            && Objects.equals(appId, other.appId)
            && Objects.equals(locationId, other.locationId)
            && Objects.equals(paymentType, other.paymentType)
            && Objects.equals(customerId, other.customerId);
    }

    /**
     * Converts this TerminalCheckout into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TerminalCheckout [" + "amountMoney=" + amountMoney + ", deviceOptions="
                + deviceOptions + ", id=" + id + ", referenceId=" + referenceId + ", note=" + note
                + ", deadlineDuration=" + deadlineDuration + ", status=" + status
                + ", cancelReason=" + cancelReason + ", paymentIds=" + paymentIds + ", createdAt="
                + createdAt + ", updatedAt=" + updatedAt + ", appId=" + appId + ", locationId="
                + locationId + ", paymentType=" + paymentType + ", customerId=" + customerId + "]";
    }

    /**
     * Builds a new {@link TerminalCheckout.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TerminalCheckout.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(amountMoney, deviceOptions)
                .id(getId())
                .referenceId(getReferenceId())
                .note(getNote())
                .deadlineDuration(getDeadlineDuration())
                .status(getStatus())
                .cancelReason(getCancelReason())
                .paymentIds(getPaymentIds())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .appId(getAppId())
                .locationId(getLocationId())
                .paymentType(getPaymentType())
                .customerId(getCustomerId());
        return builder;
    }

    /**
     * Class to build instances of {@link TerminalCheckout}.
     */
    public static class Builder {
        private Money amountMoney;
        private DeviceCheckoutOptions deviceOptions;
        private String id;
        private String referenceId;
        private String note;
        private String deadlineDuration;
        private String status;
        private String cancelReason;
        private List<String> paymentIds;
        private String createdAt;
        private String updatedAt;
        private String appId;
        private String locationId;
        private String paymentType;
        private String customerId;

        /**
         * Initialization constructor.
         * @param  amountMoney  Money value for amountMoney.
         * @param  deviceOptions  DeviceCheckoutOptions value for deviceOptions.
         */
        public Builder(Money amountMoney, DeviceCheckoutOptions deviceOptions) {
            this.amountMoney = amountMoney;
            this.deviceOptions = deviceOptions;
        }

        /**
         * Setter for amountMoney.
         * @param  amountMoney  Money value for amountMoney.
         * @return Builder
         */
        public Builder amountMoney(Money amountMoney) {
            this.amountMoney = amountMoney;
            return this;
        }

        /**
         * Setter for deviceOptions.
         * @param  deviceOptions  DeviceCheckoutOptions value for deviceOptions.
         * @return Builder
         */
        public Builder deviceOptions(DeviceCheckoutOptions deviceOptions) {
            this.deviceOptions = deviceOptions;
            return this;
        }

        /**
         * Setter for id.
         * @param  id  String value for id.
         * @return Builder
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for referenceId.
         * @param  referenceId  String value for referenceId.
         * @return Builder
         */
        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
         * Setter for note.
         * @param  note  String value for note.
         * @return Builder
         */
        public Builder note(String note) {
            this.note = note;
            return this;
        }

        /**
         * Setter for deadlineDuration.
         * @param  deadlineDuration  String value for deadlineDuration.
         * @return Builder
         */
        public Builder deadlineDuration(String deadlineDuration) {
            this.deadlineDuration = deadlineDuration;
            return this;
        }

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
         * Setter for cancelReason.
         * @param  cancelReason  String value for cancelReason.
         * @return Builder
         */
        public Builder cancelReason(String cancelReason) {
            this.cancelReason = cancelReason;
            return this;
        }

        /**
         * Setter for paymentIds.
         * @param  paymentIds  List of String value for paymentIds.
         * @return Builder
         */
        public Builder paymentIds(List<String> paymentIds) {
            this.paymentIds = paymentIds;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param  createdAt  String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param  updatedAt  String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for appId.
         * @param  appId  String value for appId.
         * @return Builder
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Setter for locationId.
         * @param  locationId  String value for locationId.
         * @return Builder
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

        /**
         * Setter for paymentType.
         * @param  paymentType  String value for paymentType.
         * @return Builder
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Setter for customerId.
         * @param  customerId  String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Builds a new {@link TerminalCheckout} object using the set fields.
         * @return {@link TerminalCheckout}
         */
        public TerminalCheckout build() {
            return new TerminalCheckout(amountMoney, deviceOptions, id, referenceId, note,
                    deadlineDuration, status, cancelReason, paymentIds, createdAt, updatedAt, appId,
                    locationId, paymentType, customerId);
        }
    }
}
