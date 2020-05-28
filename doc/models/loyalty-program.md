## Loyalty Program

### Structure

`LoyaltyProgram`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Id` | `String` |  | The Square-assigned ID of the loyalty program. Updates to <br>the loyalty program do not modify the identifier. |
| `Status` | [`String`](/doc/models/loyalty-program-status.md) |  | Whether the program is currently active. |
| `RewardTiers` | [`List<LoyaltyProgramRewardTier>`](/doc/models/loyalty-program-reward-tier.md) |  | The list of rewards for buyers, sorted by ascending points. |
| `ExpirationPolicy` | [`LoyaltyProgramExpirationPolicy`](/doc/models/loyalty-program-expiration-policy.md) | Optional | Describes when the loyalty program expires. |
| `Terminology` | [`LoyaltyProgramTerminology`](/doc/models/loyalty-program-terminology.md) |  | - |
| `LocationIds` | `List<String>` |  | The [locations](#type-Location) at which the program is active. |
| `CreatedAt` | `String` |  | The timestamp when the program was created, in RFC 3339 format. |
| `UpdatedAt` | `String` |  | The timestamp when the reward was last updated, in RFC 3339 format. |
| `AccrualRules` | [`List<LoyaltyProgramAccrualRule>`](/doc/models/loyalty-program-accrual-rule.md) |  | Defines how buyers can earn loyalty points. |

### Example (as JSON)

```json
{
  "id": "id0",
  "status": "INACTIVE",
  "reward_tiers": [
    {
      "id": "id9",
      "points": 249,
      "name": "name9",
      "definition": {
        "scope": "CATEGORY",
        "discount_type": "FIXED_PERCENTAGE",
        "percentage_discount": null,
        "catalog_object_ids": null,
        "fixed_discount_money": null,
        "max_discount_money": null
      },
      "created_at": "created_at7"
    },
    {
      "id": "id0",
      "points": 248,
      "name": "name0",
      "definition": {
        "scope": "ORDER",
        "discount_type": "FIXED_AMOUNT",
        "percentage_discount": null,
        "catalog_object_ids": null,
        "fixed_discount_money": null,
        "max_discount_money": null
      },
      "created_at": "created_at8"
    }
  ],
  "expiration_policy": null,
  "terminology": {
    "one": "one0",
    "other": "other6"
  },
  "location_ids": [
    "location_ids0"
  ],
  "created_at": "created_at2",
  "updated_at": "updated_at4",
  "accrual_rules": [
    {
      "accrual_type": "ITEM_VARIATION",
      "points": null,
      "visit_minimum_amount_money": null,
      "spend_amount_money": null,
      "catalog_object_id": null
    },
    {
      "accrual_type": "SPEND",
      "points": null,
      "visit_minimum_amount_money": null,
      "spend_amount_money": null,
      "catalog_object_id": null
    }
  ]
}
```

