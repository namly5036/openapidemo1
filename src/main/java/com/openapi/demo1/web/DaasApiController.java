package com.openapi.demo1.web;

import com.openapi.demo1.dto.EnhancedDataServiceRequest;
import com.openapi.demo1.dto.EnhancedDataServiceResponse;
import com.openapi.demo1.dto.ErrorResponse;
import com.openapi.demo1.dto.ReturnOptimizerRequest;
import com.openapi.demo1.dto.ReturnOptimizerResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-07T17:34:59.232080700+07:00[Asia/Bangkok]")
@Controller
public class DaasApiController implements DaasApi {

    private final DaasApiDelegate delegate;

    public DaasApiController(@Autowired(required = false) DaasApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new DaasApiDelegate() {});
    }

    @Override
    public DaasApiDelegate getDelegate() {
        return delegate;
    }

}
