public class GameDemo {
    public static void main(String[] args) {
        GameCharacter player = new GameCharacter("Player 1");
        InventoryObserver inventoryObserver = new InventoryObserver();
        player.registerObserver(inventoryObserver);

        player.collectItem("Health Potion");
        player.collectItem("Sword");

        GameItem shield = ItemFactory.createItem("Shield");
        if (shield != null) {
            player.collectItem(shield.getName());
        }
    }
}