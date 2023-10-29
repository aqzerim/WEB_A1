class ItemFactory {
    public static GameItem createItem(String itemName) {
        if (itemName.equalsIgnoreCase("health potion")) {
            return new HealthPotion();
        } else if (itemName.equalsIgnoreCase("sword")) {
            return new Weapon("Sword");
        } else if (itemName.equalsIgnoreCase("shield")) {
            return new Weapon("Shield");
        } else {
            return null;
        }
    }
}






