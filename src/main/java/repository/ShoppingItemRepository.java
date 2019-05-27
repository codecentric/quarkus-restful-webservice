package repository;

import domain.ShoppingItem;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ShoppingItemRepository implements PanacheRepository<ShoppingItem> {

}
