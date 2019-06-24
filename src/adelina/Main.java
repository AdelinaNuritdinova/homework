package adelina;

public class Main {

    public static void main(String[] args) {
        String name ;
        int age = 29;
        int temperature = 31;

        if((temperature>30 || temperature<-20)&&(age < 20 && age > 45)) {

            System.out.println("Не выходите гулять");


        }else if((temperature>28 || temperature<0)&&(age<20)){

            System.out.println("Не выходите гулять");


        } else if((temperature>25 || temperature<-10)&&(age>45)) {

            System.out.println("Не выходите гулять");

        }else {

            System.out.println("Oтправляйтесь в гости к своему другу");
        }

    }
}
