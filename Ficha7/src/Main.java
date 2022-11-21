import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.*;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        out.println("Hello world!");

        enum Menu {
            START, SAVEGAME, LOADGAME, HIGHSCORES, QUIT
        }

        out.println(Menu.START);
        out.println(Menu.SAVEGAME);
        out.println(Menu.LOADGAME);
        out.println(Menu.HIGHSCORES);
        out.println(Menu.QUIT);

        Scanner scanner = new Scanner(System.in);
        out.println("Introduza um comando: ");
        String line = scanner.nextLine();
        Menu menu = Menu.valueOf(line);


        /*if (command.equals("START")) {
            System.out.println("Começou o jogo");
        } else if (command.equals("SAVEGAME")) {
            System.out.println("Guardou o jogo");
        } else if (command.equals("LOADGAME")) {
            System.out.println("A carregar...");
        } else if (command.equals("HIGHSCORES")) {
            System.out.println("Highscores: ");
        } else if (command.equals("QUIT")) {
            System.out.println("a sair...");
        }*/

        switch (menu) {
            case START:
                out.println("starting...");
                break;

            case SAVEGAME:
                out.println("saving...");
                break;
            case LOADGAME:
                out.println("loading...");
            case HIGHSCORES:
                out.println("HighScores: ");
            case QUIT:
                out.println("Quiting...");
                break;
        }

        Rational r0 = new Rational();
        Rational r1 = new Rational(2, 2);
        Rational r2 = new Rational(3, 2);
        Rational r3 = new Rational(7, 2);
        Rational r4 = new Rational(9, 2);


        List<Rational> rationalList = new ArrayList<Rational>();
        rationalList.add(r0);
        rationalList.add(r1);
        rationalList.add(r2);
        rationalList.add(r3);
        rationalList.add(r4);

        Student s1 = new Student(2, "b");
        Student s2 = new Student(3, "C");
        Student s3 = new Student(1, "a");
        Student s4 = new Student(4, "D");


        List<Student> studentsList = new ArrayList<Student>();
        studentsList.add(s1);
        studentsList.add(s2);
        studentsList.add(s3);
        studentsList.add(s4);


        Collections.sort(rationalList);
        out.println(rationalList);

        Collections.sort(studentsList);
        out.println(studentsList);

        Collections.sort(studentsList, new StudentsComparatorByName());
        out.println(studentsList);

        Map<String, Course> courses = new HashMap<String, Course>();

        Course c1 = new Course(1, "Arqu...", 1, 2022);
        Course c2 = new Course(2, "Arq", 2, 2023);
        Course c3 = new Course(3, "Ar", 3, 2024);

        courses.put("arq", c1);
        courses.put("ar", c2);
        courses.put("a", c3);

        if (courses.containsKey("arq"))
            out.println(courses.get("arq"));

        for (String key : courses.keySet())
            out.println(key);

        for (Course values : courses.values())
            out.println(values);

        for (Map.Entry<String, Course> entry : courses.entrySet())
            out.println(entry);

        List<Integer> yearList = new ArrayList<Integer>();

        for (Course course : courses.values()) {
            if (!yearList.contains(course.getYear())) {
                yearList.add(course.getYear());
            }
        }
        out.println(yearList.toString());

        ArrayList<ArrayList<Course>> coursesByYear = new ArrayList<ArrayList<Course>>();

        for (int year : yearList) {
            ArrayList<Course> list = new ArrayList<Course>();
            for (Course course : courses.values()) {
                if (year == course.getYear()) {
                    list.add(course);
                }
            }
            coursesByYear.add(list);
        }

        for (ArrayList<Course> list : coursesByYear) {
            for (Course course : list) {
                out.println(course);
            }
            Collections.sort(yearList);
        }
    }
}

