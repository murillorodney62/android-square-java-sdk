
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for OrderReturnDiscount type.
 */
public class OrderReturnDiscount {
    private final String uid;
    private final String sourceDiscountUid;
    private final String catalogObjectId;
    private final Long catalogVersion;
    private final String name;
    private final String type;
    private final String percentage;
    private final Money amountMoney;
    private final Money appliedMoney;
    private final String scope;

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  sourceDiscountUid  String value for sourceDiscountUid.
     * @param  catalogObjectId  String value for catalogObjectId.
     * @param  catalogVersion  Long value for catalogVersion.
     * @param  name  String value for name.
     * @param  type  String value for type.
     * @param  percentage  String value for percentage.
     * @param  amountMoney  Money value for amountMoney.
     * @param  appliedMoney  Money value for appliedMoney.
     * @param  scope  String value for scope.
     */
    @JsonCreator
    public OrderReturnDiscount(
            @JsonProperty("uid") String uid,
            @JsonProperty("source_discount_uid") String sourceDiscountUid,
            @JsonProperty("catalog_object_id") String catalogObjectId,
            @JsonProperty("catalog_version") Long catalogVersion,
            @JsonProperty("name") String name,
            @JsonProperty("type") String type,
            @JsonProperty("percentage") String percentage,
            @JsonProperty("amount_money") Money amountMoney,
            @JsonProperty("applied_money") Money appliedMoney,
            @JsonProperty("scope") String scope) {
        this.uid = uid;
        this.sourceDiscountUid = sourceDiscountUid;
        this.catalogObjectId = catalogObjectId;
        this.catalogVersion = catalogVersion;
        this.name = name;
        this.type = type;
        this.percentage = percentage;
        this.amountMoney = amountMoney;
        this.appliedMoney = appliedMoney;
        this.scope = scope;
    }

    /**
     * Getter for Uid.
     * A unique ID that identifies the returned discount only within this order.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Getter for SourceDiscountUid.
     * The discount `uid` from the order that contains the original application of this discount.
     * @return Returns the String
     */
    @JsonGetter("source_discount_uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceDiscountUid() {
        return sourceDiscountUid;
    }

    /**
     * Getter for CatalogObjectId.
     * The catalog object ID referencing [CatalogDiscount]($m/CatalogDiscount).
     * @return Returns the String
     */
    @JsonGetter("catalog_object_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCatalogObjectId() {
        return catalogObjectId;
    }

    /**
     * Getter for CatalogVersion.
     * The version of the catalog object that this discount references.
     * @return Returns the Long
     */
    @JsonGetter("catalog_version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Long getCatalogVersion() {
        return catalogVersion;
    }

    /**
     * Getter for Name.
     * The discount's name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Getter for Type.
     * Indicates how the discount is applied to the associated line item or order.
     * @return Returns the String
     */
    @JsonGetter("type")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getType() {
        return type;
    }

    /**
     * Getter for Percentage.
     * The percentage of the tax, as a string representation of a decimal number. A value of
     * `"7.25"` corresponds to a percentage of 7.25%. `percentage` is not set for amount-based
     * discounts.
     * @return Returns the String
     */
    @JsonGetter("percentage")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPercentage() {
        return percentage;
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getAmountMoney() {
        return amountMoney;
    }

    /**
     * Getter for AppliedMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not
     * explicitly define whether they are signed or unsigned are considered unsigned and can only
     * hold positive amounts. For signed fields, the sign of the value indicates the purpose of the
     * money transfer. See [Working with Monetary
     * Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for
     * more information.
     * @return Returns the Money
     */
    @JsonGetter("applied_money")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Money getAppliedMoney() {
        return appliedMoney;
    }

    /**
     * Getter for Scope.
     * Indicates whether this is a line-item or order-level discount.
     * @return Returns the String
     */
    @JsonGetter("scope")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getScope() {
        return scope;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, sourceDiscountUid, catalogObjectId, catalogVersion, name, type,
                percentage, amountMoney, appliedMoney, scope);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderReturnDiscount)) {
            return false;
        }
        OrderReturnDiscount other = (OrderReturnDiscount) obj;
        return Objects.equals(uid, other.uid)
            && Objects.equals(sourceDiscountUid, other.sourceDiscountUid)
            && Objects.equals(catalogObjectId, other.catalogObjectId)
            && Objects.equals(catalogVersion, other.catalogVersion)
            && Objects.equals(name, other.name)
            && Objects.equals(type, other.type)
            && Objects.equals(percentage, other.percentage)
            && Objects.equals(amountMoney, other.amountMoney)
            && Objects.equals(appliedMoney, other.appliedMoney)
            && Objects.equals(scope, other.scope);
    }

    /**
     * Converts this OrderReturnDiscount into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderReturnDiscount [" + "uid=" + uid + ", sourceDiscountUid=" + sourceDiscountUid
                + ", catalogObjectId=" + catalogObjectId + ", catalogVersion=" + catalogVersion
                + ", name=" + name + ", type=" + type + ", percentage=" + percentage
                + ", amountMoney=" + amountMoney + ", appliedMoney=" + appliedMoney + ", scope="
                + scope + "]";
    }

    /**
     * Builds a new {@link OrderReturnDiscount.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderReturnDiscount.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .sourceDiscountUid(getSourceDiscountUid())
                .catalogObjectId(getCatalogObjectId())
                .catalogVersion(getCatalogVersion())
                .name(getName())
                .type(getType())
                .percentage(getPercentage())
                .amountMoney(getAmountMoney())
                .appliedMoney(getAppliedMoney())
                .scope(getScope());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderReturnDiscount}.
     */
    public static class Builder {
        private String uid;
        private String sourceDiscountUid;
        private String catalogObjectId;
        private Long catalogVersion;
        private String name;
        private String type;
        private String percentage;
        private Money amountMoney;
        private Money appliedMoney;
        private String scope;



        /**
         * Setter for uid.
         * @param  uid  String value for uid.
         * @return Builder
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        /**
         * Setter for sourceDiscountUid.
         * @param  sourceDiscountUid  String value for sourceDiscountUid.
         * @return Builder
         */
        public Builder sourceDiscountUid(String sourceDiscountUid) {
            this.sourceDiscountUid = sourceDiscountUid;
            return this;
        }

        /**
         * Setter for catalogObjectId.
         * @param  catalogObjectId  String value for catalogObjectId.
         * @return Builder
         */
        public Builder catalogObjectId(String catalogObjectId) {
            this.catalogObjectId = catalogObjectId;
            return this;
        }

        /**
         * Setter for catalogVersion.
         * @param  catalogVersion  Long value for catalogVersion.
         * @return Builder
         */
        public Builder catalogVersion(Long catalogVersion) {
            this.catalogVersion = catalogVersion;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for type.
         * @param  type  String value for type.
         * @return Builder
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * Setter for percentage.
         * @param  percentage  String value for percentage.
         * @return Builder
         */
        public Builder percentage(String percentage) {
            this.percentage = percentage;
            return this;
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
         * Setter for appliedMoney.
         * @param  appliedMoney  Money value for appliedMoney.
         * @return Builder
         */
        public Builder appliedMoney(Money appliedMoney) {
            this.appliedMoney = appliedMoney;
            return this;
        }

        /**
         * Setter for scope.
         * @param  scope  String value for scope.
         * @return Builder
         */
        public Builder scope(String scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Builds a new {@link OrderReturnDiscount} object using the set fields.
         * @return {@link OrderReturnDiscount}
         */
        public OrderReturnDiscount build() {
            return new OrderReturnDiscount(uid, sourceDiscountUid, catalogObjectId, catalogVersion,
                    name, type, percentage, amountMoney, appliedMoney, scope);
        }
    }
}
