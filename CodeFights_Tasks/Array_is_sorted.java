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