package ss10_dsa_danh_sach.linked;

import ss10_dsa_danh_sach.linked.MyLinkedList;

public class MyLinkedListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    public static void main(String[] args) {
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Hung");
        Student student2 = new Student(2, "Cuong");
        Student student3 = new Student(3, "Bao");
        Student student4 = new Student(4, "Ngoc");
        Student student5 = new Student(5, "Hoa");
        System.out.println(myLinkedList.size());
        myLinkedList.add(1, student3);
        myLinkedList.remove(2);
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}