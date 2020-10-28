
# Device Details

Details about the device that took the payment.

## Structure

`DeviceDetails`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `DeviceId` | `String` | Optional | Square-issued ID of the device. | String getDeviceId() |
| `DeviceInstallationId` | `String` | Optional | Square-issued installation ID for the device. | String getDeviceInstallationId() |
| `DeviceName` | `String` | Optional | The name of the device set by the merchant. | String getDeviceName() |

## Example (as JSON)

```json
{
  "device_id": "device_id6",
  "device_installation_id": "device_installation_id8",
  "device_name": "device_name2"
}
```

