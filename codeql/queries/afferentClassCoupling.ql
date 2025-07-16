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

from MetricRefType c
where 
  c instanceof Class and 
  c.getFile().isSourceFile() and 
  not c.getFile().getRelativePath().matches("%/test/%") and
  not c.getFile().getRelativePath().matches("test/%")
select c.getFile().getRelativePath(), c.getAfferentCoupling()