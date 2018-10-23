package edu.handong.csee.pp1.dp;

import static org.junit.Assert.*;

import org.junit.Test;

import net.lifove.clami.CLAMI;

public class CLAMITest {
	
	@Test
	public void testCLAMIHelp() {
		// Put a GitHub repository path you cloned in your laptop.
		String[] args = {"-h"};
		
		CLAMI.main(args);
	}
	
	@Test
	public void testCLAWithApacheProject() {
		
		String[] args = {"-f","data/Apache.arff","-l","isDefective","-p", "TRUE"};
		
		
		CLAMI.main(args);
	}

	@Test
	public void testCLAMIWithApacheProject() {
		
		String[] args = {"-f","data/Apache.arff","-l","isDefective","-p", "TRUE", "-m"};
		
		
		CLAMI.main(args);
	}
	
	@Test
	public void testCLAMIWithApacheProjectByRandomForest() {
		
		String[] args = {"-a", "weka.classifiers.trees.RandomForest",
				         "-f","data/Apache.arff","-l","isDefective","-p", "TRUE", "-m"};
		
		
		CLAMI.main(args);
	}
	
	@Test
	public void testCLAMIWithApacheProjectByBayesNet() {
		
		String[] args = {"-a", "weka.classifiers.bayes.BayesNet",
				         "-f","data/Apache.arff","-l","isDefective","-p", "TRUE", "-m"};
		
		
		CLAMI.main(args);
	}
	
	@Test
	public void testCLAMIWithYourSelectedProject() {
		
		// TASK3: Conduct defect prediction by using CLAMI models
		// complete this test case for the generated arff files from Task 2
		
		String[] args = {"-f","data/movie_lens.arff","-l","label","-p", "buggy", "-m"};
		
		CLAMI.main(args);
	}
	
	@Test
	public void testCLAMIWithApacheProjectToFindBestCutoffForPrecision() {
		
		// TASK5 TODO Use this method to find the best cutoff
	
		String[] args = {"-f","data/Apache.arff","-l","isDefective","-p", "TRUE", "-m", "-c", "42"};
		CLAMI.main(args);

	}
	
	@Test
	public void testCLAMIWithApacheProjectToFindBestCutoffForFmeasure() {
		
		// TASK6 TODO Use this method to find the best cutoff for f-measure
		
		String[] args = {"-f","data/Apache.arff","-l","isDefective","-p", "TRUE", "-m", "-c", "88"};
		CLAMI.main(args);
	}

}