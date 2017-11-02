/**
 * A component of a library for 
 * <a href="http://www.geog.leeds.ac.uk/people/a.turner/projects/MoSeS">Moses</a>.
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
package uk.ac.leeds.ccg.andyt.census.cas;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.HashSet;
import uk.ac.leeds.ccg.andyt.generic.io.Generic_StaticIO;

/**
 * A <code>class</code> for loading a list of Zone Code and Zone Names for
 * England and Wales Local Authority Districts, Scotland Council Areas and
 * Northern Ireland District Council regions.
 */
public class Census_CASZoneCodeZoneNameDataHandler {

    public HashSet _ZoneCode_HashSet;

    /**
     * Creates a new instance of CASZoneCodeZoneNameDataHandler.
     */
    public Census_CASZoneCodeZoneNameDataHandler() {
    }

    /**
     * Creates a new instance of CASZoneCodeZoneNameDataHandler with
     * _ZoneCode_HashSet loaded from formattedFile.
     * @param formattedFile
     * @throws java.io.IOException
     */
    public Census_CASZoneCodeZoneNameDataHandler(File formattedFile) throws IOException {
        _ZoneCode_HashSet = (HashSet) Generic_StaticIO.readObject(formattedFile);
    }

    /**
     * @param args
     *            the command line arguments No arguments are used.
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Census_CASZoneCodeZoneNameDataHandler _CASZoneCodeZoneNameDataHandler = new Census_CASZoneCodeZoneNameDataHandler();
        _CASZoneCodeZoneNameDataHandler.run();
    }

    public void run() throws IOException {
        //File workspace = new File("C:/Work/projects/MoSeS/workspace/");
        File workspace = new File("/scratch01/Work/projects/MoSeS/workspace/");
        //File sourceDataDirectory = new File("C:/Work/data/Census/2001/CAS");
        File sourceDataDirectory = new File("/scratch01/Work/data/Census/2001/CAS/");
        loadSourceData(sourceDataDirectory);
        File formattedFile = new File(
                workspace,
                "UKLAD_ZoneCode_HashSet.thisFile");
        Generic_StaticIO.writeObject(
                _ZoneCode_HashSet,
                formattedFile);
        Census_CASZoneCodeZoneNameDataHandler testCASZoneCodeZoneNameDataHandler = new Census_CASZoneCodeZoneNameDataHandler(
                formattedFile);
        System.out.println("" + _ZoneCode_HashSet.size()); // 371
    }

    /**
     * Loads source data from directory
     * @param directory
     * @throws java.io.IOException
     */
    protected void loadSourceData(
            File directory)
            throws IOException {
        _ZoneCode_HashSet = new HashSet();
        // Load from source
        File sourceFile;
        // Load England
        sourceFile = new File(
                directory,
                "EnglandZoneCodeZoneNameLAD.csv");
        format(sourceFile);
        // Load Wales
        sourceFile = new File(
                directory,
                "WalesZoneCodeZoneNameLAD.csv");
        format(sourceFile);
        // Load Scotland
        sourceFile = new File(
                directory,
                "ScotlandZoneCodeZoneNameCouncilArea.csv");
        format(sourceFile);
        // Load Northern Ireland
        sourceFile = new File(
                directory,
                "NorthernIrelandZoneCodeZoneNameDistrictCouncil.csv");
        format(sourceFile);
    }

    protected void format(
            File sourceFile)
            throws IOException {
        BufferedReader aBufferedReader = new BufferedReader(
                new InputStreamReader(new FileInputStream(sourceFile)));
        StreamTokenizer aStreamTokenizer = new StreamTokenizer(aBufferedReader);
        Generic_StaticIO.setStreamTokenizerSyntax1(aStreamTokenizer);
        String line = null;
        // Skip the first line
        int tokenType = aStreamTokenizer.nextToken();
        while (tokenType != StreamTokenizer.TT_EOL) {
            tokenType = aStreamTokenizer.nextToken();
        }
        tokenType = aStreamTokenizer.nextToken();
        while (tokenType != StreamTokenizer.TT_EOF) {
            switch (tokenType) {
                case StreamTokenizer.TT_EOL:
                    System.out.println(line);
                    break;
                case StreamTokenizer.TT_WORD:
                    line = aStreamTokenizer.sval;
                    String[] fields = line.split(",");
                    String aZone_Code = fields[0];
                    _ZoneCode_HashSet.add(aZone_Code);
                    tokenType = aStreamTokenizer.nextToken();
            }
            tokenType = aStreamTokenizer.nextToken();
        }
    }
}