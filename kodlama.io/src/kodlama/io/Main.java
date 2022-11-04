package kodlama.io;

import kodlama.io.business.abstracts.CategoryService;
import kodlama.io.business.abstracts.CourseService;
import kodlama.io.business.abstracts.TeacherService;
import kodlama.io.business.concretes.CategoryManager;
import kodlama.io.business.concretes.CourseManager;
import kodlama.io.business.concretes.TeacherManager;
import kodlama.io.dataAccess.concretes.HibernateCategoryRepository;
import kodlama.io.dataAccess.concretes.HibernateTeacherRepository;
import kodlama.io.dataAccess.concretes.JdbcCourseRepository;
import kodlama.io.entities.concretes.Category;
import kodlama.io.entities.concretes.Course;
import kodlama.io.entities.concretes.Teacher;
import kodlama.io.loggers.abstracts.Logger;
import kodlama.io.loggers.concretes.MailLogger;
import kodlama.io.loggers.concretes.SmsLogger;

public class Main {

	public static void main(String[] args) throws Exception {

		Teacher teacher1 = new Teacher(1, "Engin", "Demiroğ");
		Teacher teacher2 = new Teacher(2, "Umutcan", "Çalık");

		TeacherService teacherService = new TeacherManager(new HibernateTeacherRepository());
		teacherService.add(teacher2);
		teacherService.add(teacher1);
		Category category1 = new Category(1, "Yazılım");
		Category category2 = new Category(1, "Proglama");
		Category category3 = new Category(3, "İnternet");

		Category[] categories = { category1, category2 };
		Logger[] logger = { new MailLogger(), new SmsLogger() };
		CategoryService categoryService = new CategoryManager(new HibernateCategoryRepository(), categories, logger);

		categoryService.add(category3);
		categoryService.delete(category3);
		Course course1 = new Course(1, "Java", 1500);
		Course course2 = new Course(1, "Phyton", 2500);
		Course course3 = new Course(1, "C", 3500);
		Course course4 = new Course(1, "C++", 4000);
		Course[] courses = { course1, course2, course3 };
		CourseService courseService = new CourseManager(new JdbcCourseRepository(), courses,logger);
		courseService.add(course4);

	}

}
