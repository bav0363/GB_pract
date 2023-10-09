package Exception_1.homework3;


import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {

        int resultFio = inputFio();
        try {
            if (resultFio == -1) throw new Exception("Недопустимые символы при вводе ФИО");
            else if (resultFio == -2) throw new Exception("Вы ввели лишние данные при вводе ФИО");
            else if (resultFio == -3) throw new Exception("Введены неполные данные");
            else if(resultFio == -4) throw new Exception("Некорректный ввод даты рождения");
            else if(resultFio == -5) throw new Exception("Некорректный ввод телефона");
            else if(resultFio == -6) throw new Exception("Много цифр в номере телефона");
            else if(resultFio == -7) throw new Exception("Мало цифр в номере телефона");
            else if(resultFio == -8) throw new Exception("Некорректный ввод пола");
            else if(resultFio == -9) throw new Exception("Мало букв в ФИО");
            else{
                try (FileWriter writer = new FileWriter(fileName, true)) {
                    String result = String.valueOf(sb);
                    writer.write(result);
                    writer.append("\n");
                    if(fileName.length() == 0) throw new IOException();
                    else System.out.println("Данные успешно записаны в файл");
                } catch (IOException e) {
                    e.getStackTrace();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);
    static String fileName = "";

    static int inputFio(){
        int amountStrings = 3;
        int amountSymbols = 2;
        System.out.println("Введите ФИО (через пробел): ");
        String dataInput = sc.nextLine();
        String[] strings = dataInput.split(" +");

        //Проверки
        if (strings.length > amountStrings) return -2;  // слишком много данных (необходимо 3 значения)
        else if(strings.length < amountStrings) return -3;  // слишком мало данных(необходимо 3 значения)
        for (String string : strings) {
            if(string.length() < amountSymbols) return -9; // фамилия/имя/отчество не может состоять из 1 символа
        }
        for (int i = 0; i < strings.length; i++) {
            String[] symbols = strings[i].split("");
            for (String symbol : symbols) {
                if (symbol.matches("[а-яА-Я]")) continue;
                else return -1;  // неверные данные (необходим ввод только на кириллице)
            }
        }

        fileName = strings[0];  // запись фамилии

        for (String string : strings) {
            sb.append("<" + string + ">");
        }
        System.out.println(sb);
        return inputDateBirth();
    }

    static int inputDateBirth(){
        int amountData = 3;
        System.out.println("Введите дату рождения, в формате dd.mm.yyyy: ");
        String dataInput = sc.nextLine();
        String[] strings = dataInput.split("\\.");

        // Проверки
        if(strings.length != amountData) return -4;
        else if (Integer.parseInt(strings[0]) < 1 || Integer.parseInt(strings[0]) > 31) return -4;
        else if (Integer.parseInt(strings[1]) < 1 || Integer.parseInt(strings[1]) > 12) return -4;
        else if (Integer.parseInt(strings[2]) < 1900 || Integer.parseInt(strings[2]) > 2023) return -4;

        for (int i = 0; i < strings.length; i++) {
            String[] symbols = strings[i].split("");
            for (String symbol : symbols) {
                if (symbol.matches("[0-9]")) continue;
                else return -4;
            }
        }
        sb.append("<");
        sb.append(dataInput);
        sb.append(">");

        System.out.println(sb);
        return inputPhone();
    }

    static int inputPhone(){
        System.out.println("Введите номер телефона (от 6 до 9 цифр): ");
        String dataInput = sc.nextLine();
        String[] strings = dataInput.split("");
        Long dataInput2 = Long.parseLong(dataInput);

        // Проверки
        if (dataInput2 < 1_000_000) return -7;
        else if (dataInput2 > 999_999_999) return -6;

        for (int i = 0; i < strings.length; i++) {
            String[] symbols = strings[i].split("");
            for (String symbol : symbols) {
                if (symbol.matches("[0-9]")) continue;
                else return -5;
            }
        }
        sb.append("<");
        sb.append(dataInput);
        sb.append(">");
        System.out.println(sb);

        return inputGender();
    }

    static int inputGender(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш пол 'm' - мужской или 'f' - женский: ");
        String gen = sc.nextLine();
        sc.close();
        if(gen.matches("[m, f]")) {
            sb.append("<");
            sb.append(gen);
            sb.append(">");
            return 0;
        }
        else return -8;
    }
}