
# Subscription Event Info

Provides information about the subscription event.

## Structure

`SubscriptionEventInfo`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Detail` | `String` | Optional | A human-readable explanation for the event. | String getDetail() |
| `Code` | [`String`](/doc/models/subscription-event-info-code.md) | Optional | The possible subscription event info codes. | String getCode() |

## Example (as JSON)

```json
{
  "detail": "detail6",
  "code": "CUSTOMER_NO_EMAIL"
}
```

