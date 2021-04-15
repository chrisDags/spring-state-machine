package guru.springfreamework.msscssm.services;

import guru.springfreamework.msscssm.domain.Payment;
import guru.springfreamework.msscssm.domain.PaymentEvent;
import guru.springfreamework.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {
    Payment newPayment(Payment payment);
    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);
    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);
}
