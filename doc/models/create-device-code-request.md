
# Create Device Code Request

## Structure

`CreateDeviceCodeRequest`

## Fields

| Name | Type | Description | Getter |
|  --- | --- | --- | --- |
| `IdempotencyKey` | `String` | A unique string that identifies this CreateDeviceCode request. Keys can<br>be any valid string but must be unique for every CreateDeviceCode request.<br><br>See [Idempotency keys](https://developer.squareup.com/docs/basics/api101/idempotency) for more information.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `128` | String getIdempotencyKey() |
| `DeviceCode` | [`DeviceCode`](/doc/models/device-code.md) | - | DeviceCode getDeviceCode() |

## Example (as JSON)

```json
{
  "device_code": {
    "location_id": "B5E4484SHHNYH",
    "name": "Counter 1",
    "product_type": "TERMINAL_API"
  },
  "idempotency_key": "01bb00a6-0c86-4770-94ed-f5fca973cd56"
}
```

