package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import model.Payment;
import repository.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepository;
	public List<Payment> findAll() {
		return paymentRepository.findAll();
	}
	
    public Payment save(Payment payment) {
    		return paymentRepository.save(payment);
    }
}
