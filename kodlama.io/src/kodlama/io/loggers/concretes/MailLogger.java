package kodlama.io.loggers.concretes;

import kodlama.io.loggers.abstracts.Logger;

public class MailLogger implements Logger {

	@Override
	public void log(String mesaj) {

		System.out.println("Mail ile loglandı");
	}

}
