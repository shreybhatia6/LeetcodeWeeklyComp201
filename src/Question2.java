public class Question2 {

        public char findKthBit(int n, int k) {


            StringBuilder sb = new StringBuilder();

            int num = 2;
            sb.append("0");
            while (num <= n){
                StringBuilder temp = new StringBuilder(sb);
                sb.append("1").append(helperFunction(temp));
                num++;
            }
            return sb.charAt(k-1);
        }



        private static String helperFunction(StringBuilder tempResult){
            StringBuilder newTempRes = new StringBuilder();
            for (int i = tempResult.length()-1; i >= 0; i-- ){
                if (tempResult.charAt(i) == '0')
                    newTempRes.append("1");
                else
                    newTempRes.append("0");
            }
            return newTempRes.toString();
        }
    }