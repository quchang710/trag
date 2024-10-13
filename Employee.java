public class Employee {

        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public void raiseSalary(double percent) {
            salary += salary * percent / 100;
        }

        @Override
        public String toString() {
            return "Employee[ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
        }
    }


