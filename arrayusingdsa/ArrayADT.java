package arrayusingdsa;

//Array ADT class
class ArrayADT {
 int arr[];      // actual array
 int size;       // maximum capacity
 int length;     // current number of elements

 // Constructor
 ArrayADT(int capacity) {
     size = capacity;
     arr = new int[size];
     length = 0;
 }

 // Insert element at the end
 void insert(int value) {
     if (length < size) {
         arr[length] = value;
         length++;
     } else {
         System.out.println("Array is full!");
     }
 }

 // Insert element at specific index
 void insertAt(int index, int value) {
     if (index >= 0 && index <= length && length < size) {
         for (int i = length; i > index; i--) {
             arr[i] = arr[i - 1];  // shift elements right
         }
         arr[index] = value;
         length++;
     } else {
         System.out.println("Invalid index or array full");
     }
 }

 // Delete element at index
 void delete(int index) {
     if (index >= 0 && index < length) {
         for (int i = index; i < length - 1; i++) {
             arr[i] = arr[i + 1];  // shift elements left
         }
         length--;
     } else {
         System.out.println("Invalid index");
     }
 }

 // Search element (returns index or -1 if not found)
 int search(int value) {
     for (int i = 0; i < length; i++) {
         if (arr[i] == value)
             return i;
     }
     return -1;
 }

 // Display array elements
 void display() {
     for (int i = 0; i < length; i++) {
         System.out.print(arr[i] + " ");
     }
     System.out.println();
 }
 public static void main(String[] args) {
     ArrayADT array = new ArrayADT(5); // create array of size 5

     array.insert(10);
     array.insert(20);
     array.insert(30);
     array.display();  // Output: 10 20 30

     array.insertAt(1, 15);
     array.display();  // Output: 10 15 20 30

     array.delete(2);
     array.display();  // Output: 10 15 30

     int idx = array.search(15);
     System.out.println("Index of 15: " + idx); // Output: 1
 }
}

