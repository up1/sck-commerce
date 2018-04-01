package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Payment;
import model.PaymentChanel;
import service.PaymentService;

@RestController()
public class PaymentController {
	
	@Autowired
	private PaymentService paymentService;

	@GetMapping("payment-chanel")
	public List<Payment> getPaymentChanel() {
		return paymentService.findAll();
	}
	
	@GetMapping("test-payment-controller")
	public String testPaymentController() {
		return "PaymentController works!";
	}
}
