## Create Order Request Tax

__Deprecated__: Please use the [OrderLineItemTax](#type-orderlineitemtax) type in the
order field of [CreateOrderRequest](#type-createorderrequest) instead.

Represents a tax that can apply to either a single line item or an entire order.

### Structure

`CreateOrderRequestTax`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `CatalogObjectId` | `String` | Optional | Only used for catalog taxes. The catalog object ID of an existing [CatalogTax](#type-catalogtax).<br><br>Do not provide a value for this field if you provide values in other fields for an ad hoc tax. |
| `Name` | `String` | Optional | Only used for ad hoc taxes. The tax's name.<br><br>Do not provide a value for this field if you set `catalog_object_id`. |
| `Type` | [`String`](/doc/models/order-line-item-tax-type.md) | Optional | Indicates how the tax is applied to the associated line item or order. |
| `Percentage` | `String` | Optional | Only used for ad hoc taxes. The percentage of the tax, as a string representation of a decimal number.<br><br>A value of `7.25` corresponds to a percentage of 7.25%. This value range between 0.0 up to 100.0 |

### Example (as JSON)

```json
{
  "catalog_object_id": null,
  "name": null,
  "type": null,
  "percentage": null
}
```

