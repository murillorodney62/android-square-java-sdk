
# Obtain Token Request

## Structure

`ObtainTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `ClientId` | `String` | Required | The Square-issued ID of your application, available from the<br>[application dashboard](https://connect.squareup.com/apps).<br>**Constraints**: *Maximum Length*: `191` | String getClientId() |
| `ClientSecret` | `String` | Required | The Square-issued application secret for your application, available<br>from the [application dashboard](https://connect.squareup.com/apps).<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `1024` | String getClientSecret() |
| `Code` | `String` | Optional | The authorization code to exchange.<br>This is required if `grant_type` is set to `authorization_code`, to indicate that<br>the application wants to exchange an authorization code for an OAuth access token.<br>**Constraints**: *Maximum Length*: `191` | String getCode() |
| `RedirectUri` | `String` | Optional | The redirect URL assigned in the [application dashboard](https://connect.squareup.com/apps).<br>**Constraints**: *Maximum Length*: `2048` | String getRedirectUri() |
| `GrantType` | `String` | Required | Specifies the method to request an OAuth access token.<br>Valid values are: `authorization_code`, `refresh_token`, and `migration_token`<br>**Constraints**: *Minimum Length*: `10`, *Maximum Length*: `20` | String getGrantType() |
| `RefreshToken` | `String` | Optional | A valid refresh token for generating a new OAuth access token.<br>A valid refresh token is required if `grant_type` is set to `refresh_token` ,<br>to indicate the application wants a replacement for an expired OAuth access token.<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `1024` | String getRefreshToken() |
| `MigrationToken` | `String` | Optional | Legacy OAuth access token obtained using a Connect API version prior<br>to 2019-03-13. This parameter is required if `grant_type` is set to<br>`migration_token` to indicate that the application wants to get a replacement<br>OAuth access token. The response also returns a refresh token.<br>For more information, see [Migrate to Using Refresh Tokens](https://developer.squareup.com/docs/oauth-api/migrate-to-refresh-tokens).<br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `1024` | String getMigrationToken() |
| `Scopes` | `List<String>` | Optional | __OPTIONAL__<br><br>A JSON list of strings representing the permissions the application is requesting.<br>For example: "`["MERCHANT_PROFILE_READ","PAYMENTS_READ","BANK_ACCOUNTS_READ"]`"<br>The access token returned in the response is granted the permissions<br>that comprise the intersection between the requested list of permissions, and those<br>that belong to the provided refresh token. | List<String> getScopes() |
| `ShortLived` | `Boolean` | Optional | __OPTIONAL__<br><br>A boolean indicating a request for a short-lived access token.<br>The short-lived access token returned in the response will expire in 24 hours. | Boolean getShortLived() |

## Example (as JSON)

```json
{
  "client_id": "APPLICATION_ID",
  "client_secret": "APPLICATION_SECRET",
  "code": "CODE_FROM_AUTHORIZE",
  "grant_type": "authorization_code"
}
```

