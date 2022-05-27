let x = 5;
print(x);
// onetosix(x);
// expected output

// 5
// 4
// 3
// 2
// 1

// 1
// 2
// 3
// 4
// 5

function print(x) {
  if (x == 0) {
    return;
  }
  console.log(x);
  print(x - 1);

  print(x - 1);
  console.log(x);
}
