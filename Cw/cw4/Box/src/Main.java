public class Main {
    public static void main(String[] args) {
        Box<String> myBox = new Box<>("ponos");
        System.out.println(myBox.getObj());

        Box<Integer> integerBox = new Box<>(2);
        Box<Integer> anotherIntegerBox = new Box<>(5);

//        int sum = integerBox.getObj() + anotherIntegerBox.getObj();
//        System.out.println(sum);
//        myBox.showType();

        Arrays<Integer> arrays = new Arrays<>(1,6,98,167,853);
        System.out.println(arrays.avg());
    }
}
