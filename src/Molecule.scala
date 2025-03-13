/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
package ppart
import ostrat.*

/** A Chemical compound. */
trait Molecule
{
  val atoms: RArr[Atom]
  val bonds: RPairArr[Atom, Atom]
}

object H2Cule extends Molecule
{
  val aH1 = HAtom()
  val aH2 = HAtom()
  override val atoms: RArr[Atom] = RArr(aH1, aH2)
  override val bonds: RPairArr[Atom, Atom] = RPairArr((aH1, aH2))
}

object Water extends Molecule
{ val aH1 = HAtom()
  val aO1 = OAtom()
  val aH2 = HAtom()
  override val atoms: RArr[Atom] = RArr(aH1, aO1, aH2)
  override val bonds: RPairArr[Atom, Atom] = RPairArr((aH1, aO1), (aO1, aH2))
}