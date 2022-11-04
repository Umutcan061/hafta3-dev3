package kodlama.io.business.concretes;

import kodlama.io.business.abstracts.TeacherService;
import kodlama.io.dataAccess.abstracts.TeacherRepository;
import kodlama.io.entities.concretes.Teacher;

public class TeacherManager implements TeacherService {
	private TeacherRepository teacherRepository;

	public TeacherManager(TeacherRepository teacherRepository) {
		super();
		this.teacherRepository = teacherRepository;
	}

	@Override
	public void add(Teacher teacher) {
		
		teacherRepository.add(teacher);

	}

}
