package engin.demirog.list.Gun4Odev2.Adapters;

import engin.demirog.list.Gun4Odev2.Abstract.CustomerCheckService;
import engin.demirog.list.Gun4Odev2.Entities.Customer;

public class MernisServiceAdapter implements CustomerCheckService {
    @Override
    public boolean checkIfReal(Customer customer) {
        return true;
    }
}
