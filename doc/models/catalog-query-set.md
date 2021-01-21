
# Catalog Query Set

The query filter to return the search result(s) by exact match of the specified `attribute_name` and any of
the `attribute_values`.

## Structure

`CatalogQuerySet`

## Fields

| Name | Type | Description | Getter |
|  --- | --- | --- | --- |
| `AttributeName` | `String` | The name of the attribute to be searched. Matching of the attribute name is exact.<br>**Constraints**: *Minimum Length*: `1` | String getAttributeName() |
| `AttributeValues` | `List<String>` | The desired values of the search attribute. Matching of the attribute values is exact and case insensitive.<br>A maximum of 250 values may be searched in a request. | List<String> getAttributeValues() |

## Example (as JSON)

```json
{
  "attribute_name": "attribute_name4",
  "attribute_values": [
    "attribute_values2",
    "attribute_values3",
    "attribute_values4"
  ]
}
```

