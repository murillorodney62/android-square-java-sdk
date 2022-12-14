
package com.squareup.square.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.squareup.square.ApiHelper;
import com.squareup.square.AuthManager;
import com.squareup.square.Configuration;
import com.squareup.square.exceptions.ApiException;
import com.squareup.square.http.Headers;
import com.squareup.square.http.client.HttpCallback;
import com.squareup.square.http.client.HttpClient;
import com.squareup.square.http.client.HttpContext;
import com.squareup.square.http.request.HttpRequest;
import com.squareup.square.http.response.HttpResponse;
import com.squareup.square.http.response.HttpStringResponse;
import com.squareup.square.models.ObtainTokenRequest;
import com.squareup.square.models.ObtainTokenResponse;
import com.squareup.square.models.RenewTokenRequest;
import com.squareup.square.models.RenewTokenResponse;
import com.squareup.square.models.RevokeTokenRequest;
import com.squareup.square.models.RevokeTokenResponse;
import java.io.IOException;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

/**
 * This class lists all the endpoints of the groups.
 */
public final class DefaultOAuthApi extends BaseApi implements OAuthApi {

    /**
     * Initializes the controller.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     */
    public DefaultOAuthApi(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers) {
        super(config, httpClient, authManagers);
    }

    /**
     * Initializes the controller with HTTPCallback.
     * @param config    Configurations added in client.
     * @param httpClient    Send HTTP requests and read the responses.
     * @param authManagers    Apply authorization to requests.
     * @param httpCallback    Callback to be called before and after the HTTP call.
     */
    public DefaultOAuthApi(Configuration config, HttpClient httpClient,
            Map<String, AuthManager> authManagers, HttpCallback httpCallback) {
        super(config, httpClient, authManagers, httpCallback);
    }

    /**
     * `RenewToken` is deprecated. For information about refreshing OAuth access tokens, see
     * [Migrate from Renew to Refresh OAuth
     * Tokens](https://developer.squareup.com/docs/oauth-api/migrate-to-refresh-tokens). Renews an
     * OAuth access token before it expires. OAuth access tokens besides your application's personal
     * access token expire after 30 days. You can also renew expired tokens within 15 days of their
     * expiration. You cannot renew an access token that has been expired for more than 15 days.
     * Instead, the associated user must recomplete the OAuth flow from the beginning.
     * __Important:__ The `Authorization` header for this endpoint must have the following format:
     * ``` Authorization: Client APPLICATION_SECRET ``` Replace `APPLICATION_SECRET` with the
     * application secret on the Credentials page in the [Developer
     * Dashboard](https://developer.squareup.com/apps).
     * @deprecated
     * 
     * @param  clientId  Required parameter: Your application ID, which is available in the OAuth
     *         page in the [Developer Dashboard](https://developer.squareup.com/apps).
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @param  authorization  Required parameter: Client APPLICATION_SECRET
     * @return    Returns the RenewTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    @Deprecated
    public RenewTokenResponse renewToken(
            final String clientId,
            final RenewTokenRequest body,
            final String authorization) throws ApiException, IOException {
        HttpRequest request = buildRenewTokenRequest(clientId, body, authorization);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRenewTokenResponse(context);
    }

    /**
     * `RenewToken` is deprecated. For information about refreshing OAuth access tokens, see
     * [Migrate from Renew to Refresh OAuth
     * Tokens](https://developer.squareup.com/docs/oauth-api/migrate-to-refresh-tokens). Renews an
     * OAuth access token before it expires. OAuth access tokens besides your application's personal
     * access token expire after 30 days. You can also renew expired tokens within 15 days of their
     * expiration. You cannot renew an access token that has been expired for more than 15 days.
     * Instead, the associated user must recomplete the OAuth flow from the beginning.
     * __Important:__ The `Authorization` header for this endpoint must have the following format:
     * ``` Authorization: Client APPLICATION_SECRET ``` Replace `APPLICATION_SECRET` with the
     * application secret on the Credentials page in the [Developer
     * Dashboard](https://developer.squareup.com/apps).
     * @deprecated
     * 
     * @param  clientId  Required parameter: Your application ID, which is available in the OAuth
     *         page in the [Developer Dashboard](https://developer.squareup.com/apps).
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @param  authorization  Required parameter: Client APPLICATION_SECRET
     * @return    Returns the RenewTokenResponse response from the API call
     */
    @Deprecated
    public CompletableFuture<RenewTokenResponse> renewTokenAsync(
            final String clientId,
            final RenewTokenRequest body,
            final String authorization) {
        return makeHttpCallAsync(() -> buildRenewTokenRequest(clientId, body, authorization),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRenewTokenResponse(context));
    }

    /**
     * Builds the HttpRequest object for renewToken.
     */
    private HttpRequest buildRenewTokenRequest(
            final String clientId,
            final RenewTokenRequest body,
            final String authorization) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/oauth2/clients/{client_id}/access-token/renew");

        //process template parameters
        Map<String, SimpleEntry<Object, Boolean>> templateParameters = new HashMap<>();
        templateParameters.put("client_id",
                new SimpleEntry<Object, Boolean>(clientId, true));
        ApiHelper.appendUrlWithTemplateParameters(queryBuilder, templateParameters);

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", authorization);
        headers.add("Square-Version", config.getSquareVersion());

        headers.add("user-agent", internalUserAgent);
        headers.add("accept", "application/json");
        headers.addAll(config.getAdditionalHeaders());

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for renewToken.
     * @return An object of type RenewTokenResponse
     */
    private RenewTokenResponse handleRenewTokenResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        RenewTokenResponse result = ApiHelper.deserialize(responseBody,
                RenewTokenResponse.class);

        result = result.toBuilder().httpContext(context).build();
        return result;
    }

    /**
     * Revokes an access token generated with the OAuth flow. If an account has more than one OAuth
     * access token for your application, this endpoint revokes all of them, regardless of which
     * token you specify. When an OAuth access token is revoked, all of the active subscriptions
     * associated with that OAuth token are canceled immediately. __Important:__ The `Authorization`
     * header for this endpoint must have the following format: ``` Authorization: Client
     * APPLICATION_SECRET ``` Replace `APPLICATION_SECRET` with the application secret on the OAuth
     * page for your application on the Developer Dashboard.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @param  authorization  Required parameter: Client APPLICATION_SECRET
     * @return    Returns the RevokeTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public RevokeTokenResponse revokeToken(
            final RevokeTokenRequest body,
            final String authorization) throws ApiException, IOException {
        HttpRequest request = buildRevokeTokenRequest(body, authorization);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleRevokeTokenResponse(context);
    }

    /**
     * Revokes an access token generated with the OAuth flow. If an account has more than one OAuth
     * access token for your application, this endpoint revokes all of them, regardless of which
     * token you specify. When an OAuth access token is revoked, all of the active subscriptions
     * associated with that OAuth token are canceled immediately. __Important:__ The `Authorization`
     * header for this endpoint must have the following format: ``` Authorization: Client
     * APPLICATION_SECRET ``` Replace `APPLICATION_SECRET` with the application secret on the OAuth
     * page for your application on the Developer Dashboard.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @param  authorization  Required parameter: Client APPLICATION_SECRET
     * @return    Returns the RevokeTokenResponse response from the API call
     */
    public CompletableFuture<RevokeTokenResponse> revokeTokenAsync(
            final RevokeTokenRequest body,
            final String authorization) {
        return makeHttpCallAsync(() -> buildRevokeTokenRequest(body, authorization),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleRevokeTokenResponse(context));
    }

    /**
     * Builds the HttpRequest object for revokeToken.
     */
    private HttpRequest buildRevokeTokenRequest(
            final RevokeTokenRequest body,
            final String authorization) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/oauth2/revoke");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Authorization", authorization);
        headers.add("Square-Version", config.getSquareVersion());

        headers.add("user-agent", internalUserAgent);
        headers.add("accept", "application/json");
        headers.addAll(config.getAdditionalHeaders());

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for revokeToken.
     * @return An object of type RevokeTokenResponse
     */
    private RevokeTokenResponse handleRevokeTokenResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        RevokeTokenResponse result = ApiHelper.deserialize(responseBody,
                RevokeTokenResponse.class);

        result = result.toBuilder().httpContext(context).build();
        return result;
    }

    /**
     * Returns an OAuth access token and a refresh token unless the `short_lived` parameter is set
     * to `true`, in which case the endpoint returns only an access token. The `grant_type`
     * parameter specifies the type of OAuth request. If `grant_type` is `authorization_code`, you
     * must include the authorization code you received when a seller granted you authorization. If
     * `grant_type` is `refresh_token`, you must provide a valid refresh token. If you are using an
     * old version of the Square APIs (prior to March 13, 2019), `grant_type` can be
     * `migration_token` and you must provide a valid migration token. You can use the `scopes`
     * parameter to limit the set of permissions granted to the access token and refresh token. You
     * can use the `short_lived` parameter to create an access token that expires in 24 hours.
     * __Note:__ OAuth tokens should be encrypted and stored on a secure server. Application clients
     * should never interact directly with OAuth tokens.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the ObtainTokenResponse response from the API call
     * @throws    ApiException    Represents error response from the server.
     * @throws    IOException    Signals that an I/O exception of some sort has occurred.
     */
    public ObtainTokenResponse obtainToken(
            final ObtainTokenRequest body) throws ApiException, IOException {
        HttpRequest request = buildObtainTokenRequest(body);
        HttpResponse response = getClientInstance().execute(request, false);
        HttpContext context = new HttpContext(request, response);

        return handleObtainTokenResponse(context);
    }

    /**
     * Returns an OAuth access token and a refresh token unless the `short_lived` parameter is set
     * to `true`, in which case the endpoint returns only an access token. The `grant_type`
     * parameter specifies the type of OAuth request. If `grant_type` is `authorization_code`, you
     * must include the authorization code you received when a seller granted you authorization. If
     * `grant_type` is `refresh_token`, you must provide a valid refresh token. If you are using an
     * old version of the Square APIs (prior to March 13, 2019), `grant_type` can be
     * `migration_token` and you must provide a valid migration token. You can use the `scopes`
     * parameter to limit the set of permissions granted to the access token and refresh token. You
     * can use the `short_lived` parameter to create an access token that expires in 24 hours.
     * __Note:__ OAuth tokens should be encrypted and stored on a secure server. Application clients
     * should never interact directly with OAuth tokens.
     * @param  body  Required parameter: An object containing the fields to POST for the request.
     *         See the corresponding object definition for field details.
     * @return    Returns the ObtainTokenResponse response from the API call
     */
    public CompletableFuture<ObtainTokenResponse> obtainTokenAsync(
            final ObtainTokenRequest body) {
        return makeHttpCallAsync(() -> buildObtainTokenRequest(body),
            request -> getClientInstance().executeAsync(request, false),
            context -> handleObtainTokenResponse(context));
    }

    /**
     * Builds the HttpRequest object for obtainToken.
     */
    private HttpRequest buildObtainTokenRequest(
            final ObtainTokenRequest body) throws JsonProcessingException {
        //the base uri for api requests
        String baseUri = config.getBaseUri();

        //prepare query string for API call
        final StringBuilder queryBuilder = new StringBuilder(baseUri
                + "/oauth2/token");

        //load all headers for the outgoing API request
        Headers headers = new Headers();
        headers.add("Content-Type", "application/json");
        headers.add("Square-Version", config.getSquareVersion());

        headers.add("user-agent", internalUserAgent);
        headers.add("accept", "application/json");
        headers.addAll(config.getAdditionalHeaders());

        //prepare and invoke the API call request to fetch the response
        String bodyJson = ApiHelper.serialize(body);
        HttpRequest request = getClientInstance().postBody(queryBuilder, headers, null, bodyJson);

        // Invoke the callback before request if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onBeforeRequest(request);
        }

        return request;
    }

    /**
     * Processes the response for obtainToken.
     * @return An object of type ObtainTokenResponse
     */
    private ObtainTokenResponse handleObtainTokenResponse(
            HttpContext context) throws ApiException, IOException {
        HttpResponse response = context.getResponse();

        //invoke the callback after response if its not null
        if (getHttpCallback() != null) {
            getHttpCallback().onAfterResponse(context);
        }

        //handle errors defined at the API level
        validateResponse(response, context);

        //extract result from the http response
        String responseBody = ((HttpStringResponse) response).getBody();
        ObtainTokenResponse result = ApiHelper.deserialize(responseBody,
                ObtainTokenResponse.class);

        result = result.toBuilder().httpContext(context).build();
        return result;
    }

}