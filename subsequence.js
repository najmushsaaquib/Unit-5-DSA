let s1 = "abc"; 
let s2 = "defajbceeeg";

function sub(s1, s2) {
  if (s2.length < s1.length) {
    console.log("NO");
    return;
  }

  let count = 0;
  var i = 0;
  var j = 0;
  while (i < s1.length && j < s2.length) {
    if (s1[i] === s2[j]) {
      i++;
      count++;
    }

    j++;
  }

  count === s1.length ? console.log("YES") : console.log("No");
}

sub(s1, s2);
