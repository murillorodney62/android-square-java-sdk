
# Update Customer Custom Attribute Definition Request

Represents an [UpdateCustomerCustomAttributeDefinition](../../doc/api/customer-custom-attributes.md#update-customer-custom-attribute-definition) request.

## Structure

`UpdateCustomerCustomAttributeDefinitionRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `CustomAttributeDefinition` | [`CustomAttributeDefinition`](../../doc/models/custom-attribute-definition.md) | Required | Represents a definition for custom attribute values. A custom attribute definition<br>specifies the key, visibility, schema, and other properties for a custom attribute. | CustomAttributeDefinition getCustomAttributeDefinition() |
| `IdempotencyKey` | `String` | Optional | A unique identifier for this request, used to ensure idempotency. For more information,<br>see [Idempotency](https://developer.squareup.com/docs/build-basics/common-api-patterns/idempotency).<br>**Constraints**: *Maximum Length*: `45` | String getIdempotencyKey() |

## Example (as JSON)

```json
{
  "custom_attribute_definition": {
    "description": "Update the description as desired.",
    "visibility": "VISIBILITY_READ_ONLY"
  }
}
```

