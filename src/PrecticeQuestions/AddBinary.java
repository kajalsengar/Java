package PrecticeQuestions;

public class AddBinary {
    public static void main(String[] args) {
        String a = "101";
        String b = "011";
        int carry = 0;
        int x = a.length() - 1;
        int y = b.length() - 1;
        StringBuilder res = new StringBuilder();

        int sum = 0;
        while (x >= 0 || y >= 0 || carry > 0) {
            sum = carry;
            if (x >= 0) {
                sum = sum + a.charAt(x--)-'0';
            }
            if (y >= 0) {
                sum = sum + b.charAt(y--)-'0';
            }
            res.append(sum % 2);
            carry = sum / 2;
        }
        System.out.println(res.reverse());
    }
}
