import java.util.*;
public class Binary_search {
    static void bubble_sort(int a[],int n) {
        int t;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n-1-i;j++) {
                if(a[j]>a[j+1]) {
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    static int binary_search(int a[],int n) {
        int start=0,end=n-1,mid,pos=0;
        System.out.println("Enter any number to perform binary search:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        while(start<=end) {
            mid=(start+end)/2;
            if(a[mid]==x) {
                pos=mid;
                break;
            }
            else if(x<a[mid]) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return pos+1;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.printf("Enter %d number of elements:",n);
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        bubble_sort(a,n);
        int pos=binary_search(a,n);
        System.out.println("The value is found at position:"+pos);
    }
}