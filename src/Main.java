import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            System.out.println("задача 1");
            int clientOS = 1;
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        {
            System.out.println("");
            System.out.println("задача 2");
            int clientOS = 1;
            int clientDeviceYear = 2015;
            switch (clientOS) {
                case 0:
                    System.out.println("Установите версию для IOS");
                    break;
                case 1:
                    System.out.println("Установите версию для Android");
                    break;
                default:
                    System.out.println("Операционной системы не существует");
            } if (clientDeviceYear < 2015) {
            System.out.println("(облегченную версию)");
        } else {
            System.out.println("");
        }
        }
        {
            System.out.println("");
            System.out.println("задача 3");
            int year = 2021;
            if (year % 4 == 0 && year >= 1584 && year % 400 == 0 && year % 100 != 0) {
                System.out.println("Год " + year + " является високосный");
            } else {
                System.out.println("Год " + year + " не является високосный");
            }
        }
        {
            System.out.println("");
            System.out.println("задача 4");
            int deliveryDistance = 95;
            if (deliveryDistance >= 20 && deliveryDistance < 60) {
                System.out.println("Потребуется 2 дня доставки");
            } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
                System.out.println("Потребуется 3 дня доставки");
            } else if (deliveryDistance >= 100) {
                System.out.println("Доставка не выполняется");
            } else {
                System.out.println("Потребуется 1 день доставки");
            }
        }
        {
            System.out.println("");
            System.out.println("задача 5");
            int monthNumber = 12;
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Месяц с номером " + monthNumber + " относится к зиме");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц с номером " + monthNumber + " относится к весне");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц с номером " + monthNumber + " относится к лету");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц с номером " + monthNumber + " относится к осени");
                    break;
                default:
                    System.out.println("Месяц с номером " + monthNumber + " не существует");
            }
        }
    }
}
