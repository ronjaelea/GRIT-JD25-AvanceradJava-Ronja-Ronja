public class GenericDemo {

    public static void Demo(){

        Box<Integer> boxOfInteger = new Box<Integer>();
        boxOfInteger.setValue(67);
        System.out.println("boxOfInteger innehåller " + boxOfInteger.getValue());

        Box<String> boxOfString = new Box<>();
        boxOfString.setValue("Joystick, nice!");
        System.out.println("boxOfString innehåller " + boxOfString.getValue());

        Box<GenericDemo> boxOfGenericDemo = new Box<>();
        boxOfGenericDemo.setValue(new GenericDemo());
        System.out.println("boxOfGenericDemo innehåller " + boxOfGenericDemo.getValue());
    }

    @Override
    public String toString(){
        return "GenericDemo (från toString)";
    }

}

class Box<T> {
    private T value;

    public Box() {
        value = null;
    }

    public Box(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }
}
