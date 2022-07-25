import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chuyển thành chuỗi");
        int number = scanner.nextInt();
        String alert = "";
        int hundreds = number / 100;
        int tens = number % 100 / 10;
        int ones = number % 10;
        if (number == 0) {
            alert = "Zezo";

        }
        if (hundreds > 9 || hundreds < 0) {
            alert = "Out of ability";

        } else {
            switch (hundreds) {
                case 1:
                    alert += "One";
                    break;
                case 2:
                    alert += "Two";
                    break;
                case 3:
                    alert += "Three";
                    break;
                case 4:
                    alert += "Four";
                    break;
                case 5:
                    alert += "Five";
                    break;
                case 6:
                    alert += "Six";
                    break;
                case 7:
                    alert += "Seven";
                    break;
                case 8:
                    alert += "Eight";
                    break;
                case 9:
                    alert += "Nine";
                    break;

            }
            if (hundreds != 0) {
                alert += "hundred and ";
            }
            switch (tens) {
                case 1:
                    switch (ones) {
                        case 0:
                            alert += "Ten";
                            break;
                        case 1:
                            alert += "Eleven";
                            break;
                        case 2:
                            alert += "Twelve";
                            break;
                        case 3:
                            alert += "Thirteen";
                            break;
                        case 4:
                            alert += "Fourteen";
                            break;
                        case 5:
                            alert += "Fifteen";
                            break;
                        case 6:
                            alert += "Sixteen";
                            break;
                        case 7:
                            alert += "Seventeen";
                            break;
                        case 8:
                            alert += "Eighteen";
                            break;
                        case 9:
                            alert += "Nineteen";
                            break;
                    }
                    break;
                case 2:
                    alert += "Twenty";
                    break;
                case 3:
                    alert += "Thirty";
                    break;
                case 4:
                    alert += "Fourty";
                    break;
                case 5:
                    alert += "Fifty";
                    break;
                case 6:
                    alert += "Sixty";
                    break;
                case 7:
                    alert += "Seventy";
                    break;
                case 8:
                    alert += "Eighty";
                    break;
                case 9:
                    alert += "Ninety";
                    break;

            }
            if (tens != 1) {
                switch (ones) {
                    case 1:
                        alert += "One";
                        break;
                    case 2:
                        alert += "Two";
                        break;
                    case 3:
                        alert += "Three";
                        break;
                    case 4:
                        alert += "Four";
                        break;
                    case 5:
                        alert += "Five";
                        break;
                    case 6:
                        alert += "Six";
                        break;
                    case 7:
                        alert += "Seven";
                        break;
                    case 8:
                        alert += "Eight";
                        break;
                    case 9:
                        alert += "Nine";
                        break;
                }


            }


            System.out.println(alert);

        }

    }
}
