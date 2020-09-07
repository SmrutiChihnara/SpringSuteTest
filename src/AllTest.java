import java.util.*;

public class AllTest {



    public static void numberOfOcc()
    {
        int arr[]={1,2,3,2,1,2,4,2,1,3,4};
        Set<Integer>  set= new HashSet(Arrays.asList(arr));
     //   System.out.println(integers);
        set.add(1);
        set.add(2);
        System.out.println(set);


        /*for(Integer in:integers)
        {
            System.out.println(in);
         //   System.out.println(Collections.frequency(Arrays.asList(arr),in));
        }*/


    }


    public static int[] reverseArray(int[] arr)
    {
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        return arr;
    }

    public static void numberOfOccreance()
    {
        char arr[]= {'a','v','a','a','v','b'};
        HashMap<Character ,Integer> hashMap= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(hashMap.containsKey(arr[i]))
            {
                hashMap.put(arr[i],hashMap.get(arr[i])+1);
            }
            else hashMap.put(arr[i],1);
        }
        System.out.println(hashMap);
    }


    public static void sameString()
    {
        String arr1[]={"java","net"};
        String arr2[]={"net"};
        HashSet<String> set= new HashSet(Arrays.asList(arr1));
        HashSet<String> set2= new HashSet(Arrays.asList(arr2));
        System.out.println(set.retainAll(set2));
        System.out.println(set);

    }
    public static void DuplicateNumber() {
        {
            String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC", "Java"};

            for (int i = 0; i < strArray.length - 1; i++) {
                for (int j = i + 1; j < strArray.length; j++) {
                    if ((strArray[i].equals(strArray[j])) && (i != j)) {
                        System.out.println("Duplicate Element is : " + strArray[j]);
                    }
                }
            }

        }
    }

    public static void DuplicateNumberUsingHasSet() {
        String str[] = {"java", "net", "java", "spring", "java", "servlet", "net", "java", "net"};
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < str.length - 1; i++)
            if (!set.add(str[i])) {
                System.out.println("Duplicate " + str[i]);

            }

    }

    public static void findSecondLargestNumber() {
        int arr[] = {5, 9, 6, 1, 25, 23};
        int firstLargest;
        int secondLargest;
        if (arr[0] > arr[1]) {
            firstLargest = arr[0];
            secondLargest = arr[1];
        } else {
            firstLargest = arr[1];
            secondLargest = arr[0];
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] > firstLargest) {

                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] < firstLargest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(secondLargest);

    }
      public static void sort()
      {
          int arr[]={2,2,10,2,20,6};
          for(int i=0;i<arr.length;i++)
          {
              for(int j=i+1;j<arr.length;j++)
              {
                  if(arr[i]>arr[j])
                  {
                      int temp=arr[j];
                      arr[j]=arr[i];
                      arr[i]=temp;
                  }
              }
          }
          System.out.println(Arrays.toString(arr));

      }

    public  static void equalityOfTwoString() {

        int first[] = {1, 2, 3, 4};
        int second[] = {1, 2, 3, 6};

        System.out.println(Arrays.equals(first,second));
      /*  boolean equality=true;
        if(first.length==second.length)
        {
            for(int i=0;i<first.length;i++)
            {
                if(first[i]!=second[i])
                {
                    equality=false;
                    break;

                }
            }
        }
        if(equality)
        {
            System.out.println("equal");
        }
        else System.out.println("not equal");
    }
*/
    }
    public static int missingNumber(int[] arr) {
        int j = 1;
        for (int i = 0; i < arr.length; i++, j++) {
            if (arr[i] != j) {
                break;
            }
        }
        return j;
    }


    public static int[] duplicatenumberInArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    for (int k = j; j < arr.length - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int arr[]={1};
       // sameString();
       // System.out.println(Arrays.toString(reverseArray (new int[] {1,2,3})));
        numberOfOcc();

        //DuplicateNumber();
        //  DuplicateNumberUsingHasSet();
       // findSecondLargestNumber();
    //    equalityOfTwoString();
       // sort();
     //   numberOfOccreance();


    }

}