class Solution {
    public String addBinary(String a, String b) {
        char[]aArr = a.toCharArray();
        char[]bArr = b.toCharArray();

        int i = aArr.length - 1, j = bArr.length - 1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while(i >= 0 || j >= 0 || carry > 0){
            int aNum = i >= 0 ? aArr[i] - '0' : 0;
            int bNum = j >= 0 ? bArr[j] - '0' : 0;

            int sum = aNum + bNum + carry;
            int digit = sum % 2;
            carry = sum / 2;
            i--;
            j--;

            sb.append((char)(digit + '0'));
        }
        return sb.reverse().toString();
    }
}
