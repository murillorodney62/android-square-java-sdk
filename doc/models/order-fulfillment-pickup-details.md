
# Order Fulfillment Pickup Details

Contains details necessary to fulfill a pickup order.

## Structure

`OrderFulfillmentPickupDetails`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Recipient` | [`OrderFulfillmentRecipient`](../../doc/models/order-fulfillment-recipient.md) | Optional | Information about the fulfillment recipient. | OrderFulfillmentRecipient getRecipient() |
| `ExpiresAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when this fulfillment expires if it is not accepted. The timestamp must be in RFC 3339 format<br>(for example, "2016-09-04T23:59:33.123Z"). The expiration time can only be set up to 7 days in the future.<br>If `expires_at` is not set, this pickup fulfillment is automatically accepted when<br>placed. | String getExpiresAt() |
| `AutoCompleteDuration` | `String` | Optional | The duration of time after which an open and accepted pickup fulfillment<br>is automatically moved to the `COMPLETED` state. The duration must be in RFC 3339<br>format (for example, "P1W3D").<br><br>If not set, this pickup fulfillment remains accepted until it is canceled or completed. | String getAutoCompleteDuration() |
| `ScheduleType` | [`String`](../../doc/models/order-fulfillment-pickup-details-schedule-type.md) | Optional | The schedule type of the pickup fulfillment. | String getScheduleType() |
| `PickupAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>that represents the start of the pickup window. Must be in RFC 3339 timestamp format, e.g.,<br>"2016-09-04T23:59:33.123Z".<br><br>For fulfillments with the schedule type `ASAP`, this is automatically set<br>to the current time plus the expected duration to prepare the fulfillment. | String getPickupAt() |
| `PickupWindowDuration` | `String` | Optional | The window of time in which the order should be picked up after the `pickup_at` timestamp.<br>Must be in RFC 3339 duration format, e.g., "P1W3D". Can be used as an<br>informational guideline for merchants. | String getPickupWindowDuration() |
| `PrepTimeDuration` | `String` | Optional | The duration of time it takes to prepare this fulfillment.<br>The duration must be in RFC 3339 format (for example, "P1W3D"). | String getPrepTimeDuration() |
| `Note` | `String` | Optional | A note to provide additional instructions about the pickup<br>fulfillment displayed in the Square Point of Sale application and set by the API.<br>**Constraints**: *Maximum Length*: `500` | String getNote() |
| `PlacedAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment was placed. The timestamp must be in RFC 3339 format<br>(for example, "2016-09-04T23:59:33.123Z"). | String getPlacedAt() |
| `AcceptedAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment was accepted. The timestamp must be in RFC 3339 format<br>(for example, "2016-09-04T23:59:33.123Z"). | String getAcceptedAt() |
| `RejectedAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment was rejected. The timestamp must be in RFC 3339 format<br>(for example, "2016-09-04T23:59:33.123Z"). | String getRejectedAt() |
| `ReadyAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment is marked as ready for pickup. The timestamp must be in RFC 3339 format<br>(for example, "2016-09-04T23:59:33.123Z"). | String getReadyAt() |
| `ExpiredAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment expired. The timestamp must be in RFC 3339 format<br>(for example, "2016-09-04T23:59:33.123Z"). | String getExpiredAt() |
| `PickedUpAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment was picked up by the recipient. The timestamp must be in RFC 3339 format<br>(for example, "2016-09-04T23:59:33.123Z"). | String getPickedUpAt() |
| `CanceledAt` | `String` | Optional | The [timestamp](https://developer.squareup.com/docs/build-basics/working-with-dates)<br>indicating when the fulfillment was canceled. The timestamp must be in RFC 3339 format<br>(for example, "2016-09-04T23:59:33.123Z"). | String getCanceledAt() |
| `CancelReason` | `String` | Optional | A description of why the pickup was canceled. The maximum length: 100 characters.<br>**Constraints**: *Maximum Length*: `100` | String getCancelReason() |
| `IsCurbsidePickup` | `Boolean` | Optional | If set to `true`, indicates that this pickup order is for curbside pickup, not in-store pickup. | Boolean getIsCurbsidePickup() |
| `CurbsidePickupDetails` | [`OrderFulfillmentPickupDetailsCurbsidePickupDetails`](../../doc/models/order-fulfillment-pickup-details-curbside-pickup-details.md) | Optional | Specific details for curbside pickup. | OrderFulfillmentPickupDetailsCurbsidePickupDetails getCurbsidePickupDetails() |

## Example (as JSON)

```json
{
  "recipient": null,
  "expires_at": null,
  "auto_complete_duration": null,
  "schedule_type": null,
  "pickup_at": null,
  "pickup_window_duration": null,
  "prep_time_duration": null,
  "note": null,
  "placed_at": null,
  "accepted_at": null,
  "rejected_at": null,
  "ready_at": null,
  "expired_at": null,
  "picked_up_at": null,
  "canceled_at": null,
  "cancel_reason": null,
  "is_curbside_pickup": null,
  "curbside_pickup_details": null
}
```

