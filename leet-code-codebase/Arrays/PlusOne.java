class PlusOne {
    public int[] plusOne(int[] digit) {
        for(int i = digit.length-1; i >= 0; i-- ){
            digit[i]++;
            digit[i] = digit[i] % 10;
            if(digit[i] != 0){
                return digit;
            }
        }
        int[] result = new int[digit.length+1];
        result[0] = 1;
        return result;
    }
}
