package kodlama.io.dataAccess.concretes;

import kodlama.io.dataAccess.abstracts.TeacherRepository;
import kodlama.io.entities.concretes.Teacher;

public class JdbcTeacherRepository implements TeacherRepository {

	@Override
	public void add(Teacher teacher) {

		System.out.println("Jdbc ile veritabanına eklendi: "+ teacher.getFirstName());
		
	}

}
