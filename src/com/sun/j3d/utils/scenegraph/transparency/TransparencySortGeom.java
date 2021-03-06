/*
 * $RCSfile: TransparencySortGeom.java,v $
 *
 * Copyright (c) 2007 Sun Microsystems, Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * - Redistribution of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * - Redistribution in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in
 *   the documentation and/or other materials provided with the
 *   distribution.
 *
 * Neither the name of Sun Microsystems, Inc. or the names of
 * contributors may be used to endorse or promote products derived
 * from this software without specific prior written permission.
 *
 * This software is provided "AS IS," without a warranty of any
 * kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
 * WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY
 * EXCLUDED. SUN MICROSYSTEMS, INC. ("SUN") AND ITS LICENSORS SHALL
 * NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF
 * USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS BE LIABLE FOR
 * ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT, SPECIAL,
 * CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND
 * REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF OR
 * INABILITY TO USE THIS SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 *
 * You acknowledge that this software is not designed, licensed or
 * intended for use in the design, construction, operation or
 * maintenance of any nuclear facility.
 *
 * $Revision: 1.4 $
 * $Date: 2007/02/09 17:20:42 $
 * $State: Exp $
 */

package com.sun.j3d.utils.scenegraph.transparency;
import javax.media.j3d.Geometry;
import javax.media.j3d.Shape3D;
import javax.media.j3d.Transform3D;

/**
 *
 * The interface of the objects that should be compared to determine
 * rendering order of transparent objects.
 *
 * The Comparator supplied by the user in TransparencySortController will
 * be called with 2 objects that implement this interface.
 *
 * @since Java 3D 1.4
 */
public interface TransparencySortGeom {
    
    /**
     * Returns the Geometry for this object.
     *
     * @return geometry for this object
     */
    public Geometry getGeometry();
    
    /**
     * Returns the distance squared of this object to the viewer.
     *
     * @return distancesquared to viewer
     */
    public double getDistanceSquared();
    
    /**
     * Returns the LocalToVWorld transform for this object
     *
     * @param localToVW variable in which transform will be returned
     */
    public void getLocalToVWorld(Transform3D localToVW);
    
    /**
     * Returns the Shape3D being rendered using this geometry.
     *
     * @return the Shape3D being rendered using this geometry 
     */
    public Shape3D getShape3D();

}
