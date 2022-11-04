package kodlama.io.dataAccess.concretes;

import kodlama.io.dataAccess.abstracts.CategoryRepository;
import kodlama.io.entities.concretes.Category;

public class JdbcCategoryRepository implements CategoryRepository {

	@Override
	public void add(Category category) {

		System.out.println("Jdbc ile eklendi: "+category.getName());
	}

	@Override
	public void delete(Category category) {
		System.out.println("Jdbc ile silindi: "+category.getName() );
		
	}

}
