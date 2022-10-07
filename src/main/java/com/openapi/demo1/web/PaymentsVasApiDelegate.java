package com.openapi.demo1.web;

import com.openapi.demo1.dto.AccountInformationRequest;
import com.openapi.demo1.dto.AccountInformationResponse;
import com.openapi.demo1.dto.AccountVerificationRequest;
import com.openapi.demo1.dto.AccountVerificationResponse;
import com.openapi.demo1.dto.CardCaptureRequest;
import com.openapi.demo1.dto.ErrorResponse;
import com.openapi.demo1.dto.SecurityCredentialsRequest;
import com.openapi.demo1.dto.SecurityCredentialsResponse;
import com.openapi.demo1.dto.TokenizationRequest;
import com.openapi.demo1.dto.TokenizationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link PaymentsVasApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public interface PaymentsVasApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /payments-vas/v1/accounts/information-lookup : Lookup a payment card or payment token.
     * Use this to look up card related information such as issuer country, card function and card brand associated with a card or token.
     *
     * @param contentType The content type. Valid value (application/json). (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request. This is also used for idempotency control. Recommended 128-bit UUID format. (required)
     * @param apiKey API key provided to the merchant associating the requests with the appropriate app in the Developer Portal. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for authorization header generation and time limit (5 minutes). (required)
     * @param authTokenType Indicates authorization type HMAC, JWT, or AccessToken. (required)
     * @param authorization Authorization header used to ensure the request has not been tampered with during transmission. Valid encryption; HMAC, JWT, or AccessToken. For more information, refer to the supporting documentation on the Developer Portal. (required)
     * @param accountInformationRequest  (required)
     * @param acceptLanguage The Accept Language header contains information about the language preference of a user. This HTTP header is useful to multilingual sites for deciding the best language to serve to the client. For example en-US or fr-CA. (optional, default to Accept-Language)
     * @param messageDigest Needed only from customer browser or app to the API in Hosted Payment Page requests. (optional, default to Message-Digest)
     * @return Created (status code 201)
     *         or The request cannot be validated. (status code 400)
     *         or The request was unauthorized. (status code 401)
     *         or The requested resource does not exist. (status code 404)
     *         or The request was timed out due to not receiving the request in time. (status code 408)
     *         or The media type is not supported. (status code 415)
     *         or The request was sent too early. (status code 425)
     *         or Too many request were sent. (status code 429)
     *         or An unexpected internal server error occurred. (status code 500)
     *         or The service was unavailable. (status code 503)
     *         or The request timed out while waiting for a response. (status code 504)
     * @see PaymentsVasApi#paymentsVasV1AccountsInformationLookupPost
     */
    default ResponseEntity<AccountInformationResponse> paymentsVasV1AccountsInformationLookupPost(String contentType,
        String clientRequestId,
        String apiKey,
        Long timestamp,
        String authTokenType,
        String authorization,
        AccountInformationRequest accountInformationRequest,
        String acceptLanguage,
        String messageDigest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"gatewayResponse\" : { \"transactionType\" : \"CHARGE\", \"transactionState\" : \"AUTHORIZED\", \"transactionOrigin\" : \"ECOM\", \"transactionProcessingDetails\" : { \"orderId\" : \"R-3b83fca8-2f9c-4364-86ae-12c91f1fcf16\", \"clientRequestId\" : \"30dd879c-ee2f-11db-8314-0800200c9a66\", \"transactionTimestamp\" : \"2016-04-16T16:06:05Z\", \"transactionId\" : \"838916029301\", \"apiTraceId\" : \"1234567a1234567b1234567c1234567d\" } }, \"cardDetails\" : [ { \"anonymousPrepaidIndicator\" : \"anonymousPrepaidIndicator\", \"pinSignatureCapability\" : \"PIN_OR_SIGNATURE\", \"issuerUpdateDay\" : \"22\", \"fastFundsDomesticGambling\" : \"SUPPORTED\", \"regulatorIndicator\" : \"NON_REGULATED\", \"fastFundsDomesticMoneyTransfer\" : \"SUPPORTED\", \"prepaidIndicator\" : \"SUPPORTED\", \"fastFundsCrossBorderMoneyTransfer\" : \"SUPPORTED\", \"detailedCardProduct\" : \"VISA\", \"nonMoneyTransferOCTsDomestic\" : \"SUPPORTED\", \"tokenIndicator\" : \"SUPPORTED\", \"lowBin\" : \"400337\", \"visaProductSubType\" : \"HC\", \"onlineGamblingOCTsDomestic\" : \"SUPPORTED\", \"highBin\" : \"400338\", \"countryCode\" : \"USA\", \"issuerUpdateMonth\" : \"09\", \"debitPinlessIndicator\" : [ { \"pinnedPOS\" : \"SUPPORTED\", \"debitNetworkId\" : \"STAR_WEST\", \"pinlessBillPay\" : \"SUPPORTED\", \"eCommerce\" : \"SUPPORTED\", \"dualIndicator\" : \"SUPPORTED\", \"pinlessPOS\" : \"SUPPORTED\" }, { \"pinnedPOS\" : \"SUPPORTED\", \"debitNetworkId\" : \"STAR_WEST\", \"pinlessBillPay\" : \"SUPPORTED\", \"eCommerce\" : \"SUPPORTED\", \"dualIndicator\" : \"SUPPORTED\", \"pinlessPOS\" : \"SUPPORTED\" } ], \"issuingNetwork\" : \"DINERS\", \"moneySendIndicator\" : \"DOMESTIC_AND_CROSS_BORDER\", \"panLengthMax\" : \"16\", \"cardholderBillingCurrency\" : \"USD\", \"onlineGamblingOCTsCrossBorder\" : \"SUPPORTED\", \"cardClass\" : \"CONSUMER\", \"issuerBankName\" : \"Example Bank\", \"fsaIndicator\" : \"SUPPORTED\", \"accountFundSourceSubtype\" : \"PREPAID_RELOADABLE\", \"binLength\" : \"6\", \"fastFundsCrossBorderGambling\" : \"SUPPORTED\", \"productId\" : \"N1\", \"recordType\" : \"DETAIL\", \"fastFundsCrossBorderNonMoneyTransfer\" : \"SUPPORTED\", \"ebtState\" : \"ebtState\", \"detailedCardIndicator\" : \"CREDIT\", \"accountFundSource\" : \"CREDIT\", \"moneyTransferOCTsDomestic\" : \"SUPPORTED\", \"b2bProgramId\" : \"B2B_PROGRAM_1\", \"binDetailPan\" : \"16\", \"binSource\" : \"CHASE\", \"nonMoneyTransferOCTsCrossBorder\" : \"SUPPORTED\", \"panLengthMin\" : \"16\", \"moneyTransferOCTsCrossBorder\" : \"SUPPORTED\", \"issuerUpdateYear\" : \"20\", \"fastFundsDomesticNonMoneyTransfer\" : \"SUPPORTED\", \"visaLargeTicketIndicator\" : \"SUPPORTED\" }, { \"anonymousPrepaidIndicator\" : \"anonymousPrepaidIndicator\", \"pinSignatureCapability\" : \"PIN_OR_SIGNATURE\", \"issuerUpdateDay\" : \"22\", \"fastFundsDomesticGambling\" : \"SUPPORTED\", \"regulatorIndicator\" : \"NON_REGULATED\", \"fastFundsDomesticMoneyTransfer\" : \"SUPPORTED\", \"prepaidIndicator\" : \"SUPPORTED\", \"fastFundsCrossBorderMoneyTransfer\" : \"SUPPORTED\", \"detailedCardProduct\" : \"VISA\", \"nonMoneyTransferOCTsDomestic\" : \"SUPPORTED\", \"tokenIndicator\" : \"SUPPORTED\", \"lowBin\" : \"400337\", \"visaProductSubType\" : \"HC\", \"onlineGamblingOCTsDomestic\" : \"SUPPORTED\", \"highBin\" : \"400338\", \"countryCode\" : \"USA\", \"issuerUpdateMonth\" : \"09\", \"debitPinlessIndicator\" : [ { \"pinnedPOS\" : \"SUPPORTED\", \"debitNetworkId\" : \"STAR_WEST\", \"pinlessBillPay\" : \"SUPPORTED\", \"eCommerce\" : \"SUPPORTED\", \"dualIndicator\" : \"SUPPORTED\", \"pinlessPOS\" : \"SUPPORTED\" }, { \"pinnedPOS\" : \"SUPPORTED\", \"debitNetworkId\" : \"STAR_WEST\", \"pinlessBillPay\" : \"SUPPORTED\", \"eCommerce\" : \"SUPPORTED\", \"dualIndicator\" : \"SUPPORTED\", \"pinlessPOS\" : \"SUPPORTED\" } ], \"issuingNetwork\" : \"DINERS\", \"moneySendIndicator\" : \"DOMESTIC_AND_CROSS_BORDER\", \"panLengthMax\" : \"16\", \"cardholderBillingCurrency\" : \"USD\", \"onlineGamblingOCTsCrossBorder\" : \"SUPPORTED\", \"cardClass\" : \"CONSUMER\", \"issuerBankName\" : \"Example Bank\", \"fsaIndicator\" : \"SUPPORTED\", \"accountFundSourceSubtype\" : \"PREPAID_RELOADABLE\", \"binLength\" : \"6\", \"fastFundsCrossBorderGambling\" : \"SUPPORTED\", \"productId\" : \"N1\", \"recordType\" : \"DETAIL\", \"fastFundsCrossBorderNonMoneyTransfer\" : \"SUPPORTED\", \"ebtState\" : \"ebtState\", \"detailedCardIndicator\" : \"CREDIT\", \"accountFundSource\" : \"CREDIT\", \"moneyTransferOCTsDomestic\" : \"SUPPORTED\", \"b2bProgramId\" : \"B2B_PROGRAM_1\", \"binDetailPan\" : \"16\", \"binSource\" : \"CHASE\", \"nonMoneyTransferOCTsCrossBorder\" : \"SUPPORTED\", \"panLengthMin\" : \"16\", \"moneyTransferOCTsCrossBorder\" : \"SUPPORTED\", \"issuerUpdateYear\" : \"20\", \"fastFundsDomesticNonMoneyTransfer\" : \"SUPPORTED\", \"visaLargeTicketIndicator\" : \"SUPPORTED\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /payments-vas/v1/accounts/verification : Verify a payment card or payment token.
     * Use this payload to perform an account verification for a payment card or payment token. This will check the validity and respond if an account is valid or not.
     *
     * @param contentType The content type. Valid value (application/json). (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request. This is also used for idempotency control. Recommended 128-bit UUID format. (required)
     * @param apiKey API key provided to the merchant associating the requests with the appropriate app in the Developer Portal. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for authorization header generation and time limit (5 minutes). (required)
     * @param authTokenType Indicates authorization type HMAC, JWT, or AccessToken. (required)
     * @param authorization Authorization header used to ensure the request has not been tampered with during transmission. Valid encryption; HMAC, JWT, or AccessToken. For more information, refer to the supporting documentation on the Developer Portal. (required)
     * @param accountVerificationRequest  (required)
     * @param acceptLanguage The Accept Language header contains information about the language preference of a user. This HTTP header is useful to multilingual sites for deciding the best language to serve to the client. For example en-US or fr-CA. (optional, default to Accept-Language)
     * @param messageDigest Needed only from customer browser or app to the API in Hosted Payment Page requests. (optional, default to Message-Digest)
     * @return Created (status code 201)
     *         or The request cannot be validated. (status code 400)
     *         or The request was unauthorized. (status code 401)
     *         or The requested resource does not exist. (status code 404)
     *         or The request was timed out due to not receiving the request in time. (status code 408)
     *         or The media type is not supported. (status code 415)
     *         or The request was sent too early. (status code 425)
     *         or Too many request were sent. (status code 429)
     *         or An unexpected internal server error occurred. (status code 500)
     *         or The service was unavailable. (status code 503)
     *         or The request timed out while waiting for a response. (status code 504)
     * @see PaymentsVasApi#paymentsVasV1AccountsVerificationPost
     */
    default ResponseEntity<AccountVerificationResponse> paymentsVasV1AccountsVerificationPost(String contentType,
        String clientRequestId,
        String apiKey,
        Long timestamp,
        String authTokenType,
        String authorization,
        AccountVerificationRequest accountVerificationRequest,
        String acceptLanguage,
        String messageDigest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"processorResponseDetails\" : { \"approvalStatus\" : \"APPROVED\", \"PAR\" : \"PAR\", \"debitReceiptNumber\" : \"debitReceiptNumber\", \"approvalCode\" : \"OK3483\", \"networkInternationalId\" : \"FISERV\", \"hostResponseCode\" : \"00\", \"bankAssociationDetails\" : { \"avsSecurityCodeResponse\" : { \"streetMatch\" : \"MATCH\", \"securityCodeMatch\" : \"MATCH\", \"association\" : { \"cardholderNameResponse\" : \"1\", \"avsCode\" : \"YY\", \"securityCodeResponse\" : \"M\" }, \"postalCodeMatch\" : \"MATCH\" }, \"associationResponseCode\" : \"000\", \"transactionTimestamp\" : \"2016-04-16T16:06:05Z\", \"transactionReferenceInformation\" : \"\" }, \"processor\" : \"FISERV\", \"responseCode\" : \"00000\", \"schemeTransactionId\" : \"019078743804756\", \"hostResponseMessage\" : \"APPROVAL\", \"referenceNumber\" : \"845366457890-TODO\", \"host\" : \"NASHVILLE\", \"additionalInfo\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ], \"localTimestamp\" : \"2016-04-16T16:06:05Z\", \"authenticationResponseCode\" : \"authenticationResponseCode\", \"networkOriginalAmount\" : 100.5, \"networkRouted\" : \"networkRouted\", \"responseMessage\" : \"APPROVAL\", \"responseIndicators\" : { \"signatureLineIndicator\" : false, \"signatureDebitRouteIndicator\" : false, \"alternateRouteDebitIndicator\" : false }, \"feeProgramIndicator\" : \"123\" }, \"gatewayResponse\" : { \"transactionType\" : \"CHARGE\", \"transactionState\" : \"AUTHORIZED\", \"transactionOrigin\" : \"ECOM\", \"transactionProcessingDetails\" : { \"orderId\" : \"R-3b83fca8-2f9c-4364-86ae-12c91f1fcf16\", \"clientRequestId\" : \"30dd879c-ee2f-11db-8314-0800200c9a66\", \"transactionTimestamp\" : \"2016-04-16T16:06:05Z\", \"transactionId\" : \"838916029301\", \"apiTraceId\" : \"1234567a1234567b1234567c1234567d\" } }, \"responsePaymentToken\" : { \"tokenResponseCode\" : \"000\", \"tokenResponseDescription\" : \"SUCCESS\", \"tokenData\" : \"1234123412340019\", \"tokenSource\" : \"TRANSARMOR\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /payments-vas/v1/card-capture : Submit a &lt;a href&#x3D;\&quot;../docs?path&#x3D;docs/Online-Mobile-Digital/Secure-Data-Capture/API/API-Only.md\&quot;&gt;merchant managed&lt;/a&gt; card capture for use with Secure Card Capture
     *
     * @param contentType The content type. Valid value (application/json). (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request. This is also used for idempotency control. Recommended 128-bit UUID format. (required)
     * @param apiKey API key provided to the merchant associating the requests with the appropriate app in the Developer Portal. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for authorization header generation and time limit (5 minutes). (required)
     * @param authTokenType Indicates authorization type HMAC, JWT, or AccessToken. (required)
     * @param authorization Authorization header used to ensure the request has not been tampered with during transmission. Valid encryption; HMAC, JWT, or AccessToken. For more information, refer to the supporting documentation on the Developer Portal. (required)
     * @param cardCaptureRequest  (required)
     * @param acceptLanguage The Accept Language header contains information about the language preference of a user. This HTTP header is useful to multilingual sites for deciding the best language to serve to the client. For example en-US or fr-CA. (optional, default to Accept-Language)
     * @param messageDigest Needed only from customer browser or app to the API in Hosted Payment Page requests. (optional, default to Message-Digest)
     * @return Success. (status code 204)
     *         or The request cannot be validated. (status code 400)
     *         or The request was unauthorized. (status code 401)
     *         or The requested resource does not exist. (status code 404)
     *         or The request was timed out due to not receiving the request in time. (status code 408)
     *         or The media type is not supported. (status code 415)
     *         or The request was sent too early. (status code 425)
     *         or Too many request were sent. (status code 429)
     *         or An unexpected internal server error occurred. (status code 500)
     *         or The service was unavailable. (status code 503)
     *         or The request timed out while waiting for a response. (status code 504)
     * @see PaymentsVasApi#paymentsVasV1CardCapturePost
     */
    default ResponseEntity<Void> paymentsVasV1CardCapturePost(String contentType,
        String clientRequestId,
        String apiKey,
        Long timestamp,
        String authTokenType,
        String authorization,
        CardCaptureRequest cardCaptureRequest,
        String acceptLanguage,
        String messageDigest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /payments-vas/v1/security/credentials : Request security credentials (access token).
     * This is the credential generation call for authorizing subsequent financial transactions. A valid &lt;code&gt;accessToken&lt;/code&gt; is required for web client requests.
     *
     * @param contentType The content type. Valid value (application/json). (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request. This is also used for idempotency control. Recommended 128-bit UUID format. (required)
     * @param apiKey API key provided to the merchant associating the requests with the appropriate app in the Developer Portal. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for authorization header generation and time limit (5 minutes). (required)
     * @param authTokenType Indicates authorization type HMAC, JWT, or AccessToken. (required)
     * @param authorization Authorization header used to ensure the request has not been tampered with during transmission. Valid encryption; HMAC, JWT, or AccessToken. For more information, refer to the supporting documentation on the Developer Portal. (required)
     * @param securityCredentialsRequest  (required)
     * @param acceptLanguage The Accept Language header contains information about the language preference of a user. This HTTP header is useful to multilingual sites for deciding the best language to serve to the client. For example en-US or fr-CA. (optional, default to Accept-Language)
     * @param messageDigest Needed only from customer browser or app to the API in Hosted Payment Page requests. (optional, default to Message-Digest)
     * @return Created (status code 201)
     *         or The request cannot be validated. (status code 400)
     *         or The request was unauthorized. (status code 401)
     *         or The requested resource does not exist. (status code 404)
     *         or The request was timed out due to not receiving the request in time. (status code 408)
     *         or The media type is not supported. (status code 415)
     *         or The request was sent too early. (status code 425)
     *         or Too many request were sent. (status code 429)
     *         or An unexpected internal server error occurred. (status code 500)
     *         or The service was unavailable. (status code 503)
     *         or The request timed out while waiting for a response. (status code 504)
     * @see PaymentsVasApi#paymentsVasV1SecurityCredentialsPost
     */
    default ResponseEntity<SecurityCredentialsResponse> paymentsVasV1SecurityCredentialsPost(String contentType,
        String clientRequestId,
        String apiKey,
        Long timestamp,
        String authTokenType,
        String authorization,
        SecurityCredentialsRequest securityCredentialsRequest,
        String acceptLanguage,
        String messageDigest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"accessTokenIssuedTime\" : \"2016-04-16T16:06:05Z\", \"keyLength\" : 0, \"gatewayResponse\" : { \"transactionType\" : \"CHARGE\", \"transactionState\" : \"AUTHORIZED\", \"transactionOrigin\" : \"ECOM\", \"transactionProcessingDetails\" : { \"orderId\" : \"R-3b83fca8-2f9c-4364-86ae-12c91f1fcf16\", \"clientRequestId\" : \"30dd879c-ee2f-11db-8314-0800200c9a66\", \"transactionTimestamp\" : \"2016-04-16T16:06:05Z\", \"transactionId\" : \"838916029301\", \"apiTraceId\" : \"1234567a1234567b1234567c1234567d\" } }, \"asymmetricEncryptionAlgorithm\" : \"asymmetricEncryptionAlgorithm\", \"accessTokenTimeToLive\" : \"accessTokenTimeToLive\", \"keyId\" : \"keyId\", \"domains\" : \"https://checkout.example.com, https://*.mystore.com\", \"symmetricEncryptionAlgorithm\" : \"symmetricEncryptionAlgorithm\", \"accessTokenType\" : \"accessTokenType\", \"publicKey\" : \"publicKey\", \"sessionId\" : \"sessionId\", \"accessToken\" : \"accessToken\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /payments-vas/v1/tokens : Create a payment token.
     * Use this payload to create a payment token from a payment source.
     *
     * @param contentType The content type. Valid value (application/json). (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request. This is also used for idempotency control. Recommended 128-bit UUID format. (required)
     * @param apiKey API key provided to the merchant associating the requests with the appropriate app in the Developer Portal. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for authorization header generation and time limit (5 minutes). (required)
     * @param authTokenType Indicates authorization type HMAC, JWT, or AccessToken. (required)
     * @param authorization Authorization header used to ensure the request has not been tampered with during transmission. Valid encryption; HMAC, JWT, or AccessToken. For more information, refer to the supporting documentation on the Developer Portal. (required)
     * @param tokenizationRequest  (required)
     * @param acceptLanguage The Accept Language header contains information about the language preference of a user. This HTTP header is useful to multilingual sites for deciding the best language to serve to the client. For example en-US or fr-CA. (optional, default to Accept-Language)
     * @param messageDigest Needed only from customer browser or app to the API in Hosted Payment Page requests. (optional, default to Message-Digest)
     * @return Success. (status code 200)
     *         or The request cannot be validated. (status code 400)
     *         or The request was unauthorized. (status code 401)
     *         or The requested resource does not exist. (status code 404)
     *         or The request was timed out due to not receiving the request in time. (status code 408)
     *         or The media type is not supported. (status code 415)
     *         or The request was sent too early. (status code 425)
     *         or Too many request were sent. (status code 429)
     *         or An unexpected internal server error occurred. (status code 500)
     *         or The service was unavailable. (status code 503)
     *         or The request timed out while waiting for a response. (status code 504)
     * @see PaymentsVasApi#paymentsVasV1TokensPost
     */
    default ResponseEntity<TokenizationResponse> paymentsVasV1TokensPost(String contentType,
        String clientRequestId,
        String apiKey,
        Long timestamp,
        String authTokenType,
        String authorization,
        TokenizationRequest tokenizationRequest,
        String acceptLanguage,
        String messageDigest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"paymentToken\" : { \"tokenResponseCode\" : \"000\", \"tokenResponseDescription\" : \"SUCCESS\", \"tokenData\" : \"1234123412340019\", \"tokenSource\" : \"TRANSARMOR\" }, \"processorResponseDetails\" : { \"approvalStatus\" : \"APPROVED\", \"PAR\" : \"PAR\", \"debitReceiptNumber\" : \"debitReceiptNumber\", \"approvalCode\" : \"OK3483\", \"networkInternationalId\" : \"FISERV\", \"hostResponseCode\" : \"00\", \"bankAssociationDetails\" : { \"avsSecurityCodeResponse\" : { \"streetMatch\" : \"MATCH\", \"securityCodeMatch\" : \"MATCH\", \"association\" : { \"cardholderNameResponse\" : \"1\", \"avsCode\" : \"YY\", \"securityCodeResponse\" : \"M\" }, \"postalCodeMatch\" : \"MATCH\" }, \"associationResponseCode\" : \"000\", \"transactionTimestamp\" : \"2016-04-16T16:06:05Z\", \"transactionReferenceInformation\" : \"\" }, \"processor\" : \"FISERV\", \"responseCode\" : \"00000\", \"schemeTransactionId\" : \"019078743804756\", \"hostResponseMessage\" : \"APPROVAL\", \"referenceNumber\" : \"845366457890-TODO\", \"host\" : \"NASHVILLE\", \"additionalInfo\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ], \"localTimestamp\" : \"2016-04-16T16:06:05Z\", \"authenticationResponseCode\" : \"authenticationResponseCode\", \"networkOriginalAmount\" : 100.5, \"networkRouted\" : \"networkRouted\", \"responseMessage\" : \"APPROVAL\", \"responseIndicators\" : { \"signatureLineIndicator\" : false, \"signatureDebitRouteIndicator\" : false, \"alternateRouteDebitIndicator\" : false }, \"feeProgramIndicator\" : \"123\" }, \"gatewayResponse\" : { \"transactionType\" : \"CHARGE\", \"transactionState\" : \"AUTHORIZED\", \"transactionOrigin\" : \"ECOM\", \"transactionProcessingDetails\" : { \"orderId\" : \"R-3b83fca8-2f9c-4364-86ae-12c91f1fcf16\", \"clientRequestId\" : \"30dd879c-ee2f-11db-8314-0800200c9a66\", \"transactionTimestamp\" : \"2016-04-16T16:06:05Z\", \"transactionId\" : \"838916029301\", \"apiTraceId\" : \"1234567a1234567b1234567c1234567d\" } }, \"cardDetails\" : [ { \"anonymousPrepaidIndicator\" : \"anonymousPrepaidIndicator\", \"pinSignatureCapability\" : \"PIN_OR_SIGNATURE\", \"issuerUpdateDay\" : \"22\", \"fastFundsDomesticGambling\" : \"SUPPORTED\", \"regulatorIndicator\" : \"NON_REGULATED\", \"fastFundsDomesticMoneyTransfer\" : \"SUPPORTED\", \"prepaidIndicator\" : \"SUPPORTED\", \"fastFundsCrossBorderMoneyTransfer\" : \"SUPPORTED\", \"detailedCardProduct\" : \"VISA\", \"nonMoneyTransferOCTsDomestic\" : \"SUPPORTED\", \"tokenIndicator\" : \"SUPPORTED\", \"lowBin\" : \"400337\", \"visaProductSubType\" : \"HC\", \"onlineGamblingOCTsDomestic\" : \"SUPPORTED\", \"highBin\" : \"400338\", \"countryCode\" : \"USA\", \"issuerUpdateMonth\" : \"09\", \"debitPinlessIndicator\" : [ { \"pinnedPOS\" : \"SUPPORTED\", \"debitNetworkId\" : \"STAR_WEST\", \"pinlessBillPay\" : \"SUPPORTED\", \"eCommerce\" : \"SUPPORTED\", \"dualIndicator\" : \"SUPPORTED\", \"pinlessPOS\" : \"SUPPORTED\" }, { \"pinnedPOS\" : \"SUPPORTED\", \"debitNetworkId\" : \"STAR_WEST\", \"pinlessBillPay\" : \"SUPPORTED\", \"eCommerce\" : \"SUPPORTED\", \"dualIndicator\" : \"SUPPORTED\", \"pinlessPOS\" : \"SUPPORTED\" } ], \"issuingNetwork\" : \"DINERS\", \"moneySendIndicator\" : \"DOMESTIC_AND_CROSS_BORDER\", \"panLengthMax\" : \"16\", \"cardholderBillingCurrency\" : \"USD\", \"onlineGamblingOCTsCrossBorder\" : \"SUPPORTED\", \"cardClass\" : \"CONSUMER\", \"issuerBankName\" : \"Example Bank\", \"fsaIndicator\" : \"SUPPORTED\", \"accountFundSourceSubtype\" : \"PREPAID_RELOADABLE\", \"binLength\" : \"6\", \"fastFundsCrossBorderGambling\" : \"SUPPORTED\", \"productId\" : \"N1\", \"recordType\" : \"DETAIL\", \"fastFundsCrossBorderNonMoneyTransfer\" : \"SUPPORTED\", \"ebtState\" : \"ebtState\", \"detailedCardIndicator\" : \"CREDIT\", \"accountFundSource\" : \"CREDIT\", \"moneyTransferOCTsDomestic\" : \"SUPPORTED\", \"b2bProgramId\" : \"B2B_PROGRAM_1\", \"binDetailPan\" : \"16\", \"binSource\" : \"CHASE\", \"nonMoneyTransferOCTsCrossBorder\" : \"SUPPORTED\", \"panLengthMin\" : \"16\", \"moneyTransferOCTsCrossBorder\" : \"SUPPORTED\", \"issuerUpdateYear\" : \"20\", \"fastFundsDomesticNonMoneyTransfer\" : \"SUPPORTED\", \"visaLargeTicketIndicator\" : \"SUPPORTED\" }, { \"anonymousPrepaidIndicator\" : \"anonymousPrepaidIndicator\", \"pinSignatureCapability\" : \"PIN_OR_SIGNATURE\", \"issuerUpdateDay\" : \"22\", \"fastFundsDomesticGambling\" : \"SUPPORTED\", \"regulatorIndicator\" : \"NON_REGULATED\", \"fastFundsDomesticMoneyTransfer\" : \"SUPPORTED\", \"prepaidIndicator\" : \"SUPPORTED\", \"fastFundsCrossBorderMoneyTransfer\" : \"SUPPORTED\", \"detailedCardProduct\" : \"VISA\", \"nonMoneyTransferOCTsDomestic\" : \"SUPPORTED\", \"tokenIndicator\" : \"SUPPORTED\", \"lowBin\" : \"400337\", \"visaProductSubType\" : \"HC\", \"onlineGamblingOCTsDomestic\" : \"SUPPORTED\", \"highBin\" : \"400338\", \"countryCode\" : \"USA\", \"issuerUpdateMonth\" : \"09\", \"debitPinlessIndicator\" : [ { \"pinnedPOS\" : \"SUPPORTED\", \"debitNetworkId\" : \"STAR_WEST\", \"pinlessBillPay\" : \"SUPPORTED\", \"eCommerce\" : \"SUPPORTED\", \"dualIndicator\" : \"SUPPORTED\", \"pinlessPOS\" : \"SUPPORTED\" }, { \"pinnedPOS\" : \"SUPPORTED\", \"debitNetworkId\" : \"STAR_WEST\", \"pinlessBillPay\" : \"SUPPORTED\", \"eCommerce\" : \"SUPPORTED\", \"dualIndicator\" : \"SUPPORTED\", \"pinlessPOS\" : \"SUPPORTED\" } ], \"issuingNetwork\" : \"DINERS\", \"moneySendIndicator\" : \"DOMESTIC_AND_CROSS_BORDER\", \"panLengthMax\" : \"16\", \"cardholderBillingCurrency\" : \"USD\", \"onlineGamblingOCTsCrossBorder\" : \"SUPPORTED\", \"cardClass\" : \"CONSUMER\", \"issuerBankName\" : \"Example Bank\", \"fsaIndicator\" : \"SUPPORTED\", \"accountFundSourceSubtype\" : \"PREPAID_RELOADABLE\", \"binLength\" : \"6\", \"fastFundsCrossBorderGambling\" : \"SUPPORTED\", \"productId\" : \"N1\", \"recordType\" : \"DETAIL\", \"fastFundsCrossBorderNonMoneyTransfer\" : \"SUPPORTED\", \"ebtState\" : \"ebtState\", \"detailedCardIndicator\" : \"CREDIT\", \"accountFundSource\" : \"CREDIT\", \"moneyTransferOCTsDomestic\" : \"SUPPORTED\", \"b2bProgramId\" : \"B2B_PROGRAM_1\", \"binDetailPan\" : \"16\", \"binSource\" : \"CHASE\", \"nonMoneyTransferOCTsCrossBorder\" : \"SUPPORTED\", \"panLengthMin\" : \"16\", \"moneyTransferOCTsCrossBorder\" : \"SUPPORTED\", \"issuerUpdateYear\" : \"20\", \"fastFundsDomesticNonMoneyTransfer\" : \"SUPPORTED\", \"visaLargeTicketIndicator\" : \"SUPPORTED\" } ], \"paymentTokens\" : [ { \"tokenResponseCode\" : \"000\", \"tokenResponseDescription\" : \"SUCCESS\", \"tokenData\" : \"1234123412340019\", \"tokenSource\" : \"TRANSARMOR\" }, { \"tokenResponseCode\" : \"000\", \"tokenResponseDescription\" : \"SUCCESS\", \"tokenData\" : \"1234123412340019\", \"tokenSource\" : \"TRANSARMOR\" } ], \"source\" : { \"sourceType\" : \"PaymentCard\" }, \"billingAddress\" : { \"firstName\" : \"Jane\", \"lastName\" : \"Smith\", \"address\" : { \"country\" : \"US\", \"stateOrProvince\" : \"GA\", \"city\" : \"Sandy Springs\", \"street\" : \"123 Main Street\", \"houseNumberOrName\" : \"Apt 213\", \"recipientNameOrAddress\" : \"ATTN: Accounting Dept\", \"postalCode\" : \"30303-0001\", \"county\" : \"13121\", \"addressHistory\" : \"OVER_90_DAYS\" }, \"phone\" : { \"phoneNumber\" : \"123-123-1234\", \"countryCode\" : \"91\", \"type\" : \"DAY\" } } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
