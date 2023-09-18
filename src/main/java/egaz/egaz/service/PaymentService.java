package egaz.egaz.service;

import egaz.egaz.model.Payment;
import egaz.egaz.repository.PaymentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepo paymentRepo;
    public Payment addPayment(Payment p){
        return paymentRepo.save(p);
    }
    public List<Payment> getAllPayment(Payment p){
        return paymentRepo.findAll();
    }
    public Optional<Payment> getById(Integer id){
        return paymentRepo.findById(id);
    }
    public void deletePayment(Integer id){
        paymentRepo.deleteById(id);
    }
    public Payment updatePayment(Payment p,Integer id){
        p.setId(id);
        return paymentRepo.save(p);
    }
}
