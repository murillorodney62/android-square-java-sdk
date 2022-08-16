
# Create Booking Request

## Structure

`CreateBookingRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `IdempotencyKey` | `String` | Optional | A unique key to make this request an idempotent operation.<br>**Constraints**: *Maximum Length*: `255` | String getIdempotencyKey() |
| `Booking` | [`Booking`](../../doc/models/booking.md) | Required | Represents a booking as a time-bound service contract for a seller's staff member to provide a specified service<br>at a given location to a requesting customer in one or more appointment segments. | Booking getBooking() |

## Example (as JSON)

```json
{
  "idempotency_key": null,
  "booking": {
    "version": null,
    "status": null,
    "start_at": null,
    "location_id": null,
    "customer_id": null,
    "customer_note": null,
    "seller_note": null,
    "appointment_segments": null,
    "location_type": null,
    "creator_details": null,
    "source": null
  }
}
```

