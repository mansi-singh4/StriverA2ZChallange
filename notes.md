
# Print Name N Times Using Recursion

## Problem

Print a given name `N` times using recursion.
## Approach

Use recursion with a counter variable.

1. Start with `count = 0`.
2. Print the name.
3. Recursively call the function with `count + 1`.
4. Stop when `count == N`.





# Print 1 to N Using Recursion

## Question
Print numbers from `1` to `N` using recursion.

## Approach
- Start with `curr = 1`.
- Print the current number.
- Recursively call the function with `curr + 1`.
- Stop when `curr > N` (base case).

## Time Complexity
- **O(N)**

## Space Complexity
- **O(N)** (recursive call stack)