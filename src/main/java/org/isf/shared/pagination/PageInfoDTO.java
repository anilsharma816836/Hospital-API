/*
 * Open Hospital (www.open-hospital.org)
 * Copyright © 2006-2023 Informatici Senza Frontiere (info@informaticisenzafrontiere.org)
 *
 * Open Hospital is a free and open source software for healthcare data management.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * https://www.gnu.org/licenses/gpl-3.0-standalone.html
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package org.isf.shared.pagination;

public class PageInfoDTO {
	
	int size;
	int page;
	int nbOfElements;
	long totalPages;
	long totalNbOfElements ;
	boolean hasPreviousPage;
	boolean hasNextPage;

	public PageInfoDTO() {
	}

	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public int getNbOfElements() {
		return nbOfElements;
	}
	
	public void setNbOfElements(int nbOfElements) {
		this.nbOfElements = nbOfElements;
	}
	
	public long getTotalPages() {
		return totalPages;
	}
	
	public void setTotalPages(long l) {
		this.totalPages = l;
	}
	
	public long getTotalNbOfElements() {
		return totalNbOfElements;
	}

	public void setTotalNbOfElements(long totalNbOfElements) {
		this.totalNbOfElements = totalNbOfElements;
	}

	public boolean isHasPreviousPage() {
		return hasPreviousPage;
	}
	
	public void setHasPreviousPage(boolean hasPreviousPage) {
		this.hasPreviousPage = hasPreviousPage;
	}
	
	public boolean isHasNextPage() {
		return hasNextPage;
	}
	
	public void setHasNextPage(boolean hasNextPage) {
		this.hasNextPage = hasNextPage;
	}
}
