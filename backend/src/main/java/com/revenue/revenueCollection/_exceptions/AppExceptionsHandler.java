package com.revenue.revenueCollection._exceptions;

import com.revenue.revenueCollection._model.response.ErrorMessage;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {

  @ExceptionHandler(value = {AgentServiceException.class})
  public ResponseEntity<Object> handleAgentServiceException(AgentServiceException ex, WebRequest request) {

    String errorMessageDescription = ex.getLocalizedMessage();

    if (errorMessageDescription == null) errorMessageDescription = ex.toString();

    ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);

    return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(value = {DeviceServiceException.class})
  public ResponseEntity<Object> handleDeviceServiceException(DeviceServiceException ex, WebRequest request) {

    String errorMessageDescription = ex.getLocalizedMessage();

    if (errorMessageDescription == null) errorMessageDescription = ex.toString();

    ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);

    return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(value = {GenericServiceException.class})
  public ResponseEntity<Object> handleGenericServiceException(GenericServiceException ex, WebRequest request) {

    String errorMessageDescription = ex.getLocalizedMessage();

    if (errorMessageDescription == null) errorMessageDescription = ex.toString();

    ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);

    return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST);
  }

  @ExceptionHandler(value = {Exception.class})
  public ResponseEntity<Object> handleOtherExceptions(Exception ex, WebRequest request) {

    String errorMessageDescription = ex.getLocalizedMessage();

    if (errorMessageDescription == null) errorMessageDescription = ex.toString();

    ErrorMessage errorMessage = new ErrorMessage(new Date(), errorMessageDescription);

    return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST);
  }
}
