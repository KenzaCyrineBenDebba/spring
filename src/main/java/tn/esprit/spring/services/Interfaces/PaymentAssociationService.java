package tn.esprit.spring.services.Interfaces;

import java.time.LocalDate;
import java.util.List;

import tn.esprit.spring.DAO.entities.Association;
import tn.esprit.spring.DAO.entities.PaymentAssociation;

public interface PaymentAssociationService {

	
	List<PaymentAssociation> retriveAllPayments();
	void addPayment(Long id);
	void deletePayment(Long id);
	PaymentAssociation uploadPayment(PaymentAssociation p);
	PaymentAssociation retrievePaymentId(Long id);
	void addReservation(Long id);
	List<PaymentAssociation> getReservation(Long id);
	void MakeReservation(Long idp,Long ida,Long idc);
	void Pay(Long idp);
	void Penality(Long idp);
	List<Association>nonpayee();
	List<Long> suseptible();
}
