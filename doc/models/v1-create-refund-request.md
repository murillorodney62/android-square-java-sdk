## V1 Create Refund Request

V1CreateRefundRequest

### Structure

`V1CreateRefundRequest`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `PaymentId` | `String` |  | The ID of the payment to refund. If you are creating a `PARTIAL`<br>refund for a split tender payment, instead provide the id of the<br>particular tender you want to refund. |
| `Type` | [`String`](/doc/models/v1-create-refund-request-type.md) |  | - |
| `Reason` | `String` |  | The reason for the refund. |
| `RefundedMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `RequestIdempotenceKey` | `String` | Optional | An optional key to ensure idempotence if you issue the same PARTIAL refund request more than once. |

### Example (as JSON)

```json
{
  "payment_id": "payment_id0",
  "type": "FULL",
  "reason": "reason4",
  "refunded_money": null,
  "request_idempotence_key": null
}
```

