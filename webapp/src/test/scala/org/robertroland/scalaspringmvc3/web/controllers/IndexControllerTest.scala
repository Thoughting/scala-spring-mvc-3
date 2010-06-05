package org.robertroland.scalaspringmvc3.web.controllers

import org.junit._
import Assert._

class IndexControllerTest {
  @Test
  def testIndex = {
    val c = new IndexController

    val result = c.index

    assertTrue(result.equals("/index"))
  }
}