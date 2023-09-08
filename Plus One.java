class Solution {
    static ArrayList<Integer> increment(ArrayList<Integer> arr, int N) {
        for (int i = N - 1; i >= 0; i--) {
            if (arr.get(i) != 9) {
                arr.set(i, arr.get(i) + 1);
                break;
            } else {
                arr.set(i, 0);
            }
        }
        if (arr.get(0) == 0) {
            arr.add(0, 1);
        }
        return arr;
    }
}
