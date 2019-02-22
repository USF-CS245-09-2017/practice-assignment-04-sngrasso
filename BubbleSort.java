public class BubbleSort implements SortingAlgorithm{
    //function to swap elements for sort
    public void swap(int [] a, int i, int j){
        //switch elements by holding one in a temp
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //bubble sort function
    public void sort(int [] a){

        for(int i=0; i<a.length-1; i++){
            //pass through the entire list to check
            for(int j=0; j<a.length-i-1; j++){
                //checks only the adjacent element to swap
                //if the next element is less than the current
                //they swap
                if(a[j] > a[j+1]){
                    swap(a,j,j+1);
                }
            }
        }
    }
}
