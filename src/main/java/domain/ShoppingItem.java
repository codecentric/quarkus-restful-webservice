package domain;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import javax.persistence.Entity;

@Entity
public class ShoppingItem extends PanacheEntity {
  private String name;
  private float amount;
  private boolean inCard = false;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getAmount() {
    return amount;
  }

  public void setAmount(float amount) {
    this.amount = amount;
  }

  public boolean isInCard() {
    return inCard;
  }

  public void setInCard(boolean inCard) {
    this.inCard = inCard;
  }
}
