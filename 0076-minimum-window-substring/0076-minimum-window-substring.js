/**
 * @param {string} s
 * @param {string} t
 * @return {string}
 */
var minWindow = function(s, t) {
    let lettersSeen = {};
  let lettersNeeded = {};
  let lettersMissing = 0;

  for(let i = 0; i < t.length; i++) {
    if(t[i] in lettersNeeded){
      lettersNeeded[t[i]] += 1;
    } else {
      lettersNeeded[t[i]] = 1;
      lettersSeen[t[i]] = 0;
      lettersMissing += 1;
    }
  }

  let fast = 0;
  let slow = 0;

  let result = [-Infinity, Infinity];

  for(fast; fast < s.length; fast++) {

    if(s[fast] in lettersNeeded) {
      lettersSeen[s[fast]] += 1;
      if(lettersSeen[s[fast]] === lettersNeeded[s[fast]]) {
        lettersMissing -= 1;
      }
    }
    
    while(lettersMissing === 0) {
      if(fast - slow < result[1] - result[0]) {
        result[0] = slow
        result[1] = fast
      }
      if(s[slow] in lettersNeeded) {
        lettersSeen[s[slow]] -= 1;
        if(lettersSeen[s[slow]] < lettersNeeded[s[slow]]) {
          lettersMissing += 1;
        }
      }

      slow++;
    }
  }

  return result[0] === -Infinity ? "" : s.slice(result[0], result[1] + 1);
};