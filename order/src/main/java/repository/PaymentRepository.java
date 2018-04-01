package repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import model.Payment;

@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {
    public List<Payment> findAll();
    
}
