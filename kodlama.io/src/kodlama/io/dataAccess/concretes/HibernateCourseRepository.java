package kodlama.io.dataAccess.concretes;

import kodlama.io.dataAccess.abstracts.CourseRepository;
import kodlama.io.entities.concretes.Course;

public class HibernateCourseRepository implements CourseRepository {

	@Override
	public void add(Course course) {

		System.out.println("Hibernate ile eklendi: "+course.getName());
		
	}

}
