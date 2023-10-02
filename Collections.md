# Collections

1. ArrayList, LinkedList, Stack, Queue, Deque
   Creating:

```
ArrayList<Type> list = new ArrayList<>();
LinkedList<Type> linkedList = new LinkedList<>();
Stack<Type> stack = new Stack<>();
Queue<Type> queue = new LinkedList<>();
Deque<Type> deque = new LinkedList<>();
```

Traversing:


```
for (Type element : list) {
// Process element
}
```

```
// For LinkedList, Stack, Queue, Deque, you can also use iterators.
Iterator<Type> iterator = list.iterator();
while (iterator.hasNext()) {
Type element = iterator.next();
// Process element
}
```

Deleting an Element:

```
list.remove(element); // Removes the first occurrence of 'element'
list.remove(index);   // Removes the element at the specified index
stack.pop();          // Removes and returns the top element in the stack
queue.poll();         // Removes and returns the front element in the queue
deque.pollFirst();    // Removes and returns the first element in the deque
```

Inserting an Element:

```
list.add(element);      // Adds 'element' to the end of the list
list.add(index, element); // Inserts 'element' at the specified index
stack.push(element);     // Pushes 'element' onto the stack
queue.offer(element);    // Adds 'element' to the rear of the queue
deque.offerLast(element);// Adds 'element' to the end of the deque
```

Inserting an Element at a Specific Position:

```
list.add(index, element); // Inserts 'element' at the specified index
// For LinkedList, you can use specific methods like addFirst(), addLast() to insert at the beginning or end.
```


Update

```
arrList.set(5, newValue);
```

2. HashMap, LinkedHashMap, TreeMap
   Creating:


```
HashMap<KeyType, ValueType> hashMap = new HashMap<>();
LinkedHashMap<KeyType, ValueType> linkedHashMap = new LinkedHashMap<>();
TreeMap<KeyType, ValueType> treeMap = new TreeMap<>();
```

Traversing:

```
for (KeyType key : hashMap.keySet()) {
ValueType value = hashMap.get(key);
// Process key and value
}

Map<String, String> map = ...
for (Map.Entry<String, String> entry : map.entrySet()) {
    System.out.println(entry.getKey() + "/" + entry.getValue());
}

On Java 10+:

for (var entry : map.entrySet()) {
    System.out.println(entry.getKey() + "/" + entry.getValue());
}
```

// For LinkedHashMap and TreeMap, keys are ordered.
Deleting an Element:

```
hashMap.remove(key); // Removes the entry with the specified key
linkedHashMap.remove(key);
treeMap.remove(key);
```

Inserting an Element:

```
hashMap.put(key, value); // Adds an entry with the specified key and value
linkedHashMap.put(key, value);
treeMap.put(key, value);
```

3. HashSet, LinkedHashSet, TreeSet
   Creating:

```
HashSet<Type> hashSet = new HashSet<>();
LinkedHashSet<Type> linkedHashSet = new LinkedHashSet<>();
TreeSet<Type> treeSet = new TreeSet<>();
```

Traversing:

```
for (Type element : hashSet) {
// Process element
}
```

// For TreeSet, elements are ordered.
Deleting an Element:

```
hashSet.remove(element); // Removes 'element' if it exists
linkedHashSet.remove(element);
treeSet.remove(element);
```

Inserting an Element:

```
hashSet.add(element); // Adds 'element'
linkedHashSet.add(element);
treeSet.add(element);
```

4. PriorityQueue (Min Heap, Max Heap)
   Creating:

```
PriorityQueue<Type> minHeap = new PriorityQueue<>(); // Min heap
PriorityQueue<Type> maxHeap = new PriorityQueue<>(Collections.reverseOrder()); // Max heap
```

Traversing:

```
// Priority queues do not offer direct traversal of elements.
// You typically remove elements based on priority.
```


Deleting an Element:

```
Type element = minHeap.poll(); // Removes and returns the smallest element
Type element = maxHeap.poll(); // Removes and returns the largest element
```

Inserting an Element:

```
minHeap.offer(element); // Adds 'element' to the min heap
maxHeap.offer(element); // Adds 'element' to the max heap
```


### String


String Concatenation:

concat(String str): Concatenates the specified string to the end of the current string.

String Length:

length(): Returns the length (number of characters) of the string.

String Comparison:

equals(Object obj): Compares the content of two strings for equality.
equalsIgnoreCase(String str): Compares two strings for equality while ignoring case.

Substring:

substring(int beginIndex): Returns a substring from the specified index to the end of the string.
substring(int beginIndex, int endIndex): Returns a substring from the specified begin index (inclusive) to the specified end index (exclusive).

String Search:

indexOf(int ch): Returns the index of the first occurrence of the specified character.
indexOf(String str): Returns the index of the first occurrence of the specified substring.
lastIndexOf(int ch): Returns the index of the last occurrence of the specified character.
lastIndexOf(String str): Returns the index of the last occurrence of the specified substring.

Character Extraction:

charAt(int index): Returns the character at the specified index.

String Replacement:

replace(char oldChar, char newChar): Replaces all occurrences of the old character with the new character.
replace(CharSequence target, CharSequence replacement): Replaces all occurrences of the target substring with the replacement substring.

String Splitting:

split(String regex): Splits the string into an array of substrings based on the specified regular expression.
Trimming:

trim(): Removes leading and trailing whitespace characters from the string.

Case Conversion:

toLowerCase(): Converts the string to lowercase.
toUpperCase(): Converts the string to uppercase.

String Comparison:

compareTo(String anotherString): Compares two strings lexicographically.
compareToIgnoreCase(String str): Compares two strings lexicographically while ignoring case.

String Formatting:

format(String format, Object... args): Formats a string using the specified format and arguments.

String Checking:

startsWith(String prefix): Checks if the string starts with the specified prefix.
endsWith(String suffix): Checks if the string ends with the specified suffix.
contains(CharSequence sequence): Checks if the string contains the specified character sequence.

String Conversion:

valueOf(Object obj): Converts an object to its string representation.

String Building:

StringBuilder and StringBuffer classes provide methods for efficient string building and manipulation.



### Character methods

Character Conversion:

charValue(): Returns the primitive char value of the Character object.
Character Testing:

isLetter(char ch): Checks if the character is a letter (alphabetic).
isDigit(char ch): Checks if the character is a digit (0-9).
isLetterOrDigit(char ch): Checks if the character is a letter or a digit.
isUpperCase(char ch): Checks if the character is in uppercase.
isLowerCase(char ch): Checks if the character is in lowercase.
isWhitespace(char ch): Checks if the character is a whitespace character (e.g., space, tab, newline).

Character Case Conversion:

toLowerCase(char ch): Converts the character to lowercase.
toUpperCase(char ch): Converts the character to uppercase.

Character Comparison:

compare(char x, char y): Compares two characters numerically.
compareTo(Character anotherCharacter): Compares two Character objects.

Character Constants:

MIN_VALUE: The minimum value of a char (0).
MAX_VALUE: The maximum value of a char (65535).

Character Information:

getType(char ch): Returns the general category of the character.
getNumericValue(char ch): Returns the numeric value of a digit character.

Character Parsing:

forDigit(int digit, int radix): Returns the character representation of a digit in the specified radix.

Character Escape Sequences:

Characters can be represented using escape sequences in string literals, e.g., '\n' for a newline, '\t' for a tab, etc.