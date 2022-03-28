package engin.demirog.list.Gun4Odev2.Concrete;

import engin.demirog.list.Gun4Odev2.Abstract.CustomerCheckService;
import engin.demirog.list.Gun4Odev2.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {
    @Override
    public boolean checkIfReal(Customer customer) {
        return true;
    }
}
