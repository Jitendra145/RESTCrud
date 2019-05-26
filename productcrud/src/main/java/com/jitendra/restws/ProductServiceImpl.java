package com.jitendra.restws;

import java.util.List;

import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.jitendra.restws.entities.Product;
import com.jitendra.restws.repos.ProductRepository;

public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository repository; 
	
	@Override
	public List<Product> getProducts() {
		return repository.findAll();
	}

	@Override
	public Product getProduct(int id) {
		return repository.findById(id).get();
	}

	@Override
	public Response createProduct(Product product) {
		Product savedProduct = repository.save(product);
		return Response.ok(savedProduct).build();
	}

	@Override
	public Response updateProduct(Product product) {
		Product savedProduct = repository.save(product);
		return Response.ok(savedProduct).build();
	}

	@Override
	public Response deleteProduct(int id) {
		repository.deleteById(id);
		return Response.ok().build();
	}

	
	@Override
	public Response deleteProduct(Product product) {
		repository.delete(product);;
		return Response.ok(product).build();
	}

}
