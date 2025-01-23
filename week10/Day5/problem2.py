# Trapping Rain Water

# Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining

class problem2:
    def trap(self, height: List[int]) -> int:
        n = len(height)
        left = 0
        right = n -1
        leftbar = height[0]
        rightbar = height[n-1]
        ans = 0
        while left <= right:
            if leftbar < rightbar:
                if height[left] > leftbar:
                    leftbar = height[left]
                else:
                    ans += leftbar - height[left]
                    left += 1
            else:
                if height[right] > rightbar:
                    rightbar = height[right]
                else:
                    ans += rightbar - height[right]
                    right -= 1
        return ans


        