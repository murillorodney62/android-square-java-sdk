## Balance Payment Details

Reflects the current status of a balance payment.

### Structure

`BalancePaymentDetails`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `AccountId` | `String` | Optional | ID for the account used to fund the payment. |
| `Status` | `String` | Optional | The balance payment’s current state. Can be `COMPLETED` or `FAILED`. |

### Example (as JSON)

```json
{
  "account_id": null,
  "status": null
}
```

