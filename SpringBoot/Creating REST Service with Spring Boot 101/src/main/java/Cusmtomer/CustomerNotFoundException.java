package Cusmtomer;

public class CustomerNotFoundException extends RuntimeException{
    CustomerNotFoundException(Long id){

        super(String.format("customer with id %s not found",id));
    }


}
