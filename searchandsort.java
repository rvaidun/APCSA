public class searchandsort {
    public static void selectionSort(int arr[]) {
        for(int x = 0; x < arr.length-1; x++) {
            int min =  x;
            for(int y = x+1; y < arr.length; y++) {
                if (arr[y] < arr[min]) {
                    min = y;
                }
            }
            int temp = arr[min];
            arr[min] = arr[x];
            arr[x] = temp;
        }

    }
//    public void merge (int arr[], int l, int m, int r) {
//        int n1 = m - l + 1;
//        int n2 = r - m;
//        int L[] = new int[n1];
//        int R[] = new int[n2];
//        for(int x = 0; x < n1; ++x) {
//            L[x] = arr[l + x];
//        }
//        for(int x = 0; x < n2; ++x) {
//            R[x] = arr[m + 1+ x];
//        }
//    }

    public static void merge(int arr[], int x, int w, int q)
    {
        int n1 = w - x + 1;
        int n2 = q - w;
        int L[] = new int [n1];
        int R[] = new int [n2];

        for (int i=0; i<n1; ++i)
            L[i] = arr[x + i];
        for (int j=0; j<n2; ++j)
            R[j] = arr[w + 1+ j];
        int i = 0, j = 0;
        int k = x;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;

            sort(arr, l, m);
            sort(arr , m+1, r);
            merge(arr, l, m, r);
        }
    }
    public static int linearsearch(int arr[], int x) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {12, 11, 13, 5, 6, 7};
        selectionSort(arr);
        sort(arr, 0, arr.length-1);
        linearsearch(arr,13);
        binarySearch(arr,0,arr.length-1,13);
    }

}
