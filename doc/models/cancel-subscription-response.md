
# Cancel Subscription Response

Defines fields that are included in a
[CancelSubscription](/doc/api/subscriptions.md#cancel-subscription) response.

## Structure

`CancelSubscriptionResponse`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Errors` | [`List<Error>`](/doc/models/error.md) | Optional | Information about errors encountered during the request. | List<Error> getErrors() |
| `Subscription` | [`Subscription`](/doc/models/subscription.md) | Optional | Represents a customer subscription to a subscription plan.<br>For an overview of the `Subscription` type, see<br>[Subscription object](https://developer.squareup.com/docs/subscriptions-api/overview#subscription-object-overview). | Subscription getSubscription() |

## Example (as JSON)

```json
{
  "subscription": {
    "canceled_date": "2021-10-20",
    "card_id": "ccof:qy5x8hHGYsgLrp4Q4GB",
    "created_at": "2021-10-20T21:53:10Z",
    "customer_id": "CHFGVKYY8RSV93M5KCYTG4PN0G",
    "id": "910afd30-464a-4e00-a8d8-2296eEXAMPLE",
    "location_id": "S8GWD5R9QB376",
    "paid_until_date": "2021-11-20",
    "plan_id": "6JHXF3B2CW3YKHDV4XEM674H",
    "source": {
      "name": "My App"
    },
    "start_date": "2021-10-20",
    "status": "ACTIVE",
    "timezone": "America/Los_Angeles",
    "version": 1594311617331
  }
}
```

