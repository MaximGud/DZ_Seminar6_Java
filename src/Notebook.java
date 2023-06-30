import java.util.Objects;

public class Notebook {
  // поля
  private String model;
  private int price;
  private int year;
  
  // конструктор
  Notebook(String model, int price, int year) {
    this.model = model;
    this.price = price;
    this.year = year;

  // методы
  }

  public String getModel() {
    return model;
  }

  public int getPrice() {
    return price;
  }

  public int getYear() {
    return year;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public int hashCode() {
        return Objects.hash(model, price, year);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Notebook other = (Notebook) obj;
    if (model == null) {
      if (other.model != null)
        return false;
    } else if (!model.equals(other.model))
      return false;
    if (price != other.price)
      return false;
    if (year != other.year)
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Notebook Model: "+model+", " + "Price: "+ price+", " + "Year: "+year;
  }
}
