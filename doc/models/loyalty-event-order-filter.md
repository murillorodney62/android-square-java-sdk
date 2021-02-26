
# Loyalty Event Order Filter

Filter events by the order associated with the event.

## Structure

`LoyaltyEventOrderFilter`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `OrderId` | `String` | Required | The ID of the [order](#type-Order) associated with the event.<br>**Constraints**: *Minimum Length*: `1` | String getOrderId() |

## Example (as JSON)

```json
{
  "order_id": "order_id6"
}
```

