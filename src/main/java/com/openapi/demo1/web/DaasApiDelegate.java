package com.openapi.demo1.web;

import com.openapi.demo1.dto.EnhancedDataServiceRequest;
import com.openapi.demo1.dto.EnhancedDataServiceResponse;
import com.openapi.demo1.dto.ErrorResponse;
import com.openapi.demo1.dto.ReturnOptimizerRequest;
import com.openapi.demo1.dto.ReturnOptimizerResponse;
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
 * A delegate to be called by the {@link DaasApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
public interface DaasApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /daas/v1/enhanceddata : Submit a EDS Request.
     * Use this payload prior to a transaction to perform an Enhanced Data Service request for a payment card or payment token. This will be used by the issuer to make a more informed authorization decision.
     *
     * @param contentType The content type. Valid value (application/json). (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request. This is also used for idempotency control. Recommended 128-bit UUID format. (required)
     * @param apiKey API key provided to the merchant associating the requests with the appropriate app in the Developer Portal. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for authorization header generation and time limit (5 minutes). (required)
     * @param authTokenType Indicates authorization type HMAC, JWT, or AccessToken. (required)
     * @param authorization Authorization header used to ensure the request has not been tampered with during transmission. Valid encryption; HMAC, JWT, or AccessToken. For more information, refer to the supporting documentation on the Developer Portal. (required)
     * @param enhancedDataServiceRequest  (required)
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
     * @see DaasApi#daasV1EnhanceddataPost
     */
    default ResponseEntity<EnhancedDataServiceResponse> daasV1EnhanceddataPost(String contentType,
        String clientRequestId,
        String apiKey,
        Long timestamp,
        String authTokenType,
        String authorization,
        EnhancedDataServiceRequest enhancedDataServiceRequest,
        String acceptLanguage,
        String messageDigest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"processorResponseDetails\" : { \"approvalStatus\" : \"APPROVED\", \"PAR\" : \"PAR\", \"debitReceiptNumber\" : \"debitReceiptNumber\", \"approvalCode\" : \"OK3483\", \"networkInternationalId\" : \"FISERV\", \"hostResponseCode\" : \"00\", \"bankAssociationDetails\" : { \"avsSecurityCodeResponse\" : { \"streetMatch\" : \"MATCH\", \"securityCodeMatch\" : \"MATCH\", \"association\" : { \"cardholderNameResponse\" : \"1\", \"avsCode\" : \"YY\", \"securityCodeResponse\" : \"M\" }, \"postalCodeMatch\" : \"MATCH\" }, \"associationResponseCode\" : \"000\", \"transactionTimestamp\" : \"2016-04-16T16:06:05Z\", \"transactionReferenceInformation\" : \"\" }, \"processor\" : \"FISERV\", \"responseCode\" : \"00000\", \"schemeTransactionId\" : \"019078743804756\", \"hostResponseMessage\" : \"APPROVAL\", \"referenceNumber\" : \"845366457890-TODO\", \"host\" : \"NASHVILLE\", \"additionalInfo\" : [ { \"name\" : \"name\", \"value\" : \"value\" }, { \"name\" : \"name\", \"value\" : \"value\" } ], \"localTimestamp\" : \"2016-04-16T16:06:05Z\", \"authenticationResponseCode\" : \"authenticationResponseCode\", \"networkOriginalAmount\" : 100.5, \"networkRouted\" : \"networkRouted\", \"responseMessage\" : \"APPROVAL\", \"responseIndicators\" : { \"signatureLineIndicator\" : false, \"signatureDebitRouteIndicator\" : false, \"alternateRouteDebitIndicator\" : false }, \"feeProgramIndicator\" : \"123\" }, \"gatewayResponse\" : { \"transactionType\" : \"CHARGE\", \"transactionState\" : \"AUTHORIZED\", \"transactionOrigin\" : \"ECOM\", \"transactionProcessingDetails\" : { \"orderId\" : \"R-3b83fca8-2f9c-4364-86ae-12c91f1fcf16\", \"clientRequestId\" : \"30dd879c-ee2f-11db-8314-0800200c9a66\", \"transactionTimestamp\" : \"2016-04-16T16:06:05Z\", \"transactionId\" : \"838916029301\", \"apiTraceId\" : \"1234567a1234567b1234567c1234567d\" } } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /daas/v1/returnoptimizer : Submit a ROS request.
     * Use this payload prior to a transaction to perform an Return Optimizer request for a PaymentToken. This will be used by the merchant to make a more informed authorization decision.
     *
     * @param contentType The content type. Valid value (application/json). (required)
     * @param clientRequestId A client-generated ID for request tracking and signature creation, unique per request. This is also used for idempotency control. Recommended 128-bit UUID format. (required)
     * @param apiKey API key provided to the merchant associating the requests with the appropriate app in the Developer Portal. (required)
     * @param timestamp Epoch timestamp in milliseconds in the request from a client system. Used for authorization header generation and time limit (5 minutes). (required)
     * @param authTokenType Indicates authorization type HMAC, JWT, or AccessToken. (required)
     * @param authorization Authorization header used to ensure the request has not been tampered with during transmission. Valid encryption; HMAC, JWT, or AccessToken. For more information, refer to the supporting documentation on the Developer Portal. (required)
     * @param returnOptimizerRequest  (required)
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
     * @see DaasApi#daasV1ReturnoptimizerPost
     */
    default ResponseEntity<ReturnOptimizerResponse> daasV1ReturnoptimizerPost(String contentType,
        String clientRequestId,
        String apiKey,
        Long timestamp,
        String authTokenType,
        String authorization,
        ReturnOptimizerRequest returnOptimizerRequest,
        String acceptLanguage,
        String messageDigest) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"transactionScoreResponse\" : { \"consumerType\" : \"Existing\", \"peerReturnScoreDetails\" : { \"averageReturnValue\" : 45.53, \"averageOrderValue\" : 275.25, \"percentSalesReturned\" : 0.3 }, \"modelId\" : \"1.0.0\", \"invocationId\" : \"ad0760bf-2db5-4ba9-b294-0d2241ff58f8\", \"myReturnScoreDetails\" : null }, \"gatewayResponse\" : { \"transactionType\" : \"CHARGE\", \"transactionState\" : \"AUTHORIZED\", \"transactionOrigin\" : \"ECOM\", \"transactionProcessingDetails\" : { \"orderId\" : \"R-3b83fca8-2f9c-4364-86ae-12c91f1fcf16\", \"clientRequestId\" : \"30dd879c-ee2f-11db-8314-0800200c9a66\", \"transactionTimestamp\" : \"2016-04-16T16:06:05Z\", \"transactionId\" : \"838916029301\", \"apiTraceId\" : \"1234567a1234567b1234567c1234567d\" } } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
