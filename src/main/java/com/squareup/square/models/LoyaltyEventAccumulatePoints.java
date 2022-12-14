
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for LoyaltyEventAccumulatePoints type.
 */
public class LoyaltyEventAccumulatePoints {
    private final String loyaltyProgramId;
    private final Integer points;
    private final String orderId;

    /**
     * Initialization constructor.
     * @param  loyaltyProgramId  String value for loyaltyProgramId.
     * @param  points  Integer value for points.
     * @param  orderId  String value for orderId.
     */
    @JsonCreator
    public LoyaltyEventAccumulatePoints(
            @JsonProperty("loyalty_program_id") String loyaltyProgramId,
            @JsonProperty("points") Integer points,
            @JsonProperty("order_id") String orderId) {
        this.loyaltyProgramId = loyaltyProgramId;
        this.points = points;
        this.orderId = orderId;
    }

    /**
     * Getter for LoyaltyProgramId.
     * The ID of the [loyalty program]($m/LoyaltyProgram).
     * @return Returns the String
     */
    @JsonGetter("loyalty_program_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLoyaltyProgramId() {
        return loyaltyProgramId;
    }

    /**
     * Getter for Points.
     * The number of points accumulated by the event.
     * @return Returns the Integer
     */
    @JsonGetter("points")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getPoints() {
        return points;
    }

    /**
     * Getter for OrderId.
     * The ID of the [order]($m/Order) for which the buyer accumulated the points. This field is
     * returned only if the Orders API is used to process orders.
     * @return Returns the String
     */
    @JsonGetter("order_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getOrderId() {
        return orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(loyaltyProgramId, points, orderId);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LoyaltyEventAccumulatePoints)) {
            return false;
        }
        LoyaltyEventAccumulatePoints other = (LoyaltyEventAccumulatePoints) obj;
        return Objects.equals(loyaltyProgramId, other.loyaltyProgramId)
            && Objects.equals(points, other.points)
            && Objects.equals(orderId, other.orderId);
    }

    /**
     * Converts this LoyaltyEventAccumulatePoints into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "LoyaltyEventAccumulatePoints [" + "loyaltyProgramId=" + loyaltyProgramId
                + ", points=" + points + ", orderId=" + orderId + "]";
    }

    /**
     * Builds a new {@link LoyaltyEventAccumulatePoints.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link LoyaltyEventAccumulatePoints.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .loyaltyProgramId(getLoyaltyProgramId())
                .points(getPoints())
                .orderId(getOrderId());
        return builder;
    }

    /**
     * Class to build instances of {@link LoyaltyEventAccumulatePoints}.
     */
    public static class Builder {
        private String loyaltyProgramId;
        private Integer points;
        private String orderId;



        /**
         * Setter for loyaltyProgramId.
         * @param  loyaltyProgramId  String value for loyaltyProgramId.
         * @return Builder
         */
        public Builder loyaltyProgramId(String loyaltyProgramId) {
            this.loyaltyProgramId = loyaltyProgramId;
            return this;
        }

        /**
         * Setter for points.
         * @param  points  Integer value for points.
         * @return Builder
         */
        public Builder points(Integer points) {
            this.points = points;
            return this;
        }

        /**
         * Setter for orderId.
         * @param  orderId  String value for orderId.
         * @return Builder
         */
        public Builder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }

        /**
         * Builds a new {@link LoyaltyEventAccumulatePoints} object using the set fields.
         * @return {@link LoyaltyEventAccumulatePoints}
         */
        public LoyaltyEventAccumulatePoints build() {
            return new LoyaltyEventAccumulatePoints(loyaltyProgramId, points, orderId);
        }
    }
}
