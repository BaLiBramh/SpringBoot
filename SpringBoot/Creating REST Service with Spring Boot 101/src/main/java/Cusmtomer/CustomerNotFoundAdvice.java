package Cusmtomer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class CustomerNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(CustomerNotFoundException.class )
    @ResponseStatus(HttpStatus.NOT_FOUND )

     String CustomerNotFoundHandler(CustomerNotFoundException e) {
        return e.getMessage();

    }
}
