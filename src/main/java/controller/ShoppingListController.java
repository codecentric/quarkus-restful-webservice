package controller;

import controller.dto.ShoppingItemDTO;
import controller.dto.ShoppingListDTO;
import domain.ShoppingItem;
import domain.ShoppingList;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import service.ShoppingListService;

@Path("/shopping-list")
public class ShoppingListController {

  @Inject
  ShoppingListService shoppingListService;

  @POST
  @Produces("application/json")
  @Consumes("application/json")
  public ShoppingList create(ShoppingListDTO shoppingList) {
    return shoppingListService.createShoppingList(shoppingList.getName());
  }

  @GET
  @Path("/{listId}")
  @Produces("application/json")
  public ShoppingList get(@PathParam("listId") long listId) {
    return shoppingListService.getById(listId);
  }

  @POST
  @Path("/{listId}/item")
  @Produces("application/json")
  @Consumes("application/json")
  public ShoppingList addItem(@PathParam("listId") long listId, ShoppingItemDTO shoppingItem) {
    return shoppingListService.addItem(listId, shoppingItem.getName(), shoppingItem.getAmount());
  }
}
