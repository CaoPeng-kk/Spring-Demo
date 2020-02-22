package nov.service.impl;

import nov.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void saveCustomer() {
		System.out.println("保存了客户");
	}

	@Override
	public void updateCustomer(int i) {
		System.out.println("更新了客户"+i);
	}

	@Override
	public int deleteCustomer() {
		System.out.println("删除了客户");
		return 0;
	}

}
