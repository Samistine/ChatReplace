/*******************************************************************************
 * Copyright (c) 2012 James Richardson.
 * 
 * PatternConfiguration.java is part of ChatReplace.
 * 
 * ChatReplace is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * ChatReplace is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * ChatReplace. If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package name.richardson.james.bukkit.chatreplace;

import java.util.List;

public interface PatternConfiguration {

  /**
   * Gets the patterns created from this configuration file.
   * 
   * @return the patterns
   */
  public List<? extends AbstractPattern> getPatterns();

  /**
   * Create the patterns from this configuration file.
   */
  public void setPatterns();

}
