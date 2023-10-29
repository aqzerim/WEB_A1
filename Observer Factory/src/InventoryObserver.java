class InventoryObserver implements Observer {
    @Override
    public void update(GameCharacter character, String itemName) {
        System.out.println("Inventory updated: " + itemName + " added to " + character.getName() + "'s inventory.");
    }
}