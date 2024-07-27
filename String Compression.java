public class nweo {
    static  int compress(String[] chars) {
        StringBuilder s = new StringBuilder();
        int sum=1;
        for(int i=0;i<chars.length-1;i++){
            if(chars[i] == null ? chars[i+1] == null : chars[i].equals(chars[i+1])){
                sum++;
            }
            else if(chars[i] == null ? chars[i+1] != null : !chars[i].equals(chars[i+1])){
                s.append(chars[i]);
                if(sum>1){
                    s.append(sum);
                }
                sum=1;
            }
        }
        s.append(chars[chars.length-1]);
        if(sum>1){
            s.append(sum);
        }
        System.out.println(s);
        return s.length();
    }

    public static void main(String[] args) {
        String[] cha={"a","a","b","b","c","c","c"};
        System.out.println(compress(cha));
    }
    
}
