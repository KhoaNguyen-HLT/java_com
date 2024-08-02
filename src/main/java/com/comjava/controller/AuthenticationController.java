package com.comjava.controller;

//import com.comjava.dto.request.ApiResponse;
import com.comjava.dto.request.AuthenticationRequest;
import com.comjava.dto.request.IntrospectRequest;
import com.comjava.dto.response.AuthenticationResponse;
import com.comjava.dto.response.IntrospectResponse;
import com.comjava.service.AuthenticationService;
import com.nimbusds.jose.JOSEException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class AuthenticationController {
    @Autowired
    AuthenticationService authenticationService;
        @PostMapping("/token")
    AuthenticationResponse authenticated (@RequestBody AuthenticationRequest request) {
          return authenticationService.authenticate(request);
        }

    @PostMapping("/introspect")
    IntrospectResponse authenticated (@RequestBody IntrospectRequest request) throws ParseException, JOSEException {
        return authenticationService.introspect(request);
    }
}
