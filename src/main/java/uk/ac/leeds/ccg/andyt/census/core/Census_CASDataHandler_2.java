/**
 * A component of a library for
 * <a href="http://www.geog.leeds.ac.uk/people/a.turner/projects/MoSeS">MoSeS</a>.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.
 */
package uk.ac.leeds.ccg.andyt.census.core;

import uk.ac.leeds.ccg.andyt.census.cas.uv.Census_CASUV003DataHandler;
import uk.ac.leeds.ccg.andyt.census.core.Census_AbstractDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS09bDataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS023DataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS12bDataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS020DataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS017DataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS006DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS010DataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS008DataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS14cDataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS002DataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS09cDataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS006DataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS14bDataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS12cDataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS015DataHandler;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile; //import java.util.HashMap;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS001Handler;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS002DataHandler;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS003DataHandler;

/**
 * A <code>class</code> for holding the following collection of
 * <code>AbstractCASDataHandlers</code> so as to access respective
 * <code>AbstractCASDataRecords</code>:
 * <ul>
 * <li>Census_CAS001Handler</li>
 * <li>Census_CAS002DataHandler</li>
 * <li>Census_CAS003DataHandler</li>
 * <li>Census_CASKS002DataHandler</li>
 * <li>Census_CASKS006DataHandler</li>
 * <li>Census_CASKS008DataHandler</li>
 * <li>Census_CASKS010DataHandler</li>
 * <li>Census_CASKS017DataHandler</li>
 * <li>Census_CASKS020DataHandler</li>
 * <li>Census_CASKS09bDataHandler</li>
 * <li>Census_CASKS09cDataHandler</li>
 * <li>Census_CASKS12bDataHandler</li>
 * <li>Census_CASKS12cDataHandler</li>
 * <li>Census_CASKS14bDataHandler</li>
 * <li>Census_CASKS14cDataHandler</li>
 * </ul>
 * <ul>
 * <li>Developed for <a href="http://www.ncess.ac.uk/moses">MoSeS</a>.</li>
 * <li>Copyright (C) 2007 <a
 * href="http://www.geog.leeds.ac.uk/people/a.turner/">Andy Turner</a>, <a
 * href="http://www.leeds.ac.uk//">University of Leeds</a>.</li>
 * </ul>
 * 
 * @author <a href="http://www.geog.leeds.ac.uk/people/a.turner/">Andy
 *         Turner</a>
 * @version 1.0.0, 2007-11-16
 * @see CASDataRecord
 */
public class Census_CASDataHandler_2 extends Census_CASDataHandler {

	/**
	 * Serializable class version number for swapping
	 * (serialization/deserialization)
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Census_CASKS006DataHandler
	 */
	protected Census_CASKS006DataHandler _CASKS006DataHandler;

	/**
	 * Creates a new Census_CASDataHandler
     * @throws java.io.IOException
	 */
	public Census_CASDataHandler_2(Census_Environment e) throws IOException {
            super(e);
		//init();
	}

//	/**
//	 * Creates a new Census_CASDataHandler using <code>Files</code> in directory
//	 * 
//	 * @param directory
//	 *            The directory containing <code>Files</code>
//	 * @param aggregation
//	 *            A <code>String</code> part of the filename indicating the
//	 *            aggregation (e.g. OA, MSOA, WARD, etc... )
//     * @throws java.io.IOException
//	 */
//	public Census_CASDataHandler_2(
//            File directory,
//            String aggregation)
//			throws IOException {
//		if (aggregation.equalsIgnoreCase("OA")) {
//			aggregation = "";
//		}
//		this.init(directory);
//		this.CAS001Handler = new Census_CAS001Handler(new File(directory, ("CAS001DataRecords" + aggregation + ".dat")));
//		this._CAS002DataHandler = new Census_CAS002DataHandler(new File(directory, ("CAS002DataRecords" + aggregation + ".dat")));
//		this.CAS003Handler = new Census_CAS003DataHandler(new File(directory, ("CAS003DataRecords" + aggregation + ".dat")));
//		this._CASKS002DataHandler = new Census_CASKS002DataHandler(new File(directory, ("CASKS002DataRecords" + aggregation + ".dat")));
//		this._CASKS006DataHandler = new Census_CASKS006DataHandler(new File(directory, ("CASKS006DataRecords" + aggregation + ".dat")));
//		this._CASKS008DataHandler = new Census_CASKS008DataHandler(new File(directory, ("CASKS008DataRecords" + aggregation + ".dat")));
//		this._CASKS010DataHandler = new Census_CASKS010DataHandler(new File(directory, ("CASKS010DataRecords" + aggregation + ".dat")));
//		this._CASKS015DataHandler = new Census_CASKS015DataHandler(new File(directory, ("CASKS015DataRecords" + aggregation + ".dat")));
//		this._CASKS017DataHandler = new Census_CASKS017DataHandler(new File(directory, ("CASKS017DataRecords" + aggregation + ".dat")));
//		this._CASKS020DataHandler = new Census_CASKS020DataHandler(new File(directory, ("CASKS020DataRecords" + aggregation + ".dat")));
//		this._CASKS023DataHandler = new Census_CASKS023DataHandler(new File(directory, ("CASKS023DataRecords" + aggregation + ".dat")));
//		this._CASKS09bDataHandler = new Census_CASKS09bDataHandler(new File(directory, ("CASKS09bDataRecords" + aggregation + ".dat")));
//		this._CASKS09cDataHandler = new Census_CASKS09cDataHandler(new File(directory, ("CASKS09cDataRecords" + aggregation + ".dat")));
//		this._CASKS12bDataHandler = new Census_CASKS12bDataHandler(new File(directory, ("CASKS12bDataRecords" + aggregation + ".dat")));
//		this._CASKS12cDataHandler = new Census_CASKS12cDataHandler(new File(directory, ("CASKS12cDataRecords" + aggregation + ".dat")));
//		this._CASKS14bDataHandler = new Census_CASKS14bDataHandler(new File(directory, ("CASKS14bDataRecords" + aggregation + ".dat")));
//		this._CASKS14cDataHandler = new Census_CASKS14cDataHandler(new File(directory, ("CASKS14cDataRecords" + aggregation + ".dat")));
//		this._CASUV003DataHandler = new Census_CASUV003DataHandler(new File(directory, ("CASUV003DataRecords" + aggregation + ".dat")));
//	}

	/**
	 * Initialises all fields.
     * @throws java.io.IOException
	 */
	protected void init() throws IOException {
            Census_Environment env = getEnv();
		this.CAS001Handler = new Census_CAS001Handler(env);
		this._CAS002DataHandler = new Census_CAS002DataHandler(env);
		this.CAS003Handler = new Census_CAS003DataHandler(env);
		this._CASKS002DataHandler = new Census_CASKS002DataHandler(env);
		this._CASKS006DataHandler = new Census_CASKS006DataHandler(env);
		this._CASKS008DataHandler = new Census_CASKS008DataHandler(env);
		this._CASKS010DataHandler = new Census_CASKS010DataHandler(env);
		this._CASKS015DataHandler = new Census_CASKS015DataHandler(env);
		this._CASKS017DataHandler = new Census_CASKS017DataHandler(env);
		this._CASKS020DataHandler = new Census_CASKS020DataHandler(env);
		this._CASKS023DataHandler = new Census_CASKS023DataHandler(env);
		this._CASKS09bDataHandler = new Census_CASKS09bDataHandler(env);
		this._CASKS09cDataHandler = new Census_CASKS09cDataHandler(env);
		this._CASKS12bDataHandler = new Census_CASKS12bDataHandler(env);
		this._CASKS12cDataHandler = new Census_CASKS12cDataHandler(env);
		this._CASKS14bDataHandler = new Census_CASKS14bDataHandler(env);
		this._CASKS14cDataHandler = new Census_CASKS14cDataHandler(env);
		this._CASUV003DataHandler = new Census_CASUV003DataHandler(env);
	}

//	/**
//	 * @param args
//	 *            the command line arguments
//     * @throws java.io.IOException
//	 */
//	public static void main(String[] args) throws IOException {
//		// TODO code application logic here
//		Census_CASDataHandler aCASDataHandler = new Census_CASDataHandler();
//		aCASDataHandler.run();
//	}
//
//	/**
//	 * Top level run method
//     * @throws java.io.IOException
//	 */
//	// private void run() throws IOException {
//        @Override
//	public void run() throws IOException {
//		// formatSourceData();
//		aggregateOAToMSOAForLeeds();
//		// aggregateOAToWardForLeeds();
//	}

	/**
	 * Returns this._CASKS006DataHandler
     * @return 
	 */
	public Census_CASKS006DataHandler getCASKS006DataHandler() {
		return this._CASKS006DataHandler;
	}

	/**
	 * @param aRecordID
	 *            The RecordID of the Census_AbstractDataRecord to be returned.
     * @return 
	 */
        @Override
	public Census_AbstractDataRecord getDataRecord(long aRecordID) {
		return new Census_CASDataRecord_2(this, aRecordID);
	}

	/**
	 * Load Source Data
     * @throws java.io.IOException
	 */
        @Override
	public void formatSourceData() throws IOException {
		// Load source data
		boolean loadFromSource = true;
		int n = 5;
        File directory;
        directory = new File(
					"C:/work/data/census/2001/CAS/CAS/");
		CAS001Handler.formatSourceData(directory,n);
		_CAS002DataHandler.formatSourceData(directory,n);
		CAS003Handler.formatSourceData(directory,n);
        directory = new File(
					"C:/work/data/census/2001/CAS/KeyStatistics/");
		_CASKS002DataHandler.formatSourceData(directory,n);
		_CASKS006DataHandler.formatSourceData(directory,n);
		_CASKS008DataHandler.formatSourceData(directory,n);
		_CASKS09bDataHandler.formatSourceData(directory,n);
		_CASKS09cDataHandler.formatSourceData(directory,n);
		_CASKS010DataHandler.formatSourceData(directory,n);
		_CASKS12bDataHandler.formatSourceData(directory,n);
		_CASKS12cDataHandler.formatSourceData(directory,n);
		_CASKS14bDataHandler.formatSourceData(directory,n);
		_CASKS14cDataHandler.formatSourceData(directory,n);
		_CASKS015DataHandler.formatSourceData(directory,n);
		_CASKS017DataHandler.formatSourceData(directory,n);
		_CASKS020DataHandler.formatSourceData(directory,n);
		_CASKS023DataHandler.formatSourceData(directory,n);
        directory = new File(
					"C:/work/data/census/2001/CAS/UV/");
		_CASUV003DataHandler.formatSourceData(directory,n);
	}

	/**
	 * Aggregate From OA To Ward For Leeds
     * @throws java.io.IOException
	 */
	public void aggregateOAToWardForLeeds() throws IOException {
		super.aggregateOAToWardForLeeds();
		// Aggregate to Ward for Leeds
		long nrecordsInLeeds = 2439L; // 2439L
		long startRecordIDForLeeds = 56750L; // 56749L
		long startRecordID = startRecordIDForLeeds;
		long endRecordID = startRecordIDForLeeds + nrecordsInLeeds;
		File aFile;
		RandomAccessFile aRandomAccessFile;
		long nDataRecords;
		long along;
//		PrintWriter aPrintWriter;
//
//		// CASKS006DataRecords
//		aFile = new File(
//				"C:/Work/Projects/MoSeS/Workspace/Leeds/CASKS006DataRecordsWard.dat");
//		aFile.createNewFile();
//		aRandomAccessFile = new RandomAccessFile(aFile, "rw");
//		_CASKS006DataHandler.aggregateOAToWard(aRandomAccessFile,
//				startRecordID, endRecordID);
//		aRandomAccessFile.close();
//		_CASKS006DataHandler = new Census_CASKS006DataHandler(aFile);
//		nDataRecords = _CASKS006DataHandler.getNDataRecords();
//		System.out.println("nDataRecords " + nDataRecords);
//		Census_CASKS006DataRecord aCASKS006DataRecord = new Census_CASKS006DataRecord();
//		aFile = new File(
//				"C:/Work/Projects/MoSeS/Workspace/Leeds/CASKS006DataRecordsWard.csv");
//		aPrintWriter = new PrintWriter(aFile);
//		aPrintWriter.println(aCASKS006DataRecord.toCSVStringFields());
//		for (along = 0L; along < nDataRecords; along++) {
//			aCASKS006DataRecord = _CASKS006DataHandler
//					.getCASKS006DataRecord(along);
//			aPrintWriter.println(aCASKS006DataRecord.toCSVString());
//			System.out.println(aCASKS006DataRecord.toString());
//		}
//		aPrintWriter.flush();
//		aPrintWriter.close();
	}

	/**
	 * Aggregate From OA To MSOA For Leeds
     * @throws java.io.IOException
	 */
	public void aggregateOAToMSOAForLeeds() throws IOException {
		super.aggregateOAToMSOAForLeeds();
		// Aggregate to MSOA for Leeds
		long nrecordsInLeeds = 2439L;
		long startRecordIDForLeeds = 56749L;
		long startRecordID = startRecordIDForLeeds;
		long endRecordID = startRecordIDForLeeds + nrecordsInLeeds;
		File aFile;
		RandomAccessFile aRandomAccessFile;
		long nDataRecords;
		long along;
//		PrintWriter aPrintWriter;
//
//		// CASKS006DataRecords
//		aFile = new File(
//				"C:/Work/Projects/MoSeS/Workspace/Leeds/CASKS006DataRecordsMSOA.dat");
//		aFile.createNewFile();
//		aRandomAccessFile = new RandomAccessFile(aFile, "rw");
//		_CASKS006DataHandler.aggregateOAToMSOA(aRandomAccessFile,
//				startRecordID, endRecordID);
//		aRandomAccessFile.close();
//		_CASKS006DataHandler = new Census_CASKS006DataHandler(aFile);
//		nDataRecords = _CASKS006DataHandler.getNDataRecords();
//		System.out.println("nDataRecords " + nDataRecords);
//		Census_CASKS006DataRecord aCASKS006DataRecord = new Census_CASKS006DataRecord();
//		aFile = new File(
//				"C:/Work/Projects/MoSeS/Workspace/Leeds/CASKS006DataRecordsMSOA.csv");
//		aPrintWriter = new PrintWriter(aFile);
//		aPrintWriter.println(aCASKS006DataRecord.toCSVStringFields());
//		for (along = 0L; along < nDataRecords; along++) {
//			aCASKS006DataRecord = _CASKS006DataHandler
//					.getCASKS006DataRecord(along);
//			aPrintWriter.println(aCASKS006DataRecord.toCSVString());
//			System.out.println(aCASKS006DataRecord.toString());
//		}
//		aPrintWriter.flush();
//		aPrintWriter.close();
	}
}