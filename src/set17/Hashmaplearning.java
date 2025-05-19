package set17;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Hashmaplearning {
    public static void main(String[] args) {
        // 1. clear()      Removes all of the mappings from this map.
// 2. compute(K key, BiFunction<? super K,? super V,? extends V)    Attempts to compute a mapping for the specified key and its current mapped value (or null if there is no current mapping).
// 3. computeIfAbsent(K key, Function<? super K,? extends V)    If the specified key is not already associated with a value (or is mapped to null), attempts to compute its value using the given mapping function and enters it into this map unless null.
// 4. computeIfPresent((K key, BiFunction<? super K,? super V,? extends V)   If the value for the specified key is present and non-null, attempts to compute a new mapping given the key and its current mapped value.
// 5. boolean   containsKey(Object key)     Returns true if this map contains a mapping for the specified key.
// 6. boolean   containsValue(Object value) Returns true if this map maps one or more keys to the specified value.
// 7. Set<Map.Entry<K,V>>   entrySet()  Returns a Set view of the mappings contained in this map.
// 8. void  forEach(BiConsumer<? super K,? super V> action) Performs the given action for each entry in this map until all entries have been processed or the action throws an exception.
// 9. get(Object key)   Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
// 10. getOrDefault(Object key, V defaultValue) Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.
// 11. boolean  isEmpty()   Returns true if this map contains no key-value mappings.
// 12. Set<K>   keySet()    Returns a Set view of the keys contained in this map.
// 13. merge(K key, V value, BiFunction<? super V,? super V,? extends V> remappingFunction) If the specified key is not already associated with a value or is associated with null, associates it with the given non-null value.
// 14. put(K key, V value)  Associates the specified value with the specified key in this map.
// 15. putAll(Map<? extends K,? extends V> m)   Copies all of the mappings from the specified map to this map.
// 16. putIfAbsent(K key, V value)  If the specified key is not already associated with a value (or is mapped to null) associates it with the given value and returns null, else returns the current value.
// 17. boolean remove(Object key)   Removes the mapping for the specified key from this map if present.
// 18. boolean  remove(Object key, Object value)    Removes the entry for the specified key only if it is currently mapped to the specified value.
// 19. replace(K key, V value)  Replaces the entry for the specified key only if it is currently mapped to some value.
// 20. boolean  replace(K key, V oldValue, V newValue)  Replaces the entry for the specified key only if currently mapped to the specified value.
// 21. void replaceAll(BiFunction<? super K,? super V,? extends V> function)    Replaces each entry's value with the result of invoking the given function on that entry until all entries have been processed or the function throws an exception.
// 22. int  size()  Returns the number of key-value mappings in this map.
// 23. Collection<V>    values()    Returns a Collection view of the values contained in this map.

// ********************************************************************************************
// Practise HashMap
// ********************************************************************************************

        System.out.println("Practise HashMap");
// Creation of HashMap
        HashMap<String, String> Geeks = new HashMap<>();

// Adding values to HashMap using put() method
        Geeks.put("Language", "Java");
        Geeks.put("Platform", "Geeks For Geeks");
        Geeks.put("Code", "HashMap");
        Geeks.put("Learn", "More");

// Printing out the values of the HashMap
        System.out.println("HashMap Contents: " + Geeks);

// Printing the size of the HashMap
        System.out.println("The size of the HashMap is: "
                + Geeks.size());

// Using the get() method to retrieve a value from the HashMap
        String language = Geeks.get("Language");
        System.out.println("Language: " + language);
        System.out.println("Language: " + Geeks.get("Language"));

// Using the containsKey() method to check if a key exists in the HashMap
        boolean containsKey = Geeks.containsKey("essa");
        System.out.println("Contains Key 'essa'? "
                + containsKey);

// Using the containsValue() method to check if a value exists in the HashMap
        boolean containsValue = Geeks.containsValue("More");
        System.out.println("Contains Value 'More'? "
                + containsValue);

// Using the keySet() method to retrieve a Set of all keys in the HashMap
        Set<String> keySet = Geeks.keySet();
        System.out.println("Key Set: " + keySet);

// Using the values() method to retrieve a Collection of all values in the HashMap
        Collection<String> values = Geeks.values();
        System.out.println("Values: " + values);

// Using the entrySet() method to retrieve a Set of all key-value pairs in the HashMap
        Set<Map.Entry<String, String>> entrySet
                = Geeks.entrySet();
        System.out.println("Entry Set: " + entrySet);

// Using the remove() method to remove a key-value pair from the HashMap
        String removedValue = Geeks.remove("Code");
        System.out.println("Removed Value: "
                + removedValue);

// Using the clear() method to remove all key-value pairs from the HashMap
        Geeks.clear();
        System.out.println(
                "HashMap Contents after clear(): " + Geeks);

// Using the isEmpty() method to check if the HashMap is empty
        boolean isEmpty = Geeks.isEmpty();
        System.out.println("Is Empty? " + isEmpty);

// Some more practise for Hashmap

// Adding values to HashMap as ("keys", "values")
        Geeks.put("Language", "Java");
        Geeks.put("Platform", "Geeks For geeks");
        Geeks.put("Code", "HashMap");
        Geeks.put("Learn", "More");

// containsKey() method is to check the presence of a particluar key Since 'Code' key present here, the condition is true
        if (Geeks.containsKey("Code"))
            System.out.println("Testing .containsKey : " +
                    Geeks.get("Code"));

// keySet() method returns all the keys in HashMap
        Set<String> Geekskeys = Geeks.keySet();
        System.out.println("Initial keys : " + Geekskeys);


// values() method return all the values in HashMap
        Collection<String> Geeksvalues = Geeks.values();
        System.out.println("Initial values : " + Geeksvalues);

// Adding new set of key-value
        Geeks.put("Search", "JavaArticle");

// Again using .keySet() and .values() methods
        System.out.println("New Keys : " + Geekskeys);
        System.out.println("New Values: " + Geeksvalues);

// putAll Example
// create an HashMap
        HashMap<String, Integer> primeNumbers = new HashMap<>();

// add mappings to HashMap
        primeNumbers.put("Two", 2);
        primeNumbers.put("Three", 3);
        System.out.println("Prime Numbers: " + primeNumbers);

// create another HashMap
        HashMap<String, Integer> numbers2 = new HashMap<>();
        numbers2.put("One", 1);
        numbers2.put("Two", 22);

// Add all mappings from primeNumbers to numbers
        numbers2.putAll(primeNumbers);
        System.out.println("Numbers: " + numbers2);

// putIfAbsent Example
// create a HashMap
        HashMap<Integer, String> languages = new HashMap<>();

// add mappings to HashMap
        languages.put(1, "Python");
        languages.put(2, "C");
        languages.put(3, "Java");
        System.out.println("Languages: " + languages);

// key already not present in HashMap
        languages.putIfAbsent(4, "JavaScript");

// key already present in HashMap
        languages.putIfAbsent(2, "Swift");
        System.out.println("Updated Languages: " + languages);

// replace Example
// create an HashMap
        HashMap<Integer, String> languages2 = new HashMap<>();

// add entries to HashMap
        languages2.put(1, "Python");
        languages2.put(2, "English");
        languages2.put(3, "JavaScript");
        System.out.println("HashMap: " + languages2);

// replace mapping for key 2
        String value = languages2.replace(2, "Java");

        System.out.println("Replaced Value: " + value);
        System.out.println("Updated HashMap: " + languages2);

// replace with Old Value example
// create an HashMap
        HashMap<String, String> countries = new HashMap<>();

// insert items to the HashMap
        countries.put("Washington", "America");
        countries.put("Ottawa", "Canada");
        countries.put("Canberra", "Australia");
        System.out.println("Countries:\n" + countries);

// replace mapping {Washington = America}
        countries.replace("Washington", "America", "USA");  // return true

        countries.replace("Canberra", "New Zealand", "Victoria");  // return false

        System.out.println("Countries after replace():\n" + countries);

// put() vs replace() example
/*
    When the hashmap contains the mapping for the specified key, then both the methods replace the value associated with the specified key.
    However, if the hashmap does not contain any mapping for the specified key, then the put() method inserts the new mapping for the specified key and value
    the replace() method returns null
 */

// create an HashMap
        HashMap<Integer, String> languages3 = new HashMap<>();

// insert entries to HashMap
        languages3.put(1, "Python");
        languages3.put(2, "JavaScript");

// create another HashMap similar to languages1
        HashMap<Integer, String> languages4 = new HashMap<>();

// puts all entries from languages1 to languages2
        languages4.putAll(languages3);
        System.out.println("HashMap: " + languages3);

// use of put()
        languages4.put(3, "Java");
        System.out.println("HashMap after put():\n" + languages4);

// use of replace()
        languages3.replace(3, "Java");
        System.out.println("HashMap after replace():\n" + languages3);


// replaceAll() with scalar values example
// create an HashMap
        HashMap<Integer, String> languages5 = new HashMap<>();

// add entries to the HashMap
        languages5.put(1, "java");
        languages5.put(2, "javascript");
        languages5.put(3, "python");
        System.out.println("HashMap: " + languages5);

// Change all value to uppercase
        languages5.replaceAll((key, val) -> val.toUpperCase());
        System.out.println("Updated HashMap: " + languages5);

// replaceAll() with calculated values using lambdas
// create an HashMap
        HashMap<Integer, Integer> numbers3 = new HashMap<>();

// insert entries to the HashMap
        numbers3.put(5, 0);
        numbers3.put(8, 1);
        numbers3.put(9, 2);
        System.out.println("HashMap: " + numbers3);

// replace all value with the square of key
        numbers3.replaceAll((key, val) -> key * key);
        ;
        System.out.println("Updated HashMap: " + numbers3);

// getOrDefault() Example
// create an HashMap
        HashMap<Integer, String> numbers7 = new HashMap<>();

// insert entries to the HashMap
        numbers7.put(1, "Java");
        numbers7.put(2, "Python");
        numbers7.put(3, "JavaScript");
        System.out.println("HashMap: " + numbers7);

// mapping for the key is present in HashMap
        String value1 = numbers7.getOrDefault(1, "Not Found");
        System.out.println("Value for key 1:  " + value1);

// mapping for the key is not present in HashMap
        String value2 = numbers7.getOrDefault(4, "Not Found");
        System.out.println("Value for key 4: " + value2);

// forEach Example
// create a HashMap
        HashMap<String, Integer> prices = new HashMap<>();

// insert entries to the HashMap
        prices.put("Shoes", 200);
        prices.put("Bag", 300);
        prices.put("Pant", 150);
        System.out.println("Normal Price: " + prices);

        System.out.print("Discounted Price: ");

        prices.forEach((key, val) -> {      // pass lambda expression to forEach()
            // decrease value by 10%
            val = val - val * 10 / 100;
            System.out.print(key + "=" + val + " ");
        });

// merge() Example
/*
    If the specified key is already associated with a value, the method replaces the old value with the result of the specified function.
    The syntax of the merge() method is: hashmap.merge(key, value, remappingFunction)
        - key - key with which the specified value is to be associated
        - value - value to be associated with key, if key is already associated with any value
        - remappingFunction - result to be associated with key if key is already associated with a value

    Return values:
        - returns the new value associated with the key
        - returns null if no value associated with key
        - If remappingFunction results null, then the mapping for the specified key is removed.
*/

// HashMap merge() to Insert New Entry
// Since the key Shirt is not present in prices, the merge() method inserts the mapping Shirt=100. And, the result from remapping function is ignored.
// create an HashMap
        HashMap<String, Integer> prices2 = new HashMap<>();

// insert entries to the HashMap
        prices2.put("Shoes", 200);
        prices2.put("Bag", 300);
        prices2.put("Pant", 150);
        System.out.println("HashMap: " + prices2);

        int returnedValue = prices2.merge("Shirt", 100, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("Price of Shirt: " + returnedValue);

// print updated HashMap
        System.out.println("Updated HashMap: " + prices2);

// HashMap merge() to Insert Entry with Duplicate Key
// Since key Washington is already present in countries, the old value is replaced by the value returned by remapping function.
// Hence, the mapping for Washington includes value America/USA.

// create an HashMap
        HashMap<String, String> countries2 = new HashMap<>();

// insert entries to the HashMap
        countries.put("Washington", "America");
        countries.put("Canberra", "Australia");
        countries.put("Madrid", "Spain");
        System.out.println("HashMap: " + countries);

// merge mapping for key Washington
        String returnedValue2 = countries2.merge("Washington", "USA", (oldValue, newValue) -> oldValue + "/" + newValue);
        System.out.println("Washington: " + returnedValue2);

// print updated HashMap
        System.out.println("Updated HashMap: " + countries2);


// HashMap merge() to Merge two HashMaps
// Since the key Shoes is present in both the hashmap, the value of Shoes is replaced by the result of the remapping function.

// create an HashMap
        HashMap<String, Integer> prices1 = new HashMap<>();

// insert entries to the HashMap
        prices1.put("Pant", 230);
        prices1.put("Shoes", 350);
        System.out.println("HashMap 1: " + prices1);

// create another hashmap
        HashMap<String, Integer> prices1a = new HashMap<>();

//insert entries to the HashMap
        prices1a.put("Shirt", 150);
        prices1a.put("Shoes", 320);
        System.out.println("HashMap 2: " + prices1a);

// forEach() access each entries of prices2
// merge() inserts each entry from prices2 to prices1
        prices1a.forEach((key, val) -> prices1.merge(key, val, (oldValue, newValue) -> {

            // return the smaller value
            if (oldValue < newValue) {
                return oldValue;
            } else {
                return newValue;
            }
        }));

        System.out.println("Merged HashMap: " + prices1);

/*
    Java HashMap merge() Vs. putAll
    We can also use the putAll() method to merge two hashmaps. However, if a key is present in both hashmaps, the old value is replaced by the new value.
    Unlike the merge(), the putAll() method does not provide the remapping function. Hence, we cannot decide what value to store for duplicate keys.
 */


// compute() example
/*
    The syntax of the compute() method is hashmap.compute(K key, BiFunction remappingFunction)
    The compute() method takes 2 parameters:
        - key - key with which the computed value is to be associated
        - remappingFunction - function that computes the new value for the specified key
        - The remappingFunction can take two arguments. Hence, considered as BiFunction.
    Return Values:
        - returns the new value associated with the key
        - returns null if no value associated with key
        - If remappingFunction results null, then the mapping for the specified key is removed.
 */

// HashMap compute() to Insert New Value

/*
    (key, value) -> value - value * 10/100 - It is a lambda expression. It reduces the old value of Shoes by 10% and returns it.
    prices.compute() - Associates the new value returned by lambda expression to the mapping for Shoes.
    Note: According to the official documentation of Java, the HashMap merge() method is simpler than the compute() method.
*/

// create an HashMap
        HashMap<String, Integer> pricesA = new HashMap<>();

// insert entries to the HashMap
        pricesA.put("Shoes", 200);
        pricesA.put("Bag", 300);
        pricesA.put("Pant", 150);
        System.out.println("HashMap: " + pricesA);

// recompute the value of Shoes with 10% discount
        int newPrice = pricesA.compute("Shoes", (key, val) -> val - val * 10 / 100);
        System.out.println("Discounted Price of Shoes: " + newPrice);

// print updated HashMap
        System.out.println("Updated HashMap: " + pricesA);


// computeIfAbsent() and computeIfPresent Example

/*
    It only computes and add a new record to the map if the key does not exist in the map
    Therefore in the example below, a new record for Shoe is added to the map because it does not exist already.
    But a there is no change to Shoes record because it is already there in the map.
*/

// create an HashMap
        HashMap<String, Integer> pricesB = new HashMap<>();

// insert entries to the HashMap
        pricesB.put("Shoes", 200);
        pricesB.put("Bag", 300);
        pricesB.put("Pant", 150);
        System.out.println("HashMap: " + pricesB);

// computeIfAbsent computes the value of Shirt because it doesn't exist
        int shirtPrice = pricesB.computeIfAbsent("Shirt", key -> 280);
        System.out.println("Price of Shirt: " + shirtPrice);

// computeIfAbsent does not compute the value of Shoes because it already exists
        int shoePrice = pricesB.computeIfAbsent("Shoes", (key) -> 280);
        System.out.println("Price of Shoes: " + shoePrice);

// computeIfPresent computes the price of Pant because it is present
        int pantPrice = pricesB.computeIfPresent("Pant", (key, val) -> val + val * 10 / 100);
        System.out.println("Price of Pant after VAT: " + pantPrice);

// print updated HashMap
        System.out.println("Updated HashMap: " + pricesB);

// Sub set of keys from HashMap based on conditional values
        Map<String, Integer> map = new HashMap<>();
        map.put("Python", 1);
        map.put("Java", 1);
        map.put("OOPSa", 2);
        map.put("Language", 1);
        map.put("Rubya", 3);
        map.put("Hey", 1);

        List<String> subKeys = map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());
        System.out.println(subKeys);

// Sub set of values from HashMap based on conditional keys
        List<Integer> subValues = map.entrySet().stream()
                .filter(entry -> entry.getKey().endsWith("a"))
                .map(entry -> entry.getValue())
                .collect(Collectors.toList());
        System.out.println(subValues);

// Sub set of records from HashMap based on conditional keys
        Map<String, Integer> subHashMapByKeys = map.entrySet().stream()
                .filter(entry -> entry.getKey().endsWith("a"))
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
        System.out.println(subHashMapByKeys);

// Sub set of records from HashMap based on conditional values
        Map<String, Integer> subHashMapByValues = map.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(entry -> entry.getKey(), entry -> entry.getValue()));
        System.out.println(subHashMapByValues);

// Sub set of records from HashMap based on another ArrayList of keys
        Map<Integer, String> mapA = new HashMap<>();
        mapA.put(1, "A");
        mapA.put(2, "B");
        mapA.put(3, "C");
        mapA.put(4, "D");
        mapA.put(5, "E");

        List<Integer> keyList = Arrays.asList(2, 3, 4);

        Map<Integer, String> subMapByKeys = mapA.entrySet().stream()
                .filter(x -> keyList.contains(x.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(subMapByKeys);

// Sub set of records from HashMap based on another ArrayList of values
        List<String> valuesList = Arrays.asList("C", "D", "J"); // note that "J" is not in the map

        Map<Integer, String> subMapByValues = mapA.entrySet().stream()
                .filter(x -> valuesList.contains(x.getValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println(subMapByValues);

// creating a HashMap from ArrayList
/*
    Here we are creating a HashMap by settings its keys equal to ArrayList values.
    HashMap values are calculated by providing String::Length function which runs
    the function on each ArrayList value that stream processes.
    We can use any function like String::Length
*/
        List<String> numbtoStrList = new ArrayList<>();

        numbtoStrList.add("Six");
        numbtoStrList.add("Seven");
        numbtoStrList.add("Three");
        numbtoStrList.add("Two");
        numbtoStrList.add("Five");

// creating a map with keys from ArrayList and values as length of values of ArrayList
        Map<String, Integer> map_of_lengths = numbtoStrList.stream()
                .collect(Collectors.toMap(Function.identity(), String::length));

// creating a map with keys from ArrayList and values as Upper Case of values of ArrayList
        Map<String, String> map_of_uppercase = numbtoStrList.stream()
                .collect(Collectors.toMap(Function.identity(), String::toUpperCase));

// creating a map with keys starting from 1 and incremented by 1 for each value in ArrayList.
// The value of map are the values of ArrayList as is using Function.identity() method
        AtomicInteger counter = new AtomicInteger(0);
        Map<Integer, String> map_of_index = numbtoStrList.stream()
                .collect(Collectors.toMap(n -> counter.incrementAndGet(), Function.identity()));    // note that Function.identity() can also be replaced here with s1 -> s1 lambda

// creating a map with keys starting from 0 to ArrayList size by using IntStream.range() method
        Map<Integer, String> map_of_index2 = IntStream.range(0, numbtoStrList.size())
                .boxed()
                .collect(Collectors.toMap(Function.identity(), j -> numbtoStrList.get(j)));


        System.out.println("List : " + numbtoStrList);
        System.out.println("Map : " + map_of_lengths);
        System.out.println("Map : " + map_of_uppercase);
        System.out.println("Map : " + map_of_index);
        System.out.println("Map : " + map_of_index2);


    }
}
