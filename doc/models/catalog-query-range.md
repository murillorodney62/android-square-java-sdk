## Catalog Query Range

### Structure

`CatalogQueryRange`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `AttributeName` | `String` |  | The name of the attribute to be searched. |
| `AttributeMinValue` | `Long` | Optional | The desired minimum value for the search attribute (inclusive). |
| `AttributeMaxValue` | `Long` | Optional | The desired maximum value for the search attribute (inclusive). |

### Example (as JSON)

```json
{
  "attribute_name": "attribute_name4",
  "attribute_min_value": null,
  "attribute_max_value": null
}
```

