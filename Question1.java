class Question1{
  void insertionSort(int a1[]){
    int n=a1.length;
	for(int i=0;i<= n-1;i++){
	  int key=a1[i];
	  int j=i-1;
	  while(j>=0 && a1[j]>key){
	  a1[j+1] = a1[j];
	  j--;
	  }
	  a1[j+1]=key;
	}
  }
  void display(int a1[]){
  for(int i=0;i<a1.length;i++){
    System.out.println(a1[i]+" ");
  }
  }
  public static void main(String [] args){
    Question1 q1= new Question1();
	int [] a1={1,2,4,5,3};
	q1.insertionSort(a1);
	q1.display(a1);
  }
}