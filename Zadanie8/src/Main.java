public class Main {
    public static void main(String[] args) {
        String[][] stringArray = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };

        String[][] stringArray1 = {
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"},
                {"1", "2", "3", "4", "5"}
        };

        String[][] stringArray2 = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "abc", "4"}
        };

        try {
           int sum = twoDimensionalArray(stringArray);
            System.out.println("Сумма масива: " + sum);
        } catch (MyArraySizeException e) {
            System.out.println("Исключение: " + e.getMessage());
        } catch (MyArrayDataException e){
            System.out.println("Исключение: " + e.getMessage());
        }
    }

    public static int twoDimensionalArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4 && arr[0].length != 4) {
            throw new MyArraySizeException("Размер массива не соответствует.");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Преобразование не удалось," +
                            " элемент: [" + i + "][" + j + "] " + "является символом: " + arr[i][j]);
                }
            }
        }
        return sum;
    }
}
