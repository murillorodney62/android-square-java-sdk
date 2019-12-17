## V1 Payment Discount

V1PaymentDiscount

### Structure

`V1PaymentDiscount`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `String` | Optional | The discount's name. |
| `AppliedMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `DiscountId` | `String` | Optional | The ID of the applied discount, if available. Discounts applied in older versions of Square Register might not have an ID. |

### Example (as JSON)

```json
{
  "name": null,
  "applied_money": null,
  "discount_id": null
}
```

