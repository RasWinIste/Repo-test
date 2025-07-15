/**
 * @name Afferent Coupling per Class
 * @description Computes afferent coupling for each Java class in source files (excluding tests).
 * @kind metric
 * @metricType count
 * @language java
 * @tags summary 
 * @id java/afferent-coupling
 */
import java

from MetricRefType mr
where 
  mr instanceof Class and 
  mr.getFile().isSourceFile() and 
  not mr.getFile().getRelativePath().matches("%/test/%") and
  not mr.getFile().getRelativePath().matches("test/%")
select mr.getQualifiedName(), mr.getAfferentCoupling()