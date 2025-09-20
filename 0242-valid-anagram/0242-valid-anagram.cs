public class Solution {
    public bool IsAnagram(string s, string t) {
        int s1=s.Length;
        int t1=t.Length;
        if(s1!=t1){
            return false;
        }
        char[] arr=new char[s1];
        for(int i=0;i<s1;i++){
            arr[i]=s[i];
            
        }
        char[] arr1=new char[t1];
        for(int i=0;i<t1;i++){
            arr1[i]=t[i];
            
        }
        Array.Sort(arr);  
        Array.Sort(arr1);
        bool b=true;
        for(int i=0;i<t1;i++){
            if(arr[i]!=arr1[i]){
                b=false;

            }
        }
        return b;
    }

}