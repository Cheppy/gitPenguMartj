package pgdp.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;

//import static iter.Util.noSuchElement;


public class Range implements Iterable<Integer>, Iterator<Integer> {
    private  Integer start;
    private int end;

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int getStride() {
        return stride;
    }

    private int stride;

    public Range(Integer start, int end) {
        this.start = start;
        this.end = end;
        this.stride = 1;
    }

    public Range(Integer start, int end, int stride) {
        if (stride <= 0) {
            //  System.out.println("DEBUG1");
            // Util.badArgument("error, step is <=0");
            throw new NoSuchElementException("error step is <=0");
        }

        if (start>end){stride*=-1;}

        this.start = start;
        this.end = end;
        this.stride = stride;
    }
    public Iterator<Integer> iterator() {
        start = start;
        return this;
    }

    @Override
    public boolean hasNext() {
        if (stride <= 0) {
            return this.start>end;

        }
        else
            return this.start < end;
    }

    @Override
    public Integer next() {
        if (!this.hasNext()) {
            //  System.out.println("DEBUG1");

            throw new NoSuchElementException( "Error: No Such Element");
        }
        Integer current = start;
        start = current + stride;
        return current;
    }
}