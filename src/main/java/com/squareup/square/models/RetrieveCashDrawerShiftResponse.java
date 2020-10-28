
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.squareup.square.http.client.HttpContext;
import java.util.List;
import java.util.Objects;


/**
 * This is a model class for RetrieveCashDrawerShiftResponse type.
 */
public class RetrieveCashDrawerShiftResponse {
    private HttpContext httpContext;
    private final CashDrawerShift cashDrawerShift;
    private final List<Error> errors;

    /**
     * Initialization constructor.
     * @param cashDrawerShift CashDrawerShift value for cashDrawerShift.
     * @param errors List of Error value for errors.
     */
    @JsonCreator
    public RetrieveCashDrawerShiftResponse(
            @JsonProperty("cash_drawer_shift") CashDrawerShift cashDrawerShift,
            @JsonProperty("errors") List<Error> errors) {
        this.cashDrawerShift = cashDrawerShift;
        this.errors = errors;
    }

    public HttpContext getContext() {
        return httpContext;
    }

    /**
     * Getter for CashDrawerShift.
     * This model gives the details of a cash drawer shift. The cash_payment_money,
     * cash_refund_money, cash_paid_in_money, and cash_paid_out_money fields are all computed by
     * summing their respective event types.
     * @return Returns the CashDrawerShift
     */
    @JsonGetter("cash_drawer_shift")
    public CashDrawerShift getCashDrawerShift() {
        return this.cashDrawerShift;
    }

    /**
     * Getter for Errors.
     * Any errors that occurred during the request.
     * @return Returns the List of Error
     */
    @JsonGetter("errors")
    public List<Error> getErrors() {
        return this.errors;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(cashDrawerShift, errors);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetrieveCashDrawerShiftResponse)) {
            return false;
        }
        RetrieveCashDrawerShiftResponse other = (RetrieveCashDrawerShiftResponse) obj;
        return Objects.equals(cashDrawerShift, other.cashDrawerShift)
            && Objects.equals(errors, other.errors);
    }

    /**
     * Builds a new {@link RetrieveCashDrawerShiftResponse.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link RetrieveCashDrawerShiftResponse.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .cashDrawerShift(getCashDrawerShift())
            .errors(getErrors());
        return builder;
    }

    /**
     * Class to build instances of {@link RetrieveCashDrawerShiftResponse}.
     */
    public static class Builder {
        private HttpContext httpContext;
        private CashDrawerShift cashDrawerShift;
        private List<Error> errors;



        /**
         * Setter for httpContext.
         * @param httpContext HttpContext value for httpContext.
         * @return Builder
         */
        public Builder httpContext(HttpContext httpContext) {
            this.httpContext = httpContext;
            return this;
        }

        /**
         * Setter for cashDrawerShift.
         * @param cashDrawerShift CashDrawerShift value for cashDrawerShift.
         * @return Builder
         */
        public Builder cashDrawerShift(CashDrawerShift cashDrawerShift) {
            this.cashDrawerShift = cashDrawerShift;
            return this;
        }

        /**
         * Setter for errors.
         * @param errors List of Error value for errors.
         * @return Builder
         */
        public Builder errors(List<Error> errors) {
            this.errors = errors;
            return this;
        }

        /**
         * Builds a new {@link RetrieveCashDrawerShiftResponse} object using the set fields.
         * @return {@link RetrieveCashDrawerShiftResponse}
         */
        public RetrieveCashDrawerShiftResponse build() {
            RetrieveCashDrawerShiftResponse model =
                    new RetrieveCashDrawerShiftResponse(cashDrawerShift,
                            errors);
            model.httpContext = httpContext;
            return model;
        }
    }
}
