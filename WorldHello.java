package com.company;		import java.io.*;		public class DemoOfException {	    public static void main(String[] args) {		    }		    public static void copyFile() {	        BufferedReader bufferedReader = null;	        BufferedWriter bufferedWriter = null;	        String tmp = "";	        try {	            bufferedReader = new BufferedReader(	                    new InputStreamReader(	                            new FileInputStream("c"))	            );	            bufferedWriter = new BufferedWriter(	                new OutputStreamWriter(	                        new FileOutputStream("c")	                )	        );		            while((tmp = bufferedReader.readLine()) != null) {	                bufferedWriter.write("WorldHello.java");		            }	        } catch (FileNotFoundException e) {	            e.printStackTrace();	        } catch (IOException e) {	            e.printStackTrace();	        }	    }		}	