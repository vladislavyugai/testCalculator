package ru.vacpay.vacationpaycalculator.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
public class DateException extends RuntimeException{
    public DateException(String message){
        super(message);
    }
}
