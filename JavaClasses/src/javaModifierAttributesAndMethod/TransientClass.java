package javaModifierAttributesAndMethod;


import java.io.*;

class MyClass implements Serializable {
    // This variable will be included in serialization
    private int regularVariable;

    // This variable will be excluded from serialization
    private transient String transientVariable;

    public MyClass(int regularVariable, String transientVariable) {
        this.regularVariable = regularVariable;
        this.transientVariable = transientVariable;
    }

    public void displayValues() {
        System.out.println("Regular Variable: " + regularVariable);
        System.out.println("Transient Variable: " + transientVariable);
    }
}

public class TransientClass {
    public static void main(String[] args) {
        MyClass obj = new MyClass(42, "Hello");

        // Serialize the object
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("serialized_object.ser"))) {
            oos.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("serialized_object.ser"))) {
            MyClass deserializedObj = (MyClass) ois.readObject();
            deserializedObj.displayValues();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
