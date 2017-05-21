public class Player {
  String name;
  int value;

  public Player(String name, int value) {
    this.name = name;
    this.value = value;
  }

  public String getName() {
    return this.name;
  }

  public int getCardValue() {
    return this.value;
  }
}
