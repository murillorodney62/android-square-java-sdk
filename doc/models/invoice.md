
# Invoice

Stores information about an invoice. You use the Invoices API to create and manage
invoices. For more information, see [Manage Invoices Using the Invoices API](https://developer.squareup.com/docs/invoices-api/overview).

## Structure

`Invoice`

## Fields

| Name | Type | Tags | Description | Getter |
|  --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | The Square-assigned ID of the invoice. | String getId() |
| `Version` | `Integer` | Optional | The Square-assigned version number, which is incremented each time an update is committed to the invoice. | Integer getVersion() |
| `LocationId` | `String` | Optional | The ID of the location that this invoice is associated with.<br><br>If specified in a `CreateInvoice` request, the value must match the `location_id` of the associated order.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getLocationId() |
| `OrderId` | `String` | Optional | The ID of the [order](/doc/models/order.md) for which the invoice is created.<br>This field is required when creating an invoice, and the order must be in the `OPEN` state.<br><br>To view the line items and other information for the associated order, call the<br>[RetrieveOrder](/doc/api/orders.md#retrieve-order) endpoint using the order ID.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getOrderId() |
| `PrimaryRecipient` | [`InvoiceRecipient`](/doc/models/invoice-recipient.md) | Optional | Provides customer data that Square uses to deliver an invoice. | InvoiceRecipient getPrimaryRecipient() |
| `PaymentRequests` | [`List<InvoicePaymentRequest>`](/doc/models/invoice-payment-request.md) | Optional | The payment schedule for the invoice, represented by one or more payment requests that<br>define payment settings, such as amount due and due date. You can specify a maximum of 13<br>payment requests, with up to 12 `INSTALLMENT` request types. For more information, see<br>[Payment requests](https://developer.squareup.com/docs/invoices-api/overview#payment-requests).<br><br>This field is required when creating an invoice. It must contain at least one payment request. | List<InvoicePaymentRequest> getPaymentRequests() |
| `DeliveryMethod` | [`String`](/doc/models/invoice-delivery-method.md) | Optional | Indicates how Square delivers the [invoice](/doc/models/invoice.md) to the customer. | String getDeliveryMethod() |
| `InvoiceNumber` | `String` | Optional | A user-friendly invoice number. The value is unique within a location.<br>If not provided when creating an invoice, Square assigns a value.<br>It increments from 1 and padded with zeros making it 7 characters long<br>(for example, 0000001 and 0000002).<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `191` | String getInvoiceNumber() |
| `Title` | `String` | Optional | The title of the invoice.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `255` | String getTitle() |
| `Description` | `String` | Optional | The description of the invoice. This is visible to the customer receiving the invoice.<br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `65536` | String getDescription() |
| `ScheduledAt` | `String` | Optional | The timestamp when the invoice is scheduled for processing, in RFC 3339 format.<br>After the invoice is published, Square processes the invoice on the specified date,<br>according to the delivery method and payment request settings.<br><br>If the field is not set, Square processes the invoice immediately after it is published. | String getScheduledAt() |
| `PublicUrl` | `String` | Optional | The URL of the Square-hosted invoice page.<br>After you publish the invoice using the `PublishInvoice` endpoint, Square hosts the invoice<br>page and returns the page URL in the response. | String getPublicUrl() |
| `NextPaymentAmountMoney` | [`Money`](/doc/models/money.md) | Optional | Represents an amount of money. `Money` fields can be signed or unsigned.<br>Fields that do not explicitly define whether they are signed or unsigned are<br>considered unsigned and can only hold positive amounts. For signed fields, the<br>sign of the value indicates the purpose of the money transfer. See<br>[Working with Monetary Amounts](https://developer.squareup.com/docs/build-basics/working-with-monetary-amounts)<br>for more information. | Money getNextPaymentAmountMoney() |
| `Status` | [`String`](/doc/models/invoice-status.md) | Optional | Indicates the status of an invoice. | String getStatus() |
| `Timezone` | `String` | Optional | The time zone used to interpret calendar dates on the invoice, such as `due_date`.<br>When an invoice is created, this field is set to the `timezone` specified for the seller<br>location. The value cannot be changed.<br><br>For example, a payment `due_date` of 2021-03-09 with a `timezone` of America/Los\_Angeles<br>becomes overdue at midnight on March 9 in America/Los\_Angeles (which equals a UTC timestamp<br>of 2021-03-10T08:00:00Z). | String getTimezone() |
| `CreatedAt` | `String` | Optional | The timestamp when the invoice was created, in RFC 3339 format. | String getCreatedAt() |
| `UpdatedAt` | `String` | Optional | The timestamp when the invoice was last updated, in RFC 3339 format. | String getUpdatedAt() |
| `AcceptedPaymentMethods` | [`InvoiceAcceptedPaymentMethods`](/doc/models/invoice-accepted-payment-methods.md) | Optional | The payment methods that customers can use to pay an invoice on the Square-hosted invoice page. | InvoiceAcceptedPaymentMethods getAcceptedPaymentMethods() |
| `CustomFields` | [`List<InvoiceCustomField>`](/doc/models/invoice-custom-field.md) | Optional | Additional seller-defined fields to render on the invoice. These fields are visible to sellers and buyers<br>on the Square-hosted invoice page and in emailed or PDF copies of invoices. For more information, see<br>[Custom fields](https://developer.squareup.com/docs/invoices-api/overview#custom-fields).<br><br>Max: 2 custom fields | List<InvoiceCustomField> getCustomFields() |
| `SubscriptionId` | `String` | Optional | The ID of the [subscription](/doc/models/subscription.md) associated with the invoice.<br>This field is present only on subscription billing invoices. | String getSubscriptionId() |

## Example (as JSON)

```json
{
  "id": "id0",
  "version": 172,
  "location_id": "location_id4",
  "order_id": "order_id6",
  "primary_recipient": {
    "customer_id": "customer_id2",
    "given_name": "given_name6",
    "family_name": "family_name8",
    "email_address": "email_address2",
    "address": {
      "address_line_1": "address_line_10",
      "address_line_2": "address_line_20",
      "address_line_3": "address_line_36",
      "locality": "locality0",
      "sublocality": "sublocality0"
    }
  }
}
```

