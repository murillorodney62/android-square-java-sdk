
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;

/**
 * This is a model class for ListCustomersRequest type.
 */
public class ListCustomersRequest {
    private final String cursor;
    private final Integer limit;
    private final String sortField;
    private final String sortOrder;

    /**
     * Initialization constructor.
     * @param  cursor  String value for cursor.
     * @param  limit  Integer value for limit.
     * @param  sortField  String value for sortField.
     * @param  sortOrder  String value for sortOrder.
     */
    @JsonCreator
    public ListCustomersRequest(
            @JsonProperty("cursor") String cursor,
            @JsonProperty("limit") Integer limit,
            @JsonProperty("sort_field") String sortField,
            @JsonProperty("sort_order") String sortOrder) {
        this.cursor = cursor;
        this.limit = limit;
        this.sortField = sortField;
        this.sortOrder = sortOrder;
    }

    /**
     * Getter for Cursor.
     * A pagination cursor returned by a previous call to this endpoint. Provide this cursor to
     * retrieve the next set of results for your original query. For more information, see
     * [Pagination](https://developer.squareup.com/docs/build-basics/common-api-patterns/pagination).
     * @return Returns the String
     */
    @JsonGetter("cursor")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getCursor() {
        return cursor;
    }

    /**
     * Getter for Limit.
     * The maximum number of results to return in a single page. This limit is advisory. The
     * response might contain more or fewer results. If the specified limit is less than 1 or
     * greater than 100, Square returns a `400 VALUE_TOO_LOW` or `400 VALUE_TOO_HIGH` error. The
     * default value is 100. For more information, see
     * [Pagination](https://developer.squareup.com/docs/build-basics/common-api-patterns/pagination).
     * @return Returns the Integer
     */
    @JsonGetter("limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getLimit() {
        return limit;
    }

    /**
     * Getter for SortField.
     * Specifies customer attributes as the sort key to customer profiles returned from a search.
     * @return Returns the String
     */
    @JsonGetter("sort_field")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSortField() {
        return sortField;
    }

    /**
     * Getter for SortOrder.
     * The order (e.g., chronological or alphabetical) in which results from a request are returned.
     * @return Returns the String
     */
    @JsonGetter("sort_order")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSortOrder() {
        return sortOrder;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cursor, limit, sortField, sortOrder);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListCustomersRequest)) {
            return false;
        }
        ListCustomersRequest other = (ListCustomersRequest) obj;
        return Objects.equals(cursor, other.cursor)
            && Objects.equals(limit, other.limit)
            && Objects.equals(sortField, other.sortField)
            && Objects.equals(sortOrder, other.sortOrder);
    }

    /**
     * Converts this ListCustomersRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ListCustomersRequest [" + "cursor=" + cursor + ", limit=" + limit + ", sortField="
                + sortField + ", sortOrder=" + sortOrder + "]";
    }

    /**
     * Builds a new {@link ListCustomersRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ListCustomersRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .cursor(getCursor())
                .limit(getLimit())
                .sortField(getSortField())
                .sortOrder(getSortOrder());
        return builder;
    }

    /**
     * Class to build instances of {@link ListCustomersRequest}.
     */
    public static class Builder {
        private String cursor;
        private Integer limit;
        private String sortField;
        private String sortOrder;



        /**
         * Setter for cursor.
         * @param  cursor  String value for cursor.
         * @return Builder
         */
        public Builder cursor(String cursor) {
            this.cursor = cursor;
            return this;
        }

        /**
         * Setter for limit.
         * @param  limit  Integer value for limit.
         * @return Builder
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * Setter for sortField.
         * @param  sortField  String value for sortField.
         * @return Builder
         */
        public Builder sortField(String sortField) {
            this.sortField = sortField;
            return this;
        }

        /**
         * Setter for sortOrder.
         * @param  sortOrder  String value for sortOrder.
         * @return Builder
         */
        public Builder sortOrder(String sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Builds a new {@link ListCustomersRequest} object using the set fields.
         * @return {@link ListCustomersRequest}
         */
        public ListCustomersRequest build() {
            return new ListCustomersRequest(cursor, limit, sortField, sortOrder);
        }
    }
}
