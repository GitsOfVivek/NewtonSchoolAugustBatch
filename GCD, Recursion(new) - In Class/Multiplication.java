static int  Multiply_by_recursion(int M, int N) 
    { 
  //Enter your code here
if(N == 0 || M == 0) {
  return 0;
}
if(N == 1) {
  return M;
}
return M + Multiply_by_recursion(M, N-1);
    }
