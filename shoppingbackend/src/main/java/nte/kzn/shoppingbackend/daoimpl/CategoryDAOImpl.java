package nte.kzn.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import net.kzn.shoppingbackend.dto.Category;
import nte.kzn.shoppingbackend.dao.CategoryDAO;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>();

	static {
		Category category = new Category();

		category.setId(1);
		category.setName("Television");
		category.setDescriprtion("This is some television description");
		category.setImageURL("CAT_1.png");

		categories.add(category);

		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescriprtion("This is some Mobile description");
		category.setImageURL("CAT_2.png");

		categories.add(category);

		category = new Category();
		category.setId(3);
		category.setName("Dress");
		category.setDescriprtion("This is some Dress description");
		category.setImageURL("CAT_3.png");

		categories.add(category);

	}

	@Override
	public List<Category> list() {

		return categories;

	}

	@Override
	public Category get(int id) {

		//foreach 
		for(Category category :categories) {
			
			if(category.getId() == id) return category;
			
		}
		
		return null;
	}
	
	

}
