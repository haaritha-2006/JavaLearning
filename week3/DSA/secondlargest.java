package day18;

public class secondlargest {
    int[] arr = {4, 7, 2, 9, 5};
int max = arr[0];
int secondMax = Integer.MIN_VALUE;

// find max
for(int i = 1; i < arr.length; i++){
    if(arr[i] > max){
        max = arr[i];
    }
}

// find second max
for(int i = 0; i < arr.length; i++){
    if(arr[i] > secondMax && arr[i] < max){
        secondMax = arr[i];
    }
}

System.out.println("Second largest = " + secondMax);

}
