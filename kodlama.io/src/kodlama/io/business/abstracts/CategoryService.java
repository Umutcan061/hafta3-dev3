package kodlama.io.business.abstracts;

import kodlama.io.entities.concretes.Category;

public interface CategoryService {
	
	void add(Category category) throws Exception;
	void delete(Category category);

}
