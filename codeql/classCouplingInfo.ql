/**
 * @name Coupling metrics for Java classes (excluding tests)
 * @description Computes afferent and efferent coupling for Java classes in source files, excluding files in test directories.
 * @kind table
 * @problem.severity recommendation
 * @id java/metrics/class-coupling
 * @tags maintainability
 *       metrics
 *       java
 * @precision medium
 */

import java

from MetricRefType mr
where 
    mr instanceof Class and 
    mr.getFile().isSourceFile() and 
    not mr.getFile().getRelativePath().matches("%/test/%") and
    not mr.getFile().getRelativePath().matches("test/%")
select mr.getQualifiedName() as className,
       mr.getAfferentCoupling() as afferentCoupling,
       mr.getEfferentCoupling() as efferentCoupling