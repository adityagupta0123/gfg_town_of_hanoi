class Hanoi {

    public long toh(int N, int a, int b, int c) {
        long moves = 0L;
        if(N>0){
           moves += toh(N-1,a,c,b );
            System.out.println("move disk "+ N + " from rod " +
                       a +" to rod " + b );
                       moves++;
            moves +=toh(N-1, c,b,a);
        }
        return moves;
    }
    
}
