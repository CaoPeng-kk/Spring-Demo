package nov.service.impl;

import nov.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void saveCustomer() {
		System.out.println("�����˿ͻ�");
	}

	@Override
	public void updateCustomer(int i) {
		System.out.println("�����˿ͻ�"+i);
	}

	@Override
	public int deleteCustomer() {
		System.out.println("ɾ���˿ͻ�");
		return 0;
	}

}
