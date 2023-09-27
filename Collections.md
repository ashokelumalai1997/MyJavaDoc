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