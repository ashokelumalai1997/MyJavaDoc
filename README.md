# MyJavaDoc


# Primitive Types
n Java, primitive types are basic data types that represent single values. They are not objects and do not have methods or fields like objects do. Here is a list of the primitive data types in Java:

* byte: 8-bit signed integer.
* short: 16-bit signed integer.
* int: 32-bit signed integer.
* long: 64-bit signed integer.
* float: 32-bit floating-point number (IEEE 754 standard).
* double: 64-bit floating-point number (IEEE 754 standard).
* char: 16-bit Unicode character.
* boolean: Represents true or false values.
* These primitive data types are used to store simple values and are more memory-efficient than objects. They are commonly used in Java for variables and parameters in methods.


# Conversions


In Java, you can convert between primitive data types and their wrapper classes, as well as perform conversions between compatible primitive data types. Here are some common methods and techniques for performing these conversions:


Primitive to Wrapper Class:

You can convert a primitive type to its corresponding wrapper class using autoboxing (automatic conversion) or explicitly with constructors.

```
int primitiveInt = 42;
Integer wrapperInt = Integer.valueOf(primitiveInt); // Explicit conversion
```

Wrapper Class to Primitive:

You can convert a wrapper class object to a primitive type using unboxing (automatic conversion) or methods like intValue(), doubleValue(), etc.

```
Integer wrapperInt = Integer.valueOf(42);
int primitiveInt = wrapperInt.intValue(); // Using intValue()
```

String to Primitive:

You can parse a string to a primitive using the relevant parseXxx() method for each type, where Xxx is the name of the primitive data type.

```
String str = "123";
int num = Integer.parseInt(str);
```

Primitive to String:

Convert a primitive to a string using the String.valueOf() method or by concatenating with an empty string ("").

```
int num = 123;
String str = String.valueOf(num);
```

String to Wrapper Class:

You can parse a string to a wrapper class using the valueOf() method of the wrapper class.

```
String str = "123";
Integer wrapperInt = Integer.valueOf(str);
```

Wrapper Class to String:

Convert a wrapper class object to a string using the toString() method or by concatenating with an empty string ("").

```
Integer wrapperInt = Integer.valueOf(123);
String str = wrapperInt.toString();
```

Implicit Type Casting (Primitive to Primitive):

You can perform implicit type casting between compatible primitive types when the target type has a larger range.

```
int smallNum = 42;
long largeNum = smallNum; // Implicit casting from int to long
```
Explicit Type Casting (Primitive to Primitive):

You can explicitly cast a primitive to another type when you need to narrow the data type, but this can lead to loss of data if not done carefully.

```
double dblNum = 3.14;
int intNum = (int) dblNum; // Explicit casting from double to int
```

Keep in mind that when converting between data types, you should be aware of potential data loss and handle exceptions that may occur during conversion (e.g., when parsing strings). Additionally, be mindful of the range and precision differences between various data types.


int to Char:

```
int intValue = 6;
char charValue = (char) (intValue + '0');

System.out.println(charValue); // Prints '6'

```

Char to int

```
char charValue = '6';
int intValue = charValue - '0';

System.out.println(intValue); // Prints '6'

```
# Wrapper types

In Java, the wrapper classes are used to provide objects for each of the primitive data types. Here is a list of all the wrapper classes for primitive data types:

* Byte: java.lang.Byte (for byte)
* Short: java.lang.Short (for short)
* Integer: java.lang.Integer (for int)
* Long: java.lang.Long (for long)
* Float: java.lang.Float (for float)
* Double: java.lang.Double (for double)
* Character: java.lang.Character (for char)
* Boolean: java.lang.Boolean (for boolean)

These wrapper classes allow you to work with primitive data types as objects, and they provide utility methods for tasks such as conversion, parsing, and manipulation.

# Manipulations, Conversions - wrappers

Here's a quick summary for each of these wrapper classes:

Double:

* Convert Double to double: Use unboxing or the doubleValue() method.
* Convert double to Double: Use autoboxing or the valueOf() method.
* Convert String to Double: Use Double.valueOf() or the Double constructor.
* Convert Double to String: Use the toString() method.

Long:

* Convert Long to long: Use unboxing or the longValue() method.
* Convert long to Long: Use autoboxing or the valueOf() method.
* Convert String to Long: Use Long.valueOf() or the Long constructor.
* Convert Long to String: Use the toString() method.

Character:

* Convert Character to char: Use unboxing.
* Convert char to Character: Use autoboxing or the valueOf() method.
* Convert String to Character: Use the charAt(0) method or create a new Character object.
* Convert Character to String: Use the toString() method or concatenate it with an empty string.

Short:

* Convert Short to short: Use unboxing or the shortValue() method.
* Convert short to Short: Use autoboxing or the valueOf() method.
* Convert String to Short: Use Short.valueOf() or the Short constructor.
* Convert Short to String: Use the toString() method.

Float:

* Convert Float to float: Use unboxing or the floatValue() method.
* Convert float to Float: Use autoboxing or the valueOf() method.
* Convert String to Float: Use Float.valueOf() or the Float constructor.
* Convert Float to String: Use the toString() method.

Boolean:

* Convert Boolean to boolean: Use unboxing or the booleanValue() method.
* Convert boolean to Boolean: Use autoboxing or the valueOf() method.
* Convert String to Boolean: Use Boolean.valueOf() or the Boolean constructor.
* Convert Boolean to String: Use the toString() method.

Byte:

* Convert Byte to byte: Use unboxing or the byteValue() method.
* Convert byte to Byte: Use autoboxing or the valueOf() method.
* Convert String to Byte: Use Byte.valueOf() or the Byte constructor.
* Convert Byte to String: Use the toString() method.

Integer:

* Convert Integer to int: Use unboxing or the intValue() method.
* Convert int to Integer: Use autoboxing or the valueOf() method.
* Convert String to Integer: Use Integer.valueOf() or the Integer constructor.
* Convert Integer to String: Use the toString() method.


Integer to Long:

```
Integer intValue = 42;
Long longValue = new Long(intValue.longValue());

```

Integer to Short

```
Integer intValue = 42;
Short shortValue = new Short(intValue.shortValue());
```

Integer to Double

```
Integer intValue = 42;
Double doubleValue = new Double(intValue.doubleValue());
```


Double to Float
```
Double doubleValue = 3.14;
Float floatValue = new Float(doubleValue.floatValue());

```
Double to Integer
``` 
Double doubleValue = 3.14;
Integer intValue = new Integer(doubleValue.intValue());
```


# Sorting
You can sort various types of data in Java using inbuilt functions. Here's how you can do it for each of the mentioned data types:

        int array:
        You can use the Arrays.sort(int[] array) method to sort an integer array in ascending order.

        java
        Copy code
        int[] intArray = {5, 2, 9, 1, 5};
        Arrays.sort(intArray);
        char array:
        To sort a char array, you can use the same Arrays.sort(char[] array) method as you would for an int array.

        java
        Copy code
        char[] charArray = {'c', 'a', 'b', 'z', 'f'};
        Arrays.sort(charArray);
        String array:
        For sorting a String array, you can use Arrays.sort(String[] array) for lexicographical (alphabetical) sorting.

        java
        Copy code
        String[] stringArray = {"apple", "banana", "cherry", "date", "apricot"};
        Arrays.sort(stringArray);
        Integer ArrayList:
        You can sort an ArrayList<Integer> using the Collections.sort() method.

        java
        Copy code
        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(2);
        intList.add(9);
        intList.add(1);
        Collections.sort(intList);
        Character ArrayList:
        Similarly, you can sort an ArrayList<Character> using the Collections.sort() method.

        java
        Copy code
        ArrayList<Character> charList = new ArrayList<>();
        charList.add('c');
        charList.add('a');
        charList.add('b');
        charList.add('z');
        Collections.sort(charList);
        String ArrayList:
        To sort an ArrayList<String> lexicographically, again, use Collections.sort().

        java
        Copy code
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        stringList.add("date");
        Collections.sort(stringList);
        ArrayList of any objects:
        To sort an ArrayList of objects, you need to ensure that the objects in the list implement the Comparable interface or provide a custom Comparator. Then, you can use Collections.sort().

        java
        Copy code
        ArrayList<YourObject> objectList = new ArrayList<>();
// Add objects to the list

// Option 1: Objects implement Comparable
Collections.sort(objectList);

// Option 2: Use a custom Comparator
Collections.sort(objectList, new YourCustomComparator());
Ensure that your custom objects implement the Comparable interface or that you provide a Comparator implementation to specify how the objects should be compared and sorted.


# Reverse

You can reverse various types of data in Java using built-in functions or methods. Here's how you can reverse each of the mentioned data types:

int array:
You can reverse an int array by iterating through it and swapping elements from the beginning and end until you reach the middle of the array.

```
int[] intArray = {1, 2, 3, 4, 5};
int length = intArray.length;
for (int i = 0; i < length / 2; i++) {
int temp = intArray[i];
intArray[i] = intArray[length - i - 1];
intArray[length - i - 1] = temp;
}
```


char array:
You can reverse a char array using a similar approach as with an int array.

```
char[] charArray = {'a', 'b', 'c', 'd', 'e'};
int length = charArray.length;
for (int i = 0; i < length / 2; i++) {
char temp = charArray[i];
charArray[i] = charArray[length - i - 1];
charArray[length - i - 1] = temp;
}
```

String array:
To reverse a String array, you can use the same technique as with a char array.

```
String[] stringArray = {"apple", "banana", "cherry", "date", "fig"};
int length = stringArray.length;
for (int i = 0; i < length / 2; i++) {
String temp = stringArray[i];
stringArray[i] = stringArray[length - i - 1];
stringArray[length - i - 1] = temp;
}
```

Integer ArrayList:
To reverse an ArrayList<Integer>, you can use the Collections.reverse() method.

```
ArrayList<Integer> intList = new ArrayList<>();
intList.add(1);
intList.add(2);
intList.add(3);
intList.add(4);
intList.add(5);
Collections.reverse(intList);
```

Character ArrayList:
You can reverse an ArrayList<Character> using the same Collections.reverse() method.

```
ArrayList<Character> charList = new ArrayList<>();
charList.add('a');
charList.add('b');
charList.add('c');
charList.add('d');
charList.add('e');
Collections.reverse(charList);
```


String ArrayList:
Reversing an ArrayList<String> is also done with Collections.reverse().

```
ArrayList<String> stringList = new ArrayList<>();
stringList.add("apple");
stringList.add("banana");
stringList.add("cherry");
stringList.add("date");
stringList.add("fig");
Collections.reverse(stringList);
```

ArrayList of any objects:
To reverse an ArrayList of objects, you can use the Collections.reverse() method. However, please note that this method works by reversing the order of the elements in the list. If you have custom objects, their order will be reversed based on their current order in the list.

```
ArrayList<YourObject> objectList = new ArrayList<>();
// Add objects to the list

Collections.reverse(objectList);
```

Keep in mind that when reversing objects in an ArrayList, the objects themselves aren't modified, only their order in the list is reversed.


