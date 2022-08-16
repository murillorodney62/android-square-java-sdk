package com.squareup.square.utilities;

import org.junit.Assert;
import org.junit.Test;

public class WebhooksHelperTest {
  // These were generated by using webhook.site and the Square Developer Portal to send a test notification to a test webhook subscription.
  private static final String REQUEST_BODY = "{\"merchant_id\":\"MLEFBHHSJGVHD\",\"type\":\"webhooks.test_notification\",\"event_id\":\"ac3ac95b-f97d-458c-a6e6-18981597e05f\",\"created_at\":\"2022-07-13T20:30:59.037339943Z\",\"data\":{\"type\":\"webhooks\",\"id\":\"bc368e64-01aa-407e-b46e-3231809b1129\"}}";
  private static final String SIGNATURE_HEADER = "GF4YkrJgGBDZ9NIYbNXBnMzqb2HoL4RW/S6vkZ9/2N4=";
  private static final String SIGNATURE_KEY = "Ibxx_5AKakO-3qeNVR61Dw";
  private static final String NOTIFICATION_URL = "https://webhook.site/679a4f3a-dcfa-49ee-bac5-9d0edad886b9";

  @Test
  public void testSignatureValidationPass() {
    boolean isAuthentic = WebhooksHelper.isValidWebhookEventSignature(REQUEST_BODY, SIGNATURE_HEADER, SIGNATURE_KEY, NOTIFICATION_URL);
    Assert.assertTrue(isAuthentic);
  }

  @Test
  public void testSignatureValidationFailUrlMismatch() {
    boolean isAuthentic = WebhooksHelper.isValidWebhookEventSignature(REQUEST_BODY, SIGNATURE_HEADER, SIGNATURE_KEY, "https://webhook.site/79a4f3a-dcfa-49ee-bac5-9d0edad886b9");
    Assert.assertFalse(isAuthentic);
  }

  @Test
  public void testSignatureValidationFailInvalidSignatureKey() {
    boolean isAuthentic = WebhooksHelper.isValidWebhookEventSignature(REQUEST_BODY, SIGNATURE_HEADER, "MCmhFRxGX82xMwg5FsaoQA", NOTIFICATION_URL);
    Assert.assertFalse(isAuthentic);
  }

  @Test
  public void testSignatureValidationFailInvalidSignatureHeader() {
    boolean isAuthentic = WebhooksHelper.isValidWebhookEventSignature(REQUEST_BODY, "1z2n3DEJJiUPKcPzQo1ftvbxGdw=", SIGNATURE_KEY, NOTIFICATION_URL);
    Assert.assertFalse(isAuthentic);
  }

  @Test
  public void testSignatureValidationFailBodyMismatch() {
    String requestBody = "{\"merchant_id\":\"MLEFBHHSJGVHD\",\"type\":\"webhooks.test_notification\",\"event_id\":\"ac3ac95b-f97d-458c-a6e6-18981597e05f\",\"created_at\":\"2022-06-13T20:30:59.037339943Z\",\"data\":{\"type\":\"webhooks\",\"id\":\"bc368e64-01aa-407e-b46e-3231809b1129\"}}";
    boolean isAuthentic = WebhooksHelper.isValidWebhookEventSignature(requestBody, SIGNATURE_HEADER, SIGNATURE_KEY, NOTIFICATION_URL);
    Assert.assertFalse(isAuthentic);
  }

  @Test
  public void testSignatureValidationFailBodyFormatted() {
    String requestBody = "{\n"
        + "    \"merchant_id\": \"MLEFBHHSJGVHD\",\n"
        + "    \"type\": \"webhooks.test_notification\",\n"
        + "    \"event_id\": \"ac3ac95b-f97d-458c-a6e6-18981597e05f\",\n"
        + "    \"created_at\": \"2022-07-13T20:30:59.037339943Z\",\n"
        + "    \"data\": {\n"
        + "      \"type\": \"webhooks\",\n"
        + "      \"id\": \"bc368e64-01aa-407e-b46e-3231809b1129\"\n"
        + "    }\n"
        + "}";
    boolean isAuthentic = WebhooksHelper.isValidWebhookEventSignature(requestBody, SIGNATURE_HEADER, SIGNATURE_KEY, NOTIFICATION_URL);
    Assert.assertFalse(isAuthentic);
  }

  @Test
  public void testSignatureValidationEmptySignatureKey() {
    IllegalArgumentException ex = Assert.assertThrows(IllegalArgumentException.class,
        () -> WebhooksHelper.isValidWebhookEventSignature(REQUEST_BODY, SIGNATURE_HEADER,
            "", NOTIFICATION_URL));
    Assert.assertEquals("signatureKey is null or empty", ex.getMessage());
  }

  @Test
  public void testSignatureValidationSignatureKeyNotConfigured() {
    IllegalArgumentException ex = Assert.assertThrows(IllegalArgumentException.class,
        () -> WebhooksHelper.isValidWebhookEventSignature(REQUEST_BODY, SIGNATURE_HEADER,
            null, NOTIFICATION_URL));
    Assert.assertEquals("signatureKey is null or empty", ex.getMessage());
  }

  @Test
  public void testSignatureValidationEmptyNotificationUrl() {
    IllegalArgumentException ex = Assert.assertThrows(IllegalArgumentException.class,
        () -> WebhooksHelper.isValidWebhookEventSignature(REQUEST_BODY, SIGNATURE_HEADER,
            SIGNATURE_KEY, ""));
    Assert.assertEquals("notificationUrl is null or empty", ex.getMessage());
  }

  @Test
  public void testSignatureValidationNotificationUrlNotConfigured() {
    IllegalArgumentException ex = Assert.assertThrows(IllegalArgumentException.class,
        () -> WebhooksHelper.isValidWebhookEventSignature(REQUEST_BODY, SIGNATURE_HEADER,
            SIGNATURE_KEY, null));
    Assert.assertEquals("notificationUrl is null or empty", ex.getMessage());
  }
}
