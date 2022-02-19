package alexey.interfaces.printable;

public class Magazine implements Printable{

    private String name;

    @Override
    public void print() {
        System.out.println(this);
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
}
