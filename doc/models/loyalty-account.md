
# Loyalty Account

Describes a loyalty account. For more information, see
[Manage Loyalty Accounts Using the Loyalty API](https://developer.squareup.com/docs/loyalty-api/overview).

## Structure

`LoyaltyAccount`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The Square-assigned ID of the loyalty account.<br>**Constraints**: *Maximum Length*: `36` | String getId() |
| `ProgramId` | `String` | Required | The Square-assigned ID of the [loyalty program](/doc/models/loyalty-program.md) to which the account belongs.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `36` | String getProgramId() |
| `Balance` | `Integer` | Optional | The available point balance in the loyalty account. If points are scheduled to expire, they are listed in the `expiring_point_deadlines` field.<br><br>Your application should be able to handle loyalty accounts that have a negative point balance (`balance` is less than 0). This might occur if a seller makes a manual adjustment or as a result of a refund or exchange. | Integer getBalance() |
| `LifetimePoints` | `Integer` | Optional | The total points accrued during the lifetime of the account. | Integer getLifetimePoints() |
| `CustomerId` | `String` | Optional | The Square-assigned ID of the [customer](/doc/models/customer.md) that is associated with the account. | String getCustomerId() |
| `EnrolledAt` | `String` | Optional | The timestamp when enrollment occurred, in RFC 3339 format. | String getEnrolledAt() |
| `CreatedAt` | `String` | Optional | The timestamp when the loyalty account was created, in RFC 3339 format. | String getCreatedAt() |
| `UpdatedAt` | `String` | Optional | The timestamp when the loyalty account was last updated, in RFC 3339 format. | String getUpdatedAt() |
| `Mapping` | [`LoyaltyAccountMapping`](/doc/models/loyalty-account-mapping.md) | Optional | Represents the mapping that associates a loyalty account with a buyer.<br><br>Currently, a loyalty account can only be mapped to a buyer by phone number. For more information, see<br>[Loyalty Overview](https://developer.squareup.com/docs/loyalty/overview). | LoyaltyAccountMapping getMapping() |
| `ExpiringPointDeadlines` | [`List<LoyaltyAccountExpiringPointDeadline>`](/doc/models/loyalty-account-expiring-point-deadline.md) | Optional | The schedule for when points expire in the loyalty account balance. This field is present only if the account has points that are scheduled to expire.<br><br>The total number of points in this field equals the number of points in the `balance` field. | List<LoyaltyAccountExpiringPointDeadline> getExpiringPointDeadlines() |

## Example (as JSON)

```json
{
  "id": "id0",
  "program_id": "program_id0",
  "balance": 64,
  "lifetime_points": 88,
  "customer_id": "customer_id8",
  "enrolled_at": "enrolled_at0"
}
```

