class NQueens {
    
    public static String res = "";
    static int b[];
    static boolean solExists = false;
    public static boolean isSafe(int row,int col){
        if(row==0){
            return true;
        }
        for(int i=0;i<row;i++){
            if(b[i]==col){
                return false;
            }else if(Math.abs(b[i]-col)==Math.abs(row-i)){
                return false;
            }
        }
        return true;
    }
    
    public static void NQ(int a[][],int N,int row){
        if(row>=N){
            //return true;
            solExists = true;
            System.out.print("["+res+"] ");
            res = "";
        }
        for(int i=0;i<N;i++){
            //b[row] = i;
            
            if(isSafe(row,i)){
                b[row] = i;
                String temp = res;
                res+=((i+1)+" ");
                //if(
                NQ(a,N,row+1);//==true)
                //return true;
                res = temp;
            }
        }
        //return false;
    }
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T,N;
		HashSet<String> results;
		T = sc.nextInt();
		for(int i=0;i<T;i++){
		    results = new LinkedHashSet<String>();
		    N = sc.nextInt();
		    int a[][] = new int[N][N];
		    b = new int[N];
		    res = "";
		    NQ(a,N,0);
		
		  if(!solExists){
		      System.out.print("-1");
		  }
		  solExists = false;
		    System.out.println();
		}
	}
}
