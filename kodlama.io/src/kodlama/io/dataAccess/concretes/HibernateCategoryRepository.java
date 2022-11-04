package kodlama.io.dataAccess.concretes;

import kodlama.io.dataAccess.abstracts.CategoryRepository;
import kodlama.io.entities.concretes.Category;

public class HibernateCategoryRepository implements CategoryRepository {

	@Override
	public void add(Category category) {
		
		System.out.println("Hibernate ile eklendi: "+category.getName());
		
		
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile silindi: "+category.getName());
		
	}
	
	

}
