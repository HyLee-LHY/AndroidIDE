/*
 *  This file is part of AndroidIDE.
 *
 *  AndroidIDE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  AndroidIDE is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with AndroidIDE.  If not, see <https://www.gnu.org/licenses/>.
 */

package templates.base.module

import com.itsaky.androidide.templates.base.ModuleTemplateBuilder
import java.io.File

/**
 * @return The `proguard-rules.pro` file in the module directory.
 */
fun ModuleTemplateBuilder.proguardRulesFile(): File {
  return File(data.projectDir, "proguard-rules.pro")
}

/**
 * Creates the `proguard-rules.pro` file in the module directory.
 */
fun ModuleTemplateBuilder.proguardRules() {
  val file = proguardRulesFile()
  executor.copyAsset(baseAsset(file.name), file)
}