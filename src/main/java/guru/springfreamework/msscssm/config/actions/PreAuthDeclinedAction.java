package guru.springfreamework.msscssm.config.actions;

import guru.springfreamework.msscssm.domain.PaymentEvent;
import guru.springfreamework.msscssm.domain.PaymentState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

@Component
public class PreAuthDeclinedAction implements Action<PaymentState, PaymentEvent> {
    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> stateContext) {
        System.out.println("Sending Notification that PreAuth Declined");
    }
}
