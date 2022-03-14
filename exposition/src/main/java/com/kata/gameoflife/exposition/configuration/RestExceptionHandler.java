package com.kata.gameoflife.exposition.configuration;


import com.kata.gameoflife.application.structures.ApplicationException;
import com.kata.gameoflife.domain.structures.DomainException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
@Slf4j
public class RestExceptionHandler {


    @ResponseBody
    @ExceptionHandler(Throwable.class)
    public final ResponseEntity<?> handleFeignExceptions(Exception ex, WebRequest request) {

        if (ex instanceof ApplicationException) {
            return ResponseEntity.badRequest().body(((ApplicationException) ex).message);
        }

        if (ex instanceof DomainException) {
            return ResponseEntity.badRequest().body(((DomainException) ex).message);
        }

        return ResponseEntity.internalServerError().build();
    }

}
