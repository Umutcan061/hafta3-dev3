package kodlama.io.business.concretes;

import kodlama.io.business.abstracts.CourseService;
import kodlama.io.dataAccess.abstracts.CourseRepository;
import kodlama.io.entities.concretes.Course;
import kodlama.io.loggers.abstracts.Logger;

public class CourseManager implements CourseService {
private CourseRepository courseRepository;
private Course[] courses;
private Logger[] loggers;


	public CourseManager(CourseRepository courseRepository, Course[] courses,Logger[] loggers) {
	super();
	this.courseRepository = courseRepository;
	this.courses = courses;
	this.loggers= loggers;
}


	@Override
	public void add(Course course) throws Exception {
		if(course.getPrice()<0) {
			throw new Exception("Kurs ücreti 0'dan küçük olamaz!");
		}
		for (Course courses : courses) {
			if(courses.getName()==course.getName()) {
				throw new Exception("Kurs adı tekrarlanamaz!");
			}
			
		}
		for(Logger logger: loggers) {
			logger.log(null);
		}
		courseRepository.add(course);

		
		
	}

}
