package number4;
     public static void bubbleSort(char[] argz) {
         int n = arr.length;
         boolean swapped;

         for (int i = 0; i < n - 1; i++) {
             swapped = false;

             for (int j = 0; j < n - i - 1; j++) {
                 if (arr[j] > arr[j + 1]) {
                     // Swap arr[j] and arr[j + 1]
                     char temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                     swapped = true;
                 }
             }

             // If no two elements were swapped in the inner loop, the array is already sorted
             if (!swapped) {
                 break;
             }
         }
     }

     public static void main(String[] args) {
         char[] arr = {'d', 'b', 'a','c', 'e'};

         System.out.println("Array before sorting: ");
         for (char ch : arr) {
             System.out.print(ch + " ");
         }
       bubbleSort(arr);
         System.out.println("\nArray after sorting: ");
         for (char ch : arr) {
             System.out.print(ch + " ");
         }
     }
    }

            }
