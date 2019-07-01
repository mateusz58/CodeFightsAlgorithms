  public static boolean isSorted(int[] a)
    {
        int i=0;
        boolean sorted=true;
        for(i = 0; i < a.length-1; i++)
        {
            if (a[i] > a[i + 1]) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }
    public static void print_array(List<Integer>array)
    {
        for(int z:array)
            System.out.print(z);

        System.out.println(" ");

    }
    public static boolean isSorted(List<Integer>a)
    {
        int i=0;
        boolean sorted=true;
        for(i = 0; i < a.size()-1; i++)
        {
            if (a.get(i) > a.get(i+1)) {
                sorted = false;
                break;
            }
        }
        return sorted;
    }
    public static boolean almostIncreasingSequence(int[] sequence) {
            boolean result=false;
            int i=0;
            if(isSorted(sequence)==true)return true;
            else {
                while (i != sequence.length) {
                    List<Integer> list = Arrays.stream(sequence)
                            .boxed()
                            .collect(Collectors.toList());
                    list.remove(i);
                    i++;
                    print_array(list);
                    if (isSorted(list) == true) {
                        result = true;
                        break;
                    }
                }
                return result;
            }
    }
    }