package br.com.cfarias.categoriaMeme.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cfarias.categoriaMeme.entity.CategoryMeme;


public interface CategoryRepository extends CrudRepository<CategoryMeme, Long> {

}
