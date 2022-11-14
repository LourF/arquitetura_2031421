import java.util.Objects;

public class Course {
    private int code;
    private String name;
    private int ects;
    private int year;

    public Course(int code, String name, int ects, int year) {
        this.code = code;
        this.name = name;
        this.ects = ects;
        this.year = year;
    }

    public Course() {
        this.code = 0;
        this.name = "";
        this.ects = 0;
        this.year = 0;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getEcts() {
        return ects;
    }

    public int getYear() {
        return year;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return code == course.code && ects == course.ects && year == course.year && Objects.equals(name, course.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name, ects, year);
    }



}
