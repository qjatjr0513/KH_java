package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	public boolean checkName(String file) {
		try(FileReader fw= new FileReader(file);) {

		} catch (FileNotFoundException e) {
			return false;
		} catch(IOException e) {
			e.printStackTrace();
		}
		return true;
	}
	
	public void fileSave(String file, String s) {
		try(FileWriter fw = new FileWriter(file)) {
			fw.write(s);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br =new BufferedReader(new FileReader(file))) {
			String s = "";
			while((s = br.readLine()) != null) {
				sb.append(s+"\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		return sb;
	}
	
	public void fileEdit(String file, String s) {
		try(FileWriter fw= new FileWriter(file, true)){
			fw.write(s);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
