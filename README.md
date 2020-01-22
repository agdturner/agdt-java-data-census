# Census

https://github.com/agdturner/agdt-java-data-census/

A Java library for loading and processing 2001 and 2011 UK Human population Census data.

## Code status and development roadmap
Actively being developed and working in stages towards a Version 1.0.0 release.
This code is immature.
An earlier verson of the code base had convenience classes for loading various census data tables for England and Wales, Scotland and Northern Ireland. But these were hand written and to support the loading of more tables it has been decided to try a new approach which generates the code for loading the tables using the metadata for each table. A separate census code generation ibrary is being developed for this process: https://github.com/agdturner/agdt-java-data-census-code-generator/

Once 2011 and 2001 data have been parsed and are suported then this library may be extended for processing 1991 and earlier census data and the 2021 census data as they become available.
Unit tests are to be written using JUnit 5.

## Dependencies
Please see the pom.xml for details.
1. Data: https://github.com/agdturner/agdt-java-generic-data/. A Java library for data processing.
2. Generic: https://github.com/agdturner/agdt-java-generic. A Java library with generally useful classes and methods that have been abstracted from other libraries which now depend on this.

## Contributions
Please raise issues and submit pull requests in the usual way. Contributions will be acknowledged.

## LICENCE
Please see the standard Apache 2.0 open source LICENCE.
