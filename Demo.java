class Demo{
    public static void main(String[] args) {
     int arr [][] = new int [7][10];

     int random = (int)(Math.random()*100);
     for(int i=0 ; i<3 ; i++)
     {
        for(int j =0 ; j<4 ; j++){
            arr[i][j]= random;
        }
     }
     
    for(int i=0 ; i<3 ; i++)
    {
        for(int j =0 ; j<4 ; j++)
        {
          System.out.print(arr[i][j]+ " ");
        } System.out.println();
    } 

    }
} 