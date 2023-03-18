package net.proselyte.customerdemo.service;

import lombok.extern.slf4j.Slf4j;
import net.proselyte.customerdemo.model.Customer;
import net.proselyte.customerdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiveImpl implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public Customer getById(Long id) {
        log.info("IN CustomerServiveImpl getById {}", id);
        return customerRepository.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiveImpl save {}", customer);
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("IN CustomerServiveImpl delete {}", id);
        customerRepository.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiveImpl getAll");
        return customerRepository.findAll();
    }
}
