public class Student implements Comparable<Student> {
    private int number;
    private String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public Student(){
        this.number = 0;
        this.name = " ";
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object obj){
        Student other = (Student) obj;
        return this.number == other.number && this.name == other.name;
    }


    @Override
    public int compareTo(Student o) {
        return  this.number - o.number;
    }


    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
