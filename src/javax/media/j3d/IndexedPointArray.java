/*
 * $RCSfile: IndexedPointArray.java,v $
 *
 * Copyright 1997-2008 Sun Microsystems, Inc.  All Rights Reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Sun designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Sun in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Sun Microsystems, Inc., 4150 Network Circle, Santa Clara,
 * CA 95054 USA or visit www.sun.com if you need additional information or
 * have any questions.
 *
 * $Revision: 1.6 $
 * $Date: 2008/02/28 20:17:24 $
 * $State: Exp $
 */

package javax.media.j3d;

/**
 * The IndexedPointArray object draws the array of vertices as
 * individual points.
 */

public class IndexedPointArray extends IndexedGeometryArray {

    /**
     * Package scoped default constructor.
     */
    IndexedPointArray() {
    }

    /**
     * Constructs an empty IndexedPointArray object using the specified
     * parameters.
     *
     * @param vertexCount
     * see {@link GeometryArray#GeometryArray(int,int)}
     * for a description of this parameter.
     *
     * @param vertexFormat
     * see {@link GeometryArray#GeometryArray(int,int)}
     * for a description of this parameter.
     *
     * @param indexCount
     * see {@link IndexedGeometryArray#IndexedGeometryArray(int,int,int)}
     * for a description of this parameter.
     *
     * @exception IllegalArgumentException if vertexCount is less than 1
     * or indexCount is less than 1
     * ;<br>
     * See {@link GeometryArray#GeometryArray(int,int)}
     * for more exceptions that can be thrown
     */
    public IndexedPointArray(int vertexCount, int vertexFormat, int indexCount) {
	super(vertexCount,vertexFormat, indexCount);

        if (vertexCount < 1) 
        throw new IllegalArgumentException(J3dI18N.getString("IndexedPointArray0")); 

        if (indexCount < 1 )
        throw new IllegalArgumentException(J3dI18N.getString("IndexedPointArray1"));
    }

    /**
     * Constructs an empty IndexedPointArray object using the specified
     * parameters.
     *
     * @param vertexCount
     * see {@link GeometryArray#GeometryArray(int,int,int,int[])}
     * for a description of this parameter.
     *
     * @param vertexFormat
     * see {@link GeometryArray#GeometryArray(int,int,int,int[])}
     * for a description of this parameter.
     *
     * @param texCoordSetCount
     * see {@link GeometryArray#GeometryArray(int,int,int,int[])}
     * for a description of this parameter.
     *
     * @param texCoordSetMap
     * see {@link GeometryArray#GeometryArray(int,int,int,int[])}
     * for a description of this parameter.
     *
     * @param indexCount
     * see {@link IndexedGeometryArray#IndexedGeometryArray(int,int,int,int[],int)}
     * for a description of this parameter.
     *
     * @exception IllegalArgumentException if vertexCount is less than 1
     * or indexCount is less than 1
     * ;<br>
     * See {@link GeometryArray#GeometryArray(int,int,int,int[])}
     * for more exceptions that can be thrown
     *
     * @since Java 3D 1.2
     */
    public IndexedPointArray(int vertexCount,
			     int vertexFormat,
			     int texCoordSetCount,
			     int[] texCoordSetMap,
			     int indexCount) {

	super(vertexCount, vertexFormat,
	      texCoordSetCount, texCoordSetMap,
	      indexCount);

        if (vertexCount < 1) 
	    throw new IllegalArgumentException(J3dI18N.getString("IndexedPointArray0")); 

        if (indexCount < 1 )
	    throw new IllegalArgumentException(J3dI18N.getString("IndexedPointArray1"));
    }

    /**
     * Constructs an empty IndexedPointArray object using the specified
     * parameters.
     *
     * @param vertexCount
     * see {@link GeometryArray#GeometryArray(int,int,int,int[],int,int[])}
     * for a description of this parameter.
     *
     * @param vertexFormat
     * see {@link GeometryArray#GeometryArray(int,int,int,int[],int,int[])}
     * for a description of this parameter.
     *
     * @param texCoordSetMap
     * see {@link GeometryArray#GeometryArray(int,int,int,int[],int,int[])}
     * for a description of this parameter.
     *
     * @param vertexAttrCount
     * see {@link GeometryArray#GeometryArray(int,int,int,int[],int,int[])}
     * for a description of this parameter.
     *
     * @param vertexAttrSizes
     * see {@link GeometryArray#GeometryArray(int,int,int,int[],int,int[])}
     * for a description of this parameter.
     *
     * @param indexCount
     * see {@link IndexedGeometryArray#IndexedGeometryArray(int,int,int,int[],int,int[],int)}
     * for a description of this parameter.
     *
     * @exception IllegalArgumentException if vertexCount is less than 1
     * or indexCount is less than 1
     * ;<br>
     * See {@link GeometryArray#GeometryArray(int,int,int,int[],int,int[])}
     * for more exceptions that can be thrown
     *
     * @since Java 3D 1.4
     */
    public IndexedPointArray(int vertexCount,
			     int vertexFormat,
			     int texCoordSetCount,
			     int[] texCoordSetMap,
			     int vertexAttrCount,
			     int[] vertexAttrSizes,
			     int indexCount) {

	super(vertexCount, vertexFormat,
	      texCoordSetCount, texCoordSetMap,
	      vertexAttrCount, vertexAttrSizes,
	      indexCount);

        if (vertexCount < 1) 
	    throw new IllegalArgumentException(J3dI18N.getString("IndexedPointArray0")); 

        if (indexCount < 1 )
	    throw new IllegalArgumentException(J3dI18N.getString("IndexedPointArray1"));
    }

    /**
     * Creates the retained mode IndexedPointArrayRetained object that this
     * IndexedPointArray object will point to.
     */
    void createRetained() {
	this.retained = new IndexedPointArrayRetained();
	this.retained.setSource(this);
    }


    /**
     * @deprecated replaced with cloneNodeComponent(boolean forceDuplicate)
     */
    public NodeComponent cloneNodeComponent() {
        IndexedPointArrayRetained rt = (IndexedPointArrayRetained) retained;
        int texSetCount = rt.getTexCoordSetCount();
        int[] texMap = null;
        int vertexAttrCount = rt.getVertexAttrCount();
        int[] vertexAttrSizes = null;
        if (texSetCount > 0) {
            texMap = new int[rt.getTexCoordSetMapLength()];
            rt.getTexCoordSetMap(texMap);
        }
        if (vertexAttrCount > 0) {
            vertexAttrSizes = new int[vertexAttrCount];
            rt.getVertexAttrSizes(vertexAttrSizes);
        }
        IndexedPointArray p = new IndexedPointArray(rt.getVertexCount(),
                rt.getVertexFormat(),
                texSetCount,
                texMap,
                vertexAttrCount,
                vertexAttrSizes,
                rt.getIndexCount());
        p.duplicateNodeComponent(this);
        return p;
    }
}
