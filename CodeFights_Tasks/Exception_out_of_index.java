//1-Approach 
try {
            System.out.println(tablica[index]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Podałeś indeks wykraczający poza rozmiar tablicy!");
        }
//2-Approach
private void  rangeCheck(int index) {
     if (index >= size)
          throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
}
