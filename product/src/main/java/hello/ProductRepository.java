package hello;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "product", path = "products")
public interface ProductRepository extends MongoRepository<Product, String> {
    Product findById(@Param("id") Integer id);
}