class Solution {
    public boolean isAnagram(String s, String t) {
        // char[] arr1 = s.toCharArray();
        // char[] arr2 = t.toCharArray();

        // Arrays.sort(arr1);
        // Arrays.sort(arr2);

        // s = new String(arr1);
        // t = new String(arr2);

        // int p=0,q=0;

        if (s.length() < t.length() || s.length() > t.length()) {
            return false;
        }

        // while(p<s.length() && q<t.length()){
        //     if(s.charAt(p) == t.charAt(q)){
        //         p++;
        //         q++;
        //     }
        //     else{
        //         return false;
        //     }
        // }

        // return true;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            } else {
                map1.put(s.charAt(i), 1);
            }
        }

        System.out.println(map1);

        for (int i = 0; i < t.length(); i++) {
            if (map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            } else {
                map2.put(t.charAt(i), 1);
            }
        }

        System.out.println(map2);

        int p = 0, q = 0;

        while (p < s.length()) {
            char ch = s.charAt(p);

            int val = map1.get(s.charAt(p));
            if (map2.containsKey(ch) && val == map2.get(ch)) {
                p++;
            }
            else {
                return false;
            }
        }

        return true;
    }
}
