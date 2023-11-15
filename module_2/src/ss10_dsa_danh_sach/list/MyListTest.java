package ss10_dsa_danh_sach.list;

import ss10_dsa_danh_sach.list.MyList;

public class MyListTest {
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

        @Override
        public String toString() {
            return "MyListTest{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

    }

    public static void main(String[] args) {

        Student student1 = new Student(1, "Hung");
        Student student2 = new Student(2, "Cuong");
        Student student3 = new Student(3, "Bao");
        Student student4 = new Student(4, "Ngoc");
        Student student5 = new Student(5, "Hoa");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(student1);
        studentMyList.add(student2);
        studentMyList.add(student3);
        studentMyList.add(student4);
        studentMyList.add(student5, 2);

        studentMyList.clear();
        studentMyList.size();
        System.out.println(studentMyList.size());
        System.out.println(studentMyList.get(3).getId());
        System.out.println(studentMyList.indexOf(student4));
        studentMyList.ensureCapacity(5);
        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());

        }
    }
}
