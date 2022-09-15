static char Race(int A,int B,int C){
//Enter your code here
    int diffN = 0;
    int diffS = 0;
    if(C>A) {
        diffN = C-A;
    }else {
        diffN = A-C;
    }
    if(C>B) {
        diffS = C-B;
    }else {
        diffS = B-C;
    }
    if(diffN > diffS) {
        return 'S';
    }else if(diffS > diffN) {
        return 'N';
    }else {
        return 'D';
    }
}
