numeral -- Generic Numbers library
==================================

`numeral` is a simple Java library to offer arithmetic operations that can be used with generic numbers.

I wanted to do something like this:

    // does not compile
    public <N extends Number> List<N> getBuckets(N start, N end, N step) {
        
        List<N> buckets = new ArrayList<N>();
        // Error: Operator '<=' can not be applied to 'N', 'N'
        while(start <= end) {
            buckets.add(start);
            // Error: Operator '+' can not be applied to 'N', 'N'
            start += step;
        }
        
        return buckets;
    }

I needed this method to be able to generate List<Double> as well as List<Long>. However, the arithmetic operation `+`
in `i + j` happen on the unboxed types of `i` and `j`, and the `Number` class doesn't have instance methods to 
perform those operations.

With `Numeral`, I can write the following:

    public <N extends Numeral> List<N> getBuckets(N start, N end, N step) {
        
        List<N> buckets = new ArrayList<N>();
        while(start.smallerOrEqualThan(end)) {
            buckets.add(start);
            start = start.add(step);
        }
        
        return buckets;
    }
    
And then use this with
    
    NumeralDouble start = new NumeralDouble(2.72);
    NumeralDouble end = new NumeralDouble(3.14);
    NumeralDouble step = new NumeralDouble(0.1);
    
    List<NumeralDouble> buckets = getBuckets(start, end, step);


`numeral` suffers from the following problems. Hence, the library is not meant for performance intensive applications.

  * Performance
  * Garbage collector overhead
  * no autoboxing / unboxing

