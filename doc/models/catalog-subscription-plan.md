## Catalog Subscription Plan

Describes a subscription plan. For more information, see
[Set Up and Manage a Subscription Plan](https://developer.squareup.com/docs/docs/subscriptions-api/setup-plan).

### Structure

`CatalogSubscriptionPlan`

### Fields

| Name | Type | Tags | Description |
|  --- | --- | --- | --- |
| `Name` | `String` | Optional | The name of the plan. |
| `Phases` | [`List<SubscriptionPhase>`](/doc/models/subscription-phase.md) | Optional | A list of SubscriptionPhase containing the [SubscriptionPhase](#type-SubscriptionPhase) for this plan. |

### Example (as JSON)

```json
{
  "name": null,
  "phases": null
}
```

