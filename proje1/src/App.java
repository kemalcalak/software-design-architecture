public class App {
    class Ogrenci {
        private String name;
        private int no;
        private int classNo;
        private String department;
        private int startYear;
        public Ogrenci(String name, int no, int classNo, String department, int startYear) {
            this.name = name;
            this.no = no;
            this.classNo = classNo;
            this.department = department;
            this.startYear = startYear;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getNo() {
            return no;
        }
        public void setNo(int no) {
            this.no = no;
        }
        public int getClassNo() {
            return classNo;
        }
        public void setClassNo(int classNo) {
            this.classNo = classNo;
        }
        public String getDepartment() {
            return department;
        }
        public void setDepartment(String department) {
            this.department = department;
        }
        public int getStartYear() {
            return startYear;
        }
        public void setStartYear(int startYear) {
            this.startYear = startYear;
        }
        public void print() {
            System.out.println("Isim: " + name);
            System.out.println("Numara: " + no);
            System.out.println("Sinif No: " + classNo);
            System.out.println("Bolum: " + department);
            System.out.println("Baslangic yili: " + startYear);
        }
    }
}