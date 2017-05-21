public class Game {
  Player player;
  Player secondPlayer;

  public Game() {
    player = new Player("Charlie", 14);
    secondPlayer = new Player("Zuzana", 11);
  }

  public void whoHasWon() {
    if (player.getCardValue() > secondPlayer.getCardValue())
      System.out.println(player.getName() + " wins!");
    else
      System.out.println(secondPlayer.getName() + " wins!");
  }
}
