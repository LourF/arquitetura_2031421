public class Stadium {
    private String name;
    private String country;
    private int capacity;

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public Stadium (String name, String country, int Capacity){
        this.name = name;
        this.country = country;
        this.capacity = capacity;
    }

    @Override
    public String toString(){
        return getClass().getSimpleName() + ": " + name + ", " + country + ", " + capacity + ", ";
    }


}
