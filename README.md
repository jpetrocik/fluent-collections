fluent-collections
==================

Another collections library to make creation and populating collections more fluent.  There are many fluent collection libraries, including google’s guava library.  This project was started years ago, before guava, and I simply prefer this api over the others. 

Three main goals:

1. Supports generics without having to define the formal type parameters.
2. Minic the api for mutable methods
3. Achieve this with the least amount of coding.


## Examples

###Sets

```
      Set<String> mySet = Sets.add("Value1")
    		  .add("Value2")
    		  .add("Value3")
    		  .set();
```

###Lists
```
      List<String> myList = Lists.add("Value1")
    		  .add("Value2")
    		  .add("Value3")
    		  .list();
```

###Maps

```
      Map<String,String> myList = Maps.put("Key1", "Value1")
    		  .put("Key2", "Value2")
    		  .put("Key3", "Value3")
    		  .map();
```
