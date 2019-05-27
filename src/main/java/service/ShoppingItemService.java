package service;

import domain.ShoppingItem;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import repository.ShoppingItemRepository;

@ApplicationScoped
public class ShoppingItemService {

  private ShoppingItemRepository shoppingItemRepository;

  @Inject
  public ShoppingItemService(ShoppingItemRepository shoppingItemRepository) {
    this.shoppingItemRepository = shoppingItemRepository;
  }

  public ShoppingItemService() {
  }

  @Transactional
  public ShoppingItem putInCard(long itemId) {
    ShoppingItem shoppingItem = shoppingItemRepository.findById(itemId);
    shoppingItem.setInCard(true);
    return shoppingItem;
  }
}
