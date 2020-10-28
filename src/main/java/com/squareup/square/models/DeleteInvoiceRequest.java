
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


/**
 * This is a model class for DeleteInvoiceRequest type.
 */
public class DeleteInvoiceRequest {
    private final Integer version;

    /**
     * Initialization constructor.
     * @param version Integer value for version.
     */
    @JsonCreator
    public DeleteInvoiceRequest(
            @JsonProperty("version") Integer version) {
        this.version = version;
    }

    /**
     * Getter for Version.
     * The version of the [invoice](#type-invoice) to delete. If you do not know the version, you
     * can call [GetInvoice](#endpoint-Invoices-GetInvoice) or
     * [ListInvoices](#endpoint-Invoices-ListInvoices).
     * @return Returns the Integer
     */
    @JsonGetter("version")
    public Integer getVersion() {
        return this.version;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(version);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DeleteInvoiceRequest)) {
            return false;
        }
        DeleteInvoiceRequest other = (DeleteInvoiceRequest) obj;
        return Objects.equals(version, other.version);
    }

    /**
     * Builds a new {@link DeleteInvoiceRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DeleteInvoiceRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .version(getVersion());
        return builder;
    }

    /**
     * Class to build instances of {@link DeleteInvoiceRequest}.
     */
    public static class Builder {
        private Integer version;



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
         * Builds a new {@link DeleteInvoiceRequest} object using the set fields.
         * @return {@link DeleteInvoiceRequest}
         */
        public DeleteInvoiceRequest build() {
            return new DeleteInvoiceRequest(version);
        }
    }
}
