package quoc.dev.data.dao;

import java.util.List;

import quoc.dev.data.model.Category;

public interface CategoryDao {
	public boolean insert(Category category);
	public boolean update(Category category);
	public boolean delete(int categoryId);
	public Category find(int categoryId);
	public List<Category> findAll();
}
