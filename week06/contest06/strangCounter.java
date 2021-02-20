public class strangCounter {
    static long strangeCounter(long t) {
        long initvalue = 3;
        while(t>initvalue){
            t = t-initvalue;
            initvalue = initvalue *2;
        }
        return (initvalue-t+1);

    }
}
