## Search Loyalty Rewards Request Loyalty Reward Query

The set of search requirements.

### Structure

`SearchLoyaltyRewardsRequestLoyaltyRewardQuery`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `LoyaltyAccountId` | `String` |  | The ID of the [loyalty account](#type-LoyaltyAccount) to which the loyalty reward belongs. |
| `Status` | [`String`](/doc/models/loyalty-reward-status.md) | Optional | The status of the loyalty reward. |

### Example (as JSON)

```json
{
  "loyalty_account_id": "loyalty_account_id0",
  "status": null
}
```

