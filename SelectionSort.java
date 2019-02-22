public class SelectionSort implements SortingAlgorithm {
    //function to swap elements for sort
    public void swap(int [] a, int i, int j){
        //switch elements by holding one in a temp
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    //selection sort function
    public void sort(int [] a){
        //go through list
        for(int i=0;i<a.length-1;i++){
            int start= i;
            //from point in list look at all other elements 
            //to find the next minimum 
            for(int j=start; j<a.length;j++){
                if(a[j]<a[start]){
                    start=j;
                }
            }
            //once minimum index is found swap the two elements
            swap(a,i,start);
        }
        return;
    }
}