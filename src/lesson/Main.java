package lesson;

import java.util.*;

public  class Main {
    public static void main(String[] args) {

//        ArrayList<String> names=new ArrayList<>(Arrays.asList("Akylai","Aizada"));
//        System.out.println(names);
//
//        ArrayList<Integer>numbers=new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9));
//        System.out.println(numbers);


//        ArrayList<String> array=new ArrayList<>();
//        array.add("a");
//        array.add("b");
//        array.add("c");
//        for(int i=0;i< array.size();i++){
//            System.out.println(array.get(i));
//        }
//
//        System.out.println();


//        MyArrayList myArrayList=new MyArrayList();
//        myArrayList.add(5);
//        System.out.println();
//        ArrayList<Person>people=new ArrayList<>();


        /**Task1*/
       /* Random random=new Random();
        ArrayList<Integer>integers=new ArrayList<>();
        ArrayList<Integer>oddNumbers=new ArrayList<>(integers);
        ArrayList<Integer>evenNumbers=new ArrayList<>(integers);
        for (int i = 0; i <= 10; i++) {
            integers.add(random.nextInt(1,100));
        }
        System.out.println(integers);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for (Integer i:integers) {
            if(i%2==0){
                oddNumbers.add(i);
            }else {
                evenNumbers.add(i);
            }
        }
        System.out.println("Четные числа "+oddNumbers);
        System.out.println("Нечетные числа "+evenNumbers);*/


        /**Task2*/
       /* lesson.Student student1 = new lesson.Student("Akylai", 20, "Java");
        lesson.Student student2 = new lesson.Student("Aizada", 21, "Java");
        lesson.Student student3 = new lesson.Student("Marat", 29, "JS");
        lesson.Student student4 = new lesson.Student("Temir", 18, "JS");
        lesson.Student student5 = new lesson.Student("Alina", 25, "Java");

        ArrayList<lesson.Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5));
        System.out.println(students);
        ArrayList<lesson.Student> java = new ArrayList<>();
        ArrayList<lesson.Student> js = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.println("""
                Choose operation: 
                1-filter students by group
                2-get students in age 19-23
                3-get students names start with letter A""");
        while (true) {
            switch (num = scanner.nextInt()) {
                case 1:
                    filterGroup(students);
                    break;
                case 2:
                    getByAge(students);
                    break;
                case 3:
                    getByLetter(students);
                    break;
                default:
                    System.out.println("Введите числа только от 1 до 3");
            }
        }
    }

    public static lesson.Student filterGroup(ArrayList<lesson.Student> students) {
        ArrayList<lesson.Student> java = new ArrayList<>();
        ArrayList<lesson.Student> js = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGroup().equals("Java")) {
                java.add(students.get(i));
            } else {
                js.add(students.get(i));
            }
        }
        System.out.println("\nJava group " + java);
        System.out.println("\nJs group " + js);
        return null;
    }

    public static lesson.Student getByAge(ArrayList<lesson.Student> students) {
        ArrayList<lesson.Student> age = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAge() >= 19 && students.get(i).getAge() <= 23) {
                age.add(students.get(i));
            }
        }
        System.out.println("\n19дан 23ко чейинки студенттер " + age);
        return null;
    }

    public static lesson.Student getByLetter(ArrayList<lesson.Student> students) {
        ArrayList<lesson.Student> startWithA = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().startsWith("A")) {
                startWithA.add(students.get(i));
            }
        }
        System.out.println(startWithA);
        return null;
    }*/




    }


}
