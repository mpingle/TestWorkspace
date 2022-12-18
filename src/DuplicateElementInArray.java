import java.util.HashSet;

public class DuplicateElementInArray {

    public static void main (String[] args) {
//Approach 1: logic
       /* String arr[] = {"Java", "C++", "C", "java", "Python", "zava"};
        boolean flag=false;

        int n=arr.length;


        for (int i=0;i<n;i++)
        {
            for (int j=i+1;j<n;j++)
            {
                if (arr[i]==arr[j])
                {
                    System.out.println("Duplicate element found :" + arr[i]);
                    flag=true;
                }

            }
        }

        if (flag==false)
        {
            System.out.println("NO Duplicate element found " );
        }

        */

      // Approach 2: HashSet

        HashSet<String> langs= new HashSet<>();

        System.out.println(langs.add("Java"));
        System.out.println(langs.add("java"));
        System.out.println(langs.add("zava"));
        System.out.println(langs.add("Java"));
    }

}
