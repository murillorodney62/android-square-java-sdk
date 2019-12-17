## V1 Discount

V1Discount

### Structure

`V1Discount`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `String` | Optional | The discount's unique ID. |
| `Name` | `String` | Optional | The discount's name. |
| `Rate` | `String` | Optional | The rate of the discount, as a string representation of a decimal number. A value of 0.07 corresponds to a rate of 7%. This rate is 0 if discount_type is VARIABLE_PERCENTAGE. |
| `AmountMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `DiscountType` | [`String`](/doc/models/v1-discount-discount-type.md) | Optional | - |
| `PinRequired` | `Boolean` | Optional | Indicates whether a mobile staff member needs to enter their PIN to apply the discount to a payment. |
| `Color` | [`String`](/doc/models/v1-discount-color.md) | Optional | - |
| `V2Id` | `String` | Optional | The ID of the CatalogObject in the Connect v2 API. Objects that are shared across multiple locations share the same v2 ID. |

### Example (as JSON)

```json
{
  "id": null,
  "name": null,
  "rate": null,
  "amount_money": null,
  "discount_type": null,
  "pin_required": null,
  "color": null,
  "v2_id": null
}
```

