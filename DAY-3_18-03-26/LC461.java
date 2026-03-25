class LC461 {
    public int hammingDistance(int x, int y) {
        int a = x^y;
        return Integer.bitCount(a);
        
    }
}
