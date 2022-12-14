
# Loyalty Program

Represents a Square loyalty program. Loyalty programs define how buyers can earn points and redeem points for rewards.
Square sellers can have only one loyalty program, which is created and managed from the Seller Dashboard.
For more information, see [Loyalty Program Overview](https://developer.squareup.com/docs/loyalty/overview).

## Structure

`LoyaltyProgram`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Id` | `String` | Required | The Square-assigned ID of the loyalty program. Updates to<br>the loyalty program do not modify the identifier.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` | String getId() |
| `Status` | [`String`](../../doc/models/loyalty-program-status.md) | Required | Indicates whether the program is currently active. | String getStatus() |
| `RewardTiers` | [`List<LoyaltyProgramRewardTier>`](../../doc/models/loyalty-program-reward-tier.md) | Required | The list of rewards for buyers, sorted by ascending points. | List<LoyaltyProgramRewardTier> getRewardTiers() |
| `ExpirationPolicy` | [`LoyaltyProgramExpirationPolicy`](../../doc/models/loyalty-program-expiration-policy.md) | Optional | Describes when the loyalty program expires. | LoyaltyProgramExpirationPolicy getExpirationPolicy() |
| `Terminology` | [`LoyaltyProgramTerminology`](../../doc/models/loyalty-program-terminology.md) | Required | Represents the naming used for loyalty points. | LoyaltyProgramTerminology getTerminology() |
| `LocationIds` | `List<String>` | Optional | The [locations](../../doc/models/location.md) at which the program is active. | List<String> getLocationIds() |
| `CreatedAt` | `String` | Required | The timestamp when the program was created, in RFC 3339 format.<br>**Constraints**: *Minimum Length*: `1` | String getCreatedAt() |
| `UpdatedAt` | `String` | Required | The timestamp when the reward was last updated, in RFC 3339 format.<br>**Constraints**: *Minimum Length*: `1` | String getUpdatedAt() |
| `AccrualRules` | [`List<LoyaltyProgramAccrualRule>`](../../doc/models/loyalty-program-accrual-rule.md) | Required | Defines how buyers can earn loyalty points from the base loyalty program.<br>To check for associated [loyalty promotions](../../doc/models/loyalty-promotion.md) that enable<br>buyers to earn extra points, call [ListLoyaltyPromotions](../../doc/api/loyalty.md#list-loyalty-promotions). | List<LoyaltyProgramAccrualRule> getAccrualRules() |

## Example (as JSON)

```json
{
  "status": "INACTIVE",
  "expiration_policy": null,
  "terminology": {}
}
```

