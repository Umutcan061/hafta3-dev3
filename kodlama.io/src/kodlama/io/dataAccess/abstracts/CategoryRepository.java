package kodlama.io.dataAccess.abstracts;

import kodlama.io.entities.concretes.Category;

public interface CategoryRepository {
	
	void add(Category category);
	void delete(Category category);

}
