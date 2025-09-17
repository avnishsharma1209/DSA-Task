# DSA-Task-

# For Any Doubt 💬

Reach out to *Piyush* at *6397415707* Or *Parth* at *9559805577*.


# Week 1 Task: Let's Master "Subarray" Related Problems 🚀

## 1. Understand the Problem Clearly:

- Carefully read the problem and break it down.
- Are you asked to find a subarray with certain properties (e.g., smallest, largest sum, divisible sum)?
- Are you asked to maximize, minimize, or check for the existence of a condition?
- Does the problem allow for negative numbers or only positive ones?

Understanding these questions is the first step towards identifying which algorithm or technique might work best for solving the problem.

---

## 2. Analyze the Subarray Nature:

Subarrays are contiguous parts of an array, and different categories of subarray-related problems exist. 
- *Key Point*: Each category has specific patterns and hints towards a particular type of solution, so recognizing the subarray nature in the problem is crucial.

---

## 3. Look for Common Patterns:

### 1) Sliding Window or Two-Pointer Technique:

- *When to Use*:
  - Finding a subarray with a fixed sum or length.
  - Finding a subarray with conditions that can be checked as you move from one end of the array to another.
  
- *Why It Works*: This technique is efficient because it processes the array in linear time, expanding and contracting the window as needed.

- *Common Problem Types*:
  - Finding the smallest subarray with a sum greater than X.
  - Longest subarray with distinct elements or fixed-length subarrays.

- *Example*:
  - If you’re asked to find the longest subarray with sum ≤ k, sliding window is often the best approach.

---

### 2) Kadane’s Algorithm (Dynamic Programming):

- *When to Use*:
  - Finding the maximum subarray sum.

- *Why It Works*:
  - This algorithm efficiently tracks the maximum subarray sum ending at each index.
  - It's optimal as it builds solutions to subproblems (maximum sums ending at earlier indices) and extends them to solve larger problems.

- *Common Problem Types*:
  - Finding the maximum subarray sum, especially when there are no constraints on subarray length or when negative values are allowed.

- *Example*:
  - Given an array, find the maximum sum of any subarray.

---

### 3) Prefix Sum & HashMap:

- *When to Use*:
  - Modulo arithmetic (e.g., sum divisible by a number).
  - Checking sums over subarrays (especially when the subarray can be of any size).

- *Why It Works*:
  - The prefix sum allows us to break down a subarray sum into differences between two prefix sums.
  - HashMaps are used for fast lookups of previously seen sums, especially useful for problems with conditions like "sum divisible by k."

- *Common Problem Types*:
  - Finding subarrays that sum to k, or removing a subarray to make a sum divisible by a given value.

- *Example*:
  - Find the smallest subarray whose sum is divisible by a number p.

---

## 4. Practice Questions

### Easy Problems:

1. [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
2. [Buy Two Chocolates](https://leetcode.com/problems/buy-two-chocolates/)
3. [Count Elements with Maximum Frequency](https://leetcode.com/problems/count-elements-with-maximum-frequency/)
4. [Divide Array into Arrays with Max Difference](https://leetcode.com/problems/divide-array-into-arrays-with-max-difference/)
5. [Find Common Characters](https://leetcode.com/problems/find-common-characters/)
6. [Lemonade Change](https://leetcode.com/problems/lemonade-change/)
7. [Minimum Common Value](https://leetcode.com/problems/minimum-common-value/)

---

### Two-Pointer Problems:

1. [3Sum](https://leetcode.com/problems/3sum/)
2. [3Sum Closest](https://leetcode.com/problems/3sum-closest/)
3. [Longest Mountain in Array](https://leetcode.com/problems/longest-mountain-in-array/)
4. [Maximum Erasure Value](https://leetcode.com/problems/maximum-erasure-value/)
5. [Max Consecutive Ones II](https://leetcode.com/problems/max-consecutive-ones-ii/)

---

### Prefix Sum Problems:

1. [Contiguous Array](https://leetcode.com/problems/contiguous-array/)
2. [Continuous Subarray Sum](https://leetcode.com/problems/continuous-subarray-sum/)
3. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays)
4. [Find Pivot Index](https://leetcode.com/problems/find-pivot-index/)
5. [K-radius Subarray Averages](https://leetcode.com/problems/k-radius-subarray-averages/)

---

## 5. Let's Solve Some Problems:

### Leetcode Problems:

1. [Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
2. [Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)
3. [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/description/)
4. [Count Number of Nice Subarrays](https://leetcode.com/problems/count-number-of-nice-subarrays/description/)

### OA Problem:

1. LinkedIn - SDE Intern:
   - *Question*: Given a list of words, if any two adjacent characters in a word are equal, change one of them. Determine the minimum number of substitutions so the final string contains no adjacent equal characters.
   
   Example:  
   Input: ['add', 'boook', 'break']  
   Output: [1, 1, 0]

---

<!---LeetCode Topics Start-->
# LeetCode Topics
## Array
|  |
| ------- |
| [0001-two-sum](https://github.com/avnishsharma1209/DSA-Task/tree/master/0001-two-sum) |
| [0011-container-with-most-water](https://github.com/avnishsharma1209/DSA-Task/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/avnishsharma1209/DSA-Task/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/avnishsharma1209/DSA-Task/tree/master/0016-3sum-closest) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0027-remove-element](https://github.com/avnishsharma1209/DSA-Task/tree/master/0027-remove-element) |
| [0033-search-in-rotated-sorted-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0035-search-insert-position](https://github.com/avnishsharma1209/DSA-Task/tree/master/0035-search-insert-position) |
| [0039-combination-sum](https://github.com/avnishsharma1209/DSA-Task/tree/master/0039-combination-sum) |
| [0045-jump-game-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0045-jump-game-ii) |
| [0051-n-queens](https://github.com/avnishsharma1209/DSA-Task/tree/master/0051-n-queens) |
| [0053-maximum-subarray](https://github.com/avnishsharma1209/DSA-Task/tree/master/0053-maximum-subarray) |
| [0055-jump-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/0055-jump-game) |
| [0066-plus-one](https://github.com/avnishsharma1209/DSA-Task/tree/master/0066-plus-one) |
| [0073-set-matrix-zeroes](https://github.com/avnishsharma1209/DSA-Task/tree/master/0073-set-matrix-zeroes) |
| [0079-word-search](https://github.com/avnishsharma1209/DSA-Task/tree/master/0079-word-search) |
| [0088-merge-sorted-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0088-merge-sorted-array) |
| [0118-pascals-triangle](https://github.com/avnishsharma1209/DSA-Task/tree/master/0118-pascals-triangle) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/avnishsharma1209/DSA-Task/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0122-best-time-to-buy-and-sell-stock-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0122-best-time-to-buy-and-sell-stock-ii) |
| [0136-single-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0136-single-number) |
| [0152-maximum-product-subarray](https://github.com/avnishsharma1209/DSA-Task/tree/master/0152-maximum-product-subarray) |
| [0162-find-peak-element](https://github.com/avnishsharma1209/DSA-Task/tree/master/0162-find-peak-element) |
| [0169-majority-element](https://github.com/avnishsharma1209/DSA-Task/tree/master/0169-majority-element) |
| [0189-rotate-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0189-rotate-array) |
| [0217-contains-duplicate](https://github.com/avnishsharma1209/DSA-Task/tree/master/0217-contains-duplicate) |
| [0219-contains-duplicate-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0219-contains-duplicate-ii) |
| [0228-summary-ranges](https://github.com/avnishsharma1209/DSA-Task/tree/master/0228-summary-ranges) |
| [0268-missing-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0268-missing-number) |
| [0287-find-the-duplicate-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0287-find-the-duplicate-number) |
| [0442-find-all-duplicates-in-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0442-find-all-duplicates-in-an-array) |
| [0448-find-all-numbers-disappeared-in-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0448-find-all-numbers-disappeared-in-an-array) |
| [0455-assign-cookies](https://github.com/avnishsharma1209/DSA-Task/tree/master/0455-assign-cookies) |
| [0463-island-perimeter](https://github.com/avnishsharma1209/DSA-Task/tree/master/0463-island-perimeter) |
| [0485-max-consecutive-ones](https://github.com/avnishsharma1209/DSA-Task/tree/master/0485-max-consecutive-ones) |
| [0495-teemo-attacking](https://github.com/avnishsharma1209/DSA-Task/tree/master/0495-teemo-attacking) |
| [0496-next-greater-element-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/0496-next-greater-element-i) |
| [0561-array-partition](https://github.com/avnishsharma1209/DSA-Task/tree/master/0561-array-partition) |
| [0575-distribute-candies](https://github.com/avnishsharma1209/DSA-Task/tree/master/0575-distribute-candies) |
| [0594-longest-harmonious-subsequence](https://github.com/avnishsharma1209/DSA-Task/tree/master/0594-longest-harmonious-subsequence) |
| [0682-baseball-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/0682-baseball-game) |
| [0739-daily-temperatures](https://github.com/avnishsharma1209/DSA-Task/tree/master/0739-daily-temperatures) |
| [0747-min-cost-climbing-stairs](https://github.com/avnishsharma1209/DSA-Task/tree/master/0747-min-cost-climbing-stairs) |
| [0792-binary-search](https://github.com/avnishsharma1209/DSA-Task/tree/master/0792-binary-search) |
| [0875-longest-mountain-in-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0875-longest-mountain-in-array) |
| [0882-peak-index-in-a-mountain-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0882-peak-index-in-a-mountain-array) |
| [0890-lemonade-change](https://github.com/avnishsharma1209/DSA-Task/tree/master/0890-lemonade-change) |
| [0941-sort-array-by-parity](https://github.com/avnishsharma1209/DSA-Task/tree/master/0941-sort-array-by-parity) |
| [0948-sort-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0948-sort-an-array) |
| [0958-sort-array-by-parity-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0958-sort-array-by-parity-ii) |
| [0979-di-string-match](https://github.com/avnishsharma1209/DSA-Task/tree/master/0979-di-string-match) |
| [1001-n-repeated-element-in-size-2n-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/1001-n-repeated-element-in-size-2n-array) |
| [1044-find-common-characters](https://github.com/avnishsharma1209/DSA-Task/tree/master/1044-find-common-characters) |
| [1047-maximize-sum-of-array-after-k-negations](https://github.com/avnishsharma1209/DSA-Task/tree/master/1047-maximize-sum-of-array-after-k-negations) |
| [1137-height-checker](https://github.com/avnishsharma1209/DSA-Task/tree/master/1137-height-checker) |
| [1168-duplicate-zeros](https://github.com/avnishsharma1209/DSA-Task/tree/master/1168-duplicate-zeros) |
| [1505-create-target-array-in-the-given-order](https://github.com/avnishsharma1209/DSA-Task/tree/master/1505-create-target-array-in-the-given-order) |
| [1510-find-lucky-integer-in-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/1510-find-lucky-integer-in-an-array) |
| [1528-kids-with-the-greatest-number-of-candies](https://github.com/avnishsharma1209/DSA-Task/tree/master/1528-kids-with-the-greatest-number-of-candies) |
| [1560-number-of-students-doing-homework-at-a-given-time](https://github.com/avnishsharma1209/DSA-Task/tree/master/1560-number-of-students-doing-homework-at-a-given-time) |
| [1574-maximum-product-of-two-elements-in-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/1574-maximum-product-of-two-elements-in-an-array) |
| [1651-shuffle-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/1651-shuffle-string) |
| [1813-maximum-erasure-value](https://github.com/avnishsharma1209/DSA-Task/tree/master/1813-maximum-erasure-value) |
| [1878-check-if-array-is-sorted-and-rotated](https://github.com/avnishsharma1209/DSA-Task/tree/master/1878-check-if-array-is-sorted-and-rotated) |
| [1938-minimum-operations-to-make-the-array-increasing](https://github.com/avnishsharma1209/DSA-Task/tree/master/1938-minimum-operations-to-make-the-array-increasing) |
| [1951-find-the-winner-of-the-circular-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/1951-find-the-winner-of-the-circular-game) |
| [2048-build-array-from-permutation](https://github.com/avnishsharma1209/DSA-Task/tree/master/2048-build-array-from-permutation) |
| [2058-concatenation-of-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/2058-concatenation-of-array) |
| [2137-final-value-of-variable-after-performing-operations](https://github.com/avnishsharma1209/DSA-Task/tree/master/2137-final-value-of-variable-after-performing-operations) |
| [2144-maximum-difference-between-increasing-elements](https://github.com/avnishsharma1209/DSA-Task/tree/master/2144-maximum-difference-between-increasing-elements) |
| [2195-time-needed-to-buy-tickets](https://github.com/avnishsharma1209/DSA-Task/tree/master/2195-time-needed-to-buy-tickets) |
| [2211-k-radius-subarray-averages](https://github.com/avnishsharma1209/DSA-Task/tree/master/2211-k-radius-subarray-averages) |
| [2215-finding-3-digit-even-numbers](https://github.com/avnishsharma1209/DSA-Task/tree/master/2215-finding-3-digit-even-numbers) |
| [2265-partition-array-according-to-given-pivot](https://github.com/avnishsharma1209/DSA-Task/tree/master/2265-partition-array-according-to-given-pivot) |
| [2271-rearrange-array-elements-by-sign](https://github.com/avnishsharma1209/DSA-Task/tree/master/2271-rearrange-array-elements-by-sign) |
| [2551-apply-operations-to-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/2551-apply-operations-to-an-array) |
| [2634-minimum-common-value](https://github.com/avnishsharma1209/DSA-Task/tree/master/2634-minimum-common-value) |
| [2756-buy-two-chocolates](https://github.com/avnishsharma1209/DSA-Task/tree/master/2756-buy-two-chocolates) |
| [3241-divide-array-into-arrays-with-max-difference](https://github.com/avnishsharma1209/DSA-Task/tree/master/3241-divide-array-into-arrays-with-max-difference) |
| [3242-count-elements-with-maximum-frequency](https://github.com/avnishsharma1209/DSA-Task/tree/master/3242-count-elements-with-maximum-frequency) |
| [3321-type-of-triangle](https://github.com/avnishsharma1209/DSA-Task/tree/master/3321-type-of-triangle) |
| [3463-alternating-groups-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/3463-alternating-groups-i) |
| [3483-alternating-groups-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/3483-alternating-groups-ii) |
| [3651-transformed-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/3651-transformed-array) |
| [3747-maximum-difference-between-adjacent-elements-in-a-circular-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/3747-maximum-difference-between-adjacent-elements-in-a-circular-array) |
## Greedy
|  |
| ------- |
| [0011-container-with-most-water](https://github.com/avnishsharma1209/DSA-Task/tree/master/0011-container-with-most-water) |
| [0045-jump-game-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0045-jump-game-ii) |
| [0055-jump-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/0055-jump-game) |
| [0122-best-time-to-buy-and-sell-stock-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0122-best-time-to-buy-and-sell-stock-ii) |
| [0409-longest-palindrome](https://github.com/avnishsharma1209/DSA-Task/tree/master/0409-longest-palindrome) |
| [0455-assign-cookies](https://github.com/avnishsharma1209/DSA-Task/tree/master/0455-assign-cookies) |
| [0561-array-partition](https://github.com/avnishsharma1209/DSA-Task/tree/master/0561-array-partition) |
| [0890-lemonade-change](https://github.com/avnishsharma1209/DSA-Task/tree/master/0890-lemonade-change) |
| [0979-di-string-match](https://github.com/avnishsharma1209/DSA-Task/tree/master/0979-di-string-match) |
| [1047-maximize-sum-of-array-after-k-negations](https://github.com/avnishsharma1209/DSA-Task/tree/master/1047-maximize-sum-of-array-after-k-negations) |
| [1529-max-difference-you-can-get-from-changing-an-integer](https://github.com/avnishsharma1209/DSA-Task/tree/master/1529-max-difference-you-can-get-from-changing-an-integer) |
| [1938-minimum-operations-to-make-the-array-increasing](https://github.com/avnishsharma1209/DSA-Task/tree/master/1938-minimum-operations-to-make-the-array-increasing) |
| [2704-maximum-difference-by-remapping-a-digit](https://github.com/avnishsharma1209/DSA-Task/tree/master/2704-maximum-difference-by-remapping-a-digit) |
| [2756-buy-two-chocolates](https://github.com/avnishsharma1209/DSA-Task/tree/master/2756-buy-two-chocolates) |
| [3195-separate-black-and-white-balls](https://github.com/avnishsharma1209/DSA-Task/tree/master/3195-separate-black-and-white-balls) |
| [3241-divide-array-into-arrays-with-max-difference](https://github.com/avnishsharma1209/DSA-Task/tree/master/3241-divide-array-into-arrays-with-max-difference) |
## Sorting
|  |
| ------- |
| [0015-3sum](https://github.com/avnishsharma1209/DSA-Task/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/avnishsharma1209/DSA-Task/tree/master/0016-3sum-closest) |
| [0088-merge-sorted-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0088-merge-sorted-array) |
| [0169-majority-element](https://github.com/avnishsharma1209/DSA-Task/tree/master/0169-majority-element) |
| [0217-contains-duplicate](https://github.com/avnishsharma1209/DSA-Task/tree/master/0217-contains-duplicate) |
| [0242-valid-anagram](https://github.com/avnishsharma1209/DSA-Task/tree/master/0242-valid-anagram) |
| [0268-missing-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0268-missing-number) |
| [0455-assign-cookies](https://github.com/avnishsharma1209/DSA-Task/tree/master/0455-assign-cookies) |
| [0561-array-partition](https://github.com/avnishsharma1209/DSA-Task/tree/master/0561-array-partition) |
| [0594-longest-harmonious-subsequence](https://github.com/avnishsharma1209/DSA-Task/tree/master/0594-longest-harmonious-subsequence) |
| [0941-sort-array-by-parity](https://github.com/avnishsharma1209/DSA-Task/tree/master/0941-sort-array-by-parity) |
| [0948-sort-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0948-sort-an-array) |
| [0958-sort-array-by-parity-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0958-sort-array-by-parity-ii) |
| [1047-maximize-sum-of-array-after-k-negations](https://github.com/avnishsharma1209/DSA-Task/tree/master/1047-maximize-sum-of-array-after-k-negations) |
| [1137-height-checker](https://github.com/avnishsharma1209/DSA-Task/tree/master/1137-height-checker) |
| [1574-maximum-product-of-two-elements-in-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/1574-maximum-product-of-two-elements-in-an-array) |
| [2215-finding-3-digit-even-numbers](https://github.com/avnishsharma1209/DSA-Task/tree/master/2215-finding-3-digit-even-numbers) |
| [2756-buy-two-chocolates](https://github.com/avnishsharma1209/DSA-Task/tree/master/2756-buy-two-chocolates) |
| [3241-divide-array-into-arrays-with-max-difference](https://github.com/avnishsharma1209/DSA-Task/tree/master/3241-divide-array-into-arrays-with-max-difference) |
| [3321-type-of-triangle](https://github.com/avnishsharma1209/DSA-Task/tree/master/3321-type-of-triangle) |
## Two Pointers
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/avnishsharma1209/DSA-Task/tree/master/0005-longest-palindromic-substring) |
| [0011-container-with-most-water](https://github.com/avnishsharma1209/DSA-Task/tree/master/0011-container-with-most-water) |
| [0015-3sum](https://github.com/avnishsharma1209/DSA-Task/tree/master/0015-3sum) |
| [0016-3sum-closest](https://github.com/avnishsharma1209/DSA-Task/tree/master/0016-3sum-closest) |
| [0026-remove-duplicates-from-sorted-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0026-remove-duplicates-from-sorted-array) |
| [0027-remove-element](https://github.com/avnishsharma1209/DSA-Task/tree/master/0027-remove-element) |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
| [0088-merge-sorted-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0088-merge-sorted-array) |
| [0125-valid-palindrome](https://github.com/avnishsharma1209/DSA-Task/tree/master/0125-valid-palindrome) |
| [0151-reverse-words-in-a-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0151-reverse-words-in-a-string) |
| [0189-rotate-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0189-rotate-array) |
| [0202-happy-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0202-happy-number) |
| [0287-find-the-duplicate-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0287-find-the-duplicate-number) |
| [0344-reverse-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0344-reverse-string) |
| [0392-is-subsequence](https://github.com/avnishsharma1209/DSA-Task/tree/master/0392-is-subsequence) |
| [0455-assign-cookies](https://github.com/avnishsharma1209/DSA-Task/tree/master/0455-assign-cookies) |
| [0875-longest-mountain-in-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0875-longest-mountain-in-array) |
| [0908-middle-of-the-linked-list](https://github.com/avnishsharma1209/DSA-Task/tree/master/0908-middle-of-the-linked-list) |
| [0941-sort-array-by-parity](https://github.com/avnishsharma1209/DSA-Task/tree/master/0941-sort-array-by-parity) |
| [0958-sort-array-by-parity-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0958-sort-array-by-parity-ii) |
| [0979-di-string-match](https://github.com/avnishsharma1209/DSA-Task/tree/master/0979-di-string-match) |
| [1168-duplicate-zeros](https://github.com/avnishsharma1209/DSA-Task/tree/master/1168-duplicate-zeros) |
| [2265-partition-array-according-to-given-pivot](https://github.com/avnishsharma1209/DSA-Task/tree/master/2265-partition-array-according-to-given-pivot) |
| [2271-rearrange-array-elements-by-sign](https://github.com/avnishsharma1209/DSA-Task/tree/master/2271-rearrange-array-elements-by-sign) |
| [2551-apply-operations-to-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/2551-apply-operations-to-an-array) |
| [2634-minimum-common-value](https://github.com/avnishsharma1209/DSA-Task/tree/master/2634-minimum-common-value) |
| [3195-separate-black-and-white-balls](https://github.com/avnishsharma1209/DSA-Task/tree/master/3195-separate-black-and-white-balls) |
| [3683-find-the-lexicographically-largest-string-from-the-box-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/3683-find-the-lexicographically-largest-string-from-the-box-i) |
## String
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/avnishsharma1209/DSA-Task/tree/master/0005-longest-palindromic-substring) |
| [0012-integer-to-roman](https://github.com/avnishsharma1209/DSA-Task/tree/master/0012-integer-to-roman) |
| [0013-roman-to-integer](https://github.com/avnishsharma1209/DSA-Task/tree/master/0013-roman-to-integer) |
| [0014-longest-common-prefix](https://github.com/avnishsharma1209/DSA-Task/tree/master/0014-longest-common-prefix) |
| [0020-valid-parentheses](https://github.com/avnishsharma1209/DSA-Task/tree/master/0020-valid-parentheses) |
| [0022-generate-parentheses](https://github.com/avnishsharma1209/DSA-Task/tree/master/0022-generate-parentheses) |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
| [0038-count-and-say](https://github.com/avnishsharma1209/DSA-Task/tree/master/0038-count-and-say) |
| [0058-length-of-last-word](https://github.com/avnishsharma1209/DSA-Task/tree/master/0058-length-of-last-word) |
| [0067-add-binary](https://github.com/avnishsharma1209/DSA-Task/tree/master/0067-add-binary) |
| [0071-simplify-path](https://github.com/avnishsharma1209/DSA-Task/tree/master/0071-simplify-path) |
| [0072-edit-distance](https://github.com/avnishsharma1209/DSA-Task/tree/master/0072-edit-distance) |
| [0079-word-search](https://github.com/avnishsharma1209/DSA-Task/tree/master/0079-word-search) |
| [0125-valid-palindrome](https://github.com/avnishsharma1209/DSA-Task/tree/master/0125-valid-palindrome) |
| [0151-reverse-words-in-a-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0151-reverse-words-in-a-string) |
| [0168-excel-sheet-column-title](https://github.com/avnishsharma1209/DSA-Task/tree/master/0168-excel-sheet-column-title) |
| [0171-excel-sheet-column-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0171-excel-sheet-column-number) |
| [0205-isomorphic-strings](https://github.com/avnishsharma1209/DSA-Task/tree/master/0205-isomorphic-strings) |
| [0242-valid-anagram](https://github.com/avnishsharma1209/DSA-Task/tree/master/0242-valid-anagram) |
| [0290-word-pattern](https://github.com/avnishsharma1209/DSA-Task/tree/master/0290-word-pattern) |
| [0344-reverse-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0344-reverse-string) |
| [0383-ransom-note](https://github.com/avnishsharma1209/DSA-Task/tree/master/0383-ransom-note) |
| [0387-first-unique-character-in-a-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0387-first-unique-character-in-a-string) |
| [0392-is-subsequence](https://github.com/avnishsharma1209/DSA-Task/tree/master/0392-is-subsequence) |
| [0409-longest-palindrome](https://github.com/avnishsharma1209/DSA-Task/tree/master/0409-longest-palindrome) |
| [0459-repeated-substring-pattern](https://github.com/avnishsharma1209/DSA-Task/tree/master/0459-repeated-substring-pattern) |
| [0657-robot-return-to-origin](https://github.com/avnishsharma1209/DSA-Task/tree/master/0657-robot-return-to-origin) |
| [0979-di-string-match](https://github.com/avnishsharma1209/DSA-Task/tree/master/0979-di-string-match) |
| [1044-find-common-characters](https://github.com/avnishsharma1209/DSA-Task/tree/master/1044-find-common-characters) |
| [1250-longest-common-subsequence](https://github.com/avnishsharma1209/DSA-Task/tree/master/1250-longest-common-subsequence) |
| [1636-number-of-substrings-with-only-1s](https://github.com/avnishsharma1209/DSA-Task/tree/master/1636-number-of-substrings-with-only-1s) |
| [1651-shuffle-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/1651-shuffle-string) |
| [1737-maximum-nesting-depth-of-the-parentheses](https://github.com/avnishsharma1209/DSA-Task/tree/master/1737-maximum-nesting-depth-of-the-parentheses) |
| [1987-substrings-of-size-three-with-distinct-characters](https://github.com/avnishsharma1209/DSA-Task/tree/master/1987-substrings-of-size-three-with-distinct-characters) |
| [2137-final-value-of-variable-after-performing-operations](https://github.com/avnishsharma1209/DSA-Task/tree/master/2137-final-value-of-variable-after-performing-operations) |
| [3195-separate-black-and-white-balls](https://github.com/avnishsharma1209/DSA-Task/tree/master/3195-separate-black-and-white-balls) |
| [3617-find-the-original-typed-string-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/3617-find-the-original-typed-string-i) |
| [3683-find-the-lexicographically-largest-string-from-the-box-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/3683-find-the-lexicographically-largest-string-from-the-box-i) |
| [3753-maximum-difference-between-even-and-odd-frequency-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/3753-maximum-difference-between-even-and-odd-frequency-i) |
## Trie
|  |
| ------- |
| [0014-longest-common-prefix](https://github.com/avnishsharma1209/DSA-Task/tree/master/0014-longest-common-prefix) |
## Hash Table
|  |
| ------- |
| [0001-two-sum](https://github.com/avnishsharma1209/DSA-Task/tree/master/0001-two-sum) |
| [0012-integer-to-roman](https://github.com/avnishsharma1209/DSA-Task/tree/master/0012-integer-to-roman) |
| [0013-roman-to-integer](https://github.com/avnishsharma1209/DSA-Task/tree/master/0013-roman-to-integer) |
| [0073-set-matrix-zeroes](https://github.com/avnishsharma1209/DSA-Task/tree/master/0073-set-matrix-zeroes) |
| [0169-majority-element](https://github.com/avnishsharma1209/DSA-Task/tree/master/0169-majority-element) |
| [0202-happy-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0202-happy-number) |
| [0205-isomorphic-strings](https://github.com/avnishsharma1209/DSA-Task/tree/master/0205-isomorphic-strings) |
| [0217-contains-duplicate](https://github.com/avnishsharma1209/DSA-Task/tree/master/0217-contains-duplicate) |
| [0219-contains-duplicate-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0219-contains-duplicate-ii) |
| [0242-valid-anagram](https://github.com/avnishsharma1209/DSA-Task/tree/master/0242-valid-anagram) |
| [0268-missing-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0268-missing-number) |
| [0290-word-pattern](https://github.com/avnishsharma1209/DSA-Task/tree/master/0290-word-pattern) |
| [0383-ransom-note](https://github.com/avnishsharma1209/DSA-Task/tree/master/0383-ransom-note) |
| [0387-first-unique-character-in-a-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0387-first-unique-character-in-a-string) |
| [0409-longest-palindrome](https://github.com/avnishsharma1209/DSA-Task/tree/master/0409-longest-palindrome) |
| [0442-find-all-duplicates-in-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0442-find-all-duplicates-in-an-array) |
| [0448-find-all-numbers-disappeared-in-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0448-find-all-numbers-disappeared-in-an-array) |
| [0496-next-greater-element-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/0496-next-greater-element-i) |
| [0575-distribute-candies](https://github.com/avnishsharma1209/DSA-Task/tree/master/0575-distribute-candies) |
| [0594-longest-harmonious-subsequence](https://github.com/avnishsharma1209/DSA-Task/tree/master/0594-longest-harmonious-subsequence) |
| [1001-n-repeated-element-in-size-2n-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/1001-n-repeated-element-in-size-2n-array) |
| [1044-find-common-characters](https://github.com/avnishsharma1209/DSA-Task/tree/master/1044-find-common-characters) |
| [1510-find-lucky-integer-in-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/1510-find-lucky-integer-in-an-array) |
| [1813-maximum-erasure-value](https://github.com/avnishsharma1209/DSA-Task/tree/master/1813-maximum-erasure-value) |
| [1987-substrings-of-size-three-with-distinct-characters](https://github.com/avnishsharma1209/DSA-Task/tree/master/1987-substrings-of-size-three-with-distinct-characters) |
| [2215-finding-3-digit-even-numbers](https://github.com/avnishsharma1209/DSA-Task/tree/master/2215-finding-3-digit-even-numbers) |
| [2634-minimum-common-value](https://github.com/avnishsharma1209/DSA-Task/tree/master/2634-minimum-common-value) |
| [3242-count-elements-with-maximum-frequency](https://github.com/avnishsharma1209/DSA-Task/tree/master/3242-count-elements-with-maximum-frequency) |
| [3753-maximum-difference-between-even-and-odd-frequency-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/3753-maximum-difference-between-even-and-odd-frequency-i) |
## Counting
|  |
| ------- |
| [0169-majority-element](https://github.com/avnishsharma1209/DSA-Task/tree/master/0169-majority-element) |
| [0383-ransom-note](https://github.com/avnishsharma1209/DSA-Task/tree/master/0383-ransom-note) |
| [0387-first-unique-character-in-a-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0387-first-unique-character-in-a-string) |
| [0594-longest-harmonious-subsequence](https://github.com/avnishsharma1209/DSA-Task/tree/master/0594-longest-harmonious-subsequence) |
| [1510-find-lucky-integer-in-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/1510-find-lucky-integer-in-an-array) |
| [1987-substrings-of-size-three-with-distinct-characters](https://github.com/avnishsharma1209/DSA-Task/tree/master/1987-substrings-of-size-three-with-distinct-characters) |
| [3242-count-elements-with-maximum-frequency](https://github.com/avnishsharma1209/DSA-Task/tree/master/3242-count-elements-with-maximum-frequency) |
| [3753-maximum-difference-between-even-and-odd-frequency-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/3753-maximum-difference-between-even-and-odd-frequency-i) |
## String Matching
|  |
| ------- |
| [0028-find-the-index-of-the-first-occurrence-in-a-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0028-find-the-index-of-the-first-occurrence-in-a-string) |
| [0459-repeated-substring-pattern](https://github.com/avnishsharma1209/DSA-Task/tree/master/0459-repeated-substring-pattern) |
## Math
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/avnishsharma1209/DSA-Task/tree/master/0002-add-two-numbers) |
| [0012-integer-to-roman](https://github.com/avnishsharma1209/DSA-Task/tree/master/0012-integer-to-roman) |
| [0013-roman-to-integer](https://github.com/avnishsharma1209/DSA-Task/tree/master/0013-roman-to-integer) |
| [0050-powx-n](https://github.com/avnishsharma1209/DSA-Task/tree/master/0050-powx-n) |
| [0066-plus-one](https://github.com/avnishsharma1209/DSA-Task/tree/master/0066-plus-one) |
| [0067-add-binary](https://github.com/avnishsharma1209/DSA-Task/tree/master/0067-add-binary) |
| [0069-sqrtx](https://github.com/avnishsharma1209/DSA-Task/tree/master/0069-sqrtx) |
| [0070-climbing-stairs](https://github.com/avnishsharma1209/DSA-Task/tree/master/0070-climbing-stairs) |
| [0168-excel-sheet-column-title](https://github.com/avnishsharma1209/DSA-Task/tree/master/0168-excel-sheet-column-title) |
| [0171-excel-sheet-column-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0171-excel-sheet-column-number) |
| [0189-rotate-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0189-rotate-array) |
| [0202-happy-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0202-happy-number) |
| [0231-power-of-two](https://github.com/avnishsharma1209/DSA-Task/tree/master/0231-power-of-two) |
| [0263-ugly-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0263-ugly-number) |
| [0268-missing-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0268-missing-number) |
| [0292-nim-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/0292-nim-game) |
| [1013-fibonacci-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/1013-fibonacci-number) |
| [1086-divisor-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/1086-divisor-game) |
| [1529-max-difference-you-can-get-from-changing-an-integer](https://github.com/avnishsharma1209/DSA-Task/tree/master/1529-max-difference-you-can-get-from-changing-an-integer) |
| [1636-number-of-substrings-with-only-1s](https://github.com/avnishsharma1209/DSA-Task/tree/master/1636-number-of-substrings-with-only-1s) |
| [1642-water-bottles](https://github.com/avnishsharma1209/DSA-Task/tree/master/1642-water-bottles) |
| [1806-count-of-matches-in-tournament](https://github.com/avnishsharma1209/DSA-Task/tree/master/1806-count-of-matches-in-tournament) |
| [1951-find-the-winner-of-the-circular-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/1951-find-the-winner-of-the-circular-game) |
| [2704-maximum-difference-by-remapping-a-digit](https://github.com/avnishsharma1209/DSA-Task/tree/master/2704-maximum-difference-by-remapping-a-digit) |
| [3172-divisible-and-non-divisible-sums-difference](https://github.com/avnishsharma1209/DSA-Task/tree/master/3172-divisible-and-non-divisible-sums-difference) |
| [3321-type-of-triangle](https://github.com/avnishsharma1209/DSA-Task/tree/master/3321-type-of-triangle) |
| [3511-find-the-winning-player-in-coin-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/3511-find-the-winning-player-in-coin-game) |
## Dynamic Programming
|  |
| ------- |
| [0005-longest-palindromic-substring](https://github.com/avnishsharma1209/DSA-Task/tree/master/0005-longest-palindromic-substring) |
| [0022-generate-parentheses](https://github.com/avnishsharma1209/DSA-Task/tree/master/0022-generate-parentheses) |
| [0045-jump-game-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0045-jump-game-ii) |
| [0053-maximum-subarray](https://github.com/avnishsharma1209/DSA-Task/tree/master/0053-maximum-subarray) |
| [0055-jump-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/0055-jump-game) |
| [0070-climbing-stairs](https://github.com/avnishsharma1209/DSA-Task/tree/master/0070-climbing-stairs) |
| [0072-edit-distance](https://github.com/avnishsharma1209/DSA-Task/tree/master/0072-edit-distance) |
| [0118-pascals-triangle](https://github.com/avnishsharma1209/DSA-Task/tree/master/0118-pascals-triangle) |
| [0121-best-time-to-buy-and-sell-stock](https://github.com/avnishsharma1209/DSA-Task/tree/master/0121-best-time-to-buy-and-sell-stock) |
| [0122-best-time-to-buy-and-sell-stock-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0122-best-time-to-buy-and-sell-stock-ii) |
| [0152-maximum-product-subarray](https://github.com/avnishsharma1209/DSA-Task/tree/master/0152-maximum-product-subarray) |
| [0338-counting-bits](https://github.com/avnishsharma1209/DSA-Task/tree/master/0338-counting-bits) |
| [0392-is-subsequence](https://github.com/avnishsharma1209/DSA-Task/tree/master/0392-is-subsequence) |
| [0747-min-cost-climbing-stairs](https://github.com/avnishsharma1209/DSA-Task/tree/master/0747-min-cost-climbing-stairs) |
| [0875-longest-mountain-in-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0875-longest-mountain-in-array) |
| [1013-fibonacci-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/1013-fibonacci-number) |
| [1086-divisor-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/1086-divisor-game) |
| [1250-longest-common-subsequence](https://github.com/avnishsharma1209/DSA-Task/tree/master/1250-longest-common-subsequence) |
## Enumeration
|  |
| ------- |
| [0875-longest-mountain-in-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0875-longest-mountain-in-array) |
| [2215-finding-3-digit-even-numbers](https://github.com/avnishsharma1209/DSA-Task/tree/master/2215-finding-3-digit-even-numbers) |
| [3683-find-the-lexicographically-largest-string-from-the-box-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/3683-find-the-lexicographically-largest-string-from-the-box-i) |
## Sliding Window
|  |
| ------- |
| [0219-contains-duplicate-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/0219-contains-duplicate-ii) |
| [0594-longest-harmonious-subsequence](https://github.com/avnishsharma1209/DSA-Task/tree/master/0594-longest-harmonious-subsequence) |
| [1813-maximum-erasure-value](https://github.com/avnishsharma1209/DSA-Task/tree/master/1813-maximum-erasure-value) |
| [1987-substrings-of-size-three-with-distinct-characters](https://github.com/avnishsharma1209/DSA-Task/tree/master/1987-substrings-of-size-three-with-distinct-characters) |
| [2211-k-radius-subarray-averages](https://github.com/avnishsharma1209/DSA-Task/tree/master/2211-k-radius-subarray-averages) |
| [3463-alternating-groups-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/3463-alternating-groups-i) |
| [3483-alternating-groups-ii](https://github.com/avnishsharma1209/DSA-Task/tree/master/3483-alternating-groups-ii) |
## Binary Search
|  |
| ------- |
| [0033-search-in-rotated-sorted-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0033-search-in-rotated-sorted-array) |
| [0034-find-first-and-last-position-of-element-in-sorted-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0034-find-first-and-last-position-of-element-in-sorted-array) |
| [0035-search-insert-position](https://github.com/avnishsharma1209/DSA-Task/tree/master/0035-search-insert-position) |
| [0069-sqrtx](https://github.com/avnishsharma1209/DSA-Task/tree/master/0069-sqrtx) |
| [0162-find-peak-element](https://github.com/avnishsharma1209/DSA-Task/tree/master/0162-find-peak-element) |
| [0222-count-complete-tree-nodes](https://github.com/avnishsharma1209/DSA-Task/tree/master/0222-count-complete-tree-nodes) |
| [0268-missing-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0268-missing-number) |
| [0287-find-the-duplicate-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0287-find-the-duplicate-number) |
| [0792-binary-search](https://github.com/avnishsharma1209/DSA-Task/tree/master/0792-binary-search) |
| [0882-peak-index-in-a-mountain-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0882-peak-index-in-a-mountain-array) |
| [2634-minimum-common-value](https://github.com/avnishsharma1209/DSA-Task/tree/master/2634-minimum-common-value) |
## Recursion
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/avnishsharma1209/DSA-Task/tree/master/0002-add-two-numbers) |
| [0050-powx-n](https://github.com/avnishsharma1209/DSA-Task/tree/master/0050-powx-n) |
| [0206-reverse-linked-list](https://github.com/avnishsharma1209/DSA-Task/tree/master/0206-reverse-linked-list) |
| [0231-power-of-two](https://github.com/avnishsharma1209/DSA-Task/tree/master/0231-power-of-two) |
| [1013-fibonacci-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/1013-fibonacci-number) |
| [1951-find-the-winner-of-the-circular-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/1951-find-the-winner-of-the-circular-game) |
## Depth-First Search
|  |
| ------- |
| [0463-island-perimeter](https://github.com/avnishsharma1209/DSA-Task/tree/master/0463-island-perimeter) |
## Breadth-First Search
|  |
| ------- |
| [0463-island-perimeter](https://github.com/avnishsharma1209/DSA-Task/tree/master/0463-island-perimeter) |
## Matrix
|  |
| ------- |
| [0073-set-matrix-zeroes](https://github.com/avnishsharma1209/DSA-Task/tree/master/0073-set-matrix-zeroes) |
| [0079-word-search](https://github.com/avnishsharma1209/DSA-Task/tree/master/0079-word-search) |
| [0463-island-perimeter](https://github.com/avnishsharma1209/DSA-Task/tree/master/0463-island-perimeter) |
## Linked List
|  |
| ------- |
| [0002-add-two-numbers](https://github.com/avnishsharma1209/DSA-Task/tree/master/0002-add-two-numbers) |
| [0083-remove-duplicates-from-sorted-list](https://github.com/avnishsharma1209/DSA-Task/tree/master/0083-remove-duplicates-from-sorted-list) |
| [0206-reverse-linked-list](https://github.com/avnishsharma1209/DSA-Task/tree/master/0206-reverse-linked-list) |
| [0908-middle-of-the-linked-list](https://github.com/avnishsharma1209/DSA-Task/tree/master/0908-middle-of-the-linked-list) |
## Stack
|  |
| ------- |
| [0020-valid-parentheses](https://github.com/avnishsharma1209/DSA-Task/tree/master/0020-valid-parentheses) |
| [0071-simplify-path](https://github.com/avnishsharma1209/DSA-Task/tree/master/0071-simplify-path) |
| [0225-implement-stack-using-queues](https://github.com/avnishsharma1209/DSA-Task/tree/master/0225-implement-stack-using-queues) |
| [0496-next-greater-element-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/0496-next-greater-element-i) |
| [0682-baseball-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/0682-baseball-game) |
| [0739-daily-temperatures](https://github.com/avnishsharma1209/DSA-Task/tree/master/0739-daily-temperatures) |
| [1737-maximum-nesting-depth-of-the-parentheses](https://github.com/avnishsharma1209/DSA-Task/tree/master/1737-maximum-nesting-depth-of-the-parentheses) |
## Bit Manipulation
|  |
| ------- |
| [0067-add-binary](https://github.com/avnishsharma1209/DSA-Task/tree/master/0067-add-binary) |
| [0136-single-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0136-single-number) |
| [0222-count-complete-tree-nodes](https://github.com/avnishsharma1209/DSA-Task/tree/master/0222-count-complete-tree-nodes) |
| [0231-power-of-two](https://github.com/avnishsharma1209/DSA-Task/tree/master/0231-power-of-two) |
| [0268-missing-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0268-missing-number) |
| [0287-find-the-duplicate-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/0287-find-the-duplicate-number) |
| [0338-counting-bits](https://github.com/avnishsharma1209/DSA-Task/tree/master/0338-counting-bits) |
## Backtracking
|  |
| ------- |
| [0022-generate-parentheses](https://github.com/avnishsharma1209/DSA-Task/tree/master/0022-generate-parentheses) |
| [0039-combination-sum](https://github.com/avnishsharma1209/DSA-Task/tree/master/0039-combination-sum) |
| [0051-n-queens](https://github.com/avnishsharma1209/DSA-Task/tree/master/0051-n-queens) |
| [0079-word-search](https://github.com/avnishsharma1209/DSA-Task/tree/master/0079-word-search) |
## Divide and Conquer
|  |
| ------- |
| [0053-maximum-subarray](https://github.com/avnishsharma1209/DSA-Task/tree/master/0053-maximum-subarray) |
| [0169-majority-element](https://github.com/avnishsharma1209/DSA-Task/tree/master/0169-majority-element) |
| [0948-sort-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0948-sort-an-array) |
## Design
|  |
| ------- |
| [0225-implement-stack-using-queues](https://github.com/avnishsharma1209/DSA-Task/tree/master/0225-implement-stack-using-queues) |
## Queue
|  |
| ------- |
| [0225-implement-stack-using-queues](https://github.com/avnishsharma1209/DSA-Task/tree/master/0225-implement-stack-using-queues) |
| [0387-first-unique-character-in-a-string](https://github.com/avnishsharma1209/DSA-Task/tree/master/0387-first-unique-character-in-a-string) |
| [1951-find-the-winner-of-the-circular-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/1951-find-the-winner-of-the-circular-game) |
| [2195-time-needed-to-buy-tickets](https://github.com/avnishsharma1209/DSA-Task/tree/master/2195-time-needed-to-buy-tickets) |
## Tree
|  |
| ------- |
| [0222-count-complete-tree-nodes](https://github.com/avnishsharma1209/DSA-Task/tree/master/0222-count-complete-tree-nodes) |
## Binary Tree
|  |
| ------- |
| [0222-count-complete-tree-nodes](https://github.com/avnishsharma1209/DSA-Task/tree/master/0222-count-complete-tree-nodes) |
## Simulation
|  |
| ------- |
| [0067-add-binary](https://github.com/avnishsharma1209/DSA-Task/tree/master/0067-add-binary) |
| [0495-teemo-attacking](https://github.com/avnishsharma1209/DSA-Task/tree/master/0495-teemo-attacking) |
| [0657-robot-return-to-origin](https://github.com/avnishsharma1209/DSA-Task/tree/master/0657-robot-return-to-origin) |
| [0682-baseball-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/0682-baseball-game) |
| [1505-create-target-array-in-the-given-order](https://github.com/avnishsharma1209/DSA-Task/tree/master/1505-create-target-array-in-the-given-order) |
| [1642-water-bottles](https://github.com/avnishsharma1209/DSA-Task/tree/master/1642-water-bottles) |
| [1806-count-of-matches-in-tournament](https://github.com/avnishsharma1209/DSA-Task/tree/master/1806-count-of-matches-in-tournament) |
| [1951-find-the-winner-of-the-circular-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/1951-find-the-winner-of-the-circular-game) |
| [2048-build-array-from-permutation](https://github.com/avnishsharma1209/DSA-Task/tree/master/2048-build-array-from-permutation) |
| [2058-concatenation-of-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/2058-concatenation-of-array) |
| [2137-final-value-of-variable-after-performing-operations](https://github.com/avnishsharma1209/DSA-Task/tree/master/2137-final-value-of-variable-after-performing-operations) |
| [2195-time-needed-to-buy-tickets](https://github.com/avnishsharma1209/DSA-Task/tree/master/2195-time-needed-to-buy-tickets) |
| [2265-partition-array-according-to-given-pivot](https://github.com/avnishsharma1209/DSA-Task/tree/master/2265-partition-array-according-to-given-pivot) |
| [2271-rearrange-array-elements-by-sign](https://github.com/avnishsharma1209/DSA-Task/tree/master/2271-rearrange-array-elements-by-sign) |
| [2551-apply-operations-to-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/2551-apply-operations-to-an-array) |
| [3511-find-the-winning-player-in-coin-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/3511-find-the-winning-player-in-coin-game) |
| [3651-transformed-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/3651-transformed-array) |
## Counting Sort
|  |
| ------- |
| [0561-array-partition](https://github.com/avnishsharma1209/DSA-Task/tree/master/0561-array-partition) |
| [0948-sort-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0948-sort-an-array) |
| [1137-height-checker](https://github.com/avnishsharma1209/DSA-Task/tree/master/1137-height-checker) |
## Heap (Priority Queue)
|  |
| ------- |
| [0948-sort-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0948-sort-an-array) |
| [1574-maximum-product-of-two-elements-in-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/1574-maximum-product-of-two-elements-in-an-array) |
## Merge Sort
|  |
| ------- |
| [0948-sort-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0948-sort-an-array) |
## Bucket Sort
|  |
| ------- |
| [0948-sort-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0948-sort-an-array) |
## Radix Sort
|  |
| ------- |
| [0948-sort-an-array](https://github.com/avnishsharma1209/DSA-Task/tree/master/0948-sort-an-array) |
## Memoization
|  |
| ------- |
| [0070-climbing-stairs](https://github.com/avnishsharma1209/DSA-Task/tree/master/0070-climbing-stairs) |
| [1013-fibonacci-number](https://github.com/avnishsharma1209/DSA-Task/tree/master/1013-fibonacci-number) |
## Brainteaser
|  |
| ------- |
| [0292-nim-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/0292-nim-game) |
| [1086-divisor-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/1086-divisor-game) |
## Game Theory
|  |
| ------- |
| [0292-nim-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/0292-nim-game) |
| [1086-divisor-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/1086-divisor-game) |
| [3511-find-the-winning-player-in-coin-game](https://github.com/avnishsharma1209/DSA-Task/tree/master/3511-find-the-winning-player-in-coin-game) |
## Monotonic Stack
|  |
| ------- |
| [0496-next-greater-element-i](https://github.com/avnishsharma1209/DSA-Task/tree/master/0496-next-greater-element-i) |
| [0739-daily-temperatures](https://github.com/avnishsharma1209/DSA-Task/tree/master/0739-daily-temperatures) |
<!---LeetCode Topics End-->