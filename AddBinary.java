package AlgorithmsLeetcode;

public class AddBinary {

    public static void main(String[] args) {
        String str1 = "11";
        String str2 = "1";
        System.out.println(addBinary(str1, str2));
    }

    public static String addBinary(String bin1, String bin2){
        StringBuilder str = new StringBuilder();
        int pt1 = bin1.length()-1;
        int pt2 = bin2.length()-1;
        int carry = 0;
        while (pt1 >= 0 || pt2 >= 0 || carry > 0) {
            int sum = carry; // Start with carry
            //We take ASCII value of the char '0' and '1'
            if (pt1 >= 0) {
                sum += bin1.charAt(pt1) - '0'; // Convert char to int
                pt1--;
            }

            if (pt2 >= 0) {
                sum += bin2.charAt(pt2) - '0'; // Convert char to int
                pt2--;
            }

            // Append the binary result (sum % 2)
            str.insert(0, (char) ((sum % 2) + '0')); // Convert back to char

            // Update carry
            carry = sum / 2;
        }
        return str.toString();
    }
}
