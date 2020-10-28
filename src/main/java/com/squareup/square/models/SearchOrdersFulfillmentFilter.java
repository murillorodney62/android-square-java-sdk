
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Objects;


/**
 * This is a model class for SearchOrdersFulfillmentFilter type.
 */
public class SearchOrdersFulfillmentFilter {
    private final List<String> fulfillmentTypes;
    private final List<String> fulfillmentStates;

    /**
     * Initialization constructor.
     * @param fulfillmentTypes List of String value for fulfillmentTypes.
     * @param fulfillmentStates List of String value for fulfillmentStates.
     */
    @JsonCreator
    public SearchOrdersFulfillmentFilter(
            @JsonProperty("fulfillment_types") List<String> fulfillmentTypes,
            @JsonProperty("fulfillment_states") List<String> fulfillmentStates) {
        this.fulfillmentTypes = fulfillmentTypes;
        this.fulfillmentStates = fulfillmentStates;
    }

    /**
     * Getter for FulfillmentTypes.
     * List of [fulfillment types](#type-orderfulfillmenttype) to filter for. Will return orders if
     * any of its fulfillments match any of the fulfillment types listed in this field. See
     * [OrderFulfillmentType](#type-orderfulfillmenttype) for possible values
     * @return Returns the List of String
     */
    @JsonGetter("fulfillment_types")
    public List<String> getFulfillmentTypes() {
        return this.fulfillmentTypes;
    }

    /**
     * Getter for FulfillmentStates.
     * List of [fulfillment states](#type-orderfulfillmentstate) to filter for. Will return orders
     * if any of its fulfillments match any of the fulfillment states listed in this field. See
     * [OrderFulfillmentState](#type-orderfulfillmentstate) for possible values
     * @return Returns the List of String
     */
    @JsonGetter("fulfillment_states")
    public List<String> getFulfillmentStates() {
        return this.fulfillmentStates;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(fulfillmentTypes, fulfillmentStates);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SearchOrdersFulfillmentFilter)) {
            return false;
        }
        SearchOrdersFulfillmentFilter other = (SearchOrdersFulfillmentFilter) obj;
        return Objects.equals(fulfillmentTypes, other.fulfillmentTypes)
            && Objects.equals(fulfillmentStates, other.fulfillmentStates);
    }

    /**
     * Builds a new {@link SearchOrdersFulfillmentFilter.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SearchOrdersFulfillmentFilter.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .fulfillmentTypes(getFulfillmentTypes())
            .fulfillmentStates(getFulfillmentStates());
        return builder;
    }

    /**
     * Class to build instances of {@link SearchOrdersFulfillmentFilter}.
     */
    public static class Builder {
        private List<String> fulfillmentTypes;
        private List<String> fulfillmentStates;



        /**
         * Setter for fulfillmentTypes.
         * @param fulfillmentTypes List of String value for fulfillmentTypes.
         * @return Builder
         */
        public Builder fulfillmentTypes(List<String> fulfillmentTypes) {
            this.fulfillmentTypes = fulfillmentTypes;
            return this;
        }

        /**
         * Setter for fulfillmentStates.
         * @param fulfillmentStates List of String value for fulfillmentStates.
         * @return Builder
         */
        public Builder fulfillmentStates(List<String> fulfillmentStates) {
            this.fulfillmentStates = fulfillmentStates;
            return this;
        }

        /**
         * Builds a new {@link SearchOrdersFulfillmentFilter} object using the set fields.
         * @return {@link SearchOrdersFulfillmentFilter}
         */
        public SearchOrdersFulfillmentFilter build() {
            return new SearchOrdersFulfillmentFilter(fulfillmentTypes,
                fulfillmentStates);
        }
    }
}
