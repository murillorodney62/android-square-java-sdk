## Refund

Represents a refund processed for a Square transaction.

### Structure

`Refund`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `String` |  | The refund's unique ID. |
| `LocationId` | `String` |  | The ID of the refund's associated location. |
| `TransactionId` | `String` |  | The ID of the transaction that the refunded tender is part of. |
| `TenderId` | `String` |  | The ID of the refunded tender. |
| `CreatedAt` | `String` | Optional | The time when the refund was created, in RFC 3339 format. |
| `Reason` | `String` |  | The reason for the refund being issued. |
| `AmountMoney` | [`Money`](/doc/models/money.md) |  | Represents an amount of money. `Money` fields can be signed or unsigned.<br>Fields that do not explicitly define whether they are signed or unsigned are<br>considered unsigned and can only hold positive amounts. For signed fields, the<br>sign of the value indicates the purpose of the money transfer. See<br>[Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)<br>for more information. |
| `Status` | [`String`](/doc/models/refund-status.md) |  | Indicates a refund's current status. |
| `ProcessingFeeMoney` | [`Money`](/doc/models/money.md) | Optional | Represents an amount of money. `Money` fields can be signed or unsigned.<br>Fields that do not explicitly define whether they are signed or unsigned are<br>considered unsigned and can only hold positive amounts. For signed fields, the<br>sign of the value indicates the purpose of the money transfer. See<br>[Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)<br>for more information. |
| `AdditionalRecipients` | [`List<AdditionalRecipient>`](/doc/models/additional-recipient.md) | Optional | Additional recipients (other than the merchant) receiving a portion of this refund.<br>For example, fees assessed on a refund of a purchase by a third party integration. |

### Example (as JSON)

```json
{
  "id": "id0",
  "location_id": "location_id4",
  "transaction_id": "transaction_id8",
  "tender_id": "tender_id8",
  "created_at": null,
  "reason": "reason4",
  "amount_money": {
    "amount": null,
    "currency": null
  },
  "status": "PENDING",
  "processing_fee_money": null,
  "additional_recipients": null
}
```

