package engin.demirog.list.Gun4Odev2.Concrete;

import engin.demirog.list.Gun4Odev2.Abstract.BaseCustomerManager;
import engin.demirog.list.Gun4Odev2.Abstract.CustomerCheckService;
import engin.demirog.list.Gun4Odev2.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {

    private CustomerCheckService customerCheckService;

    public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void customerRegister(Customer customer) throws Exception {
        if (customerCheckService.checkIfReal(customer) == true){
        }
        else {
            throw new Exception("person entered Invalid");
        }
    }
}
