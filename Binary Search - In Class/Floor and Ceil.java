static void floorAndCeil(int a[], int N, int x){	
//Enter your code here
    int s = 0;
    int e = N-1;
    boolean f = false;
    while(s<=e) {
        int m = s + (e-s)/2;
        if(a[m] == x) {
            System.out.println(a[m] + " " + a[m]);
            f = true;
            break;
        }else if(a[m] < x) {
            s = m+1;
        }else {
            e = m-1;
        }
    }
    if(!f) {
        System.out.println(a[e] + " " + a[s]);
    }
    if(e==-1) {
        System.out.println("-1" + " " + a[0]);
    }
    if(s >= N) {
        System.out.print(a[e] + " " + "-1");
    }
    
}
