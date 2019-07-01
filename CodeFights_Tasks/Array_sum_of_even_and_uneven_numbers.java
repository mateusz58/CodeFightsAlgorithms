int[] alternatingSums(int[] a) {

    int []niz = new int[2];
    
    for(int i=0; i<a.length; i++)
        niz[i%2]+=a[i];
    
    return niz;
}