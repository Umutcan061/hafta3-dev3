package kodlama.io.business.concretes;

import kodlama.io.business.abstracts.CategoryService;
import kodlama.io.dataAccess.abstracts.CategoryRepository;
import kodlama.io.entities.concretes.Category;
import kodlama.io.loggers.abstracts.Logger;

public class CategoryManager implements CategoryService {
	private CategoryRepository categoryRepository;
	private Category[] categories;
	private Logger[] loggers;

	public CategoryManager(CategoryRepository categoryRepository, Category[] categories,Logger[] loggers) {
		super();
		this.categoryRepository = categoryRepository;
		this.categories = categories;
		this.loggers=loggers;
	}

	@Override
	public void add(Category category) throws Exception {
		for (Category categoryy : categories) {
			if (categoryy.getName() == category.getName()) {
				throw new Exception("Aynı isimle kategori eklenemez!");
			}
		}
		categoryRepository.add(category);
		for(Logger logger:loggers) {
			logger.log(null);
		}

	}

	@Override
	public void delete(Category category) {
		categoryRepository.delete(category);

	}

}
