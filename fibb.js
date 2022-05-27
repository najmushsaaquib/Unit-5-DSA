console.log(group(7, [1]));
function group(n, arr) {
  if (n == 1) return arr;

  let ans = [];
  let count = 1;
  let data = arr[0];
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] == arr[i + 1]) {
      count++;
    } else {
      data = arr[i];
      ans.push(count);
      ans.push(data);
      count = 1;
    }
  }
  arr = ans;
  return group(n - 1, arr);
}

