package controller;

import domain.ShoppingItem;
import javax.inject.Inject;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import service.ShoppingItemService;

@Path("/shoppingitem")
public class ShoppingItemController {

    @Inject
    ShoppingItemService shoppingItemService;

    @PUT
    @Produces("application/json")
    @Path("/{itemId}")
    public ShoppingItem putInCard(@PathParam("itemId") long itemId) {
        return shoppingItemService.putInCard(itemId);
    }

}

