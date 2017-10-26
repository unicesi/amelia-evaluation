# Carvajal XML Project.

This folder contains the Amelia specifications for the automated deployment experiments of the Carvajal Case Study. This case study mainly refers to the problem of redesigning the reference architecture for the core engine of a software product family that processes large XML files. The redesigned reference architecture must ensure improved performance over the architectural designs used in previous products of the family.
The original system, which was designed for processing XML documents for different application domains, has a monolithic structure. However, it is feasible to re-structure this system into distributable and scalable subsystems, in order to improve its system performance. Moreover, several design patterns can be applied to restructure and distribute it in subsystems, thereby yielding different architectural configurations. Carvajal developed a solution for the Colombian National Agency for Overcoming Extreme Poverty (ANSP—initials correspond to the Spanish name) to allow census workers to collect demographic data in mobile devices offline (i.e., in regions with no telecommunications access).  This update process suffers from severe delays and timeout errors due to the large number of requests overloading the central server. As an exemplar of the product family, we selected this concrete case to address the stated problem, and a set of domain-specific design patterns for improving performance, Producer/Consumer and Reactor, among others, in several architectural configurations and variations. 

The following table summarizes the factors and their corresponding values of variation for the experimental design of the project. Each treatment, i.e., a combination between factor values, was implemented as a set of Amelia specifications.

|           Factor          |           Levels           |
|:-------------------------:|:--------------------------:|
| Communications protocol   |       RMI, REST, Ice       |
| Pattern                   | Producer/Consumer, Reactor |
| Processor nodes instances |          4, 8, 12*         |
| Components per node       |          1, 4**, 6, 8**, 12|
| XML file size             |          1MB, 5MB          |

*The Reactor pattern is always specified with 12 processor nodes.

**These values are not combined with the whole resulting set of possible values, instead, they produce the following treatments: Communication protocol: RMI, Producer/Consumer,12 nodes, 4 components per node, XML file with 1MB size; Communication protocol: RMI, Producer/Consumer,12 nodes, 8 components per node, XML file with 1MB size ; and Communication protocol: Ice, Producer/Consumer,12 nodes, 8 components per node, XML file with 1MB size.
