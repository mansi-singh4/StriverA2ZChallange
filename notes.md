# GCD or HCF

## Problem
Find the Greatest Common Divisor (GCD) of two numbers.

## Approach : Euclidean Algorithm (Optimal)

Observation:
gcd(a,b) = gcd(a%b,b)

Keep replacing the larger number with the remainder until one number becomes 0.
Time Complexity: O(log(min(a,b)))
Space Complexity: O(1)

## Key Learning

- Euclidean Algorithm is much faster than checking all divisors.
- The modulo operation replaces many subtraction operations in one step.
- gcd(a,b) = gcd(a%b,b)