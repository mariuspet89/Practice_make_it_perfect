package Interviu;

import java.util.*;


public class Solution {

    public static void main1(String[] args) {
        List<Integer> arrival = Arrays.asList(1, 2, 4, 8, 9);
        List<Integer> burstTime = Arrays.asList(2, 7, 9, 4, 5);


        int numberToBeFound = 3;


      }

// Function to print load on each server
        static void printLoadOnEachServer(int m, int[] loadOnServer) {

            // Traverse the loadOnServer and
            // print each loads
            for (int i = 0; i < m; i++) {
                System.out.println((i + 1) + "st Server -> " + loadOnServer[i] + ".");
            }
        }

        // Function for finding the load
        // on each server
        static void loadBalancing(int n, int m, int[] arrivalTime, int[] processTime) {

            // Stores the load on each Server
            int[] loadOnServer = new int[m];

            for (int i = 0; i < m; i++) {
                // Initialize load on each
                // server as zero
                loadOnServer[i] = 0;
            }

            // Minimum priority queue for
            // storing busy servers according
            // to their release time
            PriorityQueue<int[]> busyServers = new PriorityQueue<>(new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return a[0] - b[0];
                }
            });

            // Set to store available Servers
            TreeSet<Integer> availableServers = new TreeSet<>();

            for (int i = 0; i < m; i++) {
                // Initially, all servers are free
                availableServers.add(i);
            }

            // Iterating through the requests.
            for (int i = 0; i < n; i++) {
                // End time of current request
                // is the sum of arrival time
                // and process time
                int endTime = arrivalTime[i] + processTime[i];

                // Releasing all the servers which
                // have become free by this time
                while (!busyServers.isEmpty() && busyServers.peek()[0] <= arrivalTime[i]) {
                    // Pop the server
                    int[] releasedServer = busyServers.poll();
                    // Insert available server
                    availableServers.add(releasedServer[1]);
                }

                // If there is no free server,
                // the request is dropped
                if (availableServers.isEmpty()) {
                    continue;
                }

                int demandedServer = i % m;

                // Searching for demanded server
                Integer assignedServer = availableServers.ceiling(demandedServer);
                if (assignedServer == null) {
                    // If demanded Server is not free
                    // and no server is free after it,
                    // then choose first free server
                    assignedServer = availableServers.first();
                }

                // Increasing load on assigned Server
                loadOnServer[assignedServer]++;

                // Removing assigned server from list
                // of assigned servers
                availableServers.remove(assignedServer);

                // Add assigned server in the list of
                // busy servers with its release time
                busyServers.offer(new int[] { endTime, assignedServer });
            }

            // Function to print load on
            printLoadOnEachServer(m, loadOnServer);
        }

        public static void main(String[] args) {

            // Given arrivalTime and processTime
            int[] arrivalTime = {1, 3, 6, 8,4,6,7,8,4,2,6,67,5,5};
            int[] processTime = {1, 2, 3, 1,1,3,4,5,6,73,7,5,2,9};


            int N = arrivalTime.length;

            int M = 3;

            // Function Call
            loadBalancing(N, M, arrivalTime, processTime);
        }




}






