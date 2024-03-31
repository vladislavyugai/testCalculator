package ru.vacpay.vacationpaycalculator.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.vacpay.vacationpaycalculator.dto.Response;
import ru.vacpay.vacationpaycalculator.exception.InvalidValuesException;

@ControllerAdvice
public class DefaultAdvice {

    @ExceptionHandler(InvalidValuesException.class)
    public ResponseEntity<Response> handleException(InvalidValuesException e){
        Response response = new Response(e.getMessage());
        return new ResponseEntity<>(response, HttpStatus.NOT_ACCEPTABLE);
    }
}
