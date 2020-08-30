package HashTable;

public class HashTable {
    String[] hashArray;
    int arraySize;
    int size = 0;

    public HashTable(int noOfSlots) {
        if (isPrime(noOfSlots)) {
            hashArray = new String[noOfSlots];
            this.arraySize = noOfSlots;
        } else {
           int primeCount = getNextPrime(noOfSlots);
            hashArray = new String[primeCount];
            this.arraySize = primeCount;
        }
    }
    private boolean isPrime(int number){
        for(int i = 2 ; i*i <= number ; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    private int getNextPrime(int number){
        for(int i = number ; true ; i++){
            if(isPrime(i)){
                return  i ;
            }
        }

    }
    private int hashFunc1(String word){
        int hashVal= word.hashCode();
        hashVal = hashVal % arraySize;
        if(hashVal<0){
            hashVal = hashVal + arraySize;
        }
        return hashVal;
    }
    private int hashFunc2(String word){
        int hashVal= word.hashCode();
        hashVal = hashVal % arraySize;
        if(hashVal<0){
            hashVal = hashVal + arraySize;
        }
        return 3-hashVal%3;//returns stepSize
    }
    public void insert(String word){
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);
        if(hashArray[hashVal] != null){
            hashVal = (hashVal+stepSize)%arraySize;
        }
        hashArray[hashVal] = word;
        size++;
    }
    public String find(String word){
        int hashVal = hashFunc1(word);
        int stepSize = hashFunc2(word);
        if(hashArray[hashVal] != null){
            if (hashArray[hashVal].equals(word)){
                return hashArray[hashVal];
            }
            hashVal = (hashVal+stepSize)%arraySize;
        }
        return hashArray[hashVal];
    }
    public void displayTable(){
        for(int i = 0 ; i < arraySize ; i++){
            if(hashArray[i]!=null){
                System.out.println(hashArray[i]);
            }
        }
    }
}
