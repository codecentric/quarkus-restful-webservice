package service;

import domain.ShoppingItem;
import domain.ShoppingList;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import repository.ShoppingItemRepository;
import repository.ShoppingListRepository;

@ApplicationScoped
public class ShoppingListService {

  private ShoppingItemRepository shoppingItemRepository;
  private ShoppingListRepository shoppingListRepository;



  @Inject
  public ShoppingListService(ShoppingItemRepository shoppingItemRepository,
      ShoppingListRepository shoppingListRepository) {
    this.shoppingItemRepository = shoppingItemRepository;
    this.shoppingListRepository = shoppingListRepository;
  }

  public ShoppingListService() {
  }

  public ShoppingList getById(long id) {
    return shoppingListRepository.findById(id);
  }

  @Transactional
  public ShoppingList createShoppingList(String name) {
    ShoppingList shoppingList = new ShoppingList();
    shoppingList.setName(name);
    shoppingListRepository.persist(shoppingList);
    return shoppingList;
  }

  @Transactional
  public ShoppingList addItem(long shoppingListId, String name, float amount) {
    ShoppingItem shoppingItem = new ShoppingItem();
    shoppingItem.setName(name);
    shoppingItem.setAmount(amount);
    shoppingItemRepository.persist(shoppingItem);

    ShoppingList shoppingList = shoppingListRepository.findById(shoppingListId);
    shoppingList.getItems().add(shoppingItem);

    return shoppingList;
  }
}
