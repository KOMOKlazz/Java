import java.util.ArrayList;

class Closet {
    public ArrayList<Item> closet = new ArrayList<>();

    public ArrayList<Item> GetCloset() {
        return closet;
    }

    public void PutItemInCloset(Item item, int number) {
        if (closet.get(number) == null) {
            closet.set(number, item);
            System.out.println("Вы положили" + item.getName() + "в полку" + number);
        } else {
            System.out.println("Полка занята");
        }
    }
}