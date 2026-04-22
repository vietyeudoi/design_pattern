package structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesTeam implements Payee {
    private final List<Payee> members = new ArrayList<>();

    public void add(Payee... payees) {
        members.addAll(Arrays.asList(payees));
    }

    @Override
    public void payExpenses(int amount) {
        for (Payee member : members) {
            member.payExpenses(amount);
        }
    }
}
