
package com.squareup.square.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Objects;


/**
 * This is a model class for V1PageCell type.
 */
public class V1PageCell {
    private final String pageId;
    private final Integer row;
    private final Integer column;
    private final String objectType;
    private final String objectId;
    private final String placeholderType;

    /**
     * Initialization constructor.
     * @param pageId String value for pageId.
     * @param row Integer value for row.
     * @param column Integer value for column.
     * @param objectType String value for objectType.
     * @param objectId String value for objectId.
     * @param placeholderType String value for placeholderType.
     */
    @JsonCreator
    public V1PageCell(
            @JsonProperty("page_id") String pageId,
            @JsonProperty("row") Integer row,
            @JsonProperty("column") Integer column,
            @JsonProperty("object_type") String objectType,
            @JsonProperty("object_id") String objectId,
            @JsonProperty("placeholder_type") String placeholderType) {
        this.pageId = pageId;
        this.row = row;
        this.column = column;
        this.objectType = objectType;
        this.objectId = objectId;
        this.placeholderType = placeholderType;
    }

    /**
     * Getter for PageId.
     * The unique identifier of the page the cell is included on.
     * @return Returns the String
     */
    @JsonGetter("page_id")
    public String getPageId() {
        return this.pageId;
    }

    /**
     * Getter for Row.
     * The row of the cell. Always an integer between 0 and 4, inclusive.
     * @return Returns the Integer
     */
    @JsonGetter("row")
    public Integer getRow() {
        return this.row;
    }

    /**
     * Getter for Column.
     * The column of the cell. Always an integer between 0 and 4, inclusive.
     * @return Returns the Integer
     */
    @JsonGetter("column")
    public Integer getColumn() {
        return this.column;
    }

    /**
     * Getter for ObjectType.
     * @return Returns the String
     */
    @JsonGetter("object_type")
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * Getter for ObjectId.
     * The unique identifier of the entity represented in the cell. Not present for cells with an
     * object_type of PLACEHOLDER.
     * @return Returns the String
     */
    @JsonGetter("object_id")
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * Getter for PlaceholderType.
     * @return Returns the String
     */
    @JsonGetter("placeholder_type")
    public String getPlaceholderType() {
        return this.placeholderType;
    }

 
    @Override
    public int hashCode() {
        return Objects.hash(pageId, row, column, objectType, objectId, placeholderType);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof V1PageCell)) {
            return false;
        }
        V1PageCell other = (V1PageCell) obj;
        return Objects.equals(pageId, other.pageId)
            && Objects.equals(row, other.row)
            && Objects.equals(column, other.column)
            && Objects.equals(objectType, other.objectType)
            && Objects.equals(objectId, other.objectId)
            && Objects.equals(placeholderType, other.placeholderType);
    }

    /**
     * Builds a new {@link V1PageCell.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link V1PageCell.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
            .pageId(getPageId())
            .row(getRow())
            .column(getColumn())
            .objectType(getObjectType())
            .objectId(getObjectId())
            .placeholderType(getPlaceholderType());
        return builder;
    }

    /**
     * Class to build instances of {@link V1PageCell}.
     */
    public static class Builder {
        private String pageId;
        private Integer row;
        private Integer column;
        private String objectType;
        private String objectId;
        private String placeholderType;



        /**
         * Setter for pageId.
         * @param pageId String value for pageId.
         * @return Builder
         */
        public Builder pageId(String pageId) {
            this.pageId = pageId;
            return this;
        }

        /**
         * Setter for row.
         * @param row Integer value for row.
         * @return Builder
         */
        public Builder row(Integer row) {
            this.row = row;
            return this;
        }

        /**
         * Setter for column.
         * @param column Integer value for column.
         * @return Builder
         */
        public Builder column(Integer column) {
            this.column = column;
            return this;
        }

        /**
         * Setter for objectType.
         * @param objectType String value for objectType.
         * @return Builder
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * Setter for objectId.
         * @param objectId String value for objectId.
         * @return Builder
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * Setter for placeholderType.
         * @param placeholderType String value for placeholderType.
         * @return Builder
         */
        public Builder placeholderType(String placeholderType) {
            this.placeholderType = placeholderType;
            return this;
        }

        /**
         * Builds a new {@link V1PageCell} object using the set fields.
         * @return {@link V1PageCell}
         */
        public V1PageCell build() {
            return new V1PageCell(pageId,
                row,
                column,
                objectType,
                objectId,
                placeholderType);
        }
    }
}
