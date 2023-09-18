package egaz.egaz.controller;

import egaz.egaz.model.Payment;
import egaz.egaz.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/add")
    public Payment addPayment(@RequestBody Payment p){
        return paymentService.addPayment(p);
    }
    @GetMapping("/all")
    public List<Payment> getAllPayment(Payment p){
        return paymentService.getAllPayment(p);
    }
    @GetMapping("/{id}")
    public Optional<Payment> getById(@PathVariable Integer id){
        return paymentService.getById(id);

    }
    @DeleteMapping("/delete")
    public void deletePayment(@PathVariable Integer id){
        paymentService.deletePayment(id);
    }
    @PutMapping("/update")
    public Payment updatePayment(@RequestBody Payment p,@RequestParam Integer id){
        return paymentService.updatePayment(p,id);
    }
}
