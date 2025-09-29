package com.generation.templatedefinitivo.exceptions;

import com.generation.templatedefinitivo.dtos.ErrorDto;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

//gli exception handler che metto qui si attivano per tutti i controller
@RestControllerAdvice
public class UniversalExceptionHandler
{
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDto handleCVException(ConstraintViolationException e)
    {
        ErrorDto res = new ErrorDto();
        res.setType("Invalid Data");
        res.setMsg("A field has a not acceptable value");
        return res;
    }

    @ExceptionHandler(AlreadyPresentException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ErrorDto handleAPException(AlreadyPresentException e)
    {
        ErrorDto res = new ErrorDto();
        res.setType("Entity duplicated");
        res.setMsg(e.getMessage());
        return res;
    }
}
