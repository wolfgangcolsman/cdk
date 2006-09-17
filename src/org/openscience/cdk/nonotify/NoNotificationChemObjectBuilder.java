/* $RCSfile$
 * $Author: egonw $
 * $Date: 2006-03-29 10:27:08 +0200 (Wed, 29 Mar 2006) $
 * $Revision: 5855 $
 *
 * Copyright (C) 2005-2006  The Chemistry Development Kit (CDK) project
 *
 * Contact: cdk-devel@lists.sourceforge.net
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package org.openscience.cdk.nonotify;

import org.openscience.cdk.interfaces.*;

import javax.vecmath.Point2d;
import javax.vecmath.Point3d;

/**
 * A helper class to instantiate a IChemObject for a specific implementation.
 *
 * @author        egonw
 * @cdk.module    nonotify
 */
public class NoNotificationChemObjectBuilder implements IChemObjectBuilder {

	private static NoNotificationChemObjectBuilder instance = null;
	
	private NoNotificationChemObjectBuilder() {}

	public static NoNotificationChemObjectBuilder getInstance() {
		if (instance == null) {
			instance = new NoNotificationChemObjectBuilder();
		}
		return instance;
	}
	
	public IAminoAcid newAminoAcid() {
        return new NNAminoAcid();
	}
	
	public IAtom newAtom() {
        return new NNAtom();
	}
	
    public IAtom newAtom(String elementSymbol) {
        return new NNAtom(elementSymbol);
    }
    
    public IAtom newAtom(String elementSymbol, javax.vecmath.Point2d point2d) {

        return new NNAtom(elementSymbol, point2d);
    }

    public IAtom newAtom(String elementSymbol, javax.vecmath.Point3d point3d) {
        return new NNAtom(elementSymbol, point3d);
    }
		
	public IAtomContainer newAtomContainer() {
        return new NNAtomContainer();
	}
    
	public IAtomContainer newAtomContainer(int atomCount, int electronContainerCount) {
        return new NNAtomContainer(atomCount, electronContainerCount);
	}
    
	public IAtomContainer newAtomContainer(IAtomContainer container) {
        return new NNAtomContainer(container);
	}
	
    public IAtomParity newAtomParity(
    		IAtom centralAtom, 
    		IAtom first, 
    		IAtom second, 
    		IAtom third, 
    		IAtom fourth,
            int parity) {
        return new NNAtomParity(centralAtom, first, second, third, fourth, parity);
    }

	public IAtomType newAtomType(String elementSymbol) {
        return new NNAtomType(elementSymbol);
	}

	public IAtomType newAtomType(String identifier, String elementSymbol) {
        return new NNAtomType(identifier, elementSymbol);
	}

	public IBioPolymer newBioPolymer(){
        return new NNBioPolymer();
	}

	public IBond newBond() {
        return new NNBond();
	}
	
	public IBond newBond(IAtom atom1, IAtom atom2) {
        return new NNBond(atom1, atom2);
	}
	
	public IBond newBond(IAtom atom1, IAtom atom2, double order) {
        return new NNBond(atom1, atom2, order);
	}
	
	public IBond newBond(IAtom atom1, IAtom atom2, double order, int stereo) {
        return new NNBond(atom1, atom2, order, stereo);
	}
	
	public IChemFile newChemFile() {
        return new NNChemFile();
	}

	public IChemModel newChemModel() {
        return new NNChemModel();
	}
	
	public IChemObject newChemObject() {
        return new NNChemObject();
	}
	
	public IChemSequence newChemSequence() {
        return new NNChemSequence();
	}
	
    public ICrystal newCrystal() {
        return new NNCrystal();
    }
    
    public ICrystal newCrystal(IAtomContainer container) {
        return new NNCrystal(container);
    }
    
    public IElectronContainer newElectronContainer() {
        return new NNElectronContainer();
    }
    
    public IElement newElement() {
        return new NNElement();
    }

    public IElement newElement(String symbol) {
        return new NNElement(symbol);
    }

    public IElement newElement(String symbol, int atomicNumber) {
        return new NNElement(symbol, atomicNumber);
    }

	public IIsotope newIsotope(String elementSymbol) {
        return new NNIsotope(elementSymbol);
	}
	
	public IIsotope newIsotope(int atomicNumber, String elementSymbol, 
			int massNumber, double exactMass, double abundance) {
        return new NNIsotope(atomicNumber, elementSymbol, massNumber, exactMass, abundance);
	}

	public IIsotope newIsotope(int atomicNumber, String elementSymbol, 
			double exactMass, double abundance) {
        return new NNIsotope(atomicNumber, elementSymbol, exactMass, abundance);
	}

	public IIsotope newIsotope(String elementSymbol, int massNumber) {

        return new NNIsotope(elementSymbol, massNumber);
	}

    public ILonePair newLonePair() {
        return new NNLonePair();
    }

    public ILonePair newLonePair(IAtom atom) {
        return new NNLonePair(atom);
    }

    public IMapping newMapping(IChemObject objectOne, 
    		IChemObject objectTwo) {
        return new NNMapping(objectOne, objectTwo);
	}
    
	public IMolecule newMolecule() {
        return new NNMolecule();
	}

	public IMolecule newMolecule(int atomCount, int electronContainerCount) {
        return new NNMolecule(atomCount, electronContainerCount);
	}

	public IMolecule newMolecule(IAtomContainer container) {
        return new NNMolecule(container);
	}

	public IMonomer newMonomer () {

        return new NNMonomer();
	}
	
	public IPolymer newPolymer() {
        return new NNPolymer();
	}

    public IReaction newReaction() {
        return new NNReaction();
    }
	
	public IRing newRing() {
        return new NNRing();
	}
	
	public IRing newRing(IAtomContainer container) {
        return new NNRing(container);
	}
	
	public IRing newRing(int ringSize, String elementSymbol) {
        return new NNRing(ringSize, elementSymbol);
	}

	public IRing newRing(int ringSize) {
        return new NNRing(ringSize);
	}

	public IRingSet newRingSet() {
        return new NNRingSet();
	}

	public IAtomContainerSet newAtomContainerSet() {
        return new NNSetOfAtomContainers();
	}

	public IMoleculeSet newMoleculeSet() {
        return new NNSetOfMolecules();
	}

	public IReactionSet newReactionSet() {
        return new NNSetOfReactions();
	}
	
    public ISingleElectron newSingleElectron() {
        return new NNSingleElectron();
    }
    
    public ISingleElectron newSingleElectron(IAtom atom) {
        return new NNSingleElectron(atom);
    }

	public IStrand newStrand() {
        return new NNStrand();
	}

	public IPseudoAtom newPseudoAtom() {
        return new NNPseudoAtom();
	}

	public IPseudoAtom newPseudoAtom(String label) {
        return new NNPseudoAtom(label);
	}

	public IPseudoAtom newPseudoAtom(IAtom atom) {
		return new NNPseudoAtom(atom);
	}

	public IPseudoAtom newPseudoAtom(String label, Point3d point3d) {
		return new NNPseudoAtom(label, point3d);
	}

	public IPseudoAtom newPseudoAtom(String label, Point2d point2d) {
        return new NNPseudoAtom(label, point2d);
	}
}


