package ru.vacpay.vacationpaycalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class InvalidValuesException extends RuntimeException{
    public InvalidValuesException(String message){
        super(message);
    }
}
