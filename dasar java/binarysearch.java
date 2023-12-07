
class BinarySearch { 
int binarySearch(int arr[], int l, int r, int x)

{ if (r>=l)                                                               //Nama : Muhammad Aim Maturrohman
                                                                          //NIM  : 24210002
{ int mid = l + (r - l)/2; 

if (arr[mid] == x) return mid; 
if (arr[mid] > x) return binarySearch(arr, l, mid-1, x); 

return binarySearch(arr, mid+1, r, x);} 

return -1;} 

public static void main(String args[]) { 

BinarySearch ob = new BinarySearch(); 

int arr[] = {2,3,4,10,40,15,18,7,46,8}; 
int n = arr.length; 
int x = 9; 
int result = ob.binarySearch(arr,0,n-1,x); 

if (result == -1) System.out.println("data "+ x +" Element"+" not present"); 
else System.out.println("data "+ x +" Elemen"+" ditemukan pada index " + result); }

 }