/**
 * @param {number[]} array 
 */
function mergeSort(array) { 
    let length = array.length;
    let tempArr = [length];
    sort(array, 0, length, tempArr);
}

/**
 * @param {number[]} array 
 * @param {number} start 
 * @param {number} end
 * @param {number[]} tempArr
 */
function sort(array, start, end, tempArr) {
    
    if ((end - start) > 1) { 
        let mid = Math.floor((start + end) / 2); // 向下取整
        sort(array, start, mid, tempArr); // sort left half of array
        sort(array, mid, end, tempArr); // sort right half of array
        merge(array, start, mid, end, tempArr);
    }
}

/**
 * 
 * @param {number[]} array 
 * @param {number} start 
 * @param {number} mid 
 * @param {number} end 
 * @param {number[]} tempArr 
 */
function merge(array, start, mid, end, tempArr) {
    
    let i = start;
    let j = mid;
    let k = 0;

    while (i < mid && j < end) {
        if (array[i] >= array[j]) {
            tempArr[k] = array[j];
            j++;
        } else {
            tempArr[k] = array[i];
            i++;
        }
        k++;
    }

    if (i < mid) {
        for (i; i < mid; i++) {
            tempArr[k] = array[i];
            k++;
        }
    }

    if (j < end) {
        for (j; j < end; j++) {
            tempArr[k] = array[j];
            k++;
        }
    }

    k = 0;
    while (start < end) { 
        array[start++] = tempArr[k++];
    }
}

let testArr = [9, 8, 7, 6, 5, 4, 3, 2, 1]
mergeSort(testArr);
console.log(testArr);