public class UniqueLetters {
    public static void main(String[] args){
        String str = "swiss";
        print(str);
    }

    static void print(String str){
        char[] ch = str.toCharArray();
        int[] freqArr = new int[26];

        for(int i=0;i<ch.length;i++){
            freqArr[ch[i] - 'a']++;
        }

        int count = 0;
        for(int i=0;i<freqArr.length;i++){
            if(freqArr[i] == 1){
                System.out.println((char)('a' + i) );
            }
        }
    }
}