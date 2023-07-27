package mz.rucatrack.hrworker.services;

import org.springframework.stereotype.Service;

import mz.rucatrack.hrworker.entities.Payment;


@Service
public class PaymentService {

	public Payment getPayment(Long workerId, int days) {
		return new Payment("Bob", 2000.00, days);
	}
}
