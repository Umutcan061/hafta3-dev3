package kodlama.io.loggers.concretes;

import kodlama.io.loggers.abstracts.Logger;

public class SmsLogger implements Logger {

	@Override
	public void log(String mesaj) {
		System.out.println("Sms ile loglandı");
		
	}

}
