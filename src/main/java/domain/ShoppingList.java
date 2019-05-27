package domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class ShoppingList extends PanacheEntity {
  private String name;
  @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
  @JoinColumn(name = "shopping_list_id")
  private List<ShoppingItem> items = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<ShoppingItem> getItems() {
    return items;
  }

  public void setItems(List<ShoppingItem> items) {
    this.items = items;
  }

}
