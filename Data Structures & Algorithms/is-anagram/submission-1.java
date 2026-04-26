class Solution {
    public boolean isAnagram(String s, String t) {

        char[] arr1 = s.toCharArray();


        char[] arr2 = t.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        s = new String(arr1);
        t = new String(arr2);


        int p=0,q=0;

        if(s.length() < t.length() || s.length() > t.length()){
               return false;
        }

        while(p<s.length() && q<t.length()){
            if(s.charAt(p)== t.charAt(q)){
                p++;
                q++;
            }
            else{
                return false;
            }
        }

        return true;

    }
}
