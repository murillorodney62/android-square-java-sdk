
# Loyalty Promotion

Represents a promotion for a [loyalty program](../../doc/models/loyalty-program.md). Loyalty promotions enable buyers
to earn extra points on top of those earned from the base program.

A loyalty program can have a maximum of 10 loyalty promotions with an `ACTIVE` or `SCHEDULED` status.

## Structure

`LoyaltyPromotion`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The Square-assigned ID of the promotion.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getId() |
| `Name` | `String` | Required | The name of the promotion.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `50` | String getName() |
| `Incentive` | [`LoyaltyPromotionIncentive`](../../doc/models/loyalty-promotion-incentive.md) | Required | Represents how points for a [loyalty promotion](../../doc/models/loyalty-promotion.md) are calculated,<br>either by multiplying the points earned from the base program or by adding a specified number<br>of points to the points earned from the base program. | LoyaltyPromotionIncentive getIncentive() |
| `AvailableTime` | [`LoyaltyPromotionAvailableTimeData`](../../doc/models/loyalty-promotion-available-time-data.md) | Required | Represents scheduling information that determines when purchases can qualify to earn points<br>from a [loyalty promotion](../../doc/models/loyalty-promotion.md). | LoyaltyPromotionAvailableTimeData getAvailableTime() |
| `TriggerLimit` | [`LoyaltyPromotionTriggerLimit`](../../doc/models/loyalty-promotion-trigger-limit.md) | Optional | Represents the number of times a buyer can earn points during a [loyalty promotion](../../doc/models/loyalty-promotion.md).<br>If this field is not set, buyers can trigger the promotion an unlimited number of times to earn points during<br>the time that the promotion is available.<br><br>A purchase that is disqualified from earning points because of this limit might qualify for another active promotion. | LoyaltyPromotionTriggerLimit getTriggerLimit() |
| `Status` | [`String`](../../doc/models/loyalty-promotion-status.md) | Optional | Indicates the status of a [loyalty promotion](../../doc/models/loyalty-promotion.md). | String getStatus() |
| `CreatedAt` | `String` | Optional | The timestamp of when the promotion was created, in RFC 3339 format. | String getCreatedAt() |
| `CanceledAt` | `String` | Optional | The timestamp of when the promotion was canceled, in RFC 3339 format. | String getCanceledAt() |
| `UpdatedAt` | `String` | Optional | The timestamp when the promotion was last updated, in RFC 3339 format. | String getUpdatedAt() |
| `LoyaltyProgramId` | `String` | Optional | The ID of the [loyalty program](../../doc/models/loyalty-program.md) associated with the promotion. | String getLoyaltyProgramId() |
| `MinimumSpendAmountMoney` | [`Money`](../../doc/models/money.md) | Optional | Represents an amount of money. `Money` fields can be signed or unsigned.<br>Fields that do not explicitly define whether they are signed or unsigned are<br>considered unsigned and can only hold positive amounts. For signed fields, the<br>sign of the value indicates the purpose of the money transfer. See<br>[Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)<br>for more information. | Money getMinimumSpendAmountMoney() |

## Example (as JSON)

```json
{
  "name": "name0",
  "incentive": {
    "type": "POINTS_MULTIPLIER",
    "points_multiplier_data": null,
    "points_addition_data": null
  },
  "available_time": {
    "time_periods": [
      "time_periods9"
    ]
  },
  "trigger_limit": null,
  "status": null,
  "minimum_spend_amount_money": null
}
```

