public class Searchinrotation {
    public static int search(int arr[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }

        //for mid
        int mid = si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }

        if(arr[si]<=arr[mid]){
            if(arr[si]<=target&&target<=arr[mid]){
                return search(arr, target, si, mid-1);
            }
            else{
                return search(arr,target,mid+1,ei);
            }
        }

        else{
            if(arr[mid]<=target&&target <= arr[ei]){
                return search(arr,target,mid+1,ei);
            }
            else{
                return search(arr, target, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int idxValue = search(arr, 0, 0, arr.length-1);
        System.out.println(idxValue);
    }
}