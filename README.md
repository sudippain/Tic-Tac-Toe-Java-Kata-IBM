# # Tic-Tac-Toe-Java

## Problem Statement

Tic-tac-toe, noughts and crosses or Xs and Os, is a paper-and-pencil game for two players, X and O, who take turns marking the spaces in a 3×3 grid.
The player who succeeds in placing three of their marks in a diagonal, horizontal, or vertical row is the winner.
It is a solved game with a forced draw assuming best play from both players. Since we are using bot for both players in this problem and we are covering all edge cases and strategies, the match will be draw.


## Modules

-  TicTacToe- should be able to manage two player and follow some strategies.

## Tech Stack
- java 8
- maven 3.6.0
- CI (Gitlab Runner)
- Docker

## IDE
- Spring Tool Suite(STS)

## Input:
Preference symbol for User: (X or O)

Output:
Result of the match



Sample:

Do you want to be CROSS or NOUGHT? Please type 'X' or '0'? 0

Please select cells according to the following numbers:

1 | 2 | 3
---+---+---
4 | 5 | 6
---+---+---
7 | 8 | 9

Current state of the game:

  |   |  
---+---+---
  |   |  
---+---+---
  |   |  

Next player is CROSS

X |   |  
---+---+---
  |   |  
---+---+---
  |   |  

Next player is NOUGHT
Choose an empty cell between 1 and 9  >>>   2
X | 0 |  
---+---+---
  |   |  
---+---+---
  |   |  

Next player is CROSS

X | 0 |  
---+---+---
  |   |  
---+---+---
  |   | X

Next player is NOUGHT
Choose an empty cell between 1 and 9  >>>   5
X | 0 |  
---+---+---
  | 0 |  
---+---+---
  |   | X

Next player is CROSS

X | 0 |  
---+---+---
  | 0 |  
---+---+---
  | X | X

Next player is NOUGHT
Choose an empty cell between 1 and 9  >>>   7
X | 0 |  
---+---+---
  | 0 |  
---+---+---
0 | X | X

Next player is CROSS

X | 0 | X
---+---+---
  | 0 |  
---+---+---
0 | X | X

Next player is NOUGHT
Choose an empty cell between 1 and 9  >>>   6
X | 0 | X
---+---+---
  | 0 | 0
---+---+---
0 | X | X

Next player is CROSS

X | 0 | X
---+---+---
X | 0 | 0
---+---+---
0 | X | X 



## Docker :
Build your image:

docker build -t imageName .
Now invoke your program inside a container:

docker run --name myProgram imageName