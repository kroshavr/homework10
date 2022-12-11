public class Main {
    public static void main(String[] args) {
        //Задание 1
        String firstName = "Ivan";
        String midlleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + midlleName;
        System.out.println("ФИО сотрудника - " + fullName);
        //Задание 2
        String fullName2 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета -" + fullName2);
        //Задание 3
        StringBuilder sb = new StringBuilder(fullName);
        fullName = fullName.replace("Ivanov Ivan Ivanovich", "Иванов Семён Семёнович");
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника - " + fullName);
    }
}