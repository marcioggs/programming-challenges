package com.marcioggs.codility.trainings.exercise2.dwarfsrafting;

/**
 * A company of dwarfs is travelling across the New Zealand. On reaching the Clutha River the dwarfs need to get across, but recent storms have washed away the bridge. Luckily, a small ferry, in the form of a square raft, is operating.
 * <p>
 * The raft is square and has N rows of seats, numbered from 1 to N. Each row contains N seats, labeled with consecutive letters (A, B, C, etc.). Each seat is identified by a string composed of its row number followed by its column number; for example, "9C" denotes the third seat in the 9th row.
 * <p>
 * The raft has already been loaded with barrels in some seat positions, and other seats are already occupied by dwarfs. Our company of dwarfs may only take the remaining unoccupied seats. The ferryman wants to accommodate as many dwarfs as possible, but the raft needs to be stable when making the crossing. That is, the following conditions must be satisfied:
 * <p>
 * the front and back halves of the raft (in terms of the rows of seats) must each contain the same number of dwarfs;
 * similarly, the left and right sides of the raft (in terms of the columns of seats) must each contain the same number of dwarfs.
 * You do not have to worry about balancing the barrels; you can assume that their weights are negligible.
 * <p>
 * For example, a raft of size N = 4 is shown in the following illustration:
 * <p>
 * <p>
 * <p>
 * Barrels are marked as brown squares, and seats that are already occupied by dwarfs are labeled d.
 * <p>
 * The positions of the barrels are given in string S. The occupied seat numbers are given in string T. The contents of the strings are separated by single spaces and may appear in any order. For example, in the diagram above, S = "1B 1C 4B 1D 2A" and T = "3B 2D".
 * <p>
 * In this example, the ferryman can accommodate at most six more dwarfs, as indicated by the green squares in the following diagram:
 * <p>
 * <p>
 * <p>
 * The raft is then balanced: both left and right halves have the same number of dwarfs (four), and both front and back halves have the same number of dwarfs (also four).
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int N, String S, String T); }
 * <p>
 * that, given the size of the raft N and two strings S, T that describes the positions of barrels and occupied seats, respectively, returns the maximum number of dwarfs that can fit on the raft. If it is not possible to balance the raft with dwarfs, your function should return -1.
 * <p>
 * For instance, given N = 4, S = "1B 1C 4B 1D 2A" and T = "3B 2D", your function should return 6, as explained above.
 * <p>
 * Assume that:
 * <p>
 * N is an even integer within the range [2..26];
 * strings S, T consist of valid seat numbers, separated with spaces;
 * each seat number can appear no more than once in the strings;
 * no seat number can appear in both S and T simultaneously.
 * In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.
 * <p>
 * Copyright 2009–2022 by Codility Limited. All Rights Reserved. Unauthorized copying, publication or disclosure prohibited.
 *
 * <a href="https://app.codility.com/programmers/trainings/2/dwarfs_rafting/">Codility</a>
 */
public class Solution {

    /**
     * The important aspect is that the opposite diagonal raft quadrants must have the same number of dwarfs.
     *
     * @param raftSideSize    Raft size
     * @param barrelPositions Barrels positions
     * @param dwarfsPositions Drwarfs positions
     * @return Max dwarfs to add
     */
    public int solution(int raftSideSize, String barrelPositions, String dwarfsPositions) {

        if (raftSideSize < 2 || raftSideSize % 2 == 1 || barrelPositions == null || dwarfsPositions == null) {
            return -1;
        }

        Quadrant[] quadrants = this.getQuadrants(raftSideSize, barrelPositions, dwarfsPositions);

        if (this.quadrantHasMoreOccupancyThanSeats(quadrants[0]) ||
                this.quadrantHasMoreOccupancyThanSeats(quadrants[1]) ||
                this.quadrantHasMoreOccupancyThanSeats(quadrants[2]) ||
                this.quadrantHasMoreOccupancyThanSeats(quadrants[3])) {
            return -1;
        }


        if (this.quadrantHasMoreDwarfsOccupancyThanSeatsAvailableForDwarfsInTheOther(quadrants[0], quadrants[3]) ||
                this.quadrantHasMoreDwarfsOccupancyThanSeatsAvailableForDwarfsInTheOther(quadrants[3], quadrants[0]) ||
                this.quadrantHasMoreDwarfsOccupancyThanSeatsAvailableForDwarfsInTheOther(quadrants[1], quadrants[2]) ||
                this.quadrantHasMoreDwarfsOccupancyThanSeatsAvailableForDwarfsInTheOther(quadrants[2], quadrants[1])) {
            return -1;
        }

        int totalDwarfsPossibleInQuadrants0or3 = Math.min(quadrants[0].totalSeatsForDwarfs, quadrants[3].totalSeatsForDwarfs);
        int totalDwarfsPossibleInQuadrants1or2 = Math.min(quadrants[1].totalSeatsForDwarfs, quadrants[2].totalSeatsForDwarfs);

        int dwarfsToAddInQuadrant0 = totalDwarfsPossibleInQuadrants0or3 - quadrants[0].dwarfsNumber;
        int dwarfsToAddInQuadrant1 = totalDwarfsPossibleInQuadrants1or2 - quadrants[1].dwarfsNumber;
        int dwarfsToAddInQuadrant2 = totalDwarfsPossibleInQuadrants1or2 - quadrants[2].dwarfsNumber;
        int dwarfsToAddInQuadrant3 = totalDwarfsPossibleInQuadrants0or3 - quadrants[3].dwarfsNumber;

        return dwarfsToAddInQuadrant0 + dwarfsToAddInQuadrant1 + dwarfsToAddInQuadrant2 + dwarfsToAddInQuadrant3;
    }

    private static class Quadrant {
        int totalSeats;
        int totalSeatsForDwarfs;
        int dwarfsNumber;
        int barrelsNumber;

        Quadrant(int totalSeats) {
            this.totalSeats = totalSeats;
            this.totalSeatsForDwarfs = totalSeats;
        }
    }

    /**
     * Quadrants order:
     * <p>
     * 0   |  1
     * ----|------
     * 2   |  3
     *
     * @param raftSideSize    Raft side size
     * @param barrelPositions Barrel positions
     * @param dwarfsPositions Dwarfs positions
     * @return quadrants
     */
    private Quadrant[] getQuadrants(int raftSideSize, String barrelPositions, String dwarfsPositions) {

        int seatsPerQuadrant = raftSideSize * raftSideSize / 4;

        Quadrant quadrant0 = new Quadrant(seatsPerQuadrant);
        Quadrant quadrant1 = new Quadrant(seatsPerQuadrant);
        Quadrant quadrant2 = new Quadrant(seatsPerQuadrant);
        Quadrant quadrant3 = new Quadrant(seatsPerQuadrant);

        Quadrant[] quadrants = new Quadrant[]{quadrant0, quadrant1, quadrant2, quadrant3};

        if (!barrelPositions.equals("")) {
            for (String barrelPosition : barrelPositions.split(" ")) {
                int quadrantNumber = this.getQuadrantNumber(barrelPosition, raftSideSize);
                quadrants[quadrantNumber].barrelsNumber++;
                quadrants[quadrantNumber].totalSeatsForDwarfs--;
            }
        }

        if (!dwarfsPositions.equals("")) {
            for (String dwarfPosition : dwarfsPositions.split(" ")) {
                int quadrantNumber = this.getQuadrantNumber(dwarfPosition, raftSideSize);
                quadrants[quadrantNumber].dwarfsNumber++;
            }
        }

        return quadrants;
    }

    private int getQuadrantNumber(String position, int raftSideSize) {
        int quadrantNumber;
        int row = Integer.parseInt(position.replaceAll("\\D+", ""));
        int col = position.replaceAll("\\d+", "").toLowerCase().charAt(0) - 'a' + 1;

        if (row <= raftSideSize / 2) {
            if (col <= raftSideSize / 2) {
                quadrantNumber = 0;
            } else {
                quadrantNumber = 1;
            }
        } else {
            if (col <= raftSideSize / 2) {
                quadrantNumber = 2;
            } else {
                quadrantNumber = 3;
            }
        }

        return quadrantNumber;
    }

    private boolean quadrantHasMoreOccupancyThanSeats(Quadrant quadrant) {
        return quadrant.totalSeatsForDwarfs - quadrant.dwarfsNumber < 0;
    }

    private boolean quadrantHasMoreDwarfsOccupancyThanSeatsAvailableForDwarfsInTheOther(Quadrant firstQuadrant, Quadrant secondQuadrant) {
        return firstQuadrant.dwarfsNumber > secondQuadrant.totalSeatsForDwarfs;
    }

}
