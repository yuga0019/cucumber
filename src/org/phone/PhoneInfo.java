package org.phone;

public class PhoneInfo {
//Method
	private void phoneName() {
		System.out.println("Iphone 8");
	}
	private void phoneMieiNum() {
		System.out.println("34 XXXXXXXXX 12");
	}
	private void Camera() {
		System.out.println("7 & 12 MP Front & Back Camera");
	}
	private void storage() {
		System.out.println("64 GB");
	}
	
	//Execute
	public static void main(String[] args) {
		PhoneInfo c = new PhoneInfo();
				c.phoneName();
		c.phoneMieiNum();
		c.Camera();
		c.storage();
		
	}

}
