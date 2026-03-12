## `Range`

Generates a list of numbers over a specified range.

### Signatures

```
Range(n)
Range(n1, n2)
Range(n1, n2, step)
```

### Parameters

| Parameter | Type | Description |
|-----------|------|-------------|
| `n` | Numeric | Upper bound (starts from 1) |
| `n1` | Numeric | Start of the range (inclusive) |
| `n2` | Numeric | End of the range (inclusive) |
| `step` | Numeric | Increment between elements (default: `1`) |

### Description

- **`Range(n)`** — Returns a list from `1` to `n` (inclusive), stepping by `1`.
- **`Range(n1, n2)`** — Returns a list from `n1` to `n2` (inclusive), stepping by `1`.
- **`Range(n1, n2, step)`** — Returns a list from `n1` up to `n2` (inclusive), stepping by `step`. Use a negative step to generate a descending list.

If any argument is a `Double`, all elements in the result will be `Double`. Otherwise, elements are `Long` (integer).

Returns an empty list if the range is invalid (e.g., `n1 > n2` with a positive step, or `n1 < n2` with a negative step).

### Examples

```
Range(5)              => [1, 2, 3, 4, 5]
Range(5.0)            => [1.0, 2.0, 3.0, 4.0, 5.0]
Range(2, 10)          => [2, 3, 4, 5, 6, 7, 8, 9, 10]
Range(2, 10.0)        => [2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0]
Range(1, 11, 2)       => [1, 3, 5, 7, 9, 11]
Range(1, 10, 2)       => [1, 3, 5, 7, 9]
Range(10, 1, -1)      => [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]
Range(10, 5, -1)      => [10, 9, 8, 7, 6, 5]
Range(10, 5, -2)      => [10, 8, 6]
```

### Errors

- Throws `WrongParameterLengthException` if called with 0 or more than 3 arguments.
- Throws `WrongParameterTypeException` if any argument is not a numeric type.
