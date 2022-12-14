
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;

/**
 * This is a model class for OrderReturn type.
 */
public class OrderReturn {
    private final String uid;
    private final String sourceOrderId;
    private final List<OrderReturnLineItem> returnLineItems;
    private final List<OrderReturnServiceCharge> returnServiceCharges;
    private final List<OrderReturnTax> returnTaxes;
    private final List<OrderReturnDiscount> returnDiscounts;
    private final OrderRoundingAdjustment roundingAdjustment;
    private final OrderMoneyAmounts returnAmounts;

    /**
     * Initialization constructor.
     * @param  uid  String value for uid.
     * @param  sourceOrderId  String value for sourceOrderId.
     * @param  returnLineItems  List of OrderReturnLineItem value for returnLineItems.
     * @param  returnServiceCharges  List of OrderReturnServiceCharge value for
     *         returnServiceCharges.
     * @param  returnTaxes  List of OrderReturnTax value for returnTaxes.
     * @param  returnDiscounts  List of OrderReturnDiscount value for returnDiscounts.
     * @param  roundingAdjustment  OrderRoundingAdjustment value for roundingAdjustment.
     * @param  returnAmounts  OrderMoneyAmounts value for returnAmounts.
     */
    @JsonCreator
    public OrderReturn(
            @JsonProperty("uid") String uid,
            @JsonProperty("source_order_id") String sourceOrderId,
            @JsonProperty("return_line_items") List<OrderReturnLineItem> returnLineItems,
            @JsonProperty("return_service_charges") List<OrderReturnServiceCharge> returnServiceCharges,
            @JsonProperty("return_taxes") List<OrderReturnTax> returnTaxes,
            @JsonProperty("return_discounts") List<OrderReturnDiscount> returnDiscounts,
            @JsonProperty("rounding_adjustment") OrderRoundingAdjustment roundingAdjustment,
            @JsonProperty("return_amounts") OrderMoneyAmounts returnAmounts) {
        this.uid = uid;
        this.sourceOrderId = sourceOrderId;
        this.returnLineItems = returnLineItems;
        this.returnServiceCharges = returnServiceCharges;
        this.returnTaxes = returnTaxes;
        this.returnDiscounts = returnDiscounts;
        this.roundingAdjustment = roundingAdjustment;
        this.returnAmounts = returnAmounts;
    }

    /**
     * Getter for Uid.
     * A unique ID that identifies the return only within this order.
     * @return Returns the String
     */
    @JsonGetter("uid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUid() {
        return uid;
    }

    /**
     * Getter for SourceOrderId.
     * An order that contains the original sale of these return line items. This is unset for
     * unlinked returns.
     * @return Returns the String
     */
    @JsonGetter("source_order_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSourceOrderId() {
        return sourceOrderId;
    }

    /**
     * Getter for ReturnLineItems.
     * A collection of line items that are being returned.
     * @return Returns the List of OrderReturnLineItem
     */
    @JsonGetter("return_line_items")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderReturnLineItem> getReturnLineItems() {
        return returnLineItems;
    }

    /**
     * Getter for ReturnServiceCharges.
     * A collection of service charges that are being returned.
     * @return Returns the List of OrderReturnServiceCharge
     */
    @JsonGetter("return_service_charges")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderReturnServiceCharge> getReturnServiceCharges() {
        return returnServiceCharges;
    }

    /**
     * Getter for ReturnTaxes.
     * A collection of references to taxes being returned for an order, including the total applied
     * tax amount to be returned. The taxes must reference a top-level tax ID from the source order.
     * @return Returns the List of OrderReturnTax
     */
    @JsonGetter("return_taxes")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderReturnTax> getReturnTaxes() {
        return returnTaxes;
    }

    /**
     * Getter for ReturnDiscounts.
     * A collection of references to discounts being returned for an order, including the total
     * applied discount amount to be returned. The discounts must reference a top-level discount ID
     * from the source order.
     * @return Returns the List of OrderReturnDiscount
     */
    @JsonGetter("return_discounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public List<OrderReturnDiscount> getReturnDiscounts() {
        return returnDiscounts;
    }

    /**
     * Getter for RoundingAdjustment.
     * A rounding adjustment of the money being returned. Commonly used to apply cash rounding when
     * the minimum unit of the account is smaller than the lowest physical denomination of the
     * currency.
     * @return Returns the OrderRoundingAdjustment
     */
    @JsonGetter("rounding_adjustment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderRoundingAdjustment getRoundingAdjustment() {
        return roundingAdjustment;
    }

    /**
     * Getter for ReturnAmounts.
     * A collection of various money amounts.
     * @return Returns the OrderMoneyAmounts
     */
    @JsonGetter("return_amounts")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public OrderMoneyAmounts getReturnAmounts() {
        return returnAmounts;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, sourceOrderId, returnLineItems, returnServiceCharges, returnTaxes,
                returnDiscounts, roundingAdjustment, returnAmounts);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OrderReturn)) {
            return false;
        }
        OrderReturn other = (OrderReturn) obj;
        return Objects.equals(uid, other.uid)
            && Objects.equals(sourceOrderId, other.sourceOrderId)
            && Objects.equals(returnLineItems, other.returnLineItems)
            && Objects.equals(returnServiceCharges, other.returnServiceCharges)
            && Objects.equals(returnTaxes, other.returnTaxes)
            && Objects.equals(returnDiscounts, other.returnDiscounts)
            && Objects.equals(roundingAdjustment, other.roundingAdjustment)
            && Objects.equals(returnAmounts, other.returnAmounts);
    }

    /**
     * Converts this OrderReturn into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "OrderReturn [" + "uid=" + uid + ", sourceOrderId=" + sourceOrderId
                + ", returnLineItems=" + returnLineItems + ", returnServiceCharges="
                + returnServiceCharges + ", returnTaxes=" + returnTaxes + ", returnDiscounts="
                + returnDiscounts + ", roundingAdjustment=" + roundingAdjustment
                + ", returnAmounts=" + returnAmounts + "]";
    }

    /**
     * Builds a new {@link OrderReturn.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link OrderReturn.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .uid(getUid())
                .sourceOrderId(getSourceOrderId())
                .returnLineItems(getReturnLineItems())
                .returnServiceCharges(getReturnServiceCharges())
                .returnTaxes(getReturnTaxes())
                .returnDiscounts(getReturnDiscounts())
                .roundingAdjustment(getRoundingAdjustment())
                .returnAmounts(getReturnAmounts());
        return builder;
    }

    /**
     * Class to build instances of {@link OrderReturn}.
     */
    public static class Builder {
        private String uid;
        private String sourceOrderId;
        private List<OrderReturnLineItem> returnLineItems;
        private List<OrderReturnServiceCharge> returnServiceCharges;
        private List<OrderReturnTax> returnTaxes;
        private List<OrderReturnDiscount> returnDiscounts;
        private OrderRoundingAdjustment roundingAdjustment;
        private OrderMoneyAmounts returnAmounts;



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
         * Setter for sourceOrderId.
         * @param  sourceOrderId  String value for sourceOrderId.
         * @return Builder
         */
        public Builder sourceOrderId(String sourceOrderId) {
            this.sourceOrderId = sourceOrderId;
            return this;
        }

        /**
         * Setter for returnLineItems.
         * @param  returnLineItems  List of OrderReturnLineItem value for returnLineItems.
         * @return Builder
         */
        public Builder returnLineItems(List<OrderReturnLineItem> returnLineItems) {
            this.returnLineItems = returnLineItems;
            return this;
        }

        /**
         * Setter for returnServiceCharges.
         * @param  returnServiceCharges  List of OrderReturnServiceCharge value for
         *         returnServiceCharges.
         * @return Builder
         */
        public Builder returnServiceCharges(List<OrderReturnServiceCharge> returnServiceCharges) {
            this.returnServiceCharges = returnServiceCharges;
            return this;
        }

        /**
         * Setter for returnTaxes.
         * @param  returnTaxes  List of OrderReturnTax value for returnTaxes.
         * @return Builder
         */
        public Builder returnTaxes(List<OrderReturnTax> returnTaxes) {
            this.returnTaxes = returnTaxes;
            return this;
        }

        /**
         * Setter for returnDiscounts.
         * @param  returnDiscounts  List of OrderReturnDiscount value for returnDiscounts.
         * @return Builder
         */
        public Builder returnDiscounts(List<OrderReturnDiscount> returnDiscounts) {
            this.returnDiscounts = returnDiscounts;
            return this;
        }

        /**
         * Setter for roundingAdjustment.
         * @param  roundingAdjustment  OrderRoundingAdjustment value for roundingAdjustment.
         * @return Builder
         */
        public Builder roundingAdjustment(OrderRoundingAdjustment roundingAdjustment) {
            this.roundingAdjustment = roundingAdjustment;
            return this;
        }

        /**
         * Setter for returnAmounts.
         * @param  returnAmounts  OrderMoneyAmounts value for returnAmounts.
         * @return Builder
         */
        public Builder returnAmounts(OrderMoneyAmounts returnAmounts) {
            this.returnAmounts = returnAmounts;
            return this;
        }

        /**
         * Builds a new {@link OrderReturn} object using the set fields.
         * @return {@link OrderReturn}
         */
        public OrderReturn build() {
            return new OrderReturn(uid, sourceOrderId, returnLineItems, returnServiceCharges,
                    returnTaxes, returnDiscounts, roundingAdjustment, returnAmounts);
        }
    }
}
