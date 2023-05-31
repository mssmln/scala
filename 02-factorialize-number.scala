def factorial (num : BigInt) : BigInt =
    if (num == 0) 1 else num * factorial(num - 1)

factorial(5) // 120