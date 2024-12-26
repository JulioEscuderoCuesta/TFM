# RAI4 Model-Driven Engineering Project

Final Project by Julio Escudero Cuesta for the Master's Degree in Computer Engineering at the University of Cantabria.

Using formal modeling techniques for the automated editing and generation of artifacts for the "RAI4" metamodel, designed by researchers Patricia López, Ricardo Dintén, José María Drake, and Marta Zorrilla from the Software and Real-Time Engineering (ISTR) research group at the University of Cantabria.

## Project Structure

The repository is organized into the following main directories:

### RAI4/
Contains the core metamodel project defining the domain model for RAI4.

### SintaxisTextual/
Includes the Xtext projects for textual syntax:
- `es.unican.istr.pasys`: Core grammar and language definition
- `es.unican.istr.pasys.ide`: IDE support
- `es.unican.istr.pasys.ui`: Eclipse UI integration
- `es.unican.istr.pasys.tests`: Test suites
- `es.unican.istr.pasys.ui.tests`: UI-specific tests

### SintaxisVisual/
Contains Sirius-based graphical editor projects:
- `Rai4.design`: Main visual editor definition
- `Prueba/`: Example models for testing the graphical editor

### Ejemplos/
Contains example files demonstrating textual syntax usage.

## Requirements

- Eclipse 2023-09 or later
- Java Development Kit (JDK) 17 or later
- Eclipse Modeling Framework (EMF)
- Xtext 2.31.0
- Sirius 7.2.0
- Xtend 2.31.0
