package Cusmtomer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {


    private CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }



    @GetMapping("/customer")
    List<Customer> all(){

        return repository.findAll();
    }

    @PostMapping("/customer")
    Customer save(@RequestBody  Customer newCustomer){

        return repository.save(newCustomer);
    }

    @GetMapping("/customer/{id}")
    Customer get(@PathVariable Long id){
        return repository.findById(id).orElseThrow(()->new CustomerNotFoundException(id));
    }

    @PutMapping("/customer/{id}")
    Customer update(@PathVariable Long id ,@RequestBody Customer newCustomer){
      return   repository.findById(id).map(customer -> {
            customer.setEmail(newCustomer.getEmail());
          customer.setName(newCustomer.getName());
          repository.save(customer);
            return customer;
        }).orElseGet(() -> {
            newCustomer.setId(id);
            return repository.save(newCustomer);
      });
    }

    @DeleteMapping("/customer/{id}")
    void delete(@PathVariable Long id){
         repository.deleteById(id);

    }
}
