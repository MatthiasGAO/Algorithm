/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 * This algorithm used second part of merge sort.
 */
let merge = function (nums1, m, nums2, n) {
    let tempNums = [];
    
    let i = 0;
    let j = 0;
    let k = 0;

    while (i < m && j < n) {
        if (nums1[i] >= nums2[j]) {
            tempNums[k] = nums2[j];
            j++;
        } else { 
            tempNums[k] = nums1[i];
            i++;
        }
        k++;
    }
    
    if (i < m) {
        for (i; i < m; i++) { 
            tempNums[k] = nums1[i];
            k++;
        }
    }

    if (j < n) {
        for (j; j < n; j++) { 
            tempNums[k] = nums2[j];
            k++;
        }
    }

    for (i = 0; i < m + n; i++) { 
        nums1[i] = tempNums[i];
    }
    
};

nums1 = [1, 2, 3, 0, 0, 0];
merge(nums1, 3, [2, 5, 6], 3);
console.log(nums1);


