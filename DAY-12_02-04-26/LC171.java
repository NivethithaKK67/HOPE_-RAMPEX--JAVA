class LC171 {
public static int titleToNumber(String columnTitle) {
        int r=0;
        for(char ch:columnTitle.toCharArray()){
            r=r*26+(ch-'A'+1);
        }
        return r;
    }

}
