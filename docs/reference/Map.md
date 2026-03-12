## `Map`

Applies a function to each element of a list.

### Signature

```
Map(func, list)
```

### Parameters

| Parameter | Type | Description |
|-----------|------|-------------|
| `func` | String or Function | The name of a built-in or user-defined function to apply |
| `list` | List | The list of elements to map over |

### Description

`Map(func, list)` applies `func` to each element of `list` and returns a new list of the results. Each element is passed as a single argument to `func`.

`func` can be a built-in function name (e.g., `Factorial`), an empty function, or a user-defined function.

### Examples

**With an empty function:**
```
<f>;
Map(f, [1, 2, 3])              => [f(1), f(2), f(3)]
```

**With a built-in function:**
```
Map(Factorial, [1, 2, 3])      => [1, 2, 6]
Map(Factorial, [5])             => [120]
```

**With a predicate function:**
```
Map(IntQ, [1, 2, 3])           => [True, True, True]
```

**With a string function:**
```
Map(StringLength, ["hello", "hi", "mathlark"])  => [5, 2, 8]
```

**With nested lists:**
```
Map(First, [[10, 20], [30, 40], [50, 60]])      => [10, 30, 50]
Map(Last, [[10, 20], [30, 40], [50, 60]])        => [20, 40, 60]
Map(Length, [[1, 2], [3, 4, 5], [6]])             => [2, 3, 1]
```

**With an empty list:**
```
Map(Factorial, [])              => []
```

### Errors

- Throws `WrongParameterLengthException` if called with fewer or more than 2 arguments.
- Throws `WrongParameterTypeException` if the second argument is not a list.
