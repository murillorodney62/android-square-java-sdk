
# Update Customer Request

Defines the body parameters that can be included in a request to the
`UpdateCustomer` endpoint.

## Structure

`UpdateCustomerRequest`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `GivenName` | `String` | Optional | The given name (that is, the first name) associated with the customer profile. | String getGivenName() |
| `FamilyName` | `String` | Optional | The family name (that is, the last name) associated with the customer profile. | String getFamilyName() |
| `CompanyName` | `String` | Optional | A business name associated with the customer profile. | String getCompanyName() |
| `Nickname` | `String` | Optional | A nickname for the customer profile. | String getNickname() |
| `EmailAddress` | `String` | Optional | The email address associated with the customer profile. | String getEmailAddress() |
| `Address` | [`Address`](/doc/models/address.md) | Optional | Represents a postal address in a country.<br>For more information, see [Working with Addresses](https://developer.squareup.com/docs/build-basics/working-with-addresses). | Address getAddress() |
| `PhoneNumber` | `String` | Optional | The 11-digit phone number associated with the customer profile. | String getPhoneNumber() |
| `ReferenceId` | `String` | Optional | An optional second ID used to associate the customer profile with an<br>entity in another system. | String getReferenceId() |
| `Note` | `String` | Optional | A custom note associated with the customer profile. | String getNote() |
| `Birthday` | `String` | Optional | The birthday associated with the customer profile, in RFC 3339 format. The year is optional. The timezone and time are not allowed.<br>For example, `0000-09-21T00:00:00-00:00` represents a birthday on September 21 and `1998-09-21T00:00:00-00:00` represents a birthday on September 21, 1998.<br>You can also specify this value in `YYYY-MM-DD` format. | String getBirthday() |
| `Version` | `Long` | Optional | The current version of the customer profile.<br><br>As a best practice, you should include this field to enable [optimistic concurrency](https://developer.squareup.com/docs/working-with-apis/optimistic-concurrency) control. For more information, see [Update a customer profile](https://developer.squareup.com/docs/customers-api/use-the-api/keep-records#update-a-customer-profile). | Long getVersion() |
| `TaxIds` | [`CustomerTaxIds`](/doc/models/customer-tax-ids.md) | Optional | Represents the tax ID associated with a [customer profile](/doc/models/customer.md). The corresponding `tax_ids` field is available only for customers of sellers in EU countries or the United Kingdom.<br>For more information, see [Customer tax IDs](https://developer.squareup.com/docs/customers-api/what-it-does#customer-tax-ids). | CustomerTaxIds getTaxIds() |

## Example (as JSON)

```json
{
  "email_address": "New.Amelia.Earhart@example.com",
  "note": "updated customer note",
  "phone_number": "",
  "version": 2
}
```

