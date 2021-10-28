public class Met extends Person{

    String newname;

    public static String getNewname(String name, int age, char gender) {
        if (gender == 'F') {
            name = "Mrs." + name;
        } else if (gender == 'M') {
                name = "Mr." + name;
            }
        return name;
        }
        public void getNewname(String newname) {
        this.newname = name;
    }

    public static void main(String[] args) {

        System.out.println(getNewname("Olga", 34, 'F'));
        System.out.println(getNewname("Mike", 32, 'M'));

    }
}