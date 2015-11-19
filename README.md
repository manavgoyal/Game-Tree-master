Network_Project
===============
This is a CS61B class project assigned by professor Jonathan Shewchuk in Spring '14.

It is to develop multiple strategies to win the game: Network. The goal of this project is to implement a MachinePlayer class that plays Network well. One subtask was to write a method that identifies legal moves; another subtask was to write a method that finds a move that is likely to win the game. The MachinePlayer class is in the player package and extends the abstract
Player class, which defines the game play methods. This project requires the implementation of the minimax algorithm for searching game trees and the implementation Alpha-beta search "pruning" to give a significant speed up compared to naive tree search. 

Description of Network:
Each player tries to complete a "network" joining its two goal areas. A network is a sequence of six or more chips that starts in one of the player’s goal areas and terminates in the other. Each consecutive pair of chips in the sequence are connected to each other along straight lines, either orthogonally (left, right, up, down) or diagonally. For more on the Network game read the project description by following the rep link.



