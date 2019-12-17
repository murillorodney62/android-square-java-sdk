## V1 Refund

V1Refund

### Structure

`V1Refund`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Type` | [`String`](/doc/models/v1-refund-type.md) | Optional | - |
| `Reason` | `String` | Optional | The merchant-specified reason for the refund. |
| `RefundedMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `RefundedProcessingFeeMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `RefundedTaxMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `RefundedAdditiveTaxMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `RefundedAdditiveTax` | [`List<V1PaymentTax>`](/doc/models/v1-payment-tax.md) | Optional | All of the additive taxes associated with the refund. |
| `RefundedInclusiveTaxMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `RefundedInclusiveTax` | [`List<V1PaymentTax>`](/doc/models/v1-payment-tax.md) | Optional | All of the inclusive taxes associated with the refund. |
| `RefundedTipMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `RefundedDiscountMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `RefundedSurchargeMoney` | [`V1Money`](/doc/models/v1-money.md) | Optional | - |
| `RefundedSurcharges` | [`List<V1PaymentSurcharge>`](/doc/models/v1-payment-surcharge.md) | Optional | A list of all surcharges associated with the refund. |
| `CreatedAt` | `String` | Optional | The time when the merchant initiated the refund for Square to process, in ISO 8601 format. |
| `ProcessedAt` | `String` | Optional | The time when Square processed the refund on behalf of the merchant, in ISO 8601 format. |
| `PaymentId` | `String` | Optional | A Square-issued ID associated with the refund. For single-tender refunds, payment_id is the ID of the original payment ID. For split-tender refunds, payment_id is the ID of the original tender. For exchange-based refunds (is_exchange == true), payment_id is the ID of the original payment ID even if the payment includes other tenders. |
| `MerchantId` | `String` | Optional | - |
| `IsExchange` | `Boolean` | Optional | Indicates whether or not the refund is associated with an exchange. If is_exchange is true, the refund reflects the value of goods returned in the exchange not the total money refunded. |

### Example (as JSON)

```json
{
  "type": null,
  "reason": null,
  "refunded_money": null,
  "refunded_processing_fee_money": null,
  "refunded_tax_money": null,
  "refunded_additive_tax_money": null,
  "refunded_additive_tax": null,
  "refunded_inclusive_tax_money": null,
  "refunded_inclusive_tax": null,
  "refunded_tip_money": null,
  "refunded_discount_money": null,
  "refunded_surcharge_money": null,
  "refunded_surcharges": null,
  "created_at": null,
  "processed_at": null,
  "payment_id": null,
  "merchant_id": null,
  "is_exchange": null
}
```

