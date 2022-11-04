package kodlama.io.dataAccess.concretes;

import kodlama.io.dataAccess.abstracts.TeacherRepository;
import kodlama.io.entities.concretes.Teacher;

public class HibernateTeacherRepository implements TeacherRepository {

	@Override
	public void add(Teacher teacher) {

		System.out.println("Hibernate ile veritabanına eklendi: "+teacher.getFirstName());
		
	}

}
