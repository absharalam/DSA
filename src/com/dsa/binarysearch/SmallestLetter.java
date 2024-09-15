package com.dsa.binarysearch;
// Find the smallest letter which should greater than target letter.
// Note that the letters wrap around (if target is 'z' then smallest letter should be 'a' if 'a' is available in that array)
public class SmallestLetter {
    /*
    *
    * The compareTo() method is used to compare two String objects lexicographically. Here's how it works:

        Returns 0 if the two strings are equal.
        Returns a positive number if the first string is greater (comes after in lexicographical order).
        Returns a negative number if the first string is smaller (comes before in lexicographical order).
    * */
    public String findSmallestLetterGreaterThanTarget(String[] arr, String target){
        var start = 0;
        var end = arr.length - 1;
        while (start <= end){
            var mid = start + (end - start) / 2;
//            System.out.println(mid);
            int result = target.compareTo(arr[mid]);
            if(result == 0) return arr[mid];

            if(result > 0){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return arr[0];
    }

    public static void main(String[] args) {
        String[] arr = {"a", "b", "n", "o", "s", "y"};
        SmallestLetter smallestLetter = new SmallestLetter();
        var letter = smallestLetter.findSmallestLetterGreaterThanTarget(arr, "z");
        System.out.println("Smallest letter is:" + letter);
    }
}

/* Algorithm & Pseudocode
* Find start and end index of array. Start = 0 and end = length of Array - 1
* while start <= end
    * find middle index, mid = start + (end - start) / 2
    * if target element matched with middle element return mid
    * if target element is less than middle element, then update end = mid - 1.
    * if target element is greater than middle element, then update start = mid + 1.
* If target not found return first index that will be just greater character than target after wrap around.
* */