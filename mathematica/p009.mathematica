(* 
 * Solution to Project Euler problem 9
 * by Project Nayuki
 * 
 * https://www.nayuki.io/page/project-euler-solutions
 * https://github.com/nayuki/Project-Euler-solutions
 *)


(* Computers are fast, so we can implement a brute-force search to directly solve the problem. *)
For[a = 1, a <= 1000, a++,
  For[b = a + 1, b <= 1000, b++,
    Block[{c = 1000 - a - b},
      If[a <= b <= c && a^2 + b^2 == c^2,
        (* It is now implied that b < c, because we have a > 0 *)
        Print[a, " ", b, " ", c, " ", a * b * c]]]]]
