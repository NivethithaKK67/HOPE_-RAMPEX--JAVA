class LC2525 {
    public String categorizeBox(int length, int width, int height, int mass) {
        int s=0;
        int r=0;
        long q = (long)length*width*height; 
        if(length>=10000||width>=10000||height>=10000||mass>=10000||q>=1000000000){
            s = 1;
        }
        if(mass>=100){
            r = 1;
        }
        if(s==1&&r==1){
            return "Both";
        }
        else if(s==0&&r==0){
            return "Neither";
        }
        else if (s==1){
            return "Bulky";
        }
        else
            return "Heavy";
    }
}
