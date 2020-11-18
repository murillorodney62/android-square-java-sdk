
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * This is a model class for Order type.
 */
public class Order {
    private final String id;
    private final String locationId;
    private final String referenceId;
    private final OrderSource source;
    private final String customerId;
    private final List<OrderLineItem> lineItems;
    private final List<OrderLineItemTax> taxes;
    private final List<OrderLineItemDiscount> discounts;
    private final List<OrderServiceCharge> serviceCharges;
    private final List<OrderFulfillment> fulfillments;
    private final List<OrderReturn> returns;
    private final OrderMoneyAmounts returnAmounts;
    private final OrderMoneyAmounts netAmounts;
    private final OrderRoundingAdjustment roundingAdjustment;
    private final List<Tender> tenders;
    private final List<Refund> refunds;
    private final Map<String, String> metadata;
    private final String createdAt;
    private final String updatedAt;
    private final String closedAt;
    private final String state;
    private final Integer version;
    private final Money totalMoney;
    private final Money totalTaxMoney;
    private final Money totalDiscountMoney;
    private final Money totalTipMoney;
    private final Money totalServiceChargeMoney;
    private final OrderPricingOptions pricingOptions;
    private final List<OrderReward> rewards;

    /**
     * Initialization constructor.
     * @param locationId String value for locationId.
     * @param id String value for id.
     * @param referenceId String value for referenceId.
     * @param source OrderSource value for source.
     * @param customerId String value for customerId.
     * @param lineItems List of OrderLineItem value for lineItems.
     * @param taxes List of OrderLineItemTax value for taxes.
     * @param discounts List of OrderLineItemDiscount value for discounts.
     * @param serviceCharges List of OrderServiceCharge value for serviceCharges.
     * @param fulfillments List of OrderFulfillment value for fulfillments.
     * @param returns List of OrderReturn value for returns.
     * @param returnAmounts OrderMoneyAmounts value for returnAmounts.
     * @param netAmounts OrderMoneyAmounts value for netAmounts.
     * @param roundingAdjustment OrderRoundingAdjustment value for roundingAdjustment.
     * @param tenders List of Tender value for tenders.
     * @param refunds List of Refund value for refunds.
     * @param metadata Map of String, value for metadata.
     * @param createdAt String value for createdAt.
     * @param updatedAt String value for updatedAt.
     * @param closedAt String value for closedAt.
     * @param state String value for state.
     * @param version Integer value for version.
     * @param totalMoney Money value for totalMoney.
     * @param totalTaxMoney Money value for totalTaxMoney.
     * @param totalDiscountMoney Money value for totalDiscountMoney.
     * @param totalTipMoney Money value for totalTipMoney.
     * @param totalServiceChargeMoney Money value for totalServiceChargeMoney.
     * @param pricingOptions OrderPricingOptions value for pricingOptions.
     * @param rewards List of OrderReward value for rewards.
     */
    @JsonCreator
    public Order(
            @JsonProperty("location_id") String locationId,
            @JsonProperty("id") String id,
            @JsonProperty("reference_id") String referenceId,
            @JsonProperty("source") OrderSource source,
            @JsonProperty("customer_id") String customerId,
            @JsonProperty("line_items") List<OrderLineItem> lineItems,
            @JsonProperty("taxes") List<OrderLineItemTax> taxes,
            @JsonProperty("discounts") List<OrderLineItemDiscount> discounts,
            @JsonProperty("service_charges") List<OrderServiceCharge> serviceCharges,
            @JsonProperty("fulfillments") List<OrderFulfillment> fulfillments,
            @JsonProperty("returns") List<OrderReturn> returns,
            @JsonProperty("return_amounts") OrderMoneyAmounts returnAmounts,
            @JsonProperty("net_amounts") OrderMoneyAmounts netAmounts,
            @JsonProperty("rounding_adjustment") OrderRoundingAdjustment roundingAdjustment,
            @JsonProperty("tenders") List<Tender> tenders,
            @JsonProperty("refunds") List<Refund> refunds,
            @JsonProperty("metadata") Map<String, String> metadata,
            @JsonProperty("created_at") String createdAt,
            @JsonProperty("updated_at") String updatedAt,
            @JsonProperty("closed_at") String closedAt,
            @JsonProperty("state") String state,
            @JsonProperty("version") Integer version,
            @JsonProperty("total_money") Money totalMoney,
            @JsonProperty("total_tax_money") Money totalTaxMoney,
            @JsonProperty("total_discount_money") Money totalDiscountMoney,
            @JsonProperty("total_tip_money") Money totalTipMoney,
            @JsonProperty("total_service_charge_money") Money totalServiceChargeMoney,
            @JsonProperty("pricing_options") OrderPricingOptions pricingOptions,
            @JsonProperty("rewards") List<OrderReward> rewards) {
        this.id = id;
        this.locationId = locationId;
        this.referenceId = referenceId;
        this.source = source;
        this.customerId = customerId;
        this.lineItems = lineItems;
        this.taxes = taxes;
        this.discounts = discounts;
        this.serviceCharges = serviceCharges;
        this.fulfillments = fulfillments;
        this.returns = returns;
        this.returnAmounts = returnAmounts;
        this.netAmounts = netAmounts;
        this.roundingAdjustment = roundingAdjustment;
        this.tenders = tenders;
        this.refunds = refunds;
        this.metadata = metadata;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.closedAt = closedAt;
        this.state = state;
        this.version = version;
        this.totalMoney = totalMoney;
        this.totalTaxMoney = totalTaxMoney;
        this.totalDiscountMoney = totalDiscountMoney;
        this.totalTipMoney = totalTipMoney;
        this.totalServiceChargeMoney = totalServiceChargeMoney;
        this.pricingOptions = pricingOptions;
        this.rewards = rewards;
    }

    /**
     * Getter for Id.
     * The order's unique ID.
     * @return Returns the String
     */
    @JsonGetter("id")
    public String getId() {
        return this.id;
    }

    /**
     * Getter for LocationId.
     * The ID of the merchant location this order is associated with.
     * @return Returns the String
     */
    @JsonGetter("location_id")
    public String getLocationId() {
        return this.locationId;
    }

    /**
     * Getter for ReferenceId.
     * A client specified identifier to associate an entity in another system with this order.
     * @return Returns the String
     */
    @JsonGetter("reference_id")
    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * Getter for Source.
     * Represents the origination details of an order.
     * @return Returns the OrderSource
     */
    @JsonGetter("source")
    public OrderSource getSource() {
        return this.source;
    }

    /**
     * Getter for CustomerId.
     * The [Customer](#type-customer) ID of the customer associated with the order.
     * @return Returns the String
     */
    @JsonGetter("customer_id")
    public String getCustomerId() {
        return this.customerId;
    }

    /**
     * Getter for LineItems.
     * The line items included in the order.
     * @return Returns the List of OrderLineItem
     */
    @JsonGetter("line_items")
    public List<OrderLineItem> getLineItems() {
        return this.lineItems;
    }

    /**
     * Getter for Taxes.
     * The list of all taxes associated with the order. Taxes can be scoped to either `ORDER` or
     * `LINE_ITEM`. For taxes with `LINE_ITEM` scope, an `OrderLineItemAppliedTax` must be added to
     * each line item that the tax applies to. For taxes with `ORDER` scope, the server will
     * generate an `OrderLineItemAppliedTax` for every line item. On reads, each tax in the list
     * will include the total amount of that tax applied to the order. __IMPORTANT__: If `LINE_ITEM`
     * scope is set on any taxes in this field, usage of the deprecated `line_items.taxes` field
     * will result in an error. Please use `line_items.applied_taxes` instead.
     * @return Returns the List of OrderLineItemTax
     */
    @JsonGetter("taxes")
    public List<OrderLineItemTax> getTaxes() {
        return this.taxes;
    }

    /**
     * Getter for Discounts.
     * The list of all discounts associated with the order. Discounts can be scoped to either
     * `ORDER` or `LINE_ITEM`. For discounts scoped to `LINE_ITEM`, an
     * `OrderLineItemAppliedDiscount` must be added to each line item that the discount applies to.
     * For discounts with `ORDER` scope, the server will generate an `OrderLineItemAppliedDiscount`
     * for every line item. __IMPORTANT__: If `LINE_ITEM` scope is set on any discounts in this
     * field, usage of the deprecated `line_items.discounts` field will result in an error. Please
     * use `line_items.applied_discounts` instead.
     * @return Returns the List of OrderLineItemDiscount
     */
    @JsonGetter("discounts")
    public List<OrderLineItemDiscount> getDiscounts() {
        return this.discounts;
    }

    /**
     * Getter for ServiceCharges.
     * A list of service charges applied to the order.
     * @return Returns the List of OrderServiceCharge
     */
    @JsonGetter("service_charges")
    public List<OrderServiceCharge> getServiceCharges() {
        return this.serviceCharges;
    }

    /**
     * Getter for Fulfillments.
     * Details on order fulfillment. Orders can only be created with at most one fulfillment.
     * However, orders returned by the API may contain multiple fulfillments.
     * @return Returns the List of OrderFulfillment
     */
    @JsonGetter("fulfillments")
    public List<OrderFulfillment> getFulfillments() {
        return this.fulfillments;
    }

    /**
     * Getter for Returns.
     * Collection of items from sale Orders being returned in this one. Normally part of an Itemized
     * Return or Exchange. There will be exactly one `Return` object per sale Order being
     * referenced.
     * @return Returns the List of OrderReturn
     */
    @JsonGetter("returns")
    public List<OrderReturn> getReturns() {
        return this.returns;
    }

    /**
     * Getter for ReturnAmounts.
     * A collection of various money amounts.
     * @return Returns the OrderMoneyAmounts
     */
    @JsonGetter("return_amounts")
    public OrderMoneyAmounts getReturnAmounts() {
        return this.returnAmounts;
    }

    /**
     * Getter for NetAmounts.
     * A collection of various money amounts.
     * @return Returns the OrderMoneyAmounts
     */
    @JsonGetter("net_amounts")
    public OrderMoneyAmounts getNetAmounts() {
        return this.netAmounts;
    }

    /**
     * Getter for RoundingAdjustment.
     * A rounding adjustment of the money being returned. Commonly used to apply Cash Rounding when
     * the minimum unit of account is smaller than the lowest physical denomination of currency.
     * @return Returns the OrderRoundingAdjustment
     */
    @JsonGetter("rounding_adjustment")
    public OrderRoundingAdjustment getRoundingAdjustment() {
        return this.roundingAdjustment;
    }

    /**
     * Getter for Tenders.
     * The Tenders which were used to pay for the Order.
     * @return Returns the List of Tender
     */
    @JsonGetter("tenders")
    public List<Tender> getTenders() {
        return this.tenders;
    }

    /**
     * Getter for Refunds.
     * The Refunds that are part of this Order.
     * @return Returns the List of Refund
     */
    @JsonGetter("refunds")
    public List<Refund> getRefunds() {
        return this.refunds;
    }

    /**
     * Getter for Metadata.
     * Application-defined data attached to this order. Metadata fields are intended to store
     * descriptive references or associations with an entity in another system or store brief
     * information about the object. Square does not process this field; it only stores and returns
     * it in relevant API calls. Do not use metadata to store any sensitive information (personally
     * identifiable information, card details, etc.). Keys written by applications must be 60
     * characters or less and must be in the character set `[a-zA-Z0-9_-]`. Entries may also include
     * metadata generated by Square. These keys are prefixed with a namespace, separated from the
     * key with a ':' character. Values have a max length of 255 characters. An application may have
     * up to 10 entries per metadata field. Entries written by applications are private and can only
     * be read or modified by the same application. See
     * [Metadata](https://developer.squareup.com/docs/build-basics/metadata) for more information.
     * @return Returns the Map of String, String
     */
    @JsonGetter("metadata")
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Getter for CreatedAt.
     * Timestamp for when the order was created. In RFC 3339 format, e.g.,
     * "2016-09-04T23:59:33.123Z".
     * @return Returns the String
     */
    @JsonGetter("created_at")
    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * Getter for UpdatedAt.
     * Timestamp for when the order was last updated. In RFC 3339 format, e.g.,
     * "2016-09-04T23:59:33.123Z".
     * @return Returns the String
     */
    @JsonGetter("updated_at")
    public String getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * Getter for ClosedAt.
     * Timestamp for when the order reached a terminal [state](#property-state). In RFC 3339 format,
     * e.g., "2016-09-04T23:59:33.123Z".
     * @return Returns the String
     */
    @JsonGetter("closed_at")
    public String getClosedAt() {
        return this.closedAt;
    }

    /**
     * Getter for State.
     * The state of the order.
     * @return Returns the String
     */
    @JsonGetter("state")
    public String getState() {
        return this.state;
    }

    /**
     * Getter for Version.
     * Version number which is incremented each time an update is committed to the order. Orders
     * that were not created through the API will not include a version and thus cannot be updated.
     * [Read more about working with
     * versions](https://developer.squareup.com/docs/orders-api/manage-orders#update-orders).
     * @return Returns the Integer
     */
    @JsonGetter("version")
    public Integer getVersion() {
        return this.version;
    }

    /**
     * Getter for TotalMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not
     * explicitly define whether they are signed or unsigned are considered unsigned and can only
     * hold positive amounts. For signed fields, the sign of the value indicates the purpose of the
     * money transfer. See [Working with Monetary
     * Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for
     * more information.
     * @return Returns the Money
     */
    @JsonGetter("total_money")
    public Money getTotalMoney() {
        return this.totalMoney;
    }

    /**
     * Getter for TotalTaxMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not
     * explicitly define whether they are signed or unsigned are considered unsigned and can only
     * hold positive amounts. For signed fields, the sign of the value indicates the purpose of the
     * money transfer. See [Working with Monetary
     * Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for
     * more information.
     * @return Returns the Money
     */
    @JsonGetter("total_tax_money")
    public Money getTotalTaxMoney() {
        return this.totalTaxMoney;
    }

    /**
     * Getter for TotalDiscountMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not
     * explicitly define whether they are signed or unsigned are considered unsigned and can only
     * hold positive amounts. For signed fields, the sign of the value indicates the purpose of the
     * money transfer. See [Working with Monetary
     * Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for
     * more information.
     * @return Returns the Money
     */
    @JsonGetter("total_discount_money")
    public Money getTotalDiscountMoney() {
        return this.totalDiscountMoney;
    }

    /**
     * Getter for TotalTipMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not
     * explicitly define whether they are signed or unsigned are considered unsigned and can only
     * hold positive amounts. For signed fields, the sign of the value indicates the purpose of the
     * money transfer. See [Working with Monetary
     * Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for
     * more information.
     * @return Returns the Money
     */
    @JsonGetter("total_tip_money")
    public Money getTotalTipMoney() {
        return this.totalTipMoney;
    }

    /**
     * Getter for TotalServiceChargeMoney.
     * Represents an amount of money. `Money` fields can be signed or unsigned. Fields that do not
     * explicitly define whether they are signed or unsigned are considered unsigned and can only
     * hold positive amounts. For signed fields, the sign of the value indicates the purpose of the
     * money transfer. See [Working with Monetary
     * Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts) for
     * more information.
     * @return Returns the Money
     */
    @JsonGetter("total_service_charge_money")
    public Money getTotalServiceChargeMoney() {
        return this.totalServiceChargeMoney;
    }

    /**
     * Getter for PricingOptions.
     * Pricing options for an order. The options affect how the order's price is calculated. They
     * can be used, for example, to apply automatic price adjustments that are based on
     * pre-configured [pricing
     * rules](https://developer.squareup.com/docs/reference/square/objects/CatalogPricingRule).
     * @return Returns the OrderPricingOptions
     */
    @JsonGetter("pricing_options")
    public OrderPricingOptions getPricingOptions() {
        return this.pricingOptions;
    }

    /**
     * Getter for Rewards.
     * A set-like list of rewards that have been added to the order.
     * @return Returns the List of OrderReward
     */
    @JsonGetter("rewards")
    public List<OrderReward> getRewards() {
        return this.rewards;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, locationId, referenceId, source, customerId, lineItems, taxes,
                discounts, serviceCharges, fulfillments, returns, returnAmounts, netAmounts,
                roundingAdjustment, tenders, refunds, metadata, createdAt, updatedAt, closedAt,
                state, version, totalMoney, totalTaxMoney, totalDiscountMoney, totalTipMoney,
                totalServiceChargeMoney, pricingOptions, rewards);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }
        Order other = (Order) obj;
        return Objects.equals(id, other.id)
            && Objects.equals(locationId, other.locationId)
            && Objects.equals(referenceId, other.referenceId)
            && Objects.equals(source, other.source)
            && Objects.equals(customerId, other.customerId)
            && Objects.equals(lineItems, other.lineItems)
            && Objects.equals(taxes, other.taxes)
            && Objects.equals(discounts, other.discounts)
            && Objects.equals(serviceCharges, other.serviceCharges)
            && Objects.equals(fulfillments, other.fulfillments)
            && Objects.equals(returns, other.returns)
            && Objects.equals(returnAmounts, other.returnAmounts)
            && Objects.equals(netAmounts, other.netAmounts)
            && Objects.equals(roundingAdjustment, other.roundingAdjustment)
            && Objects.equals(tenders, other.tenders)
            && Objects.equals(refunds, other.refunds)
            && Objects.equals(metadata, other.metadata)
            && Objects.equals(createdAt, other.createdAt)
            && Objects.equals(updatedAt, other.updatedAt)
            && Objects.equals(closedAt, other.closedAt)
            && Objects.equals(state, other.state)
            && Objects.equals(version, other.version)
            && Objects.equals(totalMoney, other.totalMoney)
            && Objects.equals(totalTaxMoney, other.totalTaxMoney)
            && Objects.equals(totalDiscountMoney, other.totalDiscountMoney)
            && Objects.equals(totalTipMoney, other.totalTipMoney)
            && Objects.equals(totalServiceChargeMoney, other.totalServiceChargeMoney)
            && Objects.equals(pricingOptions, other.pricingOptions)
            && Objects.equals(rewards, other.rewards);
    }

    /**
     * Converts this Order into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Order [" + "locationId=" + locationId + ", id=" + id + ", referenceId="
                + referenceId + ", source=" + source + ", customerId=" + customerId + ", lineItems="
                + lineItems + ", taxes=" + taxes + ", discounts=" + discounts + ", serviceCharges="
                + serviceCharges + ", fulfillments=" + fulfillments + ", returns=" + returns
                + ", returnAmounts=" + returnAmounts + ", netAmounts=" + netAmounts
                + ", roundingAdjustment=" + roundingAdjustment + ", tenders=" + tenders
                + ", refunds=" + refunds + ", metadata=" + metadata + ", createdAt=" + createdAt
                + ", updatedAt=" + updatedAt + ", closedAt=" + closedAt + ", state=" + state
                + ", version=" + version + ", totalMoney=" + totalMoney + ", totalTaxMoney="
                + totalTaxMoney + ", totalDiscountMoney=" + totalDiscountMoney + ", totalTipMoney="
                + totalTipMoney + ", totalServiceChargeMoney=" + totalServiceChargeMoney
                + ", pricingOptions=" + pricingOptions + ", rewards=" + rewards + "]";
    }

    /**
     * Builds a new {@link Order.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Order.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(locationId)
                .id(getId())
                .referenceId(getReferenceId())
                .source(getSource())
                .customerId(getCustomerId())
                .lineItems(getLineItems())
                .taxes(getTaxes())
                .discounts(getDiscounts())
                .serviceCharges(getServiceCharges())
                .fulfillments(getFulfillments())
                .returns(getReturns())
                .returnAmounts(getReturnAmounts())
                .netAmounts(getNetAmounts())
                .roundingAdjustment(getRoundingAdjustment())
                .tenders(getTenders())
                .refunds(getRefunds())
                .metadata(getMetadata())
                .createdAt(getCreatedAt())
                .updatedAt(getUpdatedAt())
                .closedAt(getClosedAt())
                .state(getState())
                .version(getVersion())
                .totalMoney(getTotalMoney())
                .totalTaxMoney(getTotalTaxMoney())
                .totalDiscountMoney(getTotalDiscountMoney())
                .totalTipMoney(getTotalTipMoney())
                .totalServiceChargeMoney(getTotalServiceChargeMoney())
                .pricingOptions(getPricingOptions())
                .rewards(getRewards());
        return builder;
    }

    /**
     * Class to build instances of {@link Order}.
     */
    public static class Builder {
        private String locationId;
        private String id;
        private String referenceId;
        private OrderSource source;
        private String customerId;
        private List<OrderLineItem> lineItems;
        private List<OrderLineItemTax> taxes;
        private List<OrderLineItemDiscount> discounts;
        private List<OrderServiceCharge> serviceCharges;
        private List<OrderFulfillment> fulfillments;
        private List<OrderReturn> returns;
        private OrderMoneyAmounts returnAmounts;
        private OrderMoneyAmounts netAmounts;
        private OrderRoundingAdjustment roundingAdjustment;
        private List<Tender> tenders;
        private List<Refund> refunds;
        private Map<String, String> metadata;
        private String createdAt;
        private String updatedAt;
        private String closedAt;
        private String state;
        private Integer version;
        private Money totalMoney;
        private Money totalTaxMoney;
        private Money totalDiscountMoney;
        private Money totalTipMoney;
        private Money totalServiceChargeMoney;
        private OrderPricingOptions pricingOptions;
        private List<OrderReward> rewards;

        /**
         * Initialization constructor.
         * @param locationId String value for locationId.
         */
        public Builder(String locationId) {
            this.locationId = locationId;
        }

        /**
         * Setter for locationId.
         * @param locationId String value for locationId.
         * @return Builder
         */
        public Builder locationId(String locationId) {
            this.locationId = locationId;
            return this;
        }

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
         * Setter for referenceId.
         * @param referenceId String value for referenceId.
         * @return Builder
         */
        public Builder referenceId(String referenceId) {
            this.referenceId = referenceId;
            return this;
        }

        /**
         * Setter for source.
         * @param source OrderSource value for source.
         * @return Builder
         */
        public Builder source(OrderSource source) {
            this.source = source;
            return this;
        }

        /**
         * Setter for customerId.
         * @param customerId String value for customerId.
         * @return Builder
         */
        public Builder customerId(String customerId) {
            this.customerId = customerId;
            return this;
        }

        /**
         * Setter for lineItems.
         * @param lineItems List of OrderLineItem value for lineItems.
         * @return Builder
         */
        public Builder lineItems(List<OrderLineItem> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        /**
         * Setter for taxes.
         * @param taxes List of OrderLineItemTax value for taxes.
         * @return Builder
         */
        public Builder taxes(List<OrderLineItemTax> taxes) {
            this.taxes = taxes;
            return this;
        }

        /**
         * Setter for discounts.
         * @param discounts List of OrderLineItemDiscount value for discounts.
         * @return Builder
         */
        public Builder discounts(List<OrderLineItemDiscount> discounts) {
            this.discounts = discounts;
            return this;
        }

        /**
         * Setter for serviceCharges.
         * @param serviceCharges List of OrderServiceCharge value for serviceCharges.
         * @return Builder
         */
        public Builder serviceCharges(List<OrderServiceCharge> serviceCharges) {
            this.serviceCharges = serviceCharges;
            return this;
        }

        /**
         * Setter for fulfillments.
         * @param fulfillments List of OrderFulfillment value for fulfillments.
         * @return Builder
         */
        public Builder fulfillments(List<OrderFulfillment> fulfillments) {
            this.fulfillments = fulfillments;
            return this;
        }

        /**
         * Setter for returns.
         * @param returns List of OrderReturn value for returns.
         * @return Builder
         */
        public Builder returns(List<OrderReturn> returns) {
            this.returns = returns;
            return this;
        }

        /**
         * Setter for returnAmounts.
         * @param returnAmounts OrderMoneyAmounts value for returnAmounts.
         * @return Builder
         */
        public Builder returnAmounts(OrderMoneyAmounts returnAmounts) {
            this.returnAmounts = returnAmounts;
            return this;
        }

        /**
         * Setter for netAmounts.
         * @param netAmounts OrderMoneyAmounts value for netAmounts.
         * @return Builder
         */
        public Builder netAmounts(OrderMoneyAmounts netAmounts) {
            this.netAmounts = netAmounts;
            return this;
        }

        /**
         * Setter for roundingAdjustment.
         * @param roundingAdjustment OrderRoundingAdjustment value for roundingAdjustment.
         * @return Builder
         */
        public Builder roundingAdjustment(OrderRoundingAdjustment roundingAdjustment) {
            this.roundingAdjustment = roundingAdjustment;
            return this;
        }

        /**
         * Setter for tenders.
         * @param tenders List of Tender value for tenders.
         * @return Builder
         */
        public Builder tenders(List<Tender> tenders) {
            this.tenders = tenders;
            return this;
        }

        /**
         * Setter for refunds.
         * @param refunds List of Refund value for refunds.
         * @return Builder
         */
        public Builder refunds(List<Refund> refunds) {
            this.refunds = refunds;
            return this;
        }

        /**
         * Setter for metadata.
         * @param metadata Map of String, value for metadata.
         * @return Builder
         */
        public Builder metadata(Map<String, String> metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for createdAt.
         * @param createdAt String value for createdAt.
         * @return Builder
         */
        public Builder createdAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Setter for updatedAt.
         * @param updatedAt String value for updatedAt.
         * @return Builder
         */
        public Builder updatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Setter for closedAt.
         * @param closedAt String value for closedAt.
         * @return Builder
         */
        public Builder closedAt(String closedAt) {
            this.closedAt = closedAt;
            return this;
        }

        /**
         * Setter for state.
         * @param state String value for state.
         * @return Builder
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Setter for version.
         * @param version Integer value for version.
         * @return Builder
         */
        public Builder version(Integer version) {
            this.version = version;
            return this;
        }

        /**
         * Setter for totalMoney.
         * @param totalMoney Money value for totalMoney.
         * @return Builder
         */
        public Builder totalMoney(Money totalMoney) {
            this.totalMoney = totalMoney;
            return this;
        }

        /**
         * Setter for totalTaxMoney.
         * @param totalTaxMoney Money value for totalTaxMoney.
         * @return Builder
         */
        public Builder totalTaxMoney(Money totalTaxMoney) {
            this.totalTaxMoney = totalTaxMoney;
            return this;
        }

        /**
         * Setter for totalDiscountMoney.
         * @param totalDiscountMoney Money value for totalDiscountMoney.
         * @return Builder
         */
        public Builder totalDiscountMoney(Money totalDiscountMoney) {
            this.totalDiscountMoney = totalDiscountMoney;
            return this;
        }

        /**
         * Setter for totalTipMoney.
         * @param totalTipMoney Money value for totalTipMoney.
         * @return Builder
         */
        public Builder totalTipMoney(Money totalTipMoney) {
            this.totalTipMoney = totalTipMoney;
            return this;
        }

        /**
         * Setter for totalServiceChargeMoney.
         * @param totalServiceChargeMoney Money value for totalServiceChargeMoney.
         * @return Builder
         */
        public Builder totalServiceChargeMoney(Money totalServiceChargeMoney) {
            this.totalServiceChargeMoney = totalServiceChargeMoney;
            return this;
        }

        /**
         * Setter for pricingOptions.
         * @param pricingOptions OrderPricingOptions value for pricingOptions.
         * @return Builder
         */
        public Builder pricingOptions(OrderPricingOptions pricingOptions) {
            this.pricingOptions = pricingOptions;
            return this;
        }

        /**
         * Setter for rewards.
         * @param rewards List of OrderReward value for rewards.
         * @return Builder
         */
        public Builder rewards(List<OrderReward> rewards) {
            this.rewards = rewards;
            return this;
        }

        /**
         * Builds a new {@link Order} object using the set fields.
         * @return {@link Order}
         */
        public Order build() {
            return new Order(locationId, id, referenceId, source, customerId, lineItems, taxes,
                    discounts, serviceCharges, fulfillments, returns, returnAmounts, netAmounts,
                    roundingAdjustment, tenders, refunds, metadata, createdAt, updatedAt, closedAt,
                    state, version, totalMoney, totalTaxMoney, totalDiscountMoney, totalTipMoney,
                    totalServiceChargeMoney, pricingOptions, rewards);
        }
    }
}
