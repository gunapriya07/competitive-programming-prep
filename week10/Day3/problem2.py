# 1. Number of 1 Bits

# Write a function that takes the binary representation of a positive integer and returns the number of set bits
# it has (also known as the Hamming weight).

class problem2:
    def hammingWeight(self, n: int) -> int:
        count =0
        while(n):
            if(n&1):
                count += 1
            n=n>>1
        return count