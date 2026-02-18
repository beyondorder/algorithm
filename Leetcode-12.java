class Solution {
    public String intToRoman(int num) {
        
        StringBuilder sb = new StringBuilder();
        
        while(num != 0){
            int n = num;
            int cnt = -1;
            
            while(n > 0){
                n /= 10;
                cnt++;
            }

            n = num / (int) Math.pow(10, cnt);
            n = n * (int) Math.pow(10, cnt);
            System.out.println(n);
            System.out.println(cnt);


            if(cnt == 3){
                sb.append("M".repeat(n / 1000));
            }

            if(cnt == 2){
                if(n == 900){
                    sb.append("CM");
                }else if(n == 400){
                    sb.append("CD");
                }else if(n < 500){
                    sb.append("C".repeat(n / 100));
                }else{
                    sb.append("D");
                    sb.append("C".repeat((n-500) / 100));
                }
            }

            if(cnt == 1){
                if(n == 90){
                    sb.append("XC");
                }else if(n == 40){
                    sb.append("XL");
                }else if(n < 50){
                    sb.append("X".repeat(n / 10));
                }else{
                    sb.append("L");
                    sb.append("X".repeat((n-50) / 10));
                }
            }
            
            if(cnt == 0){
                if(n == 9){
                    sb.append("IX");
                }else if(n == 4){
                    sb.append("IV");
                }else if(n < 5){
                    sb.append("I".repeat(n));
                }else{
                    sb.append("V");
                    sb.append("I".repeat((n-5)));
                }
            }
            System.out.println(num);
            System.out.println(n);
            num = num - n;
        }

        return sb.toString();
    }
}
