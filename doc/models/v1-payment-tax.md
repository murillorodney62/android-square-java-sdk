## V1 Payment Tax

V1PaymentTax

### Structure

`V1PaymentTax`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Errors` | [`List<Error>`](/doc/models/error.md) | Optional | Any errors that occurred during the request. |
| `Name` | `String` | Optional | The merchant-defined name of the tax. |
| `AppliedMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `Rate` | `String` | Optional | The rate of the tax, as a string representation of a decimal number. A value of 0.07 corresponds to a rate of 7%. |
| `InclusionType` | [`String`](/doc/models/v1-payment-tax-inclusion-type.md) | Optional | - |
| `FeeId` | `String` | Optional | The ID of the tax, if available. Taxes applied in older versions of Square Register might not have an ID. |

### Example (as JSON)

```json
{
  "errors": null,
  "name": null,
  "applied_money": null,
  "rate": null,
  "inclusion_type": null,
  "fee_id": null
}
```

