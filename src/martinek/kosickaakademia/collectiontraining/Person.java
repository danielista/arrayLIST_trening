package martinek.kosickaakademia.collectiontraining;

public class Person {
    private String fname;
    private String lname;
    private char gender;
    private int age;

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String fname, String lname, char gender, int age) {
        this.fname = fname;
        this.lname = lname;
        this.gender = gender;
        this.age = age;
    }



    public int hashCode(){

        String wholeName = this.getFname() + this.getLname();
        System.out.println(wholeName);

        String binaryString = "";

        wholeName = wholeName.toLowerCase();
        for (int i = 0; i < wholeName.length(); i++) {
            char ch = wholeName.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'y' || ch == 'á'
                    || ch == 'é' || ch == 'í' || ch == 'ý' || ch == 'ó') binaryString += "1";

            else binaryString += "0";
        }

        System.out.println(binaryString);
        long binary = Long.parseLong(binaryString,2);
        return (int) binary;
    }


}
