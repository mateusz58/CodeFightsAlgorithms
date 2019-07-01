public static int[] sortByHeight(int[] a) {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=-1)
            {
               int j=i;
                while(true)
                {
                    if(a[j]==-1){Arrays.sort(a,i,j); break;}
                    if(j==a.length-1){Arrays.sort(a,i,j); Arrays.stream(a).forEach(System.out::println);return a;}
                    j++;
                }
                i=j;
            }
        }
        Arrays.stream(a).forEach(System.out::println);
return a;
    }
}
