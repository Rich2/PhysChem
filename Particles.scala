/* Copyright 2025 Richard Oliver. Licensed under Apache Licence version 2.0. */
package ppart
import ostrat.*

object Neutron
object Proton

trait Element
object Hydrogen extends Element
object Oxygen extends Element

/** A Chemical compound. */
class Compound(val elements: RArr[Multiple[Element]])

class Water extends Compound(RArr(Hydrogen * 2, Oxygen))

class Hydrogen2 extends Compound(RArr(Hydrogen * 2))