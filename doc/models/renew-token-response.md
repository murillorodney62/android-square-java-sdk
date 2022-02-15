
# Renew Token Response

## Structure

`RenewTokenResponse`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `AccessToken` | `String` | Optional | The renewed access token.<br>This value might be different from the `access_token` you provided in your request.<br>You provide this token in a header with every request to Connect API endpoints.<br>See [Request and response headers](https://developer.squareup.com/docs/api/connect/v2/#requestandresponseheaders) for the format of this header.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `1024` | String getAccessToken() |
| `TokenType` | `String` | Optional | This value is always _bearer_.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `10` | String getTokenType() |
| `ExpiresAt` | `String` | Optional | The date when the `access_token` expires, in [ISO 8601](http://www.iso.org/iso/home/standards/iso8601.htm) format.<br>**Constraints**: *Minimum Length*: `20`, *Maximum Length*: `48` | String getExpiresAt() |
| `MerchantId` | `String` | Optional | The ID of the authorizing merchant's business.<br>**Constraints**: *Minimum Length*: `8`, *Maximum Length*: `191` | String getMerchantId() |
| `SubscriptionId` | `String` | Optional | __LEGACY FIELD__. The ID of the merchant subscription associated with<br>the authorization. The ID is only present if the merchant signed up for a subscription<br>during authorization. | String getSubscriptionId() |
| `PlanId` | `String` | Optional | __LEGACY FIELD__. The ID of the subscription plan the merchant signed<br>up for. The ID is only present if the merchant signed up for a subscription plan during<br>authorization. | String getPlanId() |
| `Errors` | [`List<Error>`](/doc/models/error.md) | Optional | An error object that provides details about how creation of the obtain<br>token failed. | List<Error> getErrors() |

## Example (as JSON)

```json
{
  "access_token": "ACCESS_TOKEN",
  "expires_at": "2006-01-02T15:04:05Z",
  "merchant_id": "MERCHANT_ID",
  "token_type": "bearer"
}
```

