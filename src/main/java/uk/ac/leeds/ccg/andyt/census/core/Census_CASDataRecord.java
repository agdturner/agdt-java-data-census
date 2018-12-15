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

import uk.ac.leeds.ccg.andyt.census.core.Census_AbstractDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS002DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS020DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS14bDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS12cDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS14cDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS12bDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS010DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS017DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS09bDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS006DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS09cDataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.ks.Census_CASKS008DataRecord;
import java.io.IOException;
import java.io.RandomAccessFile;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS001DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS002DataRecord;
import uk.ac.leeds.ccg.andyt.census.cas.Census_CAS003DataRecord;
import uk.ac.leeds.ccg.andyt.generic.core.Generic_ErrorAndExceptionHandler;

/**
 * A <code>class</code> collection of the following
 * <code>AbstractCASDataRecords</code>:
 * <ul>
 * <li>Census_CAS001DataRecord</li>
 * <li>Census_CAS002DataRecord</li>
 * <li>Census_CAS003DataRecord</li>
 * <li>Census_CASKS002DataRecord</li>
 * <li>Census_CASKS008DataRecord</li>
 * <li>Census_CASKS010DataRecord</li>
 * <li>Census_CASKS017DataRecord</li>
 * <li>Census_CASKS020DataRecord</li>
 * <li>Census_CASKS09bDataRecord</li>
 * <li>Census_CASKS09cDataRecord</li>
 * <li>Census_CASKS12bDataRecord</li>
 * <li>Census_CASKS12cDataRecord</li>
 * <li>Census_CASKS14bDataRecord</li>
 * <li>Census_CASKS14cDataRecord</li>
 * </ul>
 * <ul>
 * <li>Developed for <a href="http://www.ncess.ac.uk/moses">MoSeS</a>.</li>
 * <li>Copyright (C) 2006 <a
 * href="http://www.geog.leeds.ac.uk/people/a.turner/">Andy Turner</a>, <a
 * href="http://www.leeds.ac.uk//">University of Leeds</a>.</li>
 * </ul>
 * 
 * @author <a href="http://www.geog.leeds.ac.uk/people/a.turner/">Andy
 *         Turner</a>
 * @version 1.0.0, 2006-08-10
 * @see Census_CASDataHandler
 */
public class Census_CASDataRecord extends Census_AbstractDataRecord {

	/**
	 * Census_CAS001DataRecord
	 */
	protected Census_CAS001DataRecord tCAS001DataRecord;

	/**
	 * Census_CAS002DataRecord
	 */
	protected Census_CAS002DataRecord tCAS002DataRecord;

	/**
	 * Census_CAS003DataRecord
	 */
	protected Census_CAS003DataRecord tCAS003DataRecord;

	/**
	 * Census_CASKS002DataRecord
	 */
	protected Census_CASKS002DataRecord tCASKS002DataRecord;

	/**
	 * Census_CASKS006DataRecord
	 */
	protected Census_CASKS006DataRecord tCASKS006DataRecord;

	/**
	 * Census_CASKS008DataRecord
	 */
	protected Census_CASKS008DataRecord tCASKS008DataRecord;

	/**
	 * Census_CASKS010DataRecord
	 */
	protected Census_CASKS010DataRecord tCASKS010DataRecord;

	/**
	 * Census_CASKS017DataRecord
	 */
	protected Census_CASKS017DataRecord tCASKS017DataRecord;

	/**
	 * Census_CASKS020DataRecord
	 */
	protected Census_CASKS020DataRecord tCASKS020DataRecord;

	/**
	 * Census_CASKS09bDataRecord
	 */
	protected Census_CASKS09bDataRecord tCASKS09bDataRecord;

	/**
	 * Census_CASKS09cDataRecord
	 */
	protected Census_CASKS09cDataRecord tCASKS09cDataRecord;

	/**
	 * Census_CASKS12bDataRecord
	 */
	protected Census_CASKS12bDataRecord tCASKS12bDataRecord;

	/**
	 * Census_CASKS12cDataRecord
	 */
	protected Census_CASKS12cDataRecord tCASKS12cDataRecord;

	/**
	 * Census_CASKS14bDataRecord
	 */
	protected Census_CASKS14bDataRecord tCASKS14bDataRecord;

	/**
	 * Census_CASKS14cDataRecord
	 */
	protected Census_CASKS14cDataRecord tCASKS14cDataRecord;

	/** Creates a new CASKSSelection1Record */
	public Census_CASDataRecord() {
		init();
	}

	/** Creates a new CASKSSelection1Record
     * @param tCASDataHandler
     * @param tRecordID */
	public Census_CASDataRecord(
            Census_CASDataHandler tCASDataHandler,
            long tRecordID) {
        init(tCASDataHandler,
                tRecordID);
    }

	/**
	 * Initialises all fields.
	 */
	protected void init() {
		this.tCAS001DataRecord = new Census_CAS001DataRecord();
		this.tCAS002DataRecord = new Census_CAS002DataRecord();
		this.tCAS003DataRecord = new Census_CAS003DataRecord();
		this.tCASKS002DataRecord = new Census_CASKS002DataRecord();
		this.tCASKS008DataRecord = new Census_CASKS008DataRecord();
		this.tCASKS010DataRecord = new Census_CASKS010DataRecord();
		this.tCASKS017DataRecord = new Census_CASKS017DataRecord();
		this.tCASKS020DataRecord = new Census_CASKS020DataRecord();
		this.tCASKS09bDataRecord = new Census_CASKS09bDataRecord();
		this.tCASKS09cDataRecord = new Census_CASKS09cDataRecord();
		this.tCASKS12bDataRecord = new Census_CASKS12bDataRecord();
		this.tCASKS12cDataRecord = new Census_CASKS12cDataRecord();
		this.tCASKS14bDataRecord = new Census_CASKS14bDataRecord();
		this.tCASKS14cDataRecord = new Census_CASKS14cDataRecord();
	}

	/**
	 * Initialises all fields.
     * @param tCASDataHandler
     * @param tRecordID
	 */
	protected void init(
            Census_CASDataHandler tCASDataHandler,
            long tRecordID) {
		this.tCAS001DataRecord = (Census_CAS001DataRecord) tCASDataHandler
				.getCAS001DataHandler().getDataRecord(tRecordID);
		this.tCAS002DataRecord = (Census_CAS002DataRecord) tCASDataHandler
				.getCAS002DataHandler().getDataRecord(tRecordID);
		this.tCAS003DataRecord = (Census_CAS003DataRecord) tCASDataHandler
				.getCAS003DataHandler().getDataRecord(tRecordID);
		this.tCASKS002DataRecord = (Census_CASKS002DataRecord) tCASDataHandler
				.getCASKS002DataHandler().getDataRecord(tRecordID);
		this.tCASKS008DataRecord = (Census_CASKS008DataRecord) tCASDataHandler
				.getCASKS008DataHandler().getDataRecord(tRecordID);
		this.tCASKS010DataRecord = (Census_CASKS010DataRecord) tCASDataHandler
				.getCASKS010DataHandler().getDataRecord(tRecordID);
		this.tCASKS017DataRecord = (Census_CASKS017DataRecord) tCASDataHandler
				.getCASKS017DataHandler().getDataRecord(tRecordID);
		this.tCASKS020DataRecord = (Census_CASKS020DataRecord) tCASDataHandler
				.getCASKS020DataHandler().getDataRecord(tRecordID);
		this.tCASKS09bDataRecord = (Census_CASKS09bDataRecord) tCASDataHandler
				.getCASKS09bDataHandler().getDataRecord(tRecordID);
		this.tCASKS09cDataRecord = (Census_CASKS09cDataRecord) tCASDataHandler
				.getCASKS09cDataHandler().getDataRecord(tRecordID);
		this.tCASKS12bDataRecord = (Census_CASKS12bDataRecord) tCASDataHandler
				.getCASKS12bDataHandler().getDataRecord(tRecordID);
		this.tCASKS12cDataRecord = (Census_CASKS12cDataRecord) tCASDataHandler
				.getCASKS12cDataHandler().getDataRecord(tRecordID);
		this.tCASKS14bDataRecord = (Census_CASKS14bDataRecord) tCASDataHandler
				.getCASKS14bDataHandler().getDataRecord(tRecordID);
		this.tCASKS14cDataRecord = (Census_CASKS14cDataRecord) tCASDataHandler
				.getCASKS14cDataHandler().getDataRecord(tRecordID);
	}

	/**
	 * Returns a string description of this;
     * @return 
	 */
	public String toString() {
		return "CAS001DataRecord " + tCAS001DataRecord.toString() + ", "
				+ "CAS002DataRecord " + tCAS002DataRecord.toString() + ", "
				+ "CAS003DataRecord " + tCAS003DataRecord.toString() + ", "
				+ "CASKS002DataRecord " + tCASKS002DataRecord.toString() + ", "
				+ "CASKS008DataRecord " + tCASKS008DataRecord.toString() + ", "
				+ "CASKS010DataRecord " + tCASKS010DataRecord.toString() + ", "
				+ "CASKS017DataRecord " + tCASKS017DataRecord.toString() + ", "
				+ "CASKS020DataRecord " + tCASKS020DataRecord.toString() + ", "
				+ "CASKS09bDataRecord " + tCASKS09bDataRecord.toString() + ", "
				+ "CASKS09cDataRecord " + tCASKS09cDataRecord.toString() + ", "
				+ "CASKS12bDataRecord " + tCASKS12bDataRecord.toString() + ", "
				+ "CASKS12cDataRecord " + tCASKS12cDataRecord.toString() + ", "
				+ "CASKS14bDataRecord " + tCASKS14bDataRecord.toString() + ", "
				+ "CASKS14cDataRecord " + tCASKS14cDataRecord.toString();
	}

	/**
	 * Returns the size of this Census_CASDataRecord in bytes as a long. This does not
	 * account for serialVersionUID. A boolean is assumed to be the same size as
	 * an int in bytes.
     * @return 
	 */
	public long getSizeInBytes() {
		return tCAS001DataRecord.getSizeInBytes()
				+ tCAS002DataRecord.getSizeInBytes()
				+ tCAS003DataRecord.getSizeInBytes()
				+ tCASKS002DataRecord.getSizeInBytes()
				+ tCASKS008DataRecord.getSizeInBytes()
				+ tCASKS010DataRecord.getSizeInBytes()
				+ tCASKS017DataRecord.getSizeInBytes()
				+ tCASKS020DataRecord.getSizeInBytes()
				+ tCASKS09bDataRecord.getSizeInBytes()
				+ tCASKS09cDataRecord.getSizeInBytes()
				+ tCASKS12bDataRecord.getSizeInBytes()
				+ tCASKS12cDataRecord.getSizeInBytes()
				+ tCASKS14bDataRecord.getSizeInBytes()
				+ tCASKS14cDataRecord.getSizeInBytes();
	}

	/**
	 * Returns this.tCAS001DataRecord
     * @return 
	 */
	public Census_CAS001DataRecord getCAS001DataRecord() {
		return this.tCAS001DataRecord;
	}

	/**
	 * Returns this.tCAS002DataRecord
     * @return 
	 */
	public Census_CAS002DataRecord getCAS002DataRecord() {
		return this.tCAS002DataRecord;
	}

	/**
	 * Returns this.tCAS003DataRecord
     * @return 
	 */
	public Census_CAS003DataRecord getCAS003DataRecord() {
		return this.tCAS003DataRecord;
	}

	/**
	 * Returns this.tCASKS002DataRecord
     * @return 
	 */
	public Census_CASKS002DataRecord getCASKS002DataRecord() {
		return this.tCASKS002DataRecord;
	}

	/**
	 * Returns this.tCASKS006DataRecord
     * @return 
	 */
	public Census_CASKS006DataRecord getCASKS006DataRecord() {
		return this.tCASKS006DataRecord;
	}

	/**
	 * Returns this.tCASKS008DataRecord
     * @return 
	 */
	public Census_CASKS008DataRecord getCASKS008DataRecord() {
		return this.tCASKS008DataRecord;
	}

	/**
	 * Returns this.tCASKS010DataRecord
     * @return 
	 */
	public Census_CASKS010DataRecord getCASKS010DataRecord() {
		return this.tCASKS010DataRecord;
	}

	/**
	 * Returns this.tCASKS017DataRecord
     * @return 
	 */
	public Census_CASKS017DataRecord getCASKS017DataRecord() {
		return this.tCASKS017DataRecord;
	}

	/**
	 * Returns this.tCASKS020DataRecord
     * @return 
	 */
	public Census_CASKS020DataRecord getCASKS020DataRecord() {
		return this.tCASKS020DataRecord;
	}

	/**
	 * Returns this.tCASKS09bDataRecord
     * @return 
	 */
	public Census_CASKS09bDataRecord getCASKS09bDataRecord() {
		return this.tCASKS09bDataRecord;
	}

	/**
	 * Returns this.tCASKS09cDataRecord
     * @return 
	 */
	public Census_CASKS09cDataRecord getCASKS09cDataRecord() {
		return this.tCASKS09cDataRecord;
	}

	/**
	 * Returns this.tCASKS12bDataRecord
     * @return 
	 */
	public Census_CASKS12bDataRecord getCASKS12bDataRecord() {
		return this.tCASKS12bDataRecord;
	}

	/**
	 * Returns this.tCASKS12cDataRecord
     * @return 
	 */
	public Census_CASKS12cDataRecord getCASKS12cDataRecord() {
		return this.tCASKS12cDataRecord;
	}

	/**
	 * Returns this.tCASKS14bDataRecord
     * @return 
	 */
	public Census_CASKS14bDataRecord getCASKS14bDataRecord() {
		return this.tCASKS14bDataRecord;
	}

	/**
	 * Returns this.tCASKS14cDataRecord
     * @return 
	 */
	public Census_CASKS14cDataRecord getCASKS14cDataRecord() {
		return this.tCASKS14cDataRecord;
	}

	/**
	 * Returns a copy of this.Zone_Code
     * @return 
	 */
	public @Override
	char[] getZone_Code() {
		return getCASKS002DataRecord().getZone_Code();
	}

	/**
	 * Writes <code>this</code> to <code>aRandomAccessFile</code> at the current
	 * position.
	 * 
	 * @param aRandomAccessFile
	 *            The <code>RandomAccessFile</code> this is written to.
	 */
	@Override
	public void write(
            RandomAccessFile aRandomAccessFile) {
		super.write(aRandomAccessFile);
		write(aRandomAccessFile, false);
	}

	/**
	 * Writes <code>this</code> to <code>aRandomAccessFile</code> at the current
	 * position.
	 * 
	 * @param aRandomAccessFile
	 *            The <code>RandomAccessFile</code> this is written to.
	 * @param avoidCallToSuper
	 *            If true super.write() is not called
	 */
	public void write(
            RandomAccessFile aRandomAccessFile,
			boolean avoidCallToSuper) {
		if (avoidCallToSuper) {
		} else {
			write(aRandomAccessFile);
		}
	}
}
