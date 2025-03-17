/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
package ppart
import ostrat.*, geom.*

/** A Chemical compound. */
trait Molecule
{
  val atoms: RArr[Atom]
  def atomInd(atom: Atom): Int = atoms.indexOf(atom)
  def atomPosns: PtPm2Arr
  val bonds: RPairArr[Atom, Atom]
  def bondSegs: LineSegPm2Arr = bonds.map{bond =>
    val i1: PtPm2 = atomPosns(atomInd(bond.a1))
    val i2: PtPm2 = atomPosns(atomInd(bond.a2))
    LineSegPm2(i1, i2)
  }
  def fills(scale: Length, xOff: Length = 0.metres, yOff: Length = 0.metres): GraphicElems =
    atoms.iMap{(i, at) => at.fillDraw(scale, (xOff + atomPosns(i).x) / scale, (yOff  + atomPosns(i).y)/ scale) }

  def draws(scale: Length, xOff: Length = 0.picometres, yOff: Length = 0.picometres): GraphicElems =
    bondSegs.map{bs =>
      val bs1 = bs.slate(xOff, yOff)
      LineSeg(bs1.xStart / scale, bs1.yStart / scale, bs1.xEnd / scale, bs1.yEnd /scale).draw() }

  def fillDraws(scale: Length, xOff: Length = 0.metres, yOff: Length = 0.metres): GraphicElems = draws(scale, xOff, yOff) ++ fills(scale, xOff, yOff)
}

object Dihydrogen extends Molecule
{
  val aH1 = HAtom()
  val aH2 = HAtom()
  override val atoms: RArr[Atom] = RArr(aH1, aH2)

  override def atomPosns: PtPm2Arr = PtPm2Arr.fromDbls(-37,0 ,37,0)
  override val bonds: RPairArr[Atom, Atom] = RPairArr((aH1, aH2))
}

object Water extends Molecule
{ val aH1 = HAtom()
  val aO1 = OAtom()
  val aH2 = HAtom()
  val bondsAngle = 104.52.degsVec
  val bondLen = 95.72.picometres
  private val bondRem: AngleVec = (180.degsVec - bondsAngle) / 2
  override val atoms: RArr[Atom] = RArr(aH1, aO1, aH2)
  val a01Posn = PtPm2.origin
  override val atomPosns: PtPm2Arr = PtPm2Arr(a01Posn.angleTo(-180.degs + bondRem, bondLen), a01Posn, a01Posn.angleTo(0.degs - bondRem, bondLen))
  override val bonds: RPairArr[Atom, Atom] = RPairArr((aH1, aO1), (aO1, aH2))
}

object CO2Mc extends Molecule
{
  val aO1 = OAtom()
  val aC1 = CAtom()
  val aO2 = OAtom()
  override val atoms: RArr[Atom] = RArr(aO1, aC1, aO2)
  val bondLenNum = 116.3
  override def atomPosns: PtPm2Arr = PtPm2Arr.fromDbls(-bondLenNum,0 ,0,0, bondLenNum, 0)
  override val bonds: RPairArr[Atom, Atom] = RPairArr((aC1, aO1), (aC1, aO2))
}