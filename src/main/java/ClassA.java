public class ClassA {
    public static void main(String[] args) {

        Employee abc = new Employee();
        abc.setEmp_name("Sehrish");
        abc.setEmp_id("Emp_112301");
        abc.setEmp_desig("Senior QA");
        System.out.println("The name  of Employee is " + abc.getEmp_name() + ",Employee id is " + abc.getEmp_id() + " and her designation is " + abc.getEmp_desig() );

        Samsung obj = new Samsung();
        obj.call();
        obj.call("YES");
        /*comment*/

    }
}
